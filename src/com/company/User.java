package com.company;

import java.util.Scanner;

public class User {

    private String username;
    private String password;
    private Role role;

    Scanner scanner = new Scanner(System.in);

    public User(Role role) {
        System.out.println("Enter username:");
        this.username = scanner.nextLine();
        System.out.println("Enter password, Password should contain at least one uppercase character " +
                "at least 3 numbers and at least one special character (“#”, “!”, or “%”):");
        String enteredPassword = scanner.nextLine();
        if (CheckPassword.checkingPassword(enteredPassword)) {
            this.password = enteredPassword;
        } else {
            System.out.println("Entered password is not valid, it is not set as the password for the " + this.username);
        }
        this.role = role;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (CheckPassword.checkingPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Entered password is not valid, it is not set as the password for the " + this.username);
        }
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

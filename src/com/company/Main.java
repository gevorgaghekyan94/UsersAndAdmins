package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> adminsAndUsers = new ArrayList<>();
        User user1 = new User(Role.ADMIN);
        adminsAndUsers.add(user1);
        User user2 = new User(Role.ADMIN);
        adminsAndUsers.add(user2);
        User user3 = new User(Role.CUSTOMER);
        adminsAndUsers.add(user3);
        User user4 = new User(Role.CUSTOMER);
        adminsAndUsers.add(user4);
        User user5 = new User(Role.CUSTOMER);
        adminsAndUsers.add(user5);
        User user6 = new User(Role.CUSTOMER);
        adminsAndUsers.add(user6);
        User user7 = new User(Role.CUSTOMER);
        adminsAndUsers.add(user7);
        User user8 = new User(Role.CUSTOMER);
        adminsAndUsers.add(user8);
        User user9 = new User(Role.CUSTOMER);
        adminsAndUsers.add(user9);
        User user10 = new User(Role.CUSTOMER);
        adminsAndUsers.add(user10);

    }
}

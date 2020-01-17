package com.company;

public class CheckPassword {

    public static boolean checkingPassword(String password) {
        boolean check = true;
        if (checkNumbersQuantity(password) && checkSpecialCharacters(password) && checkUppercase(password)) {

        } else {
            check = false;
        }
        return check;
    }

    public static boolean checkNumbersQuantity(String text) {
        boolean check = true;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        if (count < 3) {
            check = false;
        }
        return check;
    }

    public static boolean checkSpecialCharacters(String text) {
        boolean check = true;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '#' || ch == '!' || ch == '%') {
                count++;
            }
        }
        if (count < 1) {
            check = false;
        }
        return check;
    }

    public static boolean checkUppercase(String text) {
        boolean check = true;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        if (count < 1) {
            check = false;
        }
        return check;
    }
}

package com.kodilla.good.patterns.challanges;

public class User {

    private String userName;
    private String userSurname;
    private String phoneNUmber;

    public User(String userName, String userSurname, String phoneNUmber) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.phoneNUmber = phoneNUmber;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getPhoneNUmber() {
        return phoneNUmber;
    }
}

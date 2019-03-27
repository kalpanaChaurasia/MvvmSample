package com.mvvm.mvvmtest.model;

public class User {

    private String email;
    private String password;

    public User(String email, String passwrod) {
        this.email = email;
        this.password = passwrod;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String passwrod) {
        this.password = passwrod;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

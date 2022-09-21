package com.itck.home;

public class User {
    private String userId;
    private String password;
    private String email;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String userId, String password, String email) {
        this.userId = userId;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User" +
                "用户名：" + userId + "\t" +
                "密码：" + password + "\t" +
                "邮箱：" + email + "\t"
                ;
    }
}

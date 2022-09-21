package com.itck.home;

public class App {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();

        User user = new User("wenjie","123","1232qq.com");
        userManager.register(user);
        User user2 = new User("wangwenjie","123","1232qq.com");
        userManager.register(user2);

        userManager.login("wenjie","123");
        userManager.show();


    }
}

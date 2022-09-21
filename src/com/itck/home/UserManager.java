package com.itck.home;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UserManager {

    /**
     * 存储用户数据
     */

    private Set<User> userSet;
    public UserManager() {
        userSet = new HashSet<User>();
    }

    /**
     * 注册方法 账号不能相同
     */
    public void register(User user) {
        // 通过遍历，查找是否存在相同账户的用户
        // 如果存在，说明账户已经存在，该账户不能再注册
        int flag = 0;
        for (User u : userSet) {
            if (u.getUserId().equals(user.getUserId())) {
                System.out.println("账号已存在");
                flag = 1;
                break;
            }
        }
        if (flag == 0 ) {
            userSet.add(user);
            System.out.println("注册成功");
        }
    }
    /**
     * 登陆
     * @param userId
     * @param password
     */
    public void login(String userId,String password) {
        int flag = 0;
        for (User u :userSet) {
            if (u.getUserId().equals(userId) && u.getPassword().equals(password)) {
                System.out.println("合法用户，可以登录");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("用户名或密码错误");
        }
    }
    /**
     * 打印信息
     */
    public void show() {
        // 获取迭代器对象
        Iterator<User> iterator = userSet.iterator();
        // 判断是否存在下一个元素
        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(user);
        }
    }


}

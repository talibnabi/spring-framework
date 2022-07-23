package spring.dao.impl;

import spring.dao.inter.UserDaoInter;

public class MyUserDaoImpl implements UserDaoInter {
    private String userName;

    public MyUserDaoImpl() {
    }

    public MyUserDaoImpl(String userName) {
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void showAllUser() {
        System.out.println(userName);
    }
}

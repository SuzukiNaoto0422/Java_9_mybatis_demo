package com.raisetech.mybatis_demo;

import java.util.Date;

public class Member {
    private  int id;
    private String name;
    private Date birthday;

    public Member(int id, String name, Date birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
}

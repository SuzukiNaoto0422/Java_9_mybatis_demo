package com.raisetech.mybatis_demo;

import java.util.Date;

public class Member {
    private  int id;
    private String name;
    private Date birthday;
    private int age;

    public Member(int id, String name, Date birthday, int age) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.age = age;
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

    public int getAge() {
        return age;
    }
    
}

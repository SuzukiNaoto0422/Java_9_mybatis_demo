package com.raisetech.mybatis_demo;

import java.util.List;

public interface MemberService {
    List<Member> findAll();

    List<String> findAllName();

    List<String> findAllBirthday();

    List<String> findOverAge35();
}

package com.raisetech.mybatis_demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM members")
    List<Member> findAll();

    @Select("SELECT name FROM members")
    List<String> findAllName();

    @Select("SELECT birthday FROM members")
    List<Date> findAllBirthday();

    @Select("SELECT name FROM members WHERE age >= #{age}")
    List<String> findOverAge(int age);
}

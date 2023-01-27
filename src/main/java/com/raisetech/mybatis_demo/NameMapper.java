package com.raisetech.mybatis_demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {
    @Select("SELECT * FROM members")
    List<Name> findAll();

    @Select("SELECT name FROM members")
    List<String> findAllName();


}

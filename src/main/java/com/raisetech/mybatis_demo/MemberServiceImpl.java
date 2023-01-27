package com.raisetech.mybatis_demo;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public List<Member> findAll() {
        return memberMapper.findAll();
    }

    @Override
    public List<String> findAllName() {
        return memberMapper.findAllName();
    }

    @Override
    public List<Date> findAllBirthday() {
        return memberMapper.findAllBirthday();
    }

}
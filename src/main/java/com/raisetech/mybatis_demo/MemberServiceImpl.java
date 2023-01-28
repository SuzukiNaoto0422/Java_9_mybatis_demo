package com.raisetech.mybatis_demo;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    public List<String> findAllBirthday() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月 dd日");
        List<String> birthdayList = new ArrayList<>();
        for (Date date : memberMapper.findAllBirthday()) {
            birthdayList.add(sdf.format(date));
        }
        return birthdayList;
    }

    @Override
    public List<String> findOverAge35() {
        return memberMapper.findOverAge35();
    }
}

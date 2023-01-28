package com.raisetech.mybatis_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    public List<Member> getMembers() {
    return memberService.findAll();
    }

    @GetMapping("/names")
    public List<String> getNames() {
        return memberService.findAllName();
    }

    @GetMapping("/birthday")
    public List<String> getBirthday() {
        return memberService.findAllBirthday();
    }

    @GetMapping("/age>=35")
    public List<String> findOverAge35() {
        return memberService.findOverAge35();
    }


}

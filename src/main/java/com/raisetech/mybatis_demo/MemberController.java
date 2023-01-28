package com.raisetech.mybatis_demo;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/overage")
    public List<String> findOverAge(@NonNull @RequestParam(name = "age")int age) {
        return memberService.findOverAge(age);
    }


}

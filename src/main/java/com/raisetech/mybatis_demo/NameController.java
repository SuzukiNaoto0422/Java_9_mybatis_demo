package com.raisetech.mybatis_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class NameController {

    private final NamerService nameService;

    public NameController(NamerService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/members")
    public List<Name> getMembers() {
    return nameService.findAll();
    }

    @GetMapping("/names")
    public List<String> getNames() {
        return nameService.findAllName();
    }

    @GetMapping("/birthday")
    public List<Date> getBirthday() {
        return nameService.findAllBirthday();
    }

}

package com.raisetech.mybatis_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    private final NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/members")
    public List<Name> getNames() {
    return nameService.findAll();
    }

    @GetMapping("/names")
    public List<String> getAllNames() {
        return nameService.findAllName();
    }

}

package com.raisetech.mybatis_demo;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NameServiceImpl implements NamerService {

    private final NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<Name> findAll() {
        return nameMapper.findAll();
    }

    @Override
    public List<String> findAllName() {
        return nameMapper.findAllName();
    }

    @Override
    public List<Date> findAllBirthday() {
        return nameMapper.findAllBirthday();
    }

}

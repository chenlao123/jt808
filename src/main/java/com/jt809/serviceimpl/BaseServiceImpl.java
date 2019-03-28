package com.jt809.serviceimpl;

import com.jt809.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {
    @Override
    public void test() {
        System.out.println("aaaaa");
    }
}
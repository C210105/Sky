package com.example.demo1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.entitys.User;
import com.example.demo1.respositorys.UserRespository;

@Service
public class UserService {
    
    @Autowired
    UserRespository userRespository;

    public List <User> getAllUser(){
        return userRespository.findAll();
    }
}

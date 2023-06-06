package com.example.demo1.respositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.entitys.User;

@Repository
public interface UserRespository extends JpaRepository <User, Long>{

}

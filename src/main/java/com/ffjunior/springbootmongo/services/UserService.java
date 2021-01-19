package com.ffjunior.springbootmongo.services;

import com.ffjunior.springbootmongo.domain.User;
import com.ffjunior.springbootmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        userRepository.findAll();
        return userRepository.findAll();
    }

}

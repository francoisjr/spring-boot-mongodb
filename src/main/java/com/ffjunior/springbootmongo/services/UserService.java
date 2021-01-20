package com.ffjunior.springbootmongo.services;

import com.ffjunior.springbootmongo.domain.User;
import com.ffjunior.springbootmongo.dto.UserDTO;
import com.ffjunior.springbootmongo.repository.UserRepository;
import com.ffjunior.springbootmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        userRepository.findAll();
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj){
        return  userRepository.insert(obj);
    }

    public User fromDto(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}

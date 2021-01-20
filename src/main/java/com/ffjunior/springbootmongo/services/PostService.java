package com.ffjunior.springbootmongo.services;

import com.ffjunior.springbootmongo.domain.Post;
import com.ffjunior.springbootmongo.domain.User;
import com.ffjunior.springbootmongo.dto.UserDTO;
import com.ffjunior.springbootmongo.repository.PostRepository;
import com.ffjunior.springbootmongo.repository.UserRepository;
import com.ffjunior.springbootmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}

package com.ffjunior.springbootmongo.repository;

import com.ffjunior.springbootmongo.domain.Post;
import com.ffjunior.springbootmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}

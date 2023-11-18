package com.example.springtest.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.springtest.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User,Integer> {


}

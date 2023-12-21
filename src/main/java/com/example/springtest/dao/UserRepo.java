package com.example.springtest.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.springtest.entity.User;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User,Integer> {

    public List<User> findByName(String name);

    public List<User> findByNameLike(String namepattern);

    @Query("select u.id from User u")
    public List<Integer> getAllId();

    @Query("select u.name from User u where u.id = :id")
    public List<String> getName(@Param("id") Integer id);

    @Query("select u.name, u.status from User u where u.id = :id and u.city = :city")
    public List<Object[]> getNameCity(@Param("id") Integer id, @Param("city") String city);

    @Query(value= "select * from User",nativeQuery = true)
    public List<User> getUser();

}

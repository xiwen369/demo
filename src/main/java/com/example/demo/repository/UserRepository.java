package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    //查询所有会员
    @Query(value = "SELECT * FROM user limit ?1,?2",nativeQuery = true)
    List<User> queryUser(int page, int pageSize);


}

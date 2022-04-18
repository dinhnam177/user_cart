package com.example.User_CartHistory.Responsitory;

import com.example.User_CartHistory.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserResponsitory extends JpaRepository<User,String> {
    @Query("select u from User u where u.name like %:name%")
    List<User> findAllByName(@Param("name") String name);
}

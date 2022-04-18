package com.example.User_CartHistory.Service;

import com.example.User_CartHistory.Domain.User;

import java.util.List;

public interface IUserService {
    List<User> findAllByName(String name);
    List<User> findAll();
}

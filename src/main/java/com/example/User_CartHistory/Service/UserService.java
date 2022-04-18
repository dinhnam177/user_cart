package com.example.User_CartHistory.Service;

import com.example.User_CartHistory.Domain.User;
import com.example.User_CartHistory.Responsitory.IUserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserResponsitory iUserResponsitory;

    @Override
    public List<User> findAllByName(String name) {
        return iUserResponsitory.findAllByName(name);
    }

    @Override
    public List<User> findAll() {
        return iUserResponsitory.findAll();
    }
}

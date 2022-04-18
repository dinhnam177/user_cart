package com.example.User_CartHistory.Controller;

import com.example.User_CartHistory.Domain.Product;
import com.example.User_CartHistory.Domain.User;
import com.example.User_CartHistory.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping(value = "/user")
    public List<User> getUser(){
        return iUserService.findAll();
    }

    @GetMapping(value = "/user/{name}")
    @ResponseBody
    public List<User> getCartsByUserName(@PathVariable String name){
        List<User> users = iUserService.findAllByName(name);
        users.stream().forEach(user -> {
            user.getCarts().stream().forEach(cart -> {
                System.out.println(cart.getName());
                cart.getCartDetails().stream().forEach(cartDetails -> {
                    System.out.println(cartDetails.getId());
                    System.out.println(cartDetails.getProduct().toString());
                });
            });
        });
        return users;
    }
}

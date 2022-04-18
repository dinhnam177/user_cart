package com.example.User_CartHistory.Service;

import com.example.User_CartHistory.Responsitory.ICartResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService{
    @Autowired
    ICartResponsitory iCartResponsitory;
}

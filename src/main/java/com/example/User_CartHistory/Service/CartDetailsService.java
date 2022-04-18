package com.example.User_CartHistory.Service;

import com.example.User_CartHistory.Responsitory.ICartDetailsResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartDetailsService implements ICartDetailsService {
    @Autowired
    ICartDetailsResponsitory iCartDetailsResponsitory;
}

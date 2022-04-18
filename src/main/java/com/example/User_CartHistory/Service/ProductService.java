package com.example.User_CartHistory.Service;

import com.example.User_CartHistory.Responsitory.IProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductResponsitory iProductResponsitory;
}

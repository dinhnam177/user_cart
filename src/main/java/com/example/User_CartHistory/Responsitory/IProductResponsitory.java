package com.example.User_CartHistory.Responsitory;

import com.example.User_CartHistory.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductResponsitory extends JpaRepository<Product, String> {
}

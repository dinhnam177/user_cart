package com.example.User_CartHistory.Responsitory;

import com.example.User_CartHistory.Domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartResponsitory extends JpaRepository<Cart, String> {
}

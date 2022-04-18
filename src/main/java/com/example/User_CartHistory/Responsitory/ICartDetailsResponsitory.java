package com.example.User_CartHistory.Responsitory;

import com.example.User_CartHistory.Domain.CartDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartDetailsResponsitory extends JpaRepository<CartDetails, String> {
}

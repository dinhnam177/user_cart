package com.example.User_CartHistory;

import com.example.User_CartHistory.Domain.User;
import com.example.User_CartHistory.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class UserCartHistoryApplication implements CommandLineRunner {
	@Autowired
	IUserService iUserService;

	public static void main(String[] args) {
		SpringApplication.run(UserCartHistoryApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		List<User> users = iUserService.findAllByName("test");
		users.stream().forEach(user -> {
			user.getCarts().stream().forEach(cart -> {
				System.out.println(cart.getName());
				cart.getCartDetails().stream().forEach(cartDetails -> {
					System.out.println(cartDetails.getId());
					System.out.println(cartDetails.getProduct().toString());
				});
			});
		});
	}
}

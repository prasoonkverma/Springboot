package com.example.java.services;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.java.model.User;

@Service
public class UserService {

	HashMap<Integer, User> allusers;
	{
		allusers = new HashMap<>();
		User user1 = new User("Puja", 44, "p.s@gmail.com", 1);
		User user2 = new User("Prasoon", 84, "p.v@gmail.com", 2);
		User user3 = new User("Verma", 54, "a.v@gmail.com", 3);
		User user4 = new User("Sur", 34, "a.s@gmail.com", 4);
		User user5 = new User("Amit", 24, "a.s@gmail.com", 5);
		allusers.put(user1.getId(), user1);
		allusers.put(user2.getId(), user2);
		allusers.put(user3.getId(), user3);
		allusers.put(user4.getId(), user4);
		allusers.put(user5.getId(), user5);
	}
	
	public HashMap<Integer, User> getAllUsers() {
		return allusers;
	}
	
	public User getUser(Integer id) {
		return allusers.get(id);
	}
}

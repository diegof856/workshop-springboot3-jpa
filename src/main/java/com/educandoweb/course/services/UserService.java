package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repositoty;

	public List<User> findAll() {
		return repositoty.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repositoty.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repositoty.save(obj);
	}
	public void delete(Long id) {
		repositoty.deleteById(id);
	}
	public User update(Long id, User obj) {
		User entityUser = repositoty.getReferenceById(id);
		updateData(entityUser, obj);
		return repositoty.save(entityUser);
	}

	private void updateData(User entityUser, User obj) {
		entityUser.setName(obj.getName());
		entityUser.setEmail(obj.getEmail());
		entityUser.setPhone(obj.getPhone());
		
	}
	
}

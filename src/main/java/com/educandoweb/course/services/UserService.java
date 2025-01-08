package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.exceptions.DatabaseException;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repositoty;

	public List<User> findAll() {
		return repositoty.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repositoty.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repositoty.save(obj);
	}
	public void delete(Long id) {
		try {
			Optional<User> obj = repositoty.findById(id); 
			obj.orElseThrow(() -> new ResourceNotFoundException(id));
			repositoty.deleteById(id);
		} 
		catch(DataIntegrityViolationException e) {
	    	throw new DatabaseException(e.getMessage());
	    }
		
	}
	public User update(Long id, User obj) {
		try {
			User entityUser = repositoty.getReferenceById(id);
			updateData(entityUser, obj);
			return repositoty.save(entityUser);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		
	}

	private void updateData(User entityUser, User obj) {
		entityUser.setName(obj.getName());
		entityUser.setEmail(obj.getEmail());
		entityUser.setPhone(obj.getPhone());
		
	}
	
}

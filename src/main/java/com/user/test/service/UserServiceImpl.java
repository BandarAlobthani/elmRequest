package com.user.test.service;


import java.util.List;

import javax.transaction.Transactional;

import com.user.test.model.User;
import com.user.test.repositories.RoleRepository;
import com.user.test.repositories.UserRepository;
import com.user.test.repositories.UserRepositoryBean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.HashSet;

@Repository
@Component
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserRepository userRepository;
	
	@Autowired
	 private RoleRepository roleRepository;




	public User findById(Long id) {
		return userRepository.findOne(id);
	}

	public User findByUsername(String username) {
		 return userRepository.findByUsername(username);
		 }
	
	public void saveUser(User user) {
		user.setPassword(user.getPassword());
		 user.setRoles(new HashSet(roleRepository.findAll()));
		 userRepository.save(user);
	}

	public void updateUser(User user){
		saveUser(user);
	}

	public void deleteUserById(Long id){
		userRepository.delete(id);
	}

	public void deleteAllUsers(){
		userRepository.deleteAll();
	}

	public List<User> findAllUsers(){
		return userRepository.findAll();
	}

	public boolean isUserExist(User user) {
		return findByUsername(user.getUsername()) != null;
	}
	

}

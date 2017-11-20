package com.user.test.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.test.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findById(Long id);
	User findByUsername(String username);
    

}

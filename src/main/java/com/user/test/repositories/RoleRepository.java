package com.user.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.test.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
}

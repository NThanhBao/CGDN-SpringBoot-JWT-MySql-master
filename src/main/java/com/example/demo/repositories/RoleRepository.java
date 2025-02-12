package com.example.demo.repositories;

import com.example.demo.entity.DAOUser;
import com.example.demo.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Role findByRole(String role);
}

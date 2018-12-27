package com.az.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.az.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

package com.emsi.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.Entity.Chapiter;
import com.emsi.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

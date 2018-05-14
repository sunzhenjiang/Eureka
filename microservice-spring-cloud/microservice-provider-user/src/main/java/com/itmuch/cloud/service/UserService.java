package com.itmuch.cloud.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itmuch.cloud.entity.User;

public interface UserService extends JpaRepository<User, Long> {

}

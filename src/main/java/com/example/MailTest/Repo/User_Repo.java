package com.example.MailTest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.MailTest.Entity.User_test;

@EnableJpaRepositories
@Repository
public interface User_Repo extends JpaRepository<User_test, Integer> {

}

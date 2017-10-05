package com.libertymutual.goforcode.vote.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libertymutual.goforcode.vote.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

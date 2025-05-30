package com.example.relations.repositories;

import com.example.relations.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface  HobbyRepository  extends JpaRepository<Account, Long> {}
package com.example.batchtp.repository;

import com.example.batchtp.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {


}

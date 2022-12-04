package com.example.batchtp.repository;

import com.example.batchtp.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
    List<Transaction>findTransactionsByDateTransactionAfter(Date date);
}

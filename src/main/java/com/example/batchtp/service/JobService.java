package com.example.batchtp.service;

import com.example.batchtp.entity.Account;
import com.example.batchtp.entity.Transaction;
import com.example.batchtp.repository.AccountRepository;
import com.example.batchtp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;
@Service
public class JobService {
    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    AccountRepository accountRepository;
    public void debiter(){
        Date date=new Date();
        date.setHours(0);
        date.setMinutes(0);
        date.setSeconds(0);
        date.setMonth(date.getMonth()-1);
        List<Transaction> transactions = transactionRepository.findTransactionsByDateTransactionAfter(date);
        transactions.forEach(transaction -> {
            double montant=transaction.getMontant();
            Account account=transaction.getAccount();
            account.setSolde(account.getSolde()-montant);
            accountRepository.save(account);
        });

    }



}


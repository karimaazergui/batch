package com.example.batchtp.mapper.implimentation;

import com.example.batchtp.dto.TransactionDto;
import com.example.batchtp.entity.Account;
import com.example.batchtp.entity.Transaction;
import com.example.batchtp.mapper.ITransactionMapper;
import com.example.batchtp.repository.AccountRepository;
import com.example.batchtp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TransactionMapper implements ITransactionMapper {
    @Autowired
    AccountRepository accountRepository;
    @Override
    public Transaction dtoToEntity(TransactionDto transactionDto) {
        Account account=accountRepository.findById(transactionDto.getIdAccount()).get();
        return Transaction.builder()
                .idTransaction(transactionDto.getIdTransaction())
                .account(account)
                .dateTransaction(transactionDto.getDateTransaction())
                .montant(transactionDto.getMontant())
                .build();
    }

    @Override
    public TransactionDto entityToDto(Transaction transaction) {

        /*
        return TransactionDto.builder().idTransaction(transaction.getIdTransaction())
                .dateTransaction(transaction.getDateTransaction())
                .idAccount(transaction.getAccount().getIdAccount())
                .montant(transaction.getMontant())
                .build();

         */
        return null;
    }
}

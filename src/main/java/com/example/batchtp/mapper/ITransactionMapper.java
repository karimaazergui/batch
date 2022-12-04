package com.example.batchtp.mapper;

import com.example.batchtp.dto.TransactionDto;
import com.example.batchtp.entity.Transaction;

public interface ITransactionMapper {

    Transaction dtoToEntity (TransactionDto transactionDto);
    TransactionDto entityToDto(Transaction transaction);

}

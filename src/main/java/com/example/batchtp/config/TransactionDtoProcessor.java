package com.example.batchtp.config;

import com.example.batchtp.dto.TransactionDto;
import com.example.batchtp.entity.Transaction;
import com.example.batchtp.mapper.ITransactionMapper;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

public class TransactionDtoProcessor implements ItemProcessor<TransactionDto,Transaction> {
    @Autowired
    ITransactionMapper iTransactionMapper;
    @Override
    public Transaction process(TransactionDto transactionDto) throws Exception {
        return  iTransactionMapper.dtoToEntity(transactionDto);
    }
}

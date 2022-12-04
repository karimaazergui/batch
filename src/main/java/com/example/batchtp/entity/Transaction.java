package com.example.batchtp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transaction {
    @Id
    private int idTransaction;

    private double montant;
    private Date dateTransaction;

    @ManyToOne
    private Account account;

}

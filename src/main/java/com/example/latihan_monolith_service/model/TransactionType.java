package com.example.latihan_monolith_service.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "transaction_type")
public class TransactionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transaction_type_id", columnDefinition = "BIGINT")
    private BigInteger transactionTypeId;
    @Column(name="transaction_code", nullable = false, unique = true, length = 50)
    private String transactionCode;
    @Column(name="transaction_name", nullable = false, length = 255)
    private String transactionName;
    @OneToMany(mappedBy = "transactionType")
    private List<TransactionHistory> transactionHistory;

    public BigInteger getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(BigInteger transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }


}

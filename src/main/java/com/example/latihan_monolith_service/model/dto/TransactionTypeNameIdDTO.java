package com.example.latihan_monolith_service.model.dto;

import java.math.BigInteger;

public class TransactionTypeNameIdDTO {

    private BigInteger transactionTypeId;
    private  String transactionName;

    public TransactionTypeNameIdDTO(BigInteger transactionTypeId, String transactionName) {
        this.transactionTypeId = transactionTypeId;
        this.transactionName = transactionName;
    }

    public BigInteger getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(BigInteger transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }
}

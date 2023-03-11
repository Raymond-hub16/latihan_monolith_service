package com.example.latihan_monolith_service.model.dto;

import java.math.BigInteger;

public class TransactionTypeDTO {

    private BigInteger transactionTypeId;
    private String transactionCode;
    private  String transacionName;

    public TransactionTypeDTO(BigInteger transactionTypeId, String transactionCode, String transacionName) {
        this.transactionTypeId = transactionTypeId;
        this.transactionCode = transactionCode;
        this.transacionName = transacionName;
    }

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

    public String getTransacionName() {
        return transacionName;
    }

    public void setTransacionName(String transacionName) {
        this.transacionName = transacionName;
    }
}

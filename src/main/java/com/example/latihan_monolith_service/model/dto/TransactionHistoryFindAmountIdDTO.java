package com.example.latihan_monolith_service.model.dto;

import java.math.BigInteger;
import java.util.Date;

public class TransactionHistoryFindAmountIdDTO {

    private BigInteger transactionHistoryId;

    private BigInteger amount;

    public TransactionHistoryFindAmountIdDTO(BigInteger transactionHistoryId, BigInteger amount) {
        this.transactionHistoryId = transactionHistoryId;
        this.amount = amount;
    }

    public BigInteger getTransactionHistoryId() {
        return transactionHistoryId;
    }

    public void setTransactionHistoryId(BigInteger transactionHistoryId) {
        this.transactionHistoryId = transactionHistoryId;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }
}

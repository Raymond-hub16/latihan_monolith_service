package com.example.latihan_monolith_service.model.dto;

import java.math.BigInteger;
import java.util.Date;

public class TransactionHistoryDTO {

    private BigInteger transactionHistoryId;
    private Date activityDate;

    private BigInteger amount;

    public TransactionHistoryDTO(BigInteger transactionHistoryId, Date activityDate, BigInteger amount) {
        this.transactionHistoryId = transactionHistoryId;
        this.activityDate = activityDate;
        this.amount = amount;
    }

    public BigInteger getTransactionHistoryId() {
        return transactionHistoryId;
    }

    public void setTransactionHistoryId(BigInteger transactionHistoryId) {
        this.transactionHistoryId = transactionHistoryId;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }
}

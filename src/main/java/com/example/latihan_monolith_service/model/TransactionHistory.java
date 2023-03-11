package com.example.latihan_monolith_service.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "transaction_history")
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transaction_history_id",columnDefinition = "BIGINT")
    private BigInteger transactionHistoryId;
    @Column(name="activity_date", nullable = false, unique = true, length = 50)
    private Timestamp activityDate;
    @Column(name="amount",columnDefinition = "BIGINT", nullable = false)
    private BigInteger amount;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "user_id", nullable = false, insertable = false, updatable = false)
    private Users users;
    @Column(name="user_id",columnDefinition = "BIGINT")
    private BigInteger userId;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "transaction_type_id",referencedColumnName = "transaction_type_id",nullable = false, insertable = false, updatable = false)
    private TransactionType transactionType;
    @Column(name="transaction_type_id",columnDefinition = "BIGINT")
    private BigInteger transactionTypeId;

    public void setTransactionHistoryId(BigInteger transactionHistoryId) {
        this.transactionHistoryId = transactionHistoryId;
    }

    public Timestamp getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Timestamp activityDate) {
        this.activityDate = activityDate;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public BigInteger getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(BigInteger transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }







}

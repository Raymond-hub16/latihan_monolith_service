package com.example.latihan_monolith_service.model;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "user" )

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id", nullable = false, columnDefinition = "BIGINT")
    private BigInteger userId;
    @Column(name="username", nullable = false, unique = true, length = 100)
    private String username;
    @Column(name="password_hash", nullable = false, unique = true, length = 255)
    private String password;
    @Column(name="account_number", unique = true, length = 50)
    private String accountNumber;
    @OneToMany(mappedBy = "users",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<TransactionHistory> transactionHistory;
    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


}

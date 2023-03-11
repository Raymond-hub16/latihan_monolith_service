package com.example.latihan_monolith_service.controller;

import com.example.latihan_monolith_service.model.TransactionHistory;
import com.example.latihan_monolith_service.model.dto.TransactionHistoryDTO;
import com.example.latihan_monolith_service.model.dto.TransactionHistoryFindAmountIdDTO;
import com.example.latihan_monolith_service.model.dto.TransactionTypeDTO;
import com.example.latihan_monolith_service.service.TransactionHistoryService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("api/v1/transaction-history")
public class TransactionHistoryController {

    @Autowired
    TransactionHistoryService transactionHistoryService;

    @GetMapping("find-all-history-transaction")
    public  List<TransactionHistoryDTO> findAllTransactionHistory() {
        return  transactionHistoryService.findAllTransactionHistory();
    }

    @GetMapping("find-id-amount-history-transaction")
    public  List<TransactionHistoryFindAmountIdDTO> findIdAmountTransactionHistory(){
        return  transactionHistoryService.findIdAmountTransactionHistory();
    }

    @GetMapping("find-transaction-history-by-amount")
    public  List<TransactionHistoryDTO> findAllandFilterByAmountService(@RequestParam("price")BigInteger price){
        return  transactionHistoryService.findAllandFilterByAmountService(price);
    }
    @PostMapping()
    public ResponseEntity<String> addTransactionHistoryService(@RequestBody TransactionHistoryDTO request){
        String response = transactionHistoryService.addTransactionHistoryService(request);
        return new ResponseEntity<>(response, HttpStatus.OK.CREATED);
    }
}

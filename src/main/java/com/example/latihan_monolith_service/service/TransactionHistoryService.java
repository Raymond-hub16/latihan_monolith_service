package com.example.latihan_monolith_service.service;


import com.example.latihan_monolith_service.model.TransactionHistory;
import com.example.latihan_monolith_service.model.dto.TransactionHistoryDTO;
import com.example.latihan_monolith_service.model.dto.TransactionHistoryFindAmountIdDTO;
import com.example.latihan_monolith_service.model.dto.TransactionTypeDTO;
import com.example.latihan_monolith_service.model.dto.TransactionTypeNameIdDTO;
import com.example.latihan_monolith_service.repository.TransactionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

@Service
public class TransactionHistoryService {
    @Autowired
    TransactionHistoryRepository transactionHistoryRepository;

    public  List<TransactionHistoryDTO> findAllTransactionHistory() {
      return  transactionHistoryRepository.findAllTransactionHistory();
  }

    public  List<TransactionHistoryFindAmountIdDTO> findIdAmountTransactionHistory() {
        return  transactionHistoryRepository.findIdAmountTransactionHistory();
    }

    public  List<TransactionHistoryDTO> findAllandFilterByAmountService(BigInteger price) {
        return  transactionHistoryRepository.findAllandFilterByAmount(price);
    }

    @Transactional
    public String addTransactionHistoryService(TransactionHistoryDTO request ){

         TransactionHistory th = new TransactionHistory();
         UUID transactionHistoryId = UUID.randomUUID();
         th.setAmount(request.getAmount());
         UUID activityDate = UUID.randomUUID();

          transactionHistoryRepository.save(th);
          return "Data Transaction successfully.";
    }


}

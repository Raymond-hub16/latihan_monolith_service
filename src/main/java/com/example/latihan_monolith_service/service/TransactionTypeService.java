package com.example.latihan_monolith_service.service;


import com.example.latihan_monolith_service.model.TransactionType;
import com.example.latihan_monolith_service.model.dto.TransactionTypeDTO;
import com.example.latihan_monolith_service.model.dto.TransactionTypeNameIdDTO;
import com.example.latihan_monolith_service.repository.TransactionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

//
//@Service
//public class TransactionTypeService {
//
//    @Autowired
//    TransactionTypeRepository transactionTypeRepository;
//
//    public List<TransactionTypeDTO> findAllTransactionTypeService () {
//
//        return transactionTypeRepository.findAllTransactionType();
//
//    }

@Service
public  class TransactionTypeService {

    @Autowired
    TransactionTypeRepository transactionTypeRepository;

    public List<TransactionTypeDTO> findAllTransactionTypeService() {
        return transactionTypeRepository.findAllTransactionType();
    }
    public List<TransactionTypeNameIdDTO> findNameAndIdService(){
        return transactionTypeRepository.findNameAndId();
    }
    public List<TransactionTypeDTO> findAllTransactionTypeByNameService(String name){
        return transactionTypeRepository.findAllTransactionTypeByName("%"+name+"%");
  }
    @Transactional
    public String addOrUpdateTransactionTypeService(TransactionTypeDTO request) {
                TransactionType t = new TransactionType();
                UUID transactionCode = UUID.randomUUID();
                t.setTransactionName(request.getTransacionName());
                t.setTransactionCode(transactionCode.toString());
                transactionTypeRepository.save(t);
                return "Data Transaction Type Successfull";
    }



}


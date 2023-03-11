package com.example.latihan_monolith_service.controller;


import com.example.latihan_monolith_service.model.dto.TransactionTypeDTO;
import com.example.latihan_monolith_service.model.dto.TransactionTypeNameIdDTO;
import com.example.latihan_monolith_service.service.TransactionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/transaction-type")
public class TransactionTypeController {


    @Autowired
    TransactionTypeService transactionTypeService;

    @GetMapping("find-all-transaction")
    public  List<TransactionTypeDTO> findAllTransactionType() {
        return  transactionTypeService.findAllTransactionTypeService();
    }

    @GetMapping("find-all-transaction-name-id")
    public List<TransactionTypeNameIdDTO> findNameAndId() {
        return transactionTypeService.findNameAndIdService();
    }

    @GetMapping("find-transactiontype-by-name")
    public List<TransactionTypeDTO> findAllTransactionTypeByNameService(@RequestParam(name = "name")String name){
        return  transactionTypeService.findAllTransactionTypeByNameService(name);
    }

    @PostMapping()
    public  ResponseEntity<String> addorUpdateTransactionType(@RequestBody TransactionTypeDTO request){

        String response = transactionTypeService.addOrUpdateTransactionTypeService(request);
        return  new ResponseEntity<>(response, HttpStatus.OK.CREATED);


    }

//    @PostMapping()
//    public ResponseEntity<String> addOrUpdateTransaction(@AuthenticationPrincipal UserDetails ud, @RequestBody TransactionHistory request){
//        String response = transactionHistoryService.addOrUpdateTransactionService(ud.getUsername(),request);
//        return new ResponseEntity<>(response, HttpStatus.OK.CREATED);
//    }





}

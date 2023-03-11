package com.example.latihan_monolith_service.repository;

import com.example.latihan_monolith_service.model.dto.TransactionHistoryDTO;
import com.example.latihan_monolith_service.model.TransactionHistory;
import com.example.latihan_monolith_service.model.dto.TransactionHistoryFindAmountIdDTO;
import com.example.latihan_monolith_service.model.dto.TransactionTypeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Long> {


    @Query("select new com.example.latihan_monolith_service.model.dto.TransactionHistoryDTO( "
            +"th.transactionHistoryId, th.activityDate,th.amount)from TransactionHistory th")
    List<TransactionHistoryDTO> findAllTransactionHistory();

    @Query("Select new com.example.latihan_monolith_service.model.dto.TransactionHistoryFindAmountIdDTO( "
                  +"th.transactionHistoryId,th.amount) from TransactionHistory th")
     List<TransactionHistoryFindAmountIdDTO> findIdAmountTransactionHistory();

    @Query("Select new com.example.latihan_monolith_service.model.dto.TransactionHistoryDTO( "+
            "th.transactionHistoryId, th.activityDate, th.amount)from TransactionHistory th where th.amount =:price")
    List<TransactionHistoryDTO> findAllandFilterByAmount(@Param("price")BigInteger price);


}

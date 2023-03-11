package com.example.latihan_monolith_service.repository;

import com.example.latihan_monolith_service.model.TransactionType;
import com.example.latihan_monolith_service.model.dto.TransactionTypeDTO;
import com.example.latihan_monolith_service.model.dto.TransactionTypeNameIdDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionTypeRepository extends JpaRepository<TransactionType, Long> {

//    @Query("select new git.oba_transaction_service.model.dto.transactionType.TransactionTypeDTO( " +
//            "t.transactionTypeId, t.transactionCode, t.transactionName " +
//            ") from TransactionType t where " +
//            "lower(t.transactionName) like lower(:name) order by t.transactionTypeId desc")
//    List<TransactionTypeDTO> findAllAndFilterByname(String name);

//@Query("select new com.example.latihan_monolith_service.model.dto.TransactionTypeDTO( " +
//        "tp.transactionTypeId, tp.transactionCode, tp.transactionName) from TransactionType tp ")
//    List<TransactionTypeDTO> findAllTransactionType();

    @Query("select new com.example.latihan_monolith_service.model.dto.TransactionTypeDTO( "
    +"tp.transactionTypeId, tp.transactionCode, tp.transactionName) from TransactionType tp")
    List<TransactionTypeDTO> findAllTransactionType();


    @Query("select new com.example.latihan_monolith_service.model.dto.TransactionTypeNameIdDTO( "
            +"tp.transactionTypeId, tp.transactionName) from TransactionType tp")
    List<TransactionTypeNameIdDTO> findNameAndId();

    @Query("select new com.example.latihan_monolith_service.model.dto.TransactionTypeDTO( "
            +"tp.transactionTypeId, tp.transactionName,tp.transactionCode) from TransactionType tp " +
            "where lower(tp.transactionName) like lower(:name)" )
    List<TransactionTypeDTO> findAllTransactionTypeByName(@Param("name")String name);











}

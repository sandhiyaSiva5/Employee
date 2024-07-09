package com.example.employee.Service;

import com.example.employee.Model.Transaction;
import com.example.employee.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> getTransactionById(long id) {
        return transactionRepository.findById(id);
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public Transaction updateTransaction(long id, Transaction transactionDetails) {
        Optional<Transaction> optionalTransaction = transactionRepository.findById(id);
        if (optionalTransaction.isPresent()) {
            Transaction transaction = optionalTransaction.get();
            transaction.setOrderId(transactionDetails.getOrderId());
            transaction.setTransactionNumber(transactionDetails.getTransactionNumber());
            transaction.setStatus(transactionDetails.getStatus());
            transaction.setOrderDate(transactionDetails.getOrderDate());
            transaction.setDeliveryDate(transactionDetails.getDeliveryDate());
            return transactionRepository.save(transaction);
        } else {
            return null;
        }
    }
    public void deleteTransaction(long id) {
        transactionRepository.deleteById(id);
    }
}

package com.qsoft.bankaccount.persistence.dao;

import com.qsoft.bankaccount.persistence.model.Transaction;

import java.util.List;

/**
 * User: tienhd
 * Date: 7/12/13
 * Time: 12:05 AM
 */
public interface TransactionDAO extends GenericDAO
{
    public List<Transaction> findByAccountNumber(String accountNumber);
    public List<Transaction> findBetween2TimeStamp(String accountNumber, long startTime, long endTime);
    public List<Transaction> findNLastest(String accountNumber, int n);
    public Transaction findById(int id);
    public void create(String accountNumber, double amount, String log);
    public void deleteByAccountNumber(String accountNumber);
}

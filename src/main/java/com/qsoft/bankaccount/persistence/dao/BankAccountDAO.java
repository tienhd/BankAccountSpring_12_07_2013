package com.qsoft.bankaccount.persistence.dao;

import com.qsoft.bankaccount.persistence.model.BankAccount;

/**
 * User: tienhd
 * Date: 7/12/13
 * Time: 12:01 AM
 */
public interface BankAccountDAO extends GenericDAO
{
    public BankAccount findByAccountNumber(String accountNumber);

    public BankAccount create(String accountNumber);

    public void update(String accountNumber, double balance, String log);

    public void deleteByAccountNumber(String accountNumber);
}

package com.qsoft.bankaccount.persistence.dao.impl;

import com.qsoft.bankaccount.persistence.dao.BankAccountDAO;
import com.qsoft.bankaccount.persistence.model.BankAccount;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;

/**
 * User: tienhd
 * Date: 7/12/13
 * Time: 1:56 PM
 */
@Transactional
public class BankAccountDAOImpl extends GenericDAOImpl implements BankAccountDAO
{
    @Override
    public BankAccount findByAccountNumber(String accountNumber)
    {
        Query query = entityManager.createQuery("select o from BankAccount o where o.accountNumber = :accountNumber");
        query.setParameter("accountNumber", accountNumber);
        if (query.getResultList().size() > 0)
        {
            return (BankAccount) query.getResultList().get(0);
        }
        else
        {
            return null;
        }
    }

    @Override
    public BankAccount create(String accountNumber)
    {
        BankAccount bankAccount = new BankAccount(accountNumber);
        entityManager.persist(bankAccount);
        return bankAccount;
    }

    @Override
    public void update(String accountNumber, double balance, String log)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteByAccountNumber(String accountNumber)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

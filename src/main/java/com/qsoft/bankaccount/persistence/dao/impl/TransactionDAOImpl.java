package com.qsoft.bankaccount.persistence.dao.impl;

import com.qsoft.bankaccount.persistence.dao.TransactionDAO;
import com.qsoft.bankaccount.persistence.model.Transaction;

import javax.persistence.Query;
import java.util.List;

/**
 * User: tienhd
 * Date: 7/15/13
 * Time: 1:40 PM
 */
public class TransactionDAOImpl extends GenericDAOImpl implements TransactionDAO
{
    @Override
    public List<Transaction> findByAccountNumber(String accountNumber)
    {
        Query query = entityManager.createQuery("select c from Transaction c where c.accountNumber =:accountNumber");
        query.setParameter("accountNumber",accountNumber);
        return query.getResultList();
    }

    @Override
    public List<Transaction> findBetween2TimeStamp(String accountNumber, long startTime, long endTime)
    {
        Query query = entityManager.createQuery("select c from Transaction c where c.accountNumber =:accountNumber and c.timeStamp >=:startTime and " +
                "c.timeStamp <= :endTime");
        query.setParameter("accountNumber",accountNumber);
        query.setParameter("startTime",startTime);
        query.setParameter("endTime",endTime);
        return query.getResultList();
    }

    @Override
    public List<Transaction> findNLastest(String accountNumber, int n)
    {
        Query query = entityManager.createQuery("select c from Transaction c where c.accountNumber = :accountNumber" +
                " order by c.timeStamp desc ");
        query.setMaxResults(n);
        query.setParameter("accountNumber",accountNumber);
        return query.getResultList();
    }

    @Override
    public Transaction findById(int id)
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void create(String accountNumber, double amount, String log)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteByAccountNumber(String accountNumber)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}

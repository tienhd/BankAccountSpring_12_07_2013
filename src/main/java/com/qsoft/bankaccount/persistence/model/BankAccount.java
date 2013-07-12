package com.qsoft.bankaccount.persistence.model;

import javax.persistence.*;

/**
 * User: tienhd
 * Date: 7/12/13
 * Time: 2:09 PM
 */
@Entity
@Table(name = "bank_account")
@SequenceGenerator(name = "account_id", sequenceName = "account_id", allocationSize = 1)
public class BankAccount
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_id")
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "account_balance")
    private double balance;

    @Column(name = "account_description")
    private String log;

    @Column(name = "time_stamp")
    private long timeStamp;

    public BankAccount()
    {

    }

    public BankAccount(String accountNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.log = "";
        this.timeStamp = System.currentTimeMillis();
    }

    public BankAccount(String accountNumber, double balance, long timeStamp)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.log = "";
        this.timeStamp = timeStamp;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getLog()
    {
        return log;
    }

    public long getTimeStamp()
    {
        return timeStamp;
    }

    public long getId()
    {
        return id;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setLog(String log)
    {
        this.log = log;
    }

    public void setTimeStamp(long timeStamp)
    {
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        BankAccount that = (BankAccount) o;

        if (Double.compare(that.balance, balance) != 0)
        {
            return false;
        }
        if (timeStamp != that.timeStamp)
        {
            return false;
        }
        if (!accountNumber.equals(that.accountNumber))
        {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        return 0;
    }
}

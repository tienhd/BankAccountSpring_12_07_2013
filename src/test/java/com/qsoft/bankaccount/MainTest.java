package com.qsoft.bankaccount;

import com.qsoft.bankaccount.persistence.dao.BankAccountDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: tienhd
 * Date: 7/12/13
 * Time: 2:21 PM
 */
public class MainTest
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("test-config.xml");
        BankAccountDAO bankAccountDAO = (BankAccountDAO) context.getBean("bankAccountDao");
    }
}


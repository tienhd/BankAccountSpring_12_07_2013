package com.qsoft.bankaccount.persistence.dao;

/**
 * User: tienhd
 * Date: 7/12/13
 * Time: 2:09 PM
 */
public interface GenericDAO
{
    public Object findById(Class clazz, long id);
    public void delete(Object obj);
    public void deleteById(Class clazz, long id);
    public void create(Object obj);
    public void update(Object obj);
}

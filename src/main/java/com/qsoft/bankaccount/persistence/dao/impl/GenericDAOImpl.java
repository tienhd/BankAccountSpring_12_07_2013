package com.qsoft.bankaccount.persistence.dao.impl;

import com.qsoft.bankaccount.persistence.dao.GenericDAO;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * User: tienhd
 * Date: 7/5/13
 * Time: 11:29 AM
 */
public abstract class GenericDAOImpl implements GenericDAO
{
    @PersistenceContext
    public EntityManager entityManager;

    public Object findById(Class clazz, long id)
    {
        return entityManager.find(clazz,id);
    }

    public void delete(Object obj)
    {
        entityManager.remove(obj);
    }

    public void deleteById (Class clazz, long id)
    {
        Object obj = findById(clazz,id);
        entityManager.remove(obj);
    }

    @Transactional
    public void create(Object obj)
    {
        entityManager.persist(obj);
    }

    @Transactional
    public void update(Object obj)
    {
        entityManager.merge(obj);
        entityManager.persist(obj);
    }
}

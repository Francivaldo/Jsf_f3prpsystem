package br.com.f3prosystem.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;

public interface InterfaceDAO<T> {

    void save(T entity);

    /**
     *
     * @param entity
     */
    void updete(T entity);

    void remove(T entity);

    void marge(T entity);

    T getEntity(Serializable id);

    T getEntityByDetachedCriteria(DetachedCriteria criteria);

    List<T> getEntities();

    List<T> getListByDetachedCriteria(DetachedCriteria criteria);

}

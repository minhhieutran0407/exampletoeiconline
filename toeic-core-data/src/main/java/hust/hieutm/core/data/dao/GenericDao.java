package hust.hieutm.core.data.dao;

import hust.hieutm.core.common.utils.HibernateUtil;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<ID extends Serializable, T> {
    List<T> findAll();

    T update(T entity);

    public void save(T entity);

    T findById(ID id);

    Object[] findByProperty(String property, Object value, String sortExpression, String sortDirection);

    Integer delete(List<ID> ids);
}

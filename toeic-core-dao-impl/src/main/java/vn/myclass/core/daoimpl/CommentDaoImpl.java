package vn.myclass.core.daoimpl;

import vn.myclass.core.dao.CommentDao;
import vn.myclass.core.data.daoimpl.AbstractDao;
import vn.myclass.core.persistence.entity.CommentEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 24/11/2017.
 */
public class CommentDaoImpl extends AbstractDao<Integer, CommentEntity> implements CommentDao {
    public List<CommentEntity> findAll() {
        return null;
    }

    public CommentEntity update(CommentEntity entity) {
        return null;
    }

    public CommentEntity save(CommentEntity entity) {
        return null;
    }

    public CommentEntity findById(Integer var1) {
        return null;
    }

    public Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit, String whereClause) {
        return new Object[0];
    }

    public Integer delete(List<Integer> integers) {
        return null;
    }

    public CommentEntity findEqualUnique(String property, Object value) {
        return null;
    }
}

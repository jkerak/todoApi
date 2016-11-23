package com.jkerak.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public abstract class GenericSql2oRepository<T> {

    @Autowired
    private Sql2o sql2o;

    private final String TABLE_NAME;
    private final Class<T> genericType;

    public GenericSql2oRepository() {
        this.genericType = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), GenericSql2oRepository.class);
        TABLE_NAME = this.genericType.getName();
    }

    public T findById(long id){
        String sql = "SELECT *" +
                "     FROM  [:tableName] " +
                "     WHERE id = :id";
        try(Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .addParameter("id", id)
                    .addParameter("tableName", TABLE_NAME)
                    .executeAndFetchFirst(genericType);
        }
    }

}

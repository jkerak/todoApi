package com.jkerak.repository;

import com.jkerak.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.sql2o.Sql2o;

@Component
public class TodoRepository extends GenericSql2oRepository<Todo> {
        public void doSOmething(){

        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tien Hoang D
 */
public interface BaseDao<T> {

    List<T> getAll() throws SQLException;

    void insert(T t) throws SQLException;

    void update(T t) throws SQLException;

    T    getOne(T t) throws SQLException;

    void delete(T t) throws SQLException;
}

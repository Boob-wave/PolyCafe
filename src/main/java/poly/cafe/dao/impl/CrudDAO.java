/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.cafe.dao.impl;

import java.util.List;

/**
 *
 * @author namho
 */
public interface CrudDAO<T, ID> {
 T create(T entity);
 void update(T entity);
 void deleteById(ID id);
 List<T> findAll();
 T findById(ID id);
}

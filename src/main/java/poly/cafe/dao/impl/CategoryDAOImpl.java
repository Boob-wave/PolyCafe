/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.cafe.dao.impl;

import poly.cafe.entity.Category;

/**
 *
 * @author namho
 */
public class CategoryDAOImpl implements CategoryDAO {
 String createSql = "INSERT INTO Categories(Id, Name) VALUES(?, ?)";
 String updateSql = "UPDATE Categories SET Name=? WHERE Id=?";
 String deleteSql = "DELETE FROM Categories WHERE Id=?";
 String findAllSql = "SELECT * FROM Categories";
 String findByIdSql = "SELECT * FROM Categories WHERE Id=?";
 @Override
 public Category create(Category entity) {
 Object[] values = {
 entity.getId(),
 entity.getName()
 };
 XJdbc.executeUpdate(createSql, values);
 return entity;
 }
 @Override
 public void update(Category entity) {
 Object[] values = {
 entity.getName(),
 entity.getId()
 };
 XJdbc.executeUpdate(updateSql, values);
 }
 @Override
 public void deleteById(String id) {
 XJdbc.executeUpdate(deleteSql, id);
 }
 @Override
 public List<Category> findAll() {
 return XQuery.getEntityList(Category.class, findAllSql);
 }
 @Override
 public Category findById(String id) {
 return XQuery.getSingleBean(Category.class, findByIdSql, id);
 }

    @Override
    public Category create(Category entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Category entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

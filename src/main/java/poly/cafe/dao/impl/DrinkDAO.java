/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.cafe.dao.impl;

import java.util.List;
import poly.cafe.entity.Drink;

/**
 *
 * @author namho
 */
public interface DrinkDAO extends CrudDAO<Drink, String>{
 List<Drink> findByCategoryId(String categoryId);
}

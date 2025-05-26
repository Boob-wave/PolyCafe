/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.cafe.dao.impl;

import java.util.List;
import poly.cafe.entity.Bill;

/**
 *
 * @author namho
 */
public interface BillDAO extends CrudDAO<Bill, Long>{
 List<Bill> findByUsername(String username);
 List<Bill> findByCardId(Integer cardId);
}

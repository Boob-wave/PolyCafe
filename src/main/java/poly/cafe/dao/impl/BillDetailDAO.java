/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.cafe.dao.impl;

import java.util.List;
import poly.cafe.entity.BillDetail;

/**
 *
 * @author namho
 */
public interface BillDetailDAO extends CrudDAO<BillDetail, Long>{
 List<BillDetail> findByBillId(Long billId);
 List<BillDetail> findByDrinkId(String drinkId);  
}

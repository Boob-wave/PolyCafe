/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.cafe.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author namho
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Drink {
 private String id;
 private String name;
 @Builder.Default
 private String image = "product.png";
 private double unitPrice;
 private double discount;
 private boolean available;
 private String categoryId;
}

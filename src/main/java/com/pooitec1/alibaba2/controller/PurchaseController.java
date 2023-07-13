package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Purchase;
import com.pooitec1.alibaba2.entity.Seller;
import com.pooitec1.alibaba2.entity.User;
import com.pooitec1.alibaba2.service.LoteProductService;
import com.pooitec1.alibaba2.service.PurchaseService;
import com.pooitec1.alibaba2.service.SellerService;
import com.pooitec1.alibaba2.service.UserService;
import java.util.List;

/**
 *
 * @author nadia
 */
public class PurchaseController {

    private Purchase newPurchase;
    private final UserService userService;
   
     private final LoteProductService stockService;

    private final PurchaseService purchaseService;

    public PurchaseController() {

        this.newPurchase = new Purchase();

        this.purchaseService = new PurchaseService();
        this.stockService= new LoteProductService();
        this.userService = new UserService();

    }

    public PurchaseController(User user) {
        this.newPurchase = new Purchase();
        this.purchaseService = new PurchaseService();
        this.userService = new UserService();
        this.stockService= new LoteProductService();
        newPurchase.setEmployee(this.userService.findEmployeeByUser(user));
    }
    
    
   public List<LoteProduct> findByProductCode(String code){
       return stockService.findByCodeProduct(code);
   }
    
     public Purchase getNewPurchase() {
        return newPurchase;
    }

}

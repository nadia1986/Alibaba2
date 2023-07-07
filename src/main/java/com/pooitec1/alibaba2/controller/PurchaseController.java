package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.Purchase;
import com.pooitec1.alibaba2.entity.Seller;
import com.pooitec1.alibaba2.entity.User;
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
    private final SellerService sellerService;

    private final PurchaseService purchaseService;

    public PurchaseController() {

        this.newPurchase = new Purchase();

        this.purchaseService = new PurchaseService();
        this.sellerService= new SellerService();
        this.userService = new UserService();

    }

    public PurchaseController(User user) {
        this.newPurchase = new Purchase();
        this.purchaseService = new PurchaseService();
        this.userService = new UserService();
        this.sellerService= new SellerService();
        newPurchase.setEmployee(this.userService.findEmployeeByUser(user));
    }
    
    
     public List<Seller> findSellerByName(String name) {
        return sellerService.findBySellerName(name);
    }
    
     public Purchase getNewPurchase() {
        return newPurchase;
    }

}

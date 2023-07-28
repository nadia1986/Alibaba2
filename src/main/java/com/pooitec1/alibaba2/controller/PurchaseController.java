package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Purchase;
import com.pooitec1.alibaba2.entity.Seller;
import com.pooitec1.alibaba2.entity.User;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.service.PurchaseService;
import com.pooitec1.alibaba2.service.UserService;
import java.util.List;


/**
 *
 * @author nadia
 */
public class PurchaseController {

    private Purchase newPurchase;
    private final UserService userService;
    private final PurchaseService purchaseService;

    public PurchaseController() {

        this.newPurchase = new Purchase();
        this.purchaseService = new PurchaseService();
        this.userService = new UserService();

    }

    public PurchaseController(User user) {
        this.newPurchase = new Purchase();
        this.purchaseService = new PurchaseService();
        this.userService = new UserService();
        newPurchase.setEmployee(this.userService.findEmployeeByUser(user));
    }

    public List<LoteProduct> findByProductCode(String code) {
        return purchaseService.findByProductCode(code);
    }

    public Purchase getNewPurchase() {
        return newPurchase;
    }

    public List<Wharehouse> getWharehouses() {
        return purchaseService.getWharehouses();
    }

    public Wharehouse getWharehouseByName(String name) {
        return this.purchaseService.getWharehouseByName(name);
    }
    
      public Seller getSellerByName(String name){
        return purchaseService.getSellerByName(name);
    }

    public boolean verificarSectorProducto(LoteProduct loteProduct, Wharehouse wharehouse) {
        return purchaseService.verificarSectorProducto(loteProduct, wharehouse);
    }

    public List<Seller> getMayoristas() {
        return purchaseService.getMayoristas();
    }

    public void actualizarStockLote(LoteProduct loteProduct) throws Exception {
        this.purchaseService.actualizarStockLote(loteProduct);
    }

    public LoteProduct buscarLoteProduct(String code) {
        return purchaseService.buscarLoteProduct(code);
    }

    public List<LoteProduct> listarLoteProduct() {
        return this.purchaseService.listarLoteProduct();
    }

    public void findLoteProductById(Long idLote) {
        this.purchaseService.findLoteProductById(idLote);
    }

    public void savePurchase(Purchase purchase) {
        this.purchaseService.savePurchase(purchase);
    }
}

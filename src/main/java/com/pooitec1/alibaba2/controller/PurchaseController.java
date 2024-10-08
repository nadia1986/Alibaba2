package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.Purchase;
import com.pooitec1.alibaba2.entity.Sector;
import com.pooitec1.alibaba2.entity.Seller;
import com.pooitec1.alibaba2.entity.User;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.service.PurchaseService;
import java.util.List;

/**
 *
 * @author nadia
 */
public class PurchaseController {

    private Purchase newPurchase;

    private final PurchaseService purchaseService;

    public PurchaseController() {

        this.newPurchase = new Purchase();
        this.purchaseService = new PurchaseService();

    }

    public PurchaseController(User user) {
        this.newPurchase = new Purchase();
        this.purchaseService = new PurchaseService();

        newPurchase.setEmployee(this.purchaseService.findEmployeeByUser(user));
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

    public Seller getSellerByName(String name) {
        return purchaseService.getSellerByName(name);
    }

    public Sector verificarSectorProducto(Product product, Wharehouse wharehouse) {
        return purchaseService.verificarSectorProducto(product, wharehouse);
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

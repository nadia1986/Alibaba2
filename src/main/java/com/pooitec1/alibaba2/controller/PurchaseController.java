package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Purchase;
import com.pooitec1.alibaba2.entity.Seller;
import com.pooitec1.alibaba2.entity.User;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.service.LoteProductService;
import com.pooitec1.alibaba2.service.PurchaseService;
import com.pooitec1.alibaba2.service.SellerService;
import com.pooitec1.alibaba2.service.UserService;
import com.pooitec1.alibaba2.service.WharehouseService;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author nadia
 */
public class PurchaseController {

    private Purchase newPurchase;
    private final UserService userService;
    private final WharehouseService wharehouseService;
    private final LoteProductService stockService;
    private final SellerService sellerService;
   

    private final PurchaseService purchaseService;

    public PurchaseController() {

        this.newPurchase = new Purchase();
        this.purchaseService = new PurchaseService();
        this.stockService = new LoteProductService();
        this.userService = new UserService();
        this.wharehouseService = new WharehouseService();
        this.sellerService = new SellerService();

    }

    public PurchaseController(User user) {
        this.newPurchase = new Purchase();
        this.purchaseService = new PurchaseService();
        this.userService = new UserService();
        this.stockService = new LoteProductService();
        this.wharehouseService = new WharehouseService();
        this.sellerService = new SellerService();
        
        newPurchase.setEmployee(this.userService.findEmployeeByUser(user));
    }

    public List<LoteProduct> findByProductCode(String code) {
        return stockService.findByCodeProduct(code);
    }

    public Purchase getNewPurchase() {
        return newPurchase;
    }

    public Wharehouse getWharehouse(JComboBox comboBox) {
        return (Wharehouse) wharehouseService.obtenerAlmacenSeleccionado(comboBox);
    }

    public List<Wharehouse> getWharehouses() {
        return wharehouseService.getWharehouse();
    }

    public Wharehouse selectWharehouse(JComboBox<Wharehouse> comboBox) {
        return this.wharehouseService.obtenerAlmacenSeleccionado(comboBox);
    }

    public boolean verificarSectorProducto(LoteProduct loteProduct, Wharehouse wharehouse) {
        return wharehouseService.verificarSectorLote(loteProduct, wharehouse);
    }

    public List<Seller> getMayoristas() {
        return sellerService.getSeller();
    }

    public void actualizarStockLote(LoteProduct loteProduct) throws Exception {
        this.stockService.actualizaStock(loteProduct);
    }
    
    public LoteProduct buscarLoteProduct(String  code){
       return  this.stockService.buscarStockByProduct(code);
    }
    
    public List<LoteProduct> listarLoteProduct(){
        return this.stockService.getLoteProduct();
    }
    
    public void findLoteProductById(Long idLote){
        this.stockService.findLoteProductById(idLote);
    }
    public void savePurchase(Purchase purchase){
        this.purchaseService.savePurchase(purchase);
    }
}

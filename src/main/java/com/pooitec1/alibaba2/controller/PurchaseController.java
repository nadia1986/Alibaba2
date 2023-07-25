package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.Purchase;
import com.pooitec1.alibaba2.entity.Sector;
import com.pooitec1.alibaba2.entity.Seller;
import com.pooitec1.alibaba2.entity.User;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.service.LoteProductService;
import com.pooitec1.alibaba2.service.PurchaseService;
import com.pooitec1.alibaba2.service.SectorService;
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
    private Wharehouse wharehouse;
    private final UserService userService;
    private final WharehouseService wharehouseService;
    private final LoteProductService stockService;
    private final SellerService sellerService;
    private final SectorService sectorService;

    private final PurchaseService purchaseService;

    public PurchaseController() {

        this.newPurchase = new Purchase();
        this.sectorService = new SectorService();
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
        this.sectorService = new SectorService();
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

    //public boolean verificarSector(Product product, Wharehouse wharehouse){
    //return wharehouseService.(product, wharehouse);
    // }
    public List<Seller> getMayoristas() {
        return sellerService.getSeller();
    }

    public void actualizarStock(LoteProduct loteProduct, Integer quantity) {
        this.stockService.actualizarStock(loteProduct, quantity);
    }
    
    public LoteProduct buscarLoteProduct(Product product){
       return  this.sectorService.buscarLoteProductPorProducto(product);
    }
}

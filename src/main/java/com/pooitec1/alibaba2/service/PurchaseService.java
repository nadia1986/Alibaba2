
package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Purchase;
import com.pooitec1.alibaba2.entity.Seller;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import com.pooitec1.alibaba2.entity.repository.PurchaseRepository;
import java.util.List;

/**
 *
 * @author nadia
 */
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;
    private final SellerService sellerService;
    private final LoteProductService loteService;
    private final WharehouseService wharehouseService;

    public PurchaseService() {

        this.purchaseRepository = new PurchaseRepository(Conexion.getEmf());
        this.loteService = new LoteProductService();
        this.sellerService = new SellerService();
        this.wharehouseService = new WharehouseService();

    }

    public void actualizarStockLote(LoteProduct loteProduct) throws Exception {
        this.loteService.actualizaStock(loteProduct);
    }

    public LoteProduct buscarLoteProduct(String code) {
        return loteService.buscarStockByProduct(code);
    }

    public List<LoteProduct> listarLoteProduct() {
        return loteService.getLoteProduct();
    }

    public void findLoteProductById(Long idLote) {
        this.loteService.findLoteProductById(idLote);
    }
      public List<LoteProduct> findByProductCode(String code) {
        return loteService.findByCodeProduct(code);
    }

    public void savePurchase(Purchase purchase) {
        this.purchaseRepository.create(purchase);

    }

    public Seller getSellerByName(String name) {
        return this.sellerService.getSellerByName(name);
    }

    public List<Seller> getMayoristas() {
        return sellerService.getSeller();
    }

    public Wharehouse getWharehouseByName(String name) {
        return this.wharehouseService.getWharehouseByName(name);
    }
    

    public List<Wharehouse> getWharehouses() {
        return wharehouseService.getWharehouse();
    }

    public boolean verificarSectorProducto(LoteProduct loteProduct, Wharehouse wharehouse) {
        return wharehouseService.verificarSectorLote(loteProduct, wharehouse);
    }
}

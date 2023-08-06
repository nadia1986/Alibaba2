package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.Buyer;
import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.Sale;
import com.pooitec1.alibaba2.entity.SaleLine;
import com.pooitec1.alibaba2.entity.User;
import com.pooitec1.alibaba2.service.SaleService;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author nadia
 */
public class SaleController {

    private Sale newSale;

    private final SaleService saleService;

    public SaleController() {

        this.newSale = new Sale();

        this.saleService = new SaleService();

    }

    public SaleController(User user) {

        this.newSale = new Sale();

        this.saleService = new SaleService();

        newSale.setDateSale(LocalDate.now());
        newSale.setEmployee(this.saleService.findEmployeeByUser(user));

    }

    //FUNCION QUE LLAMO EN VENTA PASO 1 PARA BUSCAR CLIENTE
    public List<Buyer> findBuyerByDni(String dni) {
        return saleService.findBuyerByDni(dni);
    }

    //FUNCION QUE LLAMO EN VENTA PASO 3 PARA BUSCAR PRODUCTOS EN LoteProduct(porque el lote es quien tiene el producto)
    public List<LoteProduct> findProductByDescription(String description) {
        return saleService.findProductByDescription(description);
    }

    public LoteProduct buscarLoteProduct(String code) {
        return saleService.buscarLoteProduct(code);
    }

    public Integer traerStockMax(Product product) {
        return saleService.traerStockMax(product);
    }

    public Double obtenerPrecio(Product product) {
        return saleService.obtenerPrecio(product);
    }

    public SaleLine getNewSaleLine() {
        return saleService.getNewSaleLine();
    }

    public void saveSaleLine(SaleLine saleLine) {
        this.saleService.saveSaleLine(saleLine);
    }

    public Sale getNewSale() {
        return newSale;
    }

    public void saveSale(Sale sale) {
        this.saleService.saveSale(sale);

    }

    public void actualizarStockLote(LoteProduct loteProduct) throws Exception {
        this.saleService.actualizarStockLote(loteProduct);
    }

}

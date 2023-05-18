/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.Buyer;
import com.pooitec1.alibaba2.entity.Employee;
import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.Sale;
import com.pooitec1.alibaba2.entity.SaleLine;
import com.pooitec1.alibaba2.entity.User;
import com.pooitec1.alibaba2.service.BuyerService;
import com.pooitec1.alibaba2.service.SaleService;
import com.pooitec1.alibaba2.service.LoteProductService;
import com.pooitec1.alibaba2.service.SaleLineService;
import com.pooitec1.alibaba2.service.UserService;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author nadia
 */
public class SaleController {

    private Sale newSale;
    private final BuyerService buyerService;
    private final LoteProductService stockService;
    private final SaleLineService saleLineService;
    private final SaleService saleService;
    private final UserService userService;


    public SaleController() {

        this.newSale = new Sale();
        this.buyerService = new BuyerService();
        this.stockService = new LoteProductService();
        this.saleService = new SaleService();
        this.saleLineService = new SaleLineService();
        this.userService=new UserService();
       

    }

    public SaleController(User user) {

        this.newSale = new Sale();
       
        this.buyerService = new BuyerService();
        this.stockService = new LoteProductService();
        this.saleService = new SaleService();
        this.saleLineService = new SaleLineService();
        this.userService=new UserService();
        newSale.setDateSale(LocalDate.now());
        newSale.setEmployee(this.userService.findEmployeeByUser(user));
        
        
   

    }

    //FUNCION QUE LLAMO EN VENTA PASO 1 PARA BUSCAR CLIENTE
    public List<Buyer> findBuyerByDni(String dni) {
        return buyerService.findByDni(dni);
    }

    //FUNCION QUE LLAMO EN VENTA PASO 3 PARA BUSCAR PRODUCTOS EN LoteProduct(porque el lote es quien tiene el producto)
    public List<LoteProduct> findProductByDescription(String description) {
        return stockService.findByProductDescription(description);
    }
    
    public Integer traerStockMax( Product product){
        return stockService.verStockTotalProducto(product);
    }
    
    public Double obtenerPrecio(Product product){
        return stockService.obtenerPrecioVentaProducto(product);
    }

  

    public SaleLine getNewSaleLine() {
        return saleLineService.getNewSaleLine();
    }

    public void saveSaleLine(SaleLine saleLine) {
        this.saleLineService.saveSaleLine(saleLine);
    }

    public Sale getNewSale() {
        return newSale;
    }

    public void saveSale(Sale sale) {
        this.saleService.saveSale(sale);

    }

}


package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.service.LoteProductService;
import com.pooitec1.alibaba2.service.WharehouseService;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author nadia
 */
public class LoteProductController {
    
    private final LoteProductService loteService;
    private final WharehouseService wharehouseService;

    public LoteProductController( ) {
        this.loteService = new LoteProductService();
        this.wharehouseService=new WharehouseService();
    }
    
    public List<LoteProduct> getVencimientos(LocalDate fi, LocalDate ff){
        return this.loteService.getVencimientos(fi, ff);
    }
    
    public List<LoteProduct> getLoteProducts(String code){
        return this.loteService.findByCodeProduct(code);
    }
    
    public List<LoteProduct> getExpired(LocalDate fi){
        return this.loteService.getExpiredProduct(fi);
    }
    
     public List<Wharehouse> getWharehouses( ){
        return this.wharehouseService.getWharehouse();
    } 
   
}


package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.service.LoteProductService;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author nadia
 */
public class LoteProductController {
    
    private final LoteProductService loteService;

    public LoteProductController( ) {
        this.loteService = new LoteProductService();
    }
    
    public List<LoteProduct> getVencimientos(LocalDate fi, LocalDate ff){
        return this.loteService.getVencimientos(fi, ff);
    }
     
   
}

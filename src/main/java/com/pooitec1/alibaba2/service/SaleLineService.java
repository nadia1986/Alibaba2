/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.SaleLine;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import com.pooitec1.alibaba2.entity.repository.SaleLineRepository;
import java.util.List;

/**
 *
 * @author nadia
 */
public class SaleLineService {
    
     private  SaleLine newSaleLine;

    private SaleLineRepository saleLineRepository;

    public SaleLineService() {
        this.newSaleLine = new SaleLine();
        this.saleLineRepository = new SaleLineRepository(Conexion.getEmf());

    }

    public void saveSaleLine(SaleLine saleLine) {
        this.saleLineRepository.create(saleLine);

    }
    
      public SaleLine getNewSaleLine(){
        return newSaleLine;
    }

    
    public List<SaleLine> getSaleLines(){
        return this.saleLineRepository.findSaleLineEntities();
    }

}

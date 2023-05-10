/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pooitec1.alibaba2.service;


import com.pooitec1.alibaba2.entity.Sale;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import com.pooitec1.alibaba2.entity.repository.SaleRepository;


/**
 *
 * @author nadia
 */
public class SaleService {

    private final SaleRepository saleRepository;
  

    
    
    public SaleService() {

        this.saleRepository = new SaleRepository(Conexion.getEmf());
       

    }

 

    public  void saveSale(Sale sale) {
        this.saleRepository.create(sale);

    }

}

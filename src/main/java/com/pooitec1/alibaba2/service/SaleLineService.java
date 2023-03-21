/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.SaleLine;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import com.pooitec1.alibaba2.entity.repository.SaleLineRepository;

/**
 *
 * @author nadia
 */
public class SaleLineService {

    private  SaleLineRepository saleLineRepository;

    public SaleLineService() {

        //   this.newSaleLine = new SaleLine();
        // newSaleLine.setQuantity(quantity);
        // newSaleLine.setProduct(pr);
        this.saleLineRepository = new SaleLineRepository(Conexion.getEmf());

    }

    // public SaleLine getNewSaleLine() {
    //return newSaleLine;
    // }
    public void saveSaleLine(SaleLine saleLine) {
        this.saleLineRepository.create(saleLine);

    }

}

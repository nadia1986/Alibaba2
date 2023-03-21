/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.SaleLine;
import com.pooitec1.alibaba2.service.LoteProductService;
import com.pooitec1.alibaba2.service.SaleLineService;
import java.util.List;

/**
 *
 * @author nadia
 */
public class SaleLineController {

    private SaleLine newSaleLine;
    private final SaleLineService saleLineService;
    private final LoteProductService loteService;

    public SaleLineController() {
        this.newSaleLine = new SaleLine();

        this.loteService = new LoteProductService();
        this.saleLineService = new SaleLineService();

    }

    public List<LoteProduct> findProduct(String descripcion) {
        return this.loteService.findByProductDescription(descripcion);
    }

    public SaleLine getNewSaleLine() {
        return newSaleLine;
    }

    public void saveSaleLine(SaleLine saleLine) {
        this.saleLineService.saveSaleLine(saleLine);
    }

}

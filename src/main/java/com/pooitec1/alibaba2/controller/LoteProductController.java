/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.service.LoteProductService;

/**
 *
 * @author nadia
 */
public class LoteProductController {
    
    private LoteProduct loteProduct;
    private final LoteProductService loteService;

    public LoteProductController() {
        this.loteService = new LoteProductService();
    }
    
}

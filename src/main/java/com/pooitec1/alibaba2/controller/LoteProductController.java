package com.pooitec1.alibaba2.controller;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.service.LoteProductService;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author nadia
 */
public class LoteProductController {

    private final LoteProductService loteService;

    public LoteProductController() {
        this.loteService = new LoteProductService();

    }

    public List<LoteProduct> getVencimientos(LocalDate fi, LocalDate ff) {
        return loteService.getVencimientos(fi, ff);
    }

    public List<LoteProduct> getLoteProducts(String code) {
        return loteService.findByCodeProduct(code);
    }

    public List<LoteProduct> getExpired(LocalDate fi) {
        return loteService.getExpiredProduct(fi);
    }

    public List<Wharehouse> getWharehouses() {
        return loteService.getWharehouses();
    }

    public List<LoteProduct> getProductByWharehouse(Wharehouse wharehouse) {
        return loteService.getProductByWharehouse(wharehouse);
    }

    public Wharehouse getWharehouse(String name) {
        return loteService.getWharehouse(name);
    }

}

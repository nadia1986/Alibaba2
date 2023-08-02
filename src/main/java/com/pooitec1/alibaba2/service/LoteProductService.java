package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import com.pooitec1.alibaba2.entity.repository.LoteProductRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadia
 */
public class LoteProductService {

    private final LoteProductRepository stockRepository;

    public LoteProductService() {
        this.stockRepository = new LoteProductRepository(Conexion.getEmf());

    }

  
    public List<LoteProduct> findByProductDescription(String description) {
        List<LoteProduct> productsfound = new ArrayList<>();

        for (LoteProduct productSearch : stockRepository.findLoteProductEntities()) {
            if (productSearch.getProduct().getDescription().contains(description)) {
                if (verificarVencimiento(productSearch)) {
                    productsfound.add(productSearch);
                }
            }
        }
        return productsfound;
    }

   
    public List<LoteProduct> findByCodeProduct(String code) {
        List<LoteProduct> productsfound = new ArrayList<>();

        for (LoteProduct productSearch : stockRepository.findLoteProductEntities()) {
            if (productSearch.getProduct().getCodProd().contains(code)) {
                if (verificarVencimiento(productSearch)) {
                    productsfound.add(productSearch);
                }
            }
        }
        return productsfound;
    }

    public void findLoteProductById(Long idLote) {
        this.stockRepository.findLoteProduct(idLote);

    }

    //FALTA AGREGAR QUE BUSQUE POR CODIGO Y TRAIGA UN SOLO PRODUCTO
    public List<LoteProduct> getLoteProduct() {
        List<LoteProduct> listLoteProducts = stockRepository.findLoteProductEntities();
        return listLoteProducts;

    }

   

    public LoteProduct buscarStockByProduct(String code) {
        LoteProduct loteProduct = null;
        for (LoteProduct stockPr : this.stockRepository.findLoteProductEntities()) {
            if (stockPr.getProduct().getCodProd().equals(code)) {
                loteProduct = stockPr;

            }
        }

        return loteProduct;
    }

    public List<LoteProduct> findByProduct(Product product) {
        List<LoteProduct> stockProductfound = new ArrayList<>();
        for (LoteProduct stockPr : this.stockRepository.findLoteProductEntities()) {
            if (stockPr.getProduct().equals(product)) {
                stockProductfound.add(stockPr);

            }

        }

        return stockProductfound;

    }

    public double obtenerPrecioVentaProducto(Product product) {

        double precioProducto = 0;
        for (LoteProduct stockPr : this.stockRepository.findLoteProductEntities()) {
            if (stockPr.getProduct().equals(product)) {
                precioProducto = stockPr.getSalePrice();
            }

        }
        return precioProducto;
    }

    public Integer verStockTotalProducto(Product product) {

        Integer cantidadTotalProducto = 0;

        for (LoteProduct stockPr : this.stockRepository.findLoteProductEntities()) {
            if (stockPr.getProduct().equals(product)) {
                if (verificarVencimiento(stockPr)) {
                    cantidadTotalProducto = cantidadTotalProducto + stockPr.getCantidadActual();

                }
            }

        }

        return cantidadTotalProducto;
    }

    private Boolean verificarVencimiento(LoteProduct stockProduct) {
        Boolean state = false;

        if (stockProduct.getExpiration().isEqual(LocalDate.now()) || stockProduct.getExpiration().isAfter(LocalDate.now())) {
            state = true;
        }

        return state;
    }

    public List<LoteProduct> getVencimientos(LocalDate fi, LocalDate ff) {
        List<LoteProduct> stockProductVencidos = new ArrayList<>();
        for (LoteProduct stockProduct : this.stockRepository.findLoteProductEntities()) {
            if (stockProduct.getExpiration().isAfter(fi) && stockProduct.getExpiration().isBefore(ff)) {
                stockProductVencidos.add(stockProduct);
            }

        }
        return stockProductVencidos;
    }

    public List<LoteProduct> getProductByWharehouse(Wharehouse wharehouse) {
        List<LoteProduct> stockProductWharehouse = new ArrayList<>();
        for (LoteProduct stockProduct : this.stockRepository.findLoteProductEntities()) {
            if (stockProduct.getSector().getWharehouse().equals(wharehouse)) {
                stockProductWharehouse.add(stockProduct);
            }

        }
        return stockProductWharehouse;
    }

    public List<LoteProduct> getExpiredProduct(LocalDate fi) {
        List<LoteProduct> stockProductVencidos = new ArrayList<>();
        for (LoteProduct stockProduct : this.stockRepository.findLoteProductEntities()) {
            if (stockProduct.getExpiration().isBefore(fi)) {
                stockProductVencidos.add(stockProduct);
            }

        }
        return stockProductVencidos;

    }

    public void actualizaStock(LoteProduct loteProduct) throws Exception {
        for (LoteProduct stockPr : this.stockRepository.findLoteProductEntities()) {

            if (stockPr.equals(loteProduct)) {
                this.stockRepository.edit(loteProduct);
            }
        }

    }

    public void saveLoteProduct(LoteProduct loteProduct) {
        this.stockRepository.create(loteProduct);

    }

}

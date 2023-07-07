package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.LoteProduct;
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

    //BUSCO UN PRODUCTO POR DESCRIPCION
    public List<LoteProduct> findByProductDescription(String description) {
        List<LoteProduct> productsfound = new ArrayList<>();

        for (LoteProduct productSearch : stockRepository.findLoteProductEntities()) {
            if (productSearch.getProduct().getDescription().contains(description)) {
                productsfound.add(productSearch);
            }
        }
        return productsfound;
    }

    //FALTA AGREGAR QUE BUSQUE POR CODIGO Y TRAIGA UN SOLO PRODUCTO
    public List<LoteProduct> getLoteProduct() {
        List<LoteProduct> listLoteProducts = stockRepository.findLoteProductEntities();
        return listLoteProducts;

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

    //creo una funcion o agrego una  nueva clase PrecioProducto con precioVenta y precioCompra???
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

    public List<LoteProduct> verCantidadDeProductosPorlote(Product product) {
        List<LoteProduct> stockProductfound = new ArrayList<>();
        for (LoteProduct stockPr : this.stockRepository.findLoteProductEntities()) {
            if (stockPr.getProduct().equals(product)) {
                if (verificarVencimiento(stockPr)) {
                    stockProductfound.add(stockPr);
                }

            }

        }

        return stockProductfound;

    }

    private Boolean verificarVencimiento(LoteProduct stockProduct) {
        Boolean state = false;

        if (stockProduct.getExpiration().isEqual(LocalDate.now()) || stockProduct.getExpiration().isAfter(LocalDate.now())) {
            state = true;
        }

        return state;
    }

    public void discountStockProduct(Product productSeleccionado, int quantity) {

        Integer productStock = verStockTotalProducto(productSeleccionado);

        for (LoteProduct stockProduct : this.stockRepository.findLoteProductEntities()) {
            if (stockProduct.getProduct().equals(productSeleccionado)) {

                productStock = productStock - quantity;
                System.out.println("el stock es " + productStock);
              

            }

        }
       

        
    }
    
        public void discountStock(LoteProduct loteSeleccionado, int quantity) {

        Integer productStock =0;

        for (LoteProduct stockProduct : this.stockRepository.findLoteProductEntities()) {
            if (stockProduct.equals(loteSeleccionado)) {

                productStock = loteSeleccionado.getCantidadActual() - quantity;
                
                loteSeleccionado.setCantidadActual(productStock);
                
                //System.out.println("el stock es " + productStock);
                //System.out.println(loteSeleccionado.getCantidadActual());
                
              

            }

        }
        }
        
         public void saveLoteProduct(LoteProduct loteProduct) {
        this.stockRepository.create(loteProduct);

    }
       

        
    
        
       

}

package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.Sector;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import com.pooitec1.alibaba2.entity.repository.WharehouseRepository;
import java.util.List;


/**
 *
 * @author nadia
 */
public class WharehouseService {

    private final WharehouseRepository repository;

    public WharehouseService() {
        this.repository = new WharehouseRepository(Conexion.getEmf());
    }

    public Wharehouse selectWharehouse(Wharehouse wharehouse) {

        return this.repository.findWharehouse(wharehouse.getId());

    }

    public List<Wharehouse> getWharehouse() {
        List<Wharehouse> listWharehouses = repository.findWharehouseEntities();
        return listWharehouses;

    }

    public Sector verificarSectorProducto(Product product, Wharehouse wharehouse) {
        Sector sectorVerify = null;
        for (Sector sectorR : wharehouse.getSectors()) {

            if (sectorR.getProductTypes().equals(product.getProductType())) {
                sectorVerify = sectorR;
                System.out.println("Sector Verificado");
            }

        }

        return sectorVerify;

    }
    
   

    public Wharehouse getWharehouseByName(String name) {
        Wharehouse wharehouseSelected = null;

        for (Wharehouse wharehouseR : this.repository.findWharehouseEntities()) {
            if (wharehouseR.getEmail().equals(name)) {
                wharehouseSelected = wharehouseR;

            }
        }

        return wharehouseSelected;
    }


}

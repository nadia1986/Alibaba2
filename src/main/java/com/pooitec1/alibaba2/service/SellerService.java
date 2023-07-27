package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.Seller;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import com.pooitec1.alibaba2.entity.repository.SellerRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadia
 */
public class SellerService {

    private final SellerRepository repository;

    public SellerService() {
        this.repository = new SellerRepository(Conexion.getEmf());
    }

    public List<Seller> getSeller() {
        return this.repository.findSellerEntities();

    }
    
     public Seller getSellerByName(String name) {
        Seller sellerSelected = null;

        for (Seller sellerR : this.repository.findSellerEntities()) {
            if (sellerR.getName().equals(name)) {
                sellerSelected = sellerR;
               
            }
        }

        return sellerSelected;
    }

}

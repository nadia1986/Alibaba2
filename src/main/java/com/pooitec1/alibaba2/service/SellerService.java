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

    public List<Seller> findBySellerName(String name) {
        List<Seller> sellerfound = new ArrayList<>();

        for (Seller sellerSearch : repository.findSellerEntities()) {
            if (sellerSearch.getName().contains(name)) {
                sellerfound.add(sellerSearch);
            }
        }
        return sellerfound;
    }

    public List<Seller> getSeller() {
        return this.repository.findSellerEntities();

    }

}

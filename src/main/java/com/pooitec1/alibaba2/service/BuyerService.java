
package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.Buyer;
import com.pooitec1.alibaba2.entity.repository.BuyerRepository;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author nadia
 */
public class BuyerService {

    private final BuyerRepository repository;

    public BuyerService() {

        this.repository = new BuyerRepository(Conexion.getEmf());
    }

    public List<Buyer> findByDni(String dni) {
        return repository.findBuyerEntities()
                .stream()
                .filter(buyer -> buyer.getDni().contains(dni))
                .collect(Collectors.toList());
    }

    public List<Buyer> getBuyer() {
        return repository.findBuyerEntities();

    }

}

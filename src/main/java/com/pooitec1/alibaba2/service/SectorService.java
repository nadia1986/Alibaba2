
package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.Sector;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import com.pooitec1.alibaba2.entity.repository.SectorRepository;

/**
 *
 * @author nadia
 */
public class SectorService {
    
    private SectorRepository repository;
    
    
    public SectorService() {
        this.repository = new SectorRepository(Conexion.getEmf());
    }
    
}

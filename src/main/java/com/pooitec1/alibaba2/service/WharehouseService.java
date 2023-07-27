package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.Sector;
import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import com.pooitec1.alibaba2.entity.repository.WharehouseRepository;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

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

    public boolean verificarSectorLote(LoteProduct loteproduct, Wharehouse wharehouse) {
        for (Sector sectorR : wharehouse.getSectors()) {
            if (sectorR.equals(loteproduct.getSector())) {
                System.out.println("Sector Verify" + " SECTOR: " + sectorR.getDescription());
                return true;
            }
        }

        System.out.println("El Producto no tiene sector asignado en este Wharehouse");
        return false;
    }

    public Wharehouse obtenerAlmacenSeleccionado(JComboBox<Wharehouse> comboBox) {
        Object selectedItem = comboBox.getSelectedItem();
        if (selectedItem instanceof Wharehouse) {
            return (Wharehouse) selectedItem;
        } else {
            // Maneja el caso cuando el elemento seleccionado no es un objeto Wharehouse
            throw new IllegalArgumentException("El elemento seleccionado no es un Wharehouse");
        }
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

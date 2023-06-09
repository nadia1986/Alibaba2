
package com.pooitec1.alibaba2.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author nadia
 */
@Entity
public class LoteProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLote;

    private Integer quantity;
    private Integer cantidadActual;
    private Integer stockMin;
    private LocalDate expiration;
    private Integer stockMax;
    private Double price;
    private Double priceUnit;
    private Double salePrice;

    @ManyToOne
    private Sector sector;

    @ManyToOne
    private Product product;

    public LoteProduct() {
    }

    public LoteProduct(Integer quantity, Integer cantidadActual, Integer stockMin, LocalDate expiration, Integer stockMax, Double price, Double priceUnit, Double salePrice, Sector sector, Product product) {
        this.quantity = quantity;
        this.cantidadActual = cantidadActual;
        this.stockMin = stockMin;
        this.expiration = expiration;
        this.stockMax = stockMax;
        this.price = price;
        this.priceUnit = priceUnit;
        this.salePrice = salePrice;
        this.sector = sector;
        this.product = product;
    }

  

    public Long getIdLote() {
        return idLote;
    }

    public void setIdLote(Long idLote) {
        this.idLote = idLote;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLote != null ? idLote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idLote fields are not set
        if (!(object instanceof LoteProduct)) {
            return false;
        }
        LoteProduct other = (LoteProduct) object;
        if ((this.idLote == null && other.idLote != null) || (this.idLote != null && !this.idLote.equals(other.idLote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pooitec1.alibaba2.entity.StockProduct[ id=" + idLote + " ]";
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public int getStockMax() {
        return stockMax;
    }

    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }


    public double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    

}

package com.pooitec1.alibaba2.service;

import com.pooitec1.alibaba2.entity.Buyer;
import com.pooitec1.alibaba2.entity.Employee;
import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.Sale;
import com.pooitec1.alibaba2.entity.SaleLine;
import com.pooitec1.alibaba2.entity.User;
import com.pooitec1.alibaba2.entity.repository.Conexion;
import com.pooitec1.alibaba2.entity.repository.SaleRepository;
import java.util.List;

/**
 *
 * @author nadia
 */
public class SaleService {

    private final SaleRepository saleRepository;
    private final LoteProductService stockService;
    private final BuyerService buyerService;
    private final UserService userService;
    private final SaleLineService saleLineService;

    public SaleService() {

        this.saleRepository = new SaleRepository(Conexion.getEmf());
        this.stockService = new LoteProductService();
        this.buyerService=new BuyerService();
        this.userService= new UserService();
        this.saleLineService= new SaleLineService();

    }

    public void saveSale(Sale sale) {
        this.saleRepository.create(sale);

    }
    
     public List<Buyer> findBuyerByDni(String dni) {
        return buyerService.findByDni(dni);
    }
     
     public Employee findEmployeeByUser(User user){
         return userService.findEmployeeByUser(user);
     }

    public List<LoteProduct> findProductByDescription(String description) {
        return stockService.findByProductDescription(description);
    }

    public LoteProduct buscarLoteProduct(String code) {
        return this.stockService.buscarLoteByCodeProduct(code);
    }

    public Integer traerStockMax(Product product) {
        return stockService.verStockTotalProducto(product);
    }

    public Double obtenerPrecio(Product product) {
        return stockService.obtenerPrecioVentaProducto(product);
    }

    public void actualizarStockLote(LoteProduct loteProduct) throws Exception {
        this.stockService.actualizaStock(loteProduct);
    }
    
      public SaleLine getNewSaleLine() {
        return saleLineService.getNewSaleLine();
    }

    public void saveSaleLine(SaleLine saleLine) {
        this.saleLineService.saveSaleLine(saleLine);
    }

}

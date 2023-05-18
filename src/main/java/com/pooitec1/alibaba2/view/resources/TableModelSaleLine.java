package com.pooitec1.alibaba2.view.resources;

import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.SaleLine;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nadia
 */
public class TableModelSaleLine extends AbstractTableModel {

    private static final String[] COLUMNAS = {"Cod_prod", "Descripcion", "Quantity ", "Precio", "Subtotal"};
    private List<SaleLine> saleLines;
    private List<LoteProduct> loteProducts;

    public TableModelSaleLine() {
        saleLines = new ArrayList<>();
        loteProducts = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return saleLines == null ? 0 : saleLines.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object retorno = null;
        SaleLine saleLine = saleLines.get(rowIndex);
        LoteProduct loteProduct = loteProducts.get(rowIndex);

        switch (columnIndex) {
            case 0:
                retorno = saleLine.getProduct().getCodProd();
                break;
            case 1:
                retorno = saleLine.getProduct().getProductType().getDescription();
                break;
            case 2:
                retorno = saleLine.getQuantity();
                break;
            case 3:
                retorno= loteProduct.getSalePrice();
                break;
            case 4:
            retorno= loteProduct.getSalePrice()*saleLine.getQuantity();
            break;

        }
        return retorno;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }

    public void setSaleLine(List<SaleLine> saleLines) {
        this.saleLines = saleLines;
    }

    public SaleLine getSaleLineIn(int row) {
        return saleLines.get(row);
    }

}

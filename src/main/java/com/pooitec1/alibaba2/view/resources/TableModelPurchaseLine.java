/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pooitec1.alibaba2.view.resources;

import com.pooitec1.alibaba2.entity.PurchaseLine;
import com.pooitec1.alibaba2.entity.Sector;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nadia
 */
public class TableModelPurchaseLine extends AbstractTableModel {

    private static final String[] COLUMNAS = {"COD PRODUCTO", "PRODUCT", "QUANTITY",};
    private List<PurchaseLine> purchaseLines;
   

    public TableModelPurchaseLine() {
        purchaseLines = new ArrayList<>();
       
    }

    @Override
    public int getRowCount() {
        return purchaseLines == null ? 0 : purchaseLines.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object retorno = null;
        PurchaseLine purchaseLine = purchaseLines.get(rowIndex);

        switch (columnIndex) {
            case 0:
                retorno = purchaseLine.getProduct().getCodProd();
                break;
            case 1:
                retorno = purchaseLine.getProduct().getDescription();
                break;
            case 2:
                retorno = purchaseLine.getQuantity();
                break;
           

        }
        return retorno;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }

    public void setLinePurchase(List<PurchaseLine> lines) {
        this.purchaseLines = lines;
    }

    public PurchaseLine getLineIn(int row) {
        return purchaseLines.get(row);
    }

    public int findRowPurchaseLine(PurchaseLine lineSearch) {
        int row = 0;
        int accountant = 0;
        for (PurchaseLine lineR : purchaseLines) {
            accountant = accountant + 1;
            if (lineSearch.getId() == lineR.getId()) {
                row = accountant;
            }
        }
        return row;
    }
}

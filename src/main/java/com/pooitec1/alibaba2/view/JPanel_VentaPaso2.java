package com.pooitec1.alibaba2.view;

import com.pooitec1.alibaba2.controller.SaleController;
import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.SaleLine;
import com.pooitec1.alibaba2.view.resources.ValidadorDeCampos;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadia
 */
public class JPanel_VentaPaso2 extends javax.swing.JPanel {

    LocalDate fi = LocalDate.now();
    LocalDateTime localDate = LocalDateTime.now();

    ValidadorDeCampos validadorDeCampos;
    private SaleLine saleLineSeleccionada;

    DefaultTableModel modeloTableSaleLine = new DefaultTableModel();
    SaleController controlador;

    private JPanelAplication panelMenu;

    /**
     * Creates new form JPanel_VentaPaso2
     */
    public JPanel_VentaPaso2(JPanelAplication panelMenu, SaleController controladorP) {
        //public JPanel_VentaPaso2(JPanelAplication panelMenu, SaleController controladorP) {

        this.validadorDeCampos = new ValidadorDeCampos();

        this.controlador = controladorP;
        this.panelMenu = panelMenu;

        initComponents();

        // System.out.println(this.controlador.getNewSale().getEmployee().getFirstName());
        this.jlbl_employee.setText(this.controlador.getNewSale().getEmployee().getFirstName() + " " + this.controlador.getNewSale().getEmployee().getLastName());
        this.jlbl_date.setText(this.controlador.getNewSale().getDateSale().toString());
        this.jlbl_cliente.setText(this.controlador.getNewSale().getBuyer().getFirstName() + " " + this.controlador.getNewSale().getBuyer().getLastName());
        this.jlbl_time.setText(this.localDate.getHour() + ":" + this.localDate.getMinute() + ":" + this.localDate.getSecond());
        calcularSubtotal();

        modeloTableSaleLine.addColumn("Code Product");
        modeloTableSaleLine.addColumn("Description");
        modeloTableSaleLine.addColumn("Price");
        modeloTableSaleLine.addColumn("Quantity");
        modeloTableSaleLine.addColumn("Subtotal");
        //saleLines.add(this.controlador.getNewSaleLine());
        //this.controlador.getNewSale().setSaleLines(saleLines);
        actualizarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBtn_addproduct = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbtn_cancelarventapaso2 = new javax.swing.JButton();
        jbtn_confirmsale = new javax.swing.JButton();
        jlbl_cliente = new javax.swing.JLabel();
        jlbl_employee = new javax.swing.JLabel();
        jLabel_subtotal = new javax.swing.JLabel();
        jLabel_total = new javax.swing.JLabel();
        jlbl_date = new javax.swing.JLabel();
        jlbl_time = new javax.swing.JLabel();
        jbtn_atrasventapaso2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_lineadeventa = new javax.swing.JTable();
        jbtn_deletesaleline = new javax.swing.JButton();
        jLabel_iva = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("N° Factura:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Date:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Time:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Employee:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Buyer:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("SALE DETAIL");

        jBtn_addproduct.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtn_addproduct.setText("Add Product");
        jBtn_addproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_addproductActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("IVA:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("SUBTOTAL:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setText("TOTAL TO PAY:");

        jbtn_cancelarventapaso2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtn_cancelarventapaso2.setText("CANCEL");
        jbtn_cancelarventapaso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarventapaso2ActionPerformed(evt);
            }
        });

        jbtn_confirmsale.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtn_confirmsale.setText("CONFIRM");
        jbtn_confirmsale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_confirmsaleActionPerformed(evt);
            }
        });

        jlbl_cliente.setText("jLabel10");

        jlbl_employee.setText("jLabel11");

        jLabel_subtotal.setText("jLabel12");

        jLabel_total.setText("jLabel13");

        jlbl_date.setText("jLabel14");

        jlbl_time.setText("jLabel10");

        jbtn_atrasventapaso2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtn_atrasventapaso2.setText("BACK");
        jbtn_atrasventapaso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_atrasventapaso2ActionPerformed(evt);
            }
        });

        jtable_lineadeventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtable_lineadeventa);

        jbtn_deletesaleline.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtn_deletesaleline.setText("Remove");
        jbtn_deletesaleline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_deletesalelineActionPerformed(evt);
            }
        });

        jLabel_iva.setText("jLabel14");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_cancelarventapaso2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_atrasventapaso2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(jbtn_confirmsale))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jbtn_deletesaleline, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jBtn_addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel_total, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(165, 165, 165)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlbl_cliente))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addComponent(jlbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbl_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1079, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jlbl_date)
                    .addComponent(jlbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlbl_employee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlbl_cliente))
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn_addproduct)
                    .addComponent(jbtn_deletesaleline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel_total, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_cancelarventapaso2)
                    .addComponent(jbtn_atrasventapaso2)
                    .addComponent(jbtn_confirmsale))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_addproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_addproductActionPerformed

        JPanel_VentaPaso3 panelventapaso3 = new JPanel_VentaPaso3(this.panelMenu, this.controlador);

        panelventapaso3.setSize(814, 600);

        this.panelMenu.limpiarPanelContenido();

        this.panelMenu.getjPanel_contenido().add(panelventapaso3);

        this.panelMenu.repaint();
        this.panelMenu.validate();


    }//GEN-LAST:event_jBtn_addproductActionPerformed

    private void jbtn_cancelarventapaso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarventapaso2ActionPerformed
        this.panelMenu.bloquearBotones(true);
        this.panelMenu.limpiarPanelContenido();
    }//GEN-LAST:event_jbtn_cancelarventapaso2ActionPerformed

    private void jbtn_confirmsaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_confirmsaleActionPerformed
        if (!this.controlador.getNewSale().getSaleLines().isEmpty()) {
            this.controlador.saveSale(this.controlador.getNewSale());
            try {
                discontStock();
            } catch (Exception ex) {
                Logger.getLogger(JPanel_VentaPaso2.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Saved sale");
            this.panelMenu.bloquearBotones(true);
            this.panelMenu.limpiarPanelContenido();
        } else {
            //throw new IllegalStateException("Cannot save sale without sale lines");
            System.out.println("Seleccionar Productos");
            JOptionPane.showMessageDialog(null, " Not saved!Sale Detail isempty");
        }
        
    }//GEN-LAST:event_jbtn_confirmsaleActionPerformed

    private void jbtn_atrasventapaso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_atrasventapaso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_atrasventapaso2ActionPerformed

    private void jbtn_deletesalelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_deletesalelineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_deletesalelineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_addproduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_iva;
    private javax.swing.JLabel jLabel_subtotal;
    private javax.swing.JLabel jLabel_total;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtn_atrasventapaso2;
    private javax.swing.JButton jbtn_cancelarventapaso2;
    private javax.swing.JButton jbtn_confirmsale;
    private javax.swing.JButton jbtn_deletesaleline;
    private javax.swing.JLabel jlbl_cliente;
    private javax.swing.JLabel jlbl_date;
    private javax.swing.JLabel jlbl_employee;
    private javax.swing.JLabel jlbl_time;
    private javax.swing.JTable jtable_lineadeventa;
    // End of variables declaration//GEN-END:variables

    public void calcularPrecio() {

    }

    public void actualizarTabla() {
        while (modeloTableSaleLine.getRowCount() > 0) {
            modeloTableSaleLine.removeRow(0);
        }
        double subtotal = 0;
        for (SaleLine saleLine : this.controlador.getNewSale().getSaleLines()) {
            Object x[] = new Object[5];
            x[0] = saleLine.getProduct().getCodProd();
            x[1] = saleLine.getProduct().getDescription();
            x[2] = pasarMoneda(this.controlador.obtenerPrecio(saleLine.getProduct()));
            x[3] = saleLine.getQuantity();
            x[4] = pasarMoneda(this.controlador.obtenerPrecio(saleLine.getProduct()) * saleLine.getQuantity());
            subtotal += this.controlador.obtenerPrecio(saleLine.getProduct()) * saleLine.getQuantity();
            modeloTableSaleLine.addRow(x);

        }
        double iva = subtotal * 0.21;
        double total = subtotal + iva;
        jLabel_iva.setText(pasarMoneda(iva));
        jLabel_subtotal.setText(pasarMoneda(subtotal));
        jLabel_total.setText(pasarMoneda(total));
        jtable_lineadeventa.setModel(modeloTableSaleLine);
    }

    public void discontStock() throws Exception {
        int rowCount = modeloTableSaleLine.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String productCode = (String) modeloTableSaleLine.getValueAt(i, 0);
            int cantidad = (int) modeloTableSaleLine.getValueAt(i, 3);

            LoteProduct loteProduct = this.controlador.buscarLoteProduct(productCode);
            int stockActual = loteProduct.getCantidadActual();
            //System.out.println(loteProduct.getCantidadActual());
            int newStock = stockActual - cantidad;
            //System.out.println(newStock);
            loteProduct.setCantidadActual(newStock);
            this.controlador.actualizarStockLote(loteProduct);

           // System.out.println(loteProduct.getCantidadActual());

        }

    }

    public void seleccionarLineaVenta() {
        int filaSeleccionada = this.jtable_lineadeventa.getSelectedRow();
        if (filaSeleccionada > 0) {
            //this.saleLineSeleccionada = this.modeloTableSaleLine(filaSeleccionada);
        }

    }

    public String pasarMoneda(Double precio) {
        return "$ " + Math.round(precio * 100.0) / 100.0;

    }

    private void calcularSubtotal() {
        double subtotal = 0.0;

        for (int i = 0; i < modeloTableSaleLine.getRowCount(); i++) {

        }

    }

}

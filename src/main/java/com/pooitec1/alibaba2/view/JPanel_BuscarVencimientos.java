package com.pooitec1.alibaba2.view;

import com.pooitec1.alibaba2.controller.LoteProductController;
import com.pooitec1.alibaba2.entity.LoteProduct;

import com.pooitec1.alibaba2.view.resources.TableModelListenerVencimientos;
import com.pooitec1.alibaba2.view.resources.TableModelProduct;
import java.time.LocalDate;

/**
 *
 * @author nadia
 */
public class JPanel_BuscarVencimientos extends javax.swing.JPanel {

    private JPanelAplication panelMenu;
    LocalDate fi = LocalDate.now();
    LocalDate ff = LocalDate.now();
    private final TableModelProduct tableModelVencimientos;
    private LoteProduct loteSeleccionado;
    LoteProductController controlador;

    public JPanel_BuscarVencimientos(JPanelAplication panelMenu, LoteProductController controladorL) {

        this.tableModelVencimientos = new TableModelProduct();
        this.panelMenu = panelMenu;
        this.controlador = controladorL;
        initComponents();
        this.jTable_vencimientos.getSelectionModel().addListSelectionListener(new TableModelListenerVencimientos(this));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_vencimientos = new javax.swing.JTable();
        jButton_aceptar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_producttype = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_wharehouse = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_sector = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_stock = new javax.swing.JLabel();
        jSlider_diasVencimiento = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel_expiracion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_sectorCode = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Days:");

        jTable_vencimientos.setModel(tableModelVencimientos);
        jScrollPane1.setViewportView(jTable_vencimientos);

        jButton_aceptar.setText("ACCEPT");
        jButton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aceptarActionPerformed(evt);
            }
        });

        jButton_cancelar.setText("BACK");
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Product Type:");

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getStyle() | java.awt.Font.BOLD, jLabel4.getFont().getSize()+2));
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Wharehouse:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Sector:");

        jLabel_sector.setText(" ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Stock:");

        jLabel_stock.setText(" ");

        jSlider_diasVencimiento.setMajorTickSpacing(30);
        jSlider_diasVencimiento.setMaximum(120);
        jSlider_diasVencimiento.setMinorTickSpacing(30);
        jSlider_diasVencimiento.setPaintLabels(true);
        jSlider_diasVencimiento.setPaintTicks(true);
        jSlider_diasVencimiento.setSnapToTicks(true);
        jSlider_diasVencimiento.setValue(0);
        jSlider_diasVencimiento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_diasVencimientoStateChanged(evt);
            }
        });
        jSlider_diasVencimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jSlider_diasVencimientoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Expiration:");

        jLabel_expiracion.setText(" ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Nivel:");

        jLabel_sectorCode.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton_cancelar)
                        .addGap(149, 149, 149)
                        .addComponent(jButton_aceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jSlider_diasVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_sector, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_sectorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_producttype, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel_expiracion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_wharehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider_diasVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_producttype))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_wharehouse)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_stock))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_sector)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_sectorCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_expiracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancelar)
                    .addComponent(jButton_aceptar))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        this.panelMenu.bloquearBotones(true);
        this.panelMenu.limpiarPanelContenido(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelarActionPerformed

    private void jButton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aceptarActionPerformed
        this.panelMenu.bloquearBotones(true);
        this.panelMenu.limpiarPanelContenido();
        
    }//GEN-LAST:event_jButton_aceptarActionPerformed

    private void jSlider_diasVencimientoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_diasVencimientoStateChanged
        
        
        long d = jSlider_diasVencimiento.getValue();
        ff = fi.plusDays(d);
        this.tableModelVencimientos.setProducts(this.controlador.getVencimientos(fi, ff));
        
        this.tableModelVencimientos.fireTableDataChanged();
        
    }//GEN-LAST:event_jSlider_diasVencimientoStateChanged

    private void jSlider_diasVencimientoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSlider_diasVencimientoKeyReleased

    }//GEN-LAST:event_jSlider_diasVencimientoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_aceptar;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_expiracion;
    private javax.swing.JLabel jLabel_producttype;
    private javax.swing.JLabel jLabel_sector;
    private javax.swing.JLabel jLabel_sectorCode;
    private javax.swing.JLabel jLabel_stock;
    private javax.swing.JLabel jLabel_wharehouse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider_diasVencimiento;
    private javax.swing.JTable jTable_vencimientos;
    // End of variables declaration//GEN-END:variables

    public void seleccionarProducto() {
        //obtiene el indice de la fila seleccionada en la tabla de buyer
        int filaSeleccionada = this.jTable_vencimientos.getSelectedRow();
        // si la fila esta seleccionada, seteamos  buyer auxiliar, llamando al modelo de tabla
        if (filaSeleccionada >= 0) {
            this.loteSeleccionado = this.tableModelVencimientos.getProductIn(filaSeleccionada);
            this.jLabel_producttype.setText(this.loteSeleccionado.getProduct().getProductType().getDescription());
            this.jLabel_wharehouse.setText(this.loteSeleccionado.getSector().getWharehouse().getEmail());
            this.jLabel_sector.setText(this.loteSeleccionado.getSector().getDescription());
            this.jLabel_stock.setText(this.loteSeleccionado.getCantidadActual().toString());
            this.jLabel_expiracion.setText(this.loteSeleccionado.getExpiration().toString());
            this.jLabel_sectorCode.setText(this.loteSeleccionado.getSector().getSectorCode());

        }
    }

}

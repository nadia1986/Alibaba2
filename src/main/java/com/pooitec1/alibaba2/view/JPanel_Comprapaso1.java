package com.pooitec1.alibaba2.view;

import com.pooitec1.alibaba2.controller.PurchaseController;

import com.pooitec1.alibaba2.view.resources.TableModelListenerPurchaseLine;
import com.pooitec1.alibaba2.view.resources.TableModelPurchaseLine;
import com.pooitec1.alibaba2.view.resources.ValidadorDeCampos;
import java.awt.Color;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author nadia
 */
public class JPanel_Comprapaso1 extends javax.swing.JPanel {

    LocalDate fi = LocalDate.now();
    LocalDateTime localDate = LocalDateTime.now();
    ValidadorDeCampos validadorDeCampos;

    private final TableModelPurchaseLine tableModelPurchaseLine;

    PurchaseController controlador;
    private JPanelAplication panelMenu;

    public JPanel_Comprapaso1(JPanelAplication panelMenu, PurchaseController controladorP) {
        this.validadorDeCampos = new ValidadorDeCampos();
        //JTable vacio
        this.tableModelPurchaseLine = new TableModelPurchaseLine();

        this.controlador = controladorP;
        this.panelMenu = panelMenu;
        initComponents();
        this.tableModelPurchaseLine.setLinePurchase(this.controlador.getNewPurchase().getPurchaseLines());
        this.jLabel_date.setText(fi.toString());
        this.jLabel_time.setText(this.localDate.getHour() + ":" + this.localDate.getMinute() + ":" + this.localDate.getSecond());
        this.jLabel_employee.setText(this.controlador.getNewPurchase().getEmployee().getFirstName());
        this.jtb_purchaseLine.getSelectionModel().addListSelectionListener(new TableModelListenerPurchaseLine(this));

        setupBotones();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_purchaseLine = new javax.swing.JTable();
        jButton_remove = new javax.swing.JButton();
        jButton_product = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_time = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_employee = new javax.swing.JLabel();
        jButton_cancelar = new javax.swing.JButton();
        jButton_next = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("PURCHASE DETAIL:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jtb_purchaseLine.setModel(tableModelPurchaseLine);
        jScrollPane1.setViewportView(jtb_purchaseLine);

        jButton_remove.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_remove.setForeground(new java.awt.Color(255, 0, 0));
        jButton_remove.setText("REMOVE");
        jButton_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_removeActionPerformed(evt);
            }
        });

        jButton_product.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_product.setForeground(new java.awt.Color(0, 0, 102));
        jButton_product.setText("ADD PRODUCT");
        jButton_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_productActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("DATE:");

        jLabel_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_date.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_date.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("TIME:");

        jLabel_time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_time.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_time.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("EMPLOYEE:");

        jLabel_employee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_employee.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_employee.setText("jLabel7");

        jButton_cancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_cancelar.setText("CANCEL");
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });

        jButton_next.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_next.setForeground(new java.awt.Color(0, 0, 102));
        jButton_next.setText("NEXT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel_date, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(348, 348, 348)
                                .addComponent(jButton_remove))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jButton_cancelar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_next)
                            .addComponent(jButton_product, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(463, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_date))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_time))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_employee))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_product, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancelar)
                    .addComponent(jButton_next))
                .addGap(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_removeActionPerformed
        // this.panelMenu.bloquearBotones(true);
        // this.panelMenu.limpiarPanelContenido();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_removeActionPerformed

    private void jButton_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_productActionPerformed

        JPanel_Comprapaso2 panelPaso2 = new JPanel_Comprapaso2(this.panelMenu, this.controlador);

        panelPaso2.setSize(814, 600);
        this.panelMenu.limpiarPanelContenido();

        this.panelMenu.getjPanel_contenido().add(panelPaso2);
        this.panelMenu.repaint();
        this.panelMenu.validate();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_productActionPerformed

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        this.panelMenu.bloquearBotones(true);
        this.panelMenu.limpiarPanelContenido();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JButton jButton_next;
    private javax.swing.JButton jButton_product;
    private javax.swing.JButton jButton_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_employee;
    private javax.swing.JLabel jLabel_time;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtb_purchaseLine;
    // End of variables declaration//GEN-END:variables

    private void setupBotones() {
        this.validadorDeCampos.habilitarBoton(true, jButton_cancelar, new Color(176, 128, 118), Color.WHITE, Color.GRAY, Color.BLACK);
    }
}

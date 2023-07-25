package com.pooitec1.alibaba2.view;

import com.pooitec1.alibaba2.controller.PurchaseController;
import com.pooitec1.alibaba2.entity.Product;
import com.pooitec1.alibaba2.entity.PurchaseLine;
import com.pooitec1.alibaba2.entity.Seller;
import com.pooitec1.alibaba2.view.resources.TableModelListenerPurchaseLine;
import com.pooitec1.alibaba2.view.resources.TableModelPurchaseLine;
import com.pooitec1.alibaba2.view.resources.ValidadorDeCampos;
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author nadia
 */
public class JPanel_Comprapaso1 extends javax.swing.JPanel {

    LocalDate fi = LocalDate.now();
    LocalDateTime localDate = LocalDateTime.now();
    ValidadorDeCampos validadorDeCampos;
    private final TableModelPurchaseLine tableModelPurchaseLine;
    private PurchaseController controlador;
    private JPanelAplication panelMenu;
    private Seller sellerSeleccionado;
    DefaultComboBoxModel<Seller> comboBoxModelSeller = new DefaultComboBoxModel<>();

    public JPanel_Comprapaso1(JPanelAplication panelMenu, PurchaseController controladorP) {
        this.validadorDeCampos = new ValidadorDeCampos();
        this.tableModelPurchaseLine = new TableModelPurchaseLine();
        this.controlador = controladorP;
        this.panelMenu = panelMenu;

        initComponents();

        this.tableModelPurchaseLine.setLinePurchase(this.controlador.getNewPurchase().getPurchaseLines());
        this.jLabel_date.setText(fi.toString());
        this.jLabel_time.setText(this.localDate.getHour() + ":" + this.localDate.getMinute() + ":" + this.localDate.getSecond());
        this.jLabel_employee.setText(this.controlador.getNewPurchase().getEmployee().getFirstName() + " " + this.controlador.getNewPurchase().getEmployee().getLastName());
        this.jtb_purchaseLine.getSelectionModel().addListSelectionListener(new TableModelListenerPurchaseLine(this));

        cargarMayoristas();
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
        jButton_savepurchase = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_seller = new javax.swing.JComboBox();

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

        jButton_product.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_product.setForeground(new java.awt.Color(0, 0, 51));
        jButton_product.setText("ADD PRODUCT");
        jButton_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_productActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("DATE:");

        jLabel_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_date.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_date.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("TIME:");

        jLabel_time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_time.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_time.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
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

        jButton_savepurchase.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_savepurchase.setText("SAVE");
        jButton_savepurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_savepurchaseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("SELLER:");

        jComboBox_seller.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_seller.setModel(comboBoxModelSeller);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_date, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_seller, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_remove)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_cancelar)
                                        .addGap(85, 85, 85)
                                        .addComponent(jButton_savepurchase)))))
                        .addGap(29, 29, 29)
                        .addComponent(jButton_product, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_date)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_employee))
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_product, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_seller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancelar)
                    .addComponent(jButton_savepurchase))
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

    private void jButton_savepurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_savepurchaseActionPerformed

    }//GEN-LAST:event_jButton_savepurchaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JButton jButton_product;
    private javax.swing.JButton jButton_remove;
    private javax.swing.JButton jButton_savepurchase;
    private javax.swing.JComboBox jComboBox_seller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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

    private void cargarMayoristas() {
        List<Seller> sellers = this.controlador.getMayoristas();
        for (Seller seller : sellers) {
            comboBoxModelSeller.addElement(seller);
            jComboBox_seller.setModel(comboBoxModelSeller);
        }
    }

    public PurchaseController getControlador() {
        return controlador;
    }

    public void setControlador(PurchaseController controlador) {
        this.controlador = controlador;
    }

    public void actualizarStock() {
        int rowCount = jtb_purchaseLine.getRowCount();
        for (int i = 0; i < rowCount; i++) {

            Product product = (Product) jtb_purchaseLine.getValueAt(i, 0);
            int cantidad = (int) jtb_purchaseLine.getValueAt(3, 0);

            //for (LoteProduct loteProduct :this.controlador.getNewPurchase().){
            //if (loteProduct.getProduct().equals(product)) {
            // loteProduct.setCantidadActual(cantidad);
            // break;
            //}
            // }
            // }
        }
    }
}

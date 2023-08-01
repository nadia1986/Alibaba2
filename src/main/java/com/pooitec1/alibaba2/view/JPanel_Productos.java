package com.pooitec1.alibaba2.view;

import com.pooitec1.alibaba2.controller.LoteProductController;
import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.view.resources.TableModelListenerProducts;
import com.pooitec1.alibaba2.view.resources.TableModelProduct;
import com.pooitec1.alibaba2.view.resources.ValidadorDeCampos;

/**
 *
 * @author nadia
 */
public class JPanel_Productos extends javax.swing.JPanel {

    private JPanelAplication panelMenu;
    ValidadorDeCampos validadorDeCampos;
    private final TableModelProduct tableModelProduct;
    private LoteProduct loteProductSelected;
    private LoteProductController loteController;

    public JPanel_Productos(JPanelAplication panelMenu, LoteProductController controllerP) {
        this.loteController = controllerP;
        this.panelMenu = panelMenu;
        this.validadorDeCampos = new ValidadorDeCampos();
        this.tableModelProduct = new TableModelProduct();
        initComponents();

        this.jTable_productos.getSelectionModel().addListSelectionListener(new TableModelListenerProducts(this));
        validadarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_aceptar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtxf_code = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_productType = new javax.swing.JLabel();
        jLabel_stock = new javax.swing.JLabel();
        jLabel_sector = new javax.swing.JLabel();
        jLabel_wharehouse = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_seller = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Product Code:");

        jtxf_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxf_codeKeyReleased(evt);
            }
        });

        jTable_productos.setModel(tableModelProduct);
        jScrollPane1.setViewportView(jTable_productos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Product Type:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Stock:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Sector:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Wharehouse:");

        jLabel_productType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_productType.setForeground(new java.awt.Color(0, 0, 51));

        jLabel_stock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_stock.setForeground(new java.awt.Color(0, 0, 51));

        jLabel_sector.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_sector.setForeground(new java.awt.Color(0, 0, 51));

        jLabel_wharehouse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_wharehouse.setForeground(new java.awt.Color(0, 0, 51));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Seller:");

        jLabel_seller.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_seller.setForeground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton_cancelar)
                        .addGap(205, 205, 205)
                        .addComponent(jButton_aceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_stock, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addGap(472, 472, 472))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel_sector, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_productType, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_wharehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_seller, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxf_code, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxf_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel_productType))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_stock))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_sector))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_wharehouse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_seller))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_aceptar)
                    .addComponent(jButton_cancelar))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        this.panelMenu.bloquearBotones(true);
        this.panelMenu.limpiarPanelContenido(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelarActionPerformed

    private void jtxf_codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxf_codeKeyReleased
        if (this.jtxf_code.isEditable()) {
            //Actualizar el TableModel con la lista del controlador
            this.tableModelProduct.setProducts(this.loteController.getLoteProducts(this.jtxf_code.getText()));

            //Refrescar el modelo en la tabla
            this.tableModelProduct.fireTableDataChanged();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxf_codeKeyReleased

    private void jButton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aceptarActionPerformed
        this.panelMenu.bloquearBotones(true);
        this.panelMenu.limpiarPanelContenido(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_aceptar;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_productType;
    private javax.swing.JLabel jLabel_sector;
    private javax.swing.JLabel jLabel_seller;
    private javax.swing.JLabel jLabel_stock;
    private javax.swing.JLabel jLabel_wharehouse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_productos;
    private javax.swing.JTextField jtxf_code;
    // End of variables declaration//GEN-END:variables

    public void seleccionarProducto() {

        int filaSeleccionada = this.jTable_productos.getSelectedRow();

        if (filaSeleccionada >= 0) {

            this.loteProductSelected = this.tableModelProduct.getProductIn(filaSeleccionada);

            this.jLabel_productType.setText(this.loteProductSelected.getProduct().getProductType().getDescription());
            this.jLabel_stock.setText(this.loteProductSelected.getCantidadActual().toString());
            this.jLabel_sector.setText(this.loteProductSelected.getSector().getDescription());
            this.jLabel_wharehouse.setText(this.loteProductSelected.getSector().getWharehouse().getEmail());
            this.jLabel_seller.setText(this.loteProductSelected.getProduct().getSeller().getName());

        }
    }

    private void validadarCampos() {
        this.validadorDeCampos.validarSoloNumero(jtxf_code);
        this.validadorDeCampos.LimitarCaracteres(jtxf_code, 15);
    }

}

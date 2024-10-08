package com.pooitec1.alibaba2.view;

import com.pooitec1.alibaba2.controller.SaleController;
import com.pooitec1.alibaba2.entity.LoteProduct;
import com.pooitec1.alibaba2.entity.SaleLine;
import com.pooitec1.alibaba2.view.resources.TableModelListenerSaleProduct;
import com.pooitec1.alibaba2.view.resources.TableModelProduct;
import com.pooitec1.alibaba2.view.resources.ValidadorDeCampos;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author nadia
 */
public class JPanel_VentaPaso3 extends javax.swing.JPanel {

    LocalDate fecha = LocalDate.now();

    ValidadorDeCampos validadorDeCampos;

    private SaleController controlador;

    private final TableModelProduct tableModelProduct;
    private LoteProduct loteProductSelected;
    private JPanelAplication panelMenu;
    private SpinnerNumberModel modeloSpinner;

    /**
     * Creates new form JPanel_VentaPaso3
     */
    public JPanel_VentaPaso3(JPanelAplication panelMenu, SaleController controladorP) {

        this.modeloSpinner = new SpinnerNumberModel();

        this.validadorDeCampos = new ValidadorDeCampos();

        this.tableModelProduct = new TableModelProduct();

        this.controlador = controladorP;

        this.panelMenu = panelMenu;
        initComponents();
        this.jtbl_products.getSelectionModel().addListSelectionListener(new TableModelListenerSaleProduct(this));

        validadarCampos();

        setupBotones();

        spncantidad.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_prodcutname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_products = new javax.swing.JTable();
        jbtn_cancelarventapaso3 = new javax.swing.JButton();
        jbtn_atrasventapaso3 = new javax.swing.JButton();
        jbtn_agregarsaleline = new javax.swing.JButton();
        jlbl_descripcion = new javax.swing.JLabel();
        jlbl_tipoproducto = new javax.swing.JLabel();
        jlbl_precio = new javax.swing.JLabel();
        jtxf_productname = new javax.swing.JTextField();
        jlblcode = new javax.swing.JLabel();
        jlbldescription = new javax.swing.JLabel();
        jlblprice = new javax.swing.JLabel();
        jtf_quantity = new javax.swing.JLabel();
        JLbl_quantity = new javax.swing.JLabel();
        spncantidad = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jlblsubtotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jlbl_prodcutname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlbl_prodcutname.setText("Product Description");

        jtbl_products.setModel(tableModelProduct);
        jScrollPane1.setViewportView(jtbl_products);

        jbtn_cancelarventapaso3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtn_cancelarventapaso3.setText("CANCEL");
        jbtn_cancelarventapaso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarventapaso3ActionPerformed(evt);
            }
        });

        jbtn_atrasventapaso3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtn_atrasventapaso3.setText("BACK");
        jbtn_atrasventapaso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_atrasventapaso3ActionPerformed(evt);
            }
        });

        jbtn_agregarsaleline.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtn_agregarsaleline.setText("ADD");
        jbtn_agregarsaleline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_agregarsalelineActionPerformed(evt);
            }
        });

        jlbl_descripcion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlbl_descripcion.setText("Code:");

        jlbl_tipoproducto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlbl_tipoproducto.setText("Proyuct type:");

        jlbl_precio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlbl_precio.setText("Price:");

        jtxf_productname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxf_productnameActionPerformed(evt);
            }
        });
        jtxf_productname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxf_productnameKeyReleased(evt);
            }
        });

        jlblcode.setText("jLabel1");

        jlbldescription.setText("jLabel2");

        jlblprice.setText("jLabel3");

        jtf_quantity.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtf_quantity.setText("Quantity:");

        spncantidad.setModel(modeloSpinner);
        spncantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spncantidadStateChanged(evt);
            }
        });
        spncantidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spncantidadPropertyChange(evt);
            }
        });
        spncantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spncantidadKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Subtotal:");

        jlblsubtotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlblsubtotal.setText("$ 0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbl_descripcion)
                                .addGap(18, 18, 18)
                                .addComponent(jlblcode, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbl_tipoproducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbldescription, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbl_precio)
                                .addGap(40, 40, 40)
                                .addComponent(jlblprice, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_quantity)
                                .addGap(18, 18, 18)
                                .addComponent(spncantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlblsubtotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbl_prodcutname)
                                .addGap(18, 18, 18)
                                .addComponent(jtxf_productname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_cancelarventapaso3)
                                .addGap(60, 60, 60)
                                .addComponent(jbtn_atrasventapaso3)
                                .addGap(58, 58, 58)
                                .addComponent(jbtn_agregarsaleline)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_prodcutname)
                    .addComponent(jtxf_productname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jlbl_descripcion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblcode)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_tipoproducto)
                    .addComponent(jlbldescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_precio)
                    .addComponent(jlblprice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_quantity)
                    .addComponent(JLbl_quantity)
                    .addComponent(spncantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblsubtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_cancelarventapaso3)
                    .addComponent(jbtn_atrasventapaso3)
                    .addComponent(jbtn_agregarsaleline))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_cancelarventapaso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarventapaso3ActionPerformed
        this.panelMenu.bloquearBotones(true);
        this.panelMenu.limpiarPanelContenido(); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_cancelarventapaso3ActionPerformed

    private void jbtn_atrasventapaso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_atrasventapaso3ActionPerformed
        JPanel_VentaPaso2 panelPaso2 = new JPanel_VentaPaso2(this.panelMenu, this.controlador);

        panelPaso2.setSize(814, 600);

        this.panelMenu.limpiarPanelContenido();

        this.panelMenu.getjPanel_contenido().add(panelPaso2);

        this.panelMenu.repaint();
        this.panelMenu.validate(); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_atrasventapaso3ActionPerformed

    private void jtxf_productnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxf_productnameKeyReleased
        if (this.jtxf_productname.isEditable()) {
            //Actualizar el TableModel con la lista del controlador
            this.tableModelProduct.setProducts(this.controlador.findProductByDescription(this.jtxf_productname.getText()));

            //Refrescar el modelo en la tabla
            this.tableModelProduct.fireTableDataChanged();
        }// TODO add your handling code here:
    }//GEN-LAST:event_jtxf_productnameKeyReleased

    private void jtxf_productnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxf_productnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxf_productnameActionPerformed

    private void jbtn_agregarsalelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_agregarsalelineActionPerformed
        if (this.loteProductSelected != null) {

            SaleLine saleLine = new SaleLine();
            saleLine.setProduct(loteProductSelected.getProduct());
            saleLine.setQuantity(Integer.parseInt(spncantidad.getValue().toString()));
            if (!buscarSaleLine(saleLine) &&  saleLine.getQuantity()>0) {
                this.controlador.getNewSale().getSaleLines().add(saleLine);
               
                
            }

            JPanel_VentaPaso2 panelPaso2 = new JPanel_VentaPaso2(this.panelMenu, this.controlador);

            panelPaso2.setSize(814, 600);
            this.panelMenu.limpiarPanelContenido();

            this.panelMenu.getjPanel_contenido().add(panelPaso2);
            this.panelMenu.repaint();
            this.panelMenu.validate();

        } else {
            JOptionPane.showMessageDialog(null, "Hola. Selecciona un producto");

        } // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_agregarsalelineActionPerformed

    private void spncantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spncantidadKeyReleased

    }//GEN-LAST:event_spncantidadKeyReleased

    private void spncantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spncantidadStateChanged

        calcularSubtotal();
    }//GEN-LAST:event_spncantidadStateChanged

    private void spncantidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spncantidadPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_spncantidadPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLbl_quantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_agregarsaleline;
    private javax.swing.JButton jbtn_atrasventapaso3;
    private javax.swing.JButton jbtn_cancelarventapaso3;
    private javax.swing.JLabel jlbl_descripcion;
    private javax.swing.JLabel jlbl_precio;
    private javax.swing.JLabel jlbl_prodcutname;
    private javax.swing.JLabel jlbl_tipoproducto;
    private javax.swing.JLabel jlblcode;
    private javax.swing.JLabel jlbldescription;
    private javax.swing.JLabel jlblprice;
    private javax.swing.JLabel jlblsubtotal;
    private javax.swing.JTable jtbl_products;
    private javax.swing.JLabel jtf_quantity;
    private javax.swing.JTextField jtxf_productname;
    private javax.swing.JSpinner spncantidad;
    // End of variables declaration//GEN-END:variables

    public void seleccionarProducto() {

        int filaSeleccionada = this.jtbl_products.getSelectedRow();

        if (filaSeleccionada >= 0) {

            this.loteProductSelected = this.tableModelProduct.getProductIn(filaSeleccionada);

            this.jlblcode.setText(this.loteProductSelected.getProduct().getCodProd());
            this.jlbldescription.setText(this.loteProductSelected.getProduct().getDescription());
            this.jlblprice.setText(pasarMoneda(this.loteProductSelected.getSalePrice()));
            jlblsubtotal.setText(pasarMoneda(this.loteProductSelected.getSalePrice()));

        }
    }

    public void calcularSubtotal() {
        Double precio = this.loteProductSelected.getSalePrice();
       // Integer cantidad = Integer.parseInt(spncantidad.getValue().toString());
       Integer cantidad = Integer.valueOf(spncantidad.getValue().toString());
        jlblsubtotal.setText(pasarMoneda(precio * cantidad));
    }

    public String pasarMoneda(Double precio) {
        return "$ " + Math.round(precio * 100.0) / 100.0;

    }

    public void discountStock(LoteProduct loteSeleccionado, int spncantidad) {
        Integer cantidadActual = loteSeleccionado.getCantidadActual();
        cantidadActual -= spncantidad;
        loteSeleccionado.setCantidadActual(cantidadActual);
    }

    private void validadarCampos() {
        this.validadorDeCampos.validarSoloLetras(jtxf_productname);
        this.validadorDeCampos.LimitarCaracteres(jtxf_productname, 20);
    }

    private void setupBotones() {
        this.validadorDeCampos.habilitarBoton(true, jbtn_cancelarventapaso3, new Color(176, 128, 118), Color.WHITE, Color.GRAY, Color.BLACK);
    }

    private void actualizarTabla() {
     
        int selectedRow = this.jtbl_products.getSelectedRow();
     
        
        // Get the selected quantity from the spinner
        int selectedQuantity = Integer.parseInt(spncantidad.getValue().toString());
        
        // Update the quantity in the TableModelProduct
        LoteProduct selectedProduct = tableModelProduct.getProductIn(selectedRow);
        int currentQuantity = selectedProduct.getQuantity();
        selectedProduct.setQuantity(currentQuantity - selectedQuantity);
        //tableModelProduct.setValueAt((tableModelProduct.getValueAt(, selectedRow, 2);
        // Update the table
        tableModelProduct.fireTableDataChanged();
    }

    public boolean buscarSaleLine(SaleLine newSaleLine) {
        for (SaleLine s : this.controlador.getNewSale().getSaleLines()) {
            if (s.getProduct().getCodProd().equals(newSaleLine.getProduct().getCodProd())) {
                s.setQuantity(s.getQuantity() + newSaleLine.getQuantity());
                return true;
            }

        }
        return false;
    }

    public javax.swing.JSpinner getSpncantidad() {
        return spncantidad;
    }

    public LoteProduct getLoteProductSelected() {
        return loteProductSelected;
    }

    public void setModeloSpinner(SpinnerNumberModel modeloSpinner) {
        this.modeloSpinner = modeloSpinner;
    }

    public SpinnerNumberModel getModeloSpinner() {
        return modeloSpinner;
    }

    public SaleController getControlador() {
        return controlador;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.pooitec1.alibaba2.view;

import com.pooitec1.alibaba2.controller.SaleController;
import com.pooitec1.alibaba2.view.resources.ValidadorDeCampos;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadia
 */
public class JPanel_VentaPaso2 extends javax.swing.JPanel {

    LocalDate fi = LocalDate.now();

    //Validado de campos
    ValidadorDeCampos validadorDeCampos;

    //variables de tabla
    DefaultTableModel modelo = new DefaultTableModel();
    SaleController controlador;
    private JPanelAplication panelMenu;

    /**
     * Creates new form JPanel_ProcesarPrestamo_paso1
     */
    /**
     * Creates new form JPanel_VentaPaso2
     */
    public JPanel_VentaPaso2(JPanelAplication panelMenu, SaleController controladorP) {
        this.validadorDeCampos = new ValidadorDeCampos();

        //this.tableModelLibro = new TableModelLibro();
        this.controlador = controladorP;
        this.panelMenu = panelMenu;

        // System.out.println(controlador.getNewSale().getEmployee().getFirstName());
        //this.jlbl_employee.setText(controlador.getNewSale().getEmployee().getFirstName()+" "+ controlador.getNewSale().getEmployee().getLastName());
        initComponents();
        modelo.addColumn("Code Product");
        modelo.addColumn("Description");
        modelo.addColumn("Price");
        modelo.addColumn("Quantity");
        modelo.addColumn("Subtotal");
        actualizarTabla();

        //agrega escuchadores de las tablas
        //this.jtbl_libros.getSelectionModel().addListSelectionListener(new TableModelListenerLibro(this));
        //  validadarCampos();
        // setupBotones();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_lineadeventa = new javax.swing.JTable();
        jBtn_addproduct = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbtn_cancelarventapaso2 = new javax.swing.JButton();
        jBtn_atrasventapaso2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jlbl_employee = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

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

        jTable_lineadeventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodeProduct", "Description", "Price", "Quantity", "Sub_Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_lineadeventa);
        if (jTable_lineadeventa.getColumnModel().getColumnCount() > 0) {
            jTable_lineadeventa.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable_lineadeventa.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable_lineadeventa.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTable_lineadeventa.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTable_lineadeventa.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

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
        jbtn_cancelarventapaso2.setText("CANCELAR");
        jbtn_cancelarventapaso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarventapaso2ActionPerformed(evt);
            }
        });

        jBtn_atrasventapaso2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtn_atrasventapaso2.setText("ATRAS");
        jBtn_atrasventapaso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_atrasventapaso2ActionPerformed(evt);
            }
        });

        jLabel10.setText("jLabel10");

        jlbl_employee.setText("jLabel11");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jbtn_cancelarventapaso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtn_atrasventapaso2)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(86, 86, 86)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(69, 69, 69)
                                .addComponent(jlbl_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtn_addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlbl_employee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtn_addproduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_cancelarventapaso2)
                    .addComponent(jBtn_atrasventapaso2))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_addproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_addproductActionPerformed
        JPanel_VentaPaso3 panelventapaso3 = new JPanel_VentaPaso3(this.panelMenu, this.controlador);

        panelventapaso3.setSize(814, 600);

        this.panelMenu.limpiarPanelContenido();

        this.panelMenu.getjPanel_contenido().add(panelventapaso3);

        this.panelMenu.repaint();
        this.panelMenu.validate();

        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_addproductActionPerformed

    private void jbtn_cancelarventapaso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarventapaso2ActionPerformed
        this.panelMenu.bloquearBotones(true);
        this.panelMenu.limpiarPanelContenido(); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_cancelarventapaso2ActionPerformed

    private void jBtn_atrasventapaso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_atrasventapaso2ActionPerformed
        JPanel_VentaPaso1 panelPaso1 = new JPanel_VentaPaso1(this.panelMenu, this.controlador);

        panelPaso1.setSize(814, 600);

        this.panelMenu.limpiarPanelContenido();

        this.panelMenu.getjPanel_contenido().add(panelPaso1);

        this.panelMenu.repaint();
        this.panelMenu.validate(); // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_atrasventapaso2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_addproduct;
    private javax.swing.JButton jBtn_atrasventapaso2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_lineadeventa;
    private javax.swing.JButton jbtn_cancelarventapaso2;
    private javax.swing.JLabel jlbl_employee;
    // End of variables declaration//GEN-END:variables

    public void actualizarTabla() {
        jTable_lineadeventa.setModel(modelo);
    }

}

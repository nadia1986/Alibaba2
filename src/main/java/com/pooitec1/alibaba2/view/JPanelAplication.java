/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.pooitec1.alibaba2.view;

import com.pooitec1.alibaba2.controller.LoteProductController;
import com.pooitec1.alibaba2.controller.PurchaseController;
import com.pooitec1.alibaba2.controller.SaleController;
import com.pooitec1.alibaba2.controller.UserController;
import com.pooitec1.alibaba2.entity.User;

/**
 *
 * @author nadia
 */
public class JPanelAplication extends javax.swing.JPanel {

    UserController controlador;
    User user;

    /**
     * Creates new form JPanelAplication
     */
    public JPanelAplication(UserController controladorP) {
        this.user = controladorP.getUserSelected();

        System.out.println(this.user.getNickname());
        this.controlador = controladorP;
        initComponents();
        this.jlbl_userName.setText(this.controlador.getUserSelected().getNickname());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_boton = new javax.swing.JPanel();
        jbtn_nuevaVenta = new javax.swing.JButton();
        jbtn_nuevaCompra = new javax.swing.JButton();
        jbtn_buscarVencimientos = new javax.swing.JButton();
        jbtn_proveedores = new javax.swing.JButton();
        jbtn_productos = new javax.swing.JButton();
        jPanel_contenido = new javax.swing.JPanel();
        jPanel_user = new javax.swing.JPanel();
        jlbl_userName = new javax.swing.JLabel();

        jPanel_boton.setBackground(new java.awt.Color(51, 51, 51));

        jbtn_nuevaVenta.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jbtn_nuevaVenta.setText("Registrar Venta");
        jbtn_nuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_nuevaVentaActionPerformed(evt);
            }
        });

        jbtn_nuevaCompra.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jbtn_nuevaCompra.setText("Registar Compra");
        jbtn_nuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_nuevaCompraActionPerformed(evt);
            }
        });

        jbtn_buscarVencimientos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jbtn_buscarVencimientos.setText("Buscar Vencimientos");
        jbtn_buscarVencimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarVencimientosActionPerformed(evt);
            }
        });

        jbtn_proveedores.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jbtn_proveedores.setText("Proveedores");

        jbtn_productos.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jbtn_productos.setText("Productos");

        javax.swing.GroupLayout jPanel_botonLayout = new javax.swing.GroupLayout(jPanel_boton);
        jPanel_boton.setLayout(jPanel_botonLayout);
        jPanel_botonLayout.setHorizontalGroup(
            jPanel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_botonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtn_productos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_proveedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(jbtn_buscarVencimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbtn_nuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_nuevaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                .addGap(83, 83, 83))
        );
        jPanel_botonLayout.setVerticalGroup(
            jPanel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botonLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jbtn_nuevaVenta)
                .addGap(43, 43, 43)
                .addComponent(jbtn_nuevaCompra)
                .addGap(47, 47, 47)
                .addComponent(jbtn_buscarVencimientos)
                .addGap(37, 37, 37)
                .addComponent(jbtn_productos)
                .addGap(29, 29, 29)
                .addComponent(jbtn_proveedores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_contenidoLayout = new javax.swing.GroupLayout(jPanel_contenido);
        jPanel_contenido.setLayout(jPanel_contenidoLayout);
        jPanel_contenidoLayout.setHorizontalGroup(
            jPanel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        jPanel_contenidoLayout.setVerticalGroup(
            jPanel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        jPanel_user.setBackground(new java.awt.Color(0, 51, 102));

        jlbl_userName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbl_userName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_userLayout = new javax.swing.GroupLayout(jPanel_user);
        jPanel_user.setLayout(jPanel_userLayout);
        jPanel_userLayout.setHorizontalGroup(
            jPanel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_userLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jlbl_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_userLayout.setVerticalGroup(
            jPanel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_userLayout.createSequentialGroup()
                .addComponent(jlbl_userName, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_nuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_nuevaVentaActionPerformed

        SaleController controladorVenta = new SaleController(user);
        //2- crear panel enchufando el controlador creado en paso 1
        JPanel_VentaPaso1 panelPaso1 = new JPanel_VentaPaso1(this, controladorVenta);
        // JPanel_VentaPaso1 panelPaso1 = new JPanel_VentaPaso1(this, controlador);
        panelPaso1.setSize(814, 600);

        this.jPanel_contenido.removeAll();
        this.jPanel_contenido.add(panelPaso1);
        this.repaint();
        this.validate();

        bloquearBotones(false); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_nuevaVentaActionPerformed

    private void jbtn_nuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_nuevaCompraActionPerformed

        PurchaseController controladorCompra = new PurchaseController(user);

        JPanel_Comprapaso1 panelPaso1 = new JPanel_Comprapaso1(this, controladorCompra);
        panelPaso1.setSize(814, 600);
        this.jPanel_contenido.removeAll();
        this.jPanel_contenido.add(panelPaso1);
        this.repaint();
        this.validate();
        bloquearBotones(false);   // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_nuevaCompraActionPerformed

    private void jbtn_buscarVencimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarVencimientosActionPerformed
        
        LoteProductController controladorLote= new LoteProductController();
        JPanel_BuscarVencimientos panelVencimiento = new JPanel_BuscarVencimientos(this, controladorLote);
        panelVencimiento.setSize(814, 600);
        this.jPanel_contenido.removeAll();
        this.jPanel_contenido.add(panelVencimiento);
        this.repaint();
        this.validate();
        bloquearBotones(false);// TODO add your handling code here:
    }//GEN-LAST:event_jbtn_buscarVencimientosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel_boton;
    private javax.swing.JPanel jPanel_contenido;
    private javax.swing.JPanel jPanel_user;
    private javax.swing.JButton jbtn_buscarVencimientos;
    private javax.swing.JButton jbtn_nuevaCompra;
    private javax.swing.JButton jbtn_nuevaVenta;
    private javax.swing.JButton jbtn_productos;
    private javax.swing.JButton jbtn_proveedores;
    private javax.swing.JLabel jlbl_userName;
    // End of variables declaration//GEN-END:variables

    public void bloquearBotones(boolean estado) {
        this.jbtn_nuevaVenta.setEnabled(estado);
        this.jbtn_nuevaCompra.setEnabled(estado);
        this.jbtn_buscarVencimientos.setEnabled(estado);
        this.jbtn_proveedores.setEnabled(estado);
        this.jbtn_productos.setEnabled(estado);

    }

    public void limpiarPanelContenido() {
        this.jPanel_contenido.removeAll();
        this.repaint();
        this.validate();
    }

    public javax.swing.JPanel getjPanel_contenido() {
        return jPanel_contenido;
    }
}

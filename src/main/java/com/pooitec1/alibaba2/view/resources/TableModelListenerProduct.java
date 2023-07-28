package com.pooitec1.alibaba2.view.resources;

import com.pooitec1.alibaba2.view.JPanel_VentaPaso3;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nadia
 */
public class TableModelListenerProduct implements ListSelectionListener {

    private final JPanel_VentaPaso3 jPanelProcesarVentaPaso3;

    public TableModelListenerProduct(JPanel_VentaPaso3 pantallaContenido) {
        this.jPanelProcesarVentaPaso3 = pantallaContenido;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        this.jPanelProcesarVentaPaso3.seleccionarProducto();
        this.jPanelProcesarVentaPaso3.getSpncantidad().setEnabled(true);

        this.jPanelProcesarVentaPaso3.getSpncantidad().setValue(1);
        
        
       // this.jPanelProcesarVentaPaso3.getModeloSpinner().setMinimum( 1);
        this.jPanelProcesarVentaPaso3.getModeloSpinner().setMaximum(this.jPanelProcesarVentaPaso3.getLoteProductSelected().getCantidadActual());
        
        //System.out.println(this.jPanelProcesarVentaPaso3.getControlador().validarProductoACargar(this.jPanelProcesarVentaPaso3.getLoteProductSelected()));
        
        // this.jPanelProcesarVentaPaso3.getSpncantidad().setModel(this.jPanelProcesarVentaPaso3.getModeloSpinner());
    }

}

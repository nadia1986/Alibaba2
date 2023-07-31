package com.pooitec1.alibaba2.view.resources;

import com.pooitec1.alibaba2.view.JPanel_BuscarVencimientos;
import com.pooitec1.alibaba2.view.JPanel_VentaPaso3;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nadia
 */
public class TableModelListenerVencimientos implements ListSelectionListener {

    private final JPanel_BuscarVencimientos jPanelBuscarVencimientos;

    public TableModelListenerVencimientos(JPanel_BuscarVencimientos pantallaContenido) {
        this.jPanelBuscarVencimientos = pantallaContenido;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        this.jPanelBuscarVencimientos.seleccionarProducto();
       
    }

}

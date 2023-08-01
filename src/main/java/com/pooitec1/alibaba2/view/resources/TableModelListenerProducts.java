
package com.pooitec1.alibaba2.view.resources;

import com.pooitec1.alibaba2.view.JPanel_Productos;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nadia
 */
public class TableModelListenerProducts implements ListSelectionListener{

    private final JPanel_Productos jPanelBuscarProductos;
    
    public TableModelListenerProducts(JPanel_Productos pantallaContenido) {
        this.jPanelBuscarProductos = pantallaContenido;
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        this.jPanelBuscarProductos.seleccionarProducto();
    }
    
}

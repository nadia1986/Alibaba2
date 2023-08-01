
package com.pooitec1.alibaba2.view.resources;

import com.pooitec1.alibaba2.view.JPanel_WharehouseProduct;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nadia
 */
public class TableModelListenerWharehouseProduct implements ListSelectionListener {

        private final JPanel_WharehouseProduct panelWharehouse;
        
         public TableModelListenerWharehouseProduct(JPanel_WharehouseProduct pantallaContenido) {
        this.panelWharehouse = pantallaContenido;
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        this.panelWharehouse.seleccionarProducto();
    }
    
}

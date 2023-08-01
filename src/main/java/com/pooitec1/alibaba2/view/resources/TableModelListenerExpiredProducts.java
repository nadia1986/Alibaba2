
package com.pooitec1.alibaba2.view.resources;

import com.pooitec1.alibaba2.view.JPanel_ExpiredProduct;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nadia
 */
public class TableModelListenerExpiredProducts implements ListSelectionListener {

    private final JPanel_ExpiredProduct panelExpired;

    public TableModelListenerExpiredProducts(JPanel_ExpiredProduct panelContenido) {
        this.panelExpired = panelContenido;
    }
    
    
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        this.panelExpired.seleccionarProducto();
    }
    
}

package com.pooitec1.alibaba2.view.resources;

import com.pooitec1.alibaba2.entity.Wharehouse;
import com.pooitec1.alibaba2.view.JPanel_Comprapaso2;
import javax.swing.JComboBox;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author nadia
 */
public class TableModelListenerProductPurchase implements ListSelectionListener {

    private final JPanel_Comprapaso2 jPanelProcesarCompraPaso2;

    public TableModelListenerProductPurchase(JPanel_Comprapaso2 pantallaContenido) {
        this.jPanelProcesarCompraPaso2 = pantallaContenido;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        this.jPanelProcesarCompraPaso2.seleccionarProducto();

    }

}

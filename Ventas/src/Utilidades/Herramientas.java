/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.awt.Component;
import javax.swing.JComponent;

/**
 *
 * @author PapuXDXDXD
 */
public class Herramientas {

    public Herramientas() {
    }
    public void deshabilitarPanel(JComponent jcomponent){
        jcomponent.setVisible(false);
        Component[] componentes = jcomponent.getComponents();
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(false);
        }
    }
    public void habilitarPanel(JComponent jcomponent){
        jcomponent.setVisible(true);
        Component[] componentes = jcomponent.getComponents();
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(true);
        }
    }
    
}

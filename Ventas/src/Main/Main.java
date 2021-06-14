/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Vistas.MainFrame;

/**
 *
 * @author PapuXDXDXD
 */
public class Main {
    public static void main(String[] args) {
        MainFrame cuadro = new MainFrame();
        cuadro.showInicio();
        cuadro.setVisible(true);
        MainFrame otro = new MainFrame();
        otro.showLogin();
        otro.setVisible(true);
    }
}

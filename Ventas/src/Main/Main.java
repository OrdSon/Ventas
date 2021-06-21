/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Utilidades.Conexion;
import Vistas.MainFrame;

/**
 *
 * @author PapuXDXDXD
 */
public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        conexion.conectar();

        MainFrame cuadro = new MainFrame(conexion.getConnection());
        cuadro.showInicio();
        cuadro.setVisible(true);
        MainFrame otro = new MainFrame();
        otro.showLogin();
        otro.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author ordson201931185
 */
public class Modelador {
    
    Connection connection = null;
    
    public Modelador(Connection connection){
        this.connection = connection;
    }
    
    public void obtenerDatos(JTable tabla, String query, String[] modelPreset){
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            
            int columnas = rsMd.getColumnCount();
            
            setModel(modelPreset, modelo);
            
            while (rs.next()) {                
                
                Object[] filas = new Object[columnas];
                
                for (int i = 0; i < columnas; i++) {
                    filas[i] = rs.getObject(i+1);
                }
                
                modelo.addRow(filas);
            }
            
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
    public void setModel(String[] modelPreset, DefaultTableModel modelo){
        for (int i = 0; i < modelPreset.length; i++) {
            modelo.addColumn(modelPreset[i]);
        }
    }
}

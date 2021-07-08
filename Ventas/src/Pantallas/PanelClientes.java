/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Controladores.Modelador;
import Utilidades.Modelos;
import Utilidades.Querys;
import java.sql.Connection;
/**
 *
 * @author OrdSon
 */
public class PanelClientes extends javax.swing.JPanel {
 Connection connection = null;   
 Modelador modelador = new Modelador();
    
    public PanelClientes() {
        initComponents();
    }
    
    public void obtenerClientes(){
        modelador.obtenerDatos(TablaClientes, Querys.SELECT_CLIENTES, Modelos.MODELO_CLIENTES);
    }
    
    public void setConnection(Connection connection){
        this.connection = connection;
        modelador.setConnection(connection);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PanelOpcionesBusqueda = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PanelBaseTabla = new javax.swing.JPanel();
        jScrollDeTabla = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 184, 211));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setRequestFocusEnabled(false);
        setLayout(new java.awt.BorderLayout());

        PanelOpcionesBusqueda.setBackground(new java.awt.Color(153, 184, 211));
        PanelOpcionesBusqueda.setMinimumSize(new java.awt.Dimension(800, 100));
        PanelOpcionesBusqueda.setPreferredSize(new java.awt.Dimension(1467, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelOpcionesBusquedaLayout = new javax.swing.GroupLayout(PanelOpcionesBusqueda);
        PanelOpcionesBusqueda.setLayout(PanelOpcionesBusquedaLayout);
        PanelOpcionesBusquedaLayout.setHorizontalGroup(
            PanelOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcionesBusquedaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 500, Short.MAX_VALUE))
        );
        PanelOpcionesBusquedaLayout.setVerticalGroup(
            PanelOpcionesBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(PanelOpcionesBusqueda, java.awt.BorderLayout.PAGE_START);

        PanelBaseTabla.setBackground(new java.awt.Color(255, 255, 255));
        PanelBaseTabla.setLayout(new java.awt.BorderLayout());

        jScrollDeTabla.setBackground(new java.awt.Color(255, 255, 255));

        TablaClientes.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaClientes.setGridColor(new java.awt.Color(51, 54, 131));
        jScrollDeTabla.setViewportView(TablaClientes);

        PanelBaseTabla.add(jScrollDeTabla, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(153, 184, 211));
        jPanel1.setMinimumSize(new java.awt.Dimension(10, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/terminal.png"))); // NOI18N
        jButton1.setToolTipText("Ordenar por codigo");
        jButton1.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 272, 0, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/users.png"))); // NOI18N
        jButton2.setToolTipText("Ordenar por cliente");
        jButton2.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        jPanel1.add(jButton2, gridBagConstraints);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/dollar-sign.png"))); // NOI18N
        jButton3.setToolTipText("Ordenar por total de venta");
        jButton3.setMinimumSize(new java.awt.Dimension(25, 25));
        jButton3.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 293);
        jPanel1.add(jButton3, gridBagConstraints);

        PanelBaseTabla.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        add(PanelBaseTabla, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBaseTabla;
    private javax.swing.JPanel PanelOpcionesBusqueda;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollDeTabla;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Utilidades.Herramientas;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.sql.Connection;

/**
 *
 * @author OrdSon
 */
public class InicioAdmin extends javax.swing.JPanel {
    Connection connection = null;
    Herramientas herramientas = new Herramientas();
    PanelInventario inventario = new PanelInventario();
    PanelAdministracion administracion = new PanelAdministracion();
    PanelVentas ventas = new PanelVentas();
    PanelCompras compras = new PanelCompras();
    PanelClientes clientes = new PanelClientes();
    PanelProveedores proveedores = new PanelProveedores();
    
    
    ArrayList<JPanel> paneles = new ArrayList<>();

    public InicioAdmin() {
        initComponents();
    }
    
    public InicioAdmin(Connection connection){
        initComponents();
        this.connection = connection;
        inventario.setConnection(connection);
        compras.setConnection(connection);
        clientes.setConnection(connection);
        proveedores.setConnection(connection);
        inventario.getProductos();
        compras.obtenerCompras();
        clientes.obtenerClientes();
        proveedores.obtenerProveedores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        PanelSuperior = new javax.swing.JPanel();
        PanelBaner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelOpciones = new javax.swing.JPanel();
        BtnInfo = new javax.swing.JToggleButton();
        BtnInventario = new javax.swing.JToggleButton();
        BtnVentas = new javax.swing.JToggleButton();
        BtnCompras = new javax.swing.JToggleButton();
        BtnClientes = new javax.swing.JToggleButton();
        BtnProveedores = new javax.swing.JToggleButton();
        BtnTiendas = new javax.swing.JToggleButton();
        BtnReportes = new javax.swing.JToggleButton();
        BtnAdministracion = new javax.swing.JToggleButton();
        PanelBase = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        setLayout(new java.awt.BorderLayout());

        PanelSuperior.setBackground(new java.awt.Color(51, 255, 0));
        PanelSuperior.setMinimumSize(new java.awt.Dimension(0, 100));
        PanelSuperior.setLayout(new java.awt.BorderLayout());

        PanelBaner.setBackground(new java.awt.Color(51, 54, 131));
        PanelBaner.setMinimumSize(new java.awt.Dimension(100, 20));
        PanelBaner.setPreferredSize(new java.awt.Dimension(1200, 20));
        PanelBaner.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setBackground(new java.awt.Color(255, 197, 61));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 197, 61));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DEL BARRIO");
        PanelBaner.add(jLabel1);

        PanelSuperior.add(PanelBaner, java.awt.BorderLayout.PAGE_START);

        PanelOpciones.setBackground(new java.awt.Color(51, 54, 131));
        PanelOpciones.setMinimumSize(new java.awt.Dimension(679, 50));
        PanelOpciones.setPreferredSize(new java.awt.Dimension(1200, 50));
        PanelOpciones.setLayout(new java.awt.GridLayout(1, 0));

        BtnInfo.setBackground(new java.awt.Color(255, 226, 158));
        grupoBotones.add(BtnInfo);
        BtnInfo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        BtnInfo.setForeground(new java.awt.Color(51, 54, 131));
        BtnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info.png"))); // NOI18N
        BtnInfo.setText("INFO");
        BtnInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 173, 198)));
        BtnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnInfo.setMaximumSize(new java.awt.Dimension(50, 27));
        BtnInfo.setMinimumSize(new java.awt.Dimension(50, 27));
        BtnInfo.setPreferredSize(new java.awt.Dimension(50, 27));
        BtnInfo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfoActionPerformed(evt);
            }
        });
        PanelOpciones.add(BtnInfo);

        BtnInventario.setBackground(new java.awt.Color(51, 54, 131));
        grupoBotones.add(BtnInventario);
        BtnInventario.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        BtnInventario.setForeground(new java.awt.Color(233, 234, 236));
        BtnInventario.setText("INVENTARIO");
        BtnInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 173, 198)));
        BtnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventarioActionPerformed(evt);
            }
        });
        PanelOpciones.add(BtnInventario);

        BtnVentas.setBackground(new java.awt.Color(51, 54, 131));
        grupoBotones.add(BtnVentas);
        BtnVentas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        BtnVentas.setForeground(new java.awt.Color(233, 234, 236));
        BtnVentas.setText("VENTAS");
        BtnVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 173, 198)));
        BtnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVentasActionPerformed(evt);
            }
        });
        PanelOpciones.add(BtnVentas);

        BtnCompras.setBackground(new java.awt.Color(51, 54, 131));
        grupoBotones.add(BtnCompras);
        BtnCompras.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        BtnCompras.setForeground(new java.awt.Color(233, 234, 236));
        BtnCompras.setText("COMPRAS");
        BtnCompras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 173, 198)));
        BtnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprasActionPerformed(evt);
            }
        });
        PanelOpciones.add(BtnCompras);

        BtnClientes.setBackground(new java.awt.Color(51, 54, 131));
        grupoBotones.add(BtnClientes);
        BtnClientes.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        BtnClientes.setForeground(new java.awt.Color(233, 234, 236));
        BtnClientes.setText("CLIENTES");
        BtnClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 173, 198)));
        BtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClientesActionPerformed(evt);
            }
        });
        PanelOpciones.add(BtnClientes);

        BtnProveedores.setBackground(new java.awt.Color(51, 54, 131));
        grupoBotones.add(BtnProveedores);
        BtnProveedores.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        BtnProveedores.setForeground(new java.awt.Color(233, 234, 236));
        BtnProveedores.setText("PROVEEDORES");
        BtnProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 173, 198)));
        BtnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProveedoresActionPerformed(evt);
            }
        });
        PanelOpciones.add(BtnProveedores);

        BtnTiendas.setBackground(new java.awt.Color(51, 54, 131));
        grupoBotones.add(BtnTiendas);
        BtnTiendas.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        BtnTiendas.setForeground(new java.awt.Color(233, 234, 236));
        BtnTiendas.setText("TIENDAS");
        BtnTiendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 173, 198)));
        PanelOpciones.add(BtnTiendas);

        BtnReportes.setBackground(new java.awt.Color(51, 54, 131));
        grupoBotones.add(BtnReportes);
        BtnReportes.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        BtnReportes.setForeground(new java.awt.Color(233, 234, 236));
        BtnReportes.setText("REPORTES");
        BtnReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 173, 198)));
        PanelOpciones.add(BtnReportes);

        BtnAdministracion.setBackground(new java.awt.Color(51, 54, 131));
        grupoBotones.add(BtnAdministracion);
        BtnAdministracion.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        BtnAdministracion.setForeground(new java.awt.Color(233, 234, 236));
        BtnAdministracion.setText("ADMINISTRACIÓN");
        BtnAdministracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 173, 198)));
        PanelOpciones.add(BtnAdministracion);

        PanelSuperior.add(PanelOpciones, java.awt.BorderLayout.CENTER);

        add(PanelSuperior, java.awt.BorderLayout.PAGE_START);

        PanelBase.setBackground(new java.awt.Color(255, 255, 255));
        PanelBase.setLayout(new java.awt.CardLayout());
        add(PanelBase, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    public void iniciar() {
        agregarPaneles();
        BtnInfo.setEnabled(true);
        administracion.setVisible(true);
        herramientas.habilitarPanel(administracion);
        PanelBase.updateUI();

    }

    private void agregarPaneles() {
        
        paneles.add(inventario);
        paneles.add(administracion);
        paneles.add(ventas);
        paneles.add(compras);
        paneles.add(clientes);
        paneles.add(proveedores);
        
        for (int i = 0; i < paneles.size(); i++) {
            PanelBase.add(paneles.get(i));
        }
        apagarPaneles();
        PanelBase.updateUI();

    }

    private void apagarPaneles() {
        for (int i = 0; i < paneles.size(); i++) {
            herramientas.deshabilitarPanel(paneles.get(i));
        }
        PanelBase.updateUI();
    }
    
    public void setConnection(Connection connection){
        this.connection = connection;
    }

    private void BtnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventarioActionPerformed
        apagarPaneles();
        inventario.setVisible(true);
        herramientas.habilitarPanel(inventario);
        PanelBase.updateUI();

    }//GEN-LAST:event_BtnInventarioActionPerformed

    private void BtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVentasActionPerformed
        apagarPaneles();
        ventas.setVisible(true);
        herramientas.habilitarPanel(ventas);
        PanelBase.updateUI();

    }//GEN-LAST:event_BtnVentasActionPerformed

    private void BtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfoActionPerformed
        apagarPaneles();
        administracion.setVisible(true);
        herramientas.habilitarPanel(administracion);
        PanelBase.updateUI();

    }//GEN-LAST:event_BtnInfoActionPerformed

    private void BtnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprasActionPerformed
        apagarPaneles();
        compras.setVisible(true);
        herramientas.habilitarPanel(compras);
        PanelBase.updateUI();
    }//GEN-LAST:event_BtnComprasActionPerformed

    private void BtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClientesActionPerformed
        apagarPaneles();
        clientes.setVisible(true);
        herramientas.habilitarPanel(clientes);
        PanelBase.updateUI();
    }//GEN-LAST:event_BtnClientesActionPerformed

    private void BtnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProveedoresActionPerformed
        apagarPaneles();
        proveedores.setVisible(true);
        herramientas.habilitarPanel(proveedores);
        PanelBase.updateUI();
    }//GEN-LAST:event_BtnProveedoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnAdministracion;
    private javax.swing.JToggleButton BtnClientes;
    private javax.swing.JToggleButton BtnCompras;
    private javax.swing.JToggleButton BtnInfo;
    private javax.swing.JToggleButton BtnInventario;
    private javax.swing.JToggleButton BtnProveedores;
    private javax.swing.JToggleButton BtnReportes;
    private javax.swing.JToggleButton BtnTiendas;
    private javax.swing.JToggleButton BtnVentas;
    private javax.swing.JPanel PanelBaner;
    private javax.swing.JPanel PanelBase;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

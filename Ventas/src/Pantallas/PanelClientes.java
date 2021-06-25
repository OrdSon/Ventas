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
        PanelBuscarCodigo = new javax.swing.JPanel();
        lblBuscarCodigo = new javax.swing.JLabel();
        txtBuscarCodigo = new javax.swing.JTextField();
        txtBuscarCodigo1 = new javax.swing.JTextField();
        PanelBuscarPorTienda1 = new javax.swing.JPanel();
        lblBuscarPorTienda2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lblBuscarPorTienda3 = new javax.swing.JLabel();
        lblBuscarPorTienda5 = new javax.swing.JLabel();
        lblBuscarPorTienda6 = new javax.swing.JLabel();
        lblBuscarPorTienda7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        PanelOpcionesBusqueda.setLayout(new java.awt.GridBagLayout());

        PanelBuscarCodigo.setBackground(new java.awt.Color(144, 173, 198));
        PanelBuscarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBuscarCodigoMouseExited(evt);
            }
        });

        lblBuscarCodigo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblBuscarCodigo.setText("BUSCAR CLIENTE");

        txtBuscarCodigo.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtBuscarCodigo.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarCodigo.setText("NIT");
        txtBuscarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarCodigoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBuscarCodigoMouseExited(evt);
            }
        });

        txtBuscarCodigo1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtBuscarCodigo1.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarCodigo1.setText("NIT");
        txtBuscarCodigo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarCodigo1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBuscarCodigo1MouseExited(evt);
            }
        });
        txtBuscarCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarCodigo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBuscarCodigoLayout = new javax.swing.GroupLayout(PanelBuscarCodigo);
        PanelBuscarCodigo.setLayout(PanelBuscarCodigoLayout);
        PanelBuscarCodigoLayout.setHorizontalGroup(
            PanelBuscarCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBuscarCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBuscarCodigoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelBuscarCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PanelBuscarCodigoLayout.setVerticalGroup(
            PanelBuscarCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarCodigoLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(lblBuscarCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        PanelOpcionesBusqueda.add(PanelBuscarCodigo, gridBagConstraints);

        PanelBuscarPorTienda1.setBackground(new java.awt.Color(153, 184, 211));
        PanelBuscarPorTienda1.setMinimumSize(new java.awt.Dimension(180, 100));
        PanelBuscarPorTienda1.setPreferredSize(new java.awt.Dimension(180, 99));
        PanelBuscarPorTienda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBuscarPorTienda1MouseExited(evt);
            }
        });
        PanelBuscarPorTienda1.setLayout(new java.awt.GridBagLayout());

        lblBuscarPorTienda2.setBackground(new java.awt.Color(255, 255, 255));
        lblBuscarPorTienda2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblBuscarPorTienda2.setForeground(new java.awt.Color(204, 255, 255));
        lblBuscarPorTienda2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarPorTienda2.setText("EDITAR CLIENTE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 10, 0, 0);
        PanelBuscarPorTienda1.add(lblBuscarPorTienda2, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user-check.png"))); // NOI18N
        jButton4.setText("EDITAR");
        jButton4.setToolTipText("Crear una nueva venta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 18, 0, 20);
        PanelBuscarPorTienda1.add(jButton4, gridBagConstraints);

        lblBuscarPorTienda3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblBuscarPorTienda3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarPorTienda3.setText("NIT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 8, 0);
        PanelBuscarPorTienda1.add(lblBuscarPorTienda3, gridBagConstraints);

        lblBuscarPorTienda5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblBuscarPorTienda5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarPorTienda5.setText("NOMBRE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 26, 0, 0);
        PanelBuscarPorTienda1.add(lblBuscarPorTienda5, gridBagConstraints);

        lblBuscarPorTienda6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblBuscarPorTienda6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarPorTienda6.setText("DIRECCIÓN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 26, 0, 0);
        PanelBuscarPorTienda1.add(lblBuscarPorTienda6, gridBagConstraints);

        lblBuscarPorTienda7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblBuscarPorTienda7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarPorTienda7.setText("TELEFONO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 26, 8, 0);
        PanelBuscarPorTienda1.add(lblBuscarPorTienda7, gridBagConstraints);

        jTextField2.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 173;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        PanelBuscarPorTienda1.add(jTextField2, gridBagConstraints);

        jTextField3.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 173;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        PanelBuscarPorTienda1.add(jTextField3, gridBagConstraints);

        jTextField4.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 173;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 8, 0);
        PanelBuscarPorTienda1.add(jTextField4, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jLabel1.setText("34041239");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 18, 0, 0);
        PanelBuscarPorTienda1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 386;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 97, 0, 98);
        PanelOpcionesBusqueda.add(PanelBuscarPorTienda1, gridBagConstraints);

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
    //Metodos que se activan al dar click
    private void txtBuscarCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCodigoMouseClicked
  
    }//GEN-LAST:event_txtBuscarCodigoMouseClicked
    //Metodos que se activan al salir de un textField
    private void txtBuscarCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCodigoMouseExited
        
    }//GEN-LAST:event_txtBuscarCodigoMouseExited

    private void PanelBuscarCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBuscarCodigoMouseExited
    }//GEN-LAST:event_PanelBuscarCodigoMouseExited

    private void PanelBuscarPorTienda1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBuscarPorTienda1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelBuscarPorTienda1MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtBuscarCodigo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCodigo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCodigo1MouseClicked

    private void txtBuscarCodigo1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCodigo1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCodigo1MouseExited

    private void txtBuscarCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarCodigo1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBaseTabla;
    private javax.swing.JPanel PanelBuscarCodigo;
    private javax.swing.JPanel PanelBuscarPorTienda1;
    private javax.swing.JPanel PanelOpcionesBusqueda;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollDeTabla;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblBuscarCodigo;
    private javax.swing.JLabel lblBuscarPorTienda2;
    private javax.swing.JLabel lblBuscarPorTienda3;
    private javax.swing.JLabel lblBuscarPorTienda5;
    private javax.swing.JLabel lblBuscarPorTienda6;
    private javax.swing.JLabel lblBuscarPorTienda7;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtBuscarCodigo1;
    // End of variables declaration//GEN-END:variables
}

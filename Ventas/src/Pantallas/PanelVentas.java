/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Vistas.FrameNuevaVenta;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author PapuXDXDXD
 */
public class PanelVentas extends javax.swing.JPanel {
    
    private final String PRE_CODIGO = "PROD-0000";
    private final String PRE_NOMBRE = "PRODUCTO";
    private final String PRE_TIENDA = "TIENDA";
    Color grisFuente = new Color(204,204,204);
    
    public PanelVentas() {
        initComponents();
    }
    //Se activa al dar click en un textField, cambia el color de fuente para 
    //que sea mas legible
    private void cambiarFuenteEscritura(JTextField textField){    
           
        textField.setText("");
        textField.setForeground(Color.BLACK); 
    }
    
    //Se activa al salir de un textField, si dicho componente esta vacío
    //cambia el color de la fuente y escribe un ejemplo
    private void cambiarFuenteEspera(JTextField textField, String mensaje){
        if (textField.getText().isBlank()) {
            textField.setForeground(grisFuente);
            textField.setText(mensaje);
            
        } 
    }
    
    private void crearNuevaVenta(){
        FrameNuevaVenta nuevaVenta = new FrameNuevaVenta();
        nuevaVenta.iniciar();
        nuevaVenta.setVisible(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PanelOpcionesBusqueda = new javax.swing.JPanel();
        PanelBuscarCodigo = new javax.swing.JPanel();
        lblBuscarCodigo = new javax.swing.JLabel();
        txtBuscarCodigo = new javax.swing.JTextField();
        PanelBuscarNombre = new javax.swing.JPanel();
        lblBuscarNombre = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        cbBuscarNombre = new javax.swing.JComboBox<>();
        PanelBuscarPorTienda = new javax.swing.JPanel();
        txtBuscarPorTienda = new javax.swing.JTextField();
        mbBuscarPorTienda = new javax.swing.JComboBox<>();
        lblBuscarPorTienda1 = new javax.swing.JLabel();
        PanelBuscarPorTienda1 = new javax.swing.JPanel();
        lblBuscarPorTienda2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        PanelBaseTabla = new javax.swing.JPanel();
        jScrollDeTabla = new javax.swing.JScrollPane();
        TablaInventario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setRequestFocusEnabled(false);
        setLayout(new java.awt.BorderLayout());

        PanelOpcionesBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        PanelOpcionesBusqueda.setMinimumSize(new java.awt.Dimension(800, 100));
        PanelOpcionesBusqueda.setPreferredSize(new java.awt.Dimension(1467, 100));
        PanelOpcionesBusqueda.setLayout(new java.awt.GridLayout(1, 0));

        PanelBuscarCodigo.setBackground(new java.awt.Color(144, 173, 198));
        PanelBuscarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBuscarCodigoMouseExited(evt);
            }
        });
        PanelBuscarCodigo.setLayout(new java.awt.GridBagLayout());

        lblBuscarCodigo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblBuscarCodigo.setText("BUSCAR POR CODIGO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 0, 0);
        PanelBuscarCodigo.add(lblBuscarCodigo, gridBagConstraints);

        txtBuscarCodigo.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtBuscarCodigo.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarCodigo.setText("VENTA-000");
        txtBuscarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarCodigoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBuscarCodigoMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 147;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 43, 10);
        PanelBuscarCodigo.add(txtBuscarCodigo, gridBagConstraints);

        PanelOpcionesBusqueda.add(PanelBuscarCodigo);

        PanelBuscarNombre.setBackground(new java.awt.Color(153, 184, 211));
        PanelBuscarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBuscarNombreMouseExited(evt);
            }
        });
        PanelBuscarNombre.setLayout(new java.awt.GridBagLayout());

        lblBuscarNombre.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblBuscarNombre.setText("BUSCAR CLIENTE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 12, 0, 0);
        PanelBuscarNombre.add(lblBuscarNombre, gridBagConstraints);

        txtBuscarNombre.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtBuscarNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarNombre.setText("CLIENTE");
        txtBuscarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarNombreMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBuscarNombreMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 9);
        PanelBuscarNombre.add(txtBuscarNombre, gridBagConstraints);

        cbBuscarNombre.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        cbBuscarNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rosa Diaz", "Estevan Gonzales", "Mauricio Cifuentes", "Rogelio Garcia", "Margarita Miranda" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = -21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 12, 4, 9);
        PanelBuscarNombre.add(cbBuscarNombre, gridBagConstraints);

        PanelOpcionesBusqueda.add(PanelBuscarNombre);

        PanelBuscarPorTienda.setBackground(new java.awt.Color(144, 173, 198));
        PanelBuscarPorTienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBuscarPorTiendaMouseExited(evt);
            }
        });
        PanelBuscarPorTienda.setLayout(new java.awt.GridBagLayout());

        txtBuscarPorTienda.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtBuscarPorTienda.setForeground(new java.awt.Color(204, 204, 204));
        txtBuscarPorTienda.setText("TIENDA");
        txtBuscarPorTienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarPorTiendaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBuscarPorTiendaMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 9);
        PanelBuscarPorTienda.add(txtBuscarPorTienda, gridBagConstraints);

        mbBuscarPorTienda.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        mbBuscarPorTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRINCIPAL", "SAN ANTONIO", "VISTA BELLA" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 12, 4, 9);
        PanelBuscarPorTienda.add(mbBuscarPorTienda, gridBagConstraints);

        lblBuscarPorTienda1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblBuscarPorTienda1.setText("BUSCAR POR TIENDA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 12, 0, 0);
        PanelBuscarPorTienda.add(lblBuscarPorTienda1, gridBagConstraints);

        PanelOpcionesBusqueda.add(PanelBuscarPorTienda);

        PanelBuscarPorTienda1.setBackground(new java.awt.Color(153, 184, 211));
        PanelBuscarPorTienda1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelBuscarPorTienda1MouseExited(evt);
            }
        });
        PanelBuscarPorTienda1.setLayout(new java.awt.GridBagLayout());

        lblBuscarPorTienda2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        lblBuscarPorTienda2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuscarPorTienda2.setText("NUEVA VENTA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 32, 0, 29);
        PanelBuscarPorTienda1.add(lblBuscarPorTienda2, gridBagConstraints);

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/arrow-right-circle.png"))); // NOI18N
        jButton4.setText("CREAR");
        jButton4.setToolTipText("Crear una nueva venta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 33, 23, 29);
        PanelBuscarPorTienda1.add(jButton4, gridBagConstraints);

        PanelOpcionesBusqueda.add(PanelBuscarPorTienda1);

        add(PanelOpcionesBusqueda, java.awt.BorderLayout.PAGE_START);

        PanelBaseTabla.setBackground(new java.awt.Color(255, 255, 255));
        PanelBaseTabla.setLayout(new java.awt.BorderLayout());

        jScrollDeTabla.setBackground(new java.awt.Color(255, 255, 255));

        TablaInventario.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        TablaInventario.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaInventario.setGridColor(new java.awt.Color(51, 54, 131));
        jScrollDeTabla.setViewportView(TablaInventario);

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
        if (txtBuscarCodigo.getText().equals(PRE_CODIGO)) {
            cambiarFuenteEscritura(txtBuscarCodigo);
        }
    }//GEN-LAST:event_txtBuscarCodigoMouseClicked

    private void txtBuscarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarNombreMouseClicked
        if (txtBuscarNombre.getText().equals(PRE_NOMBRE)) {
            cambiarFuenteEscritura(txtBuscarNombre);
        }
    }//GEN-LAST:event_txtBuscarNombreMouseClicked

    private void txtBuscarPorTiendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarPorTiendaMouseClicked
        if (txtBuscarPorTienda.getText().equals(PRE_TIENDA)) {
            cambiarFuenteEscritura(txtBuscarPorTienda);
        }
    }//GEN-LAST:event_txtBuscarPorTiendaMouseClicked
    //Metodos que se activan al salir de un textField
    private void txtBuscarCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCodigoMouseExited
        
    }//GEN-LAST:event_txtBuscarCodigoMouseExited

    private void txtBuscarNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarNombreMouseExited
        
    }//GEN-LAST:event_txtBuscarNombreMouseExited

    private void txtBuscarPorTiendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarPorTiendaMouseExited
      
    }//GEN-LAST:event_txtBuscarPorTiendaMouseExited

    private void PanelBuscarCodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBuscarCodigoMouseExited
        cambiarFuenteEspera(txtBuscarCodigo, PRE_CODIGO);
    }//GEN-LAST:event_PanelBuscarCodigoMouseExited

    private void PanelBuscarNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBuscarNombreMouseExited
        cambiarFuenteEspera(txtBuscarNombre, PRE_NOMBRE);
    }//GEN-LAST:event_PanelBuscarNombreMouseExited

    private void PanelBuscarPorTiendaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBuscarPorTiendaMouseExited
        cambiarFuenteEspera(txtBuscarPorTienda, PRE_TIENDA);
    }//GEN-LAST:event_PanelBuscarPorTiendaMouseExited

    private void PanelBuscarPorTienda1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelBuscarPorTienda1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelBuscarPorTienda1MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        crearNuevaVenta();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBaseTabla;
    private javax.swing.JPanel PanelBuscarCodigo;
    private javax.swing.JPanel PanelBuscarNombre;
    private javax.swing.JPanel PanelBuscarPorTienda;
    private javax.swing.JPanel PanelBuscarPorTienda1;
    private javax.swing.JPanel PanelOpcionesBusqueda;
    private javax.swing.JTable TablaInventario;
    private javax.swing.JComboBox<String> cbBuscarNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollDeTabla;
    private javax.swing.JLabel lblBuscarCodigo;
    private javax.swing.JLabel lblBuscarNombre;
    private javax.swing.JLabel lblBuscarPorTienda1;
    private javax.swing.JLabel lblBuscarPorTienda2;
    private javax.swing.JComboBox<String> mbBuscarPorTienda;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtBuscarPorTienda;
    // End of variables declaration//GEN-END:variables
}

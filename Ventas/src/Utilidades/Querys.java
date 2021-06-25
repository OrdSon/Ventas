/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author ordson201931185
 */
public class Querys {
    public static final String SELECT_PRODUCTOS = "SELECT id_producto, nombre, presentacion, precio_compra, precio_venta FROM Producto";
    public static final String NOMBRE_PRODUCTOS = "SELECT nombre FROM Producto";
    public static final String SELECT_COMPRAS = "SELECT compra.id_compra, compra.fecha, compra.Proveedor_id_nit," +
                                                "Proveedor.nombre, compra.Tienda_id_tienda, compra.total," +
                                                "compra.Usuario_id_usuario  FROM compra " +
                                                "INNER JOIN Proveedor ON Proveedor.id_nit = compra.Proveedor_id_nit;";
    public static final String SELECT_CLIENTES = "SELECT NIT, nombre, telefono, direccion FROM Cliente";
    
}

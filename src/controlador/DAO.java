/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Compra;
import model.Marca;
import model.MetodoPago;
import model.Producto;
import model.Tipo;
import model.Usuario;
import model.Venta;

/**
 *
 * @author Luis Gabriel Herrera
 */
public class DAO {
    
    private Conexion c;
    private String sql;
    private List<Producto> productos;
    private List<Marca> marcas;
    private List<Tipo> tipos;
    private List<Usuario> usuarios;
    private List<MetodoPago> metodos;
    
    public DAO() throws SQLException {
        c = new Conexion(
                "localhost",
                "pro_venta",
                "root",
                ""
        );
    }
    
    public void crearMarca(Marca m) throws SQLException {
        sql = "insert into marca values(null, '"+m.getNombre_marca()+"')";
        
        c.ejecutar(sql);
        
    }
    
    public void crearTipo(Tipo t) throws SQLException {
        sql = "insert into tipo values(null, '"+t.getNombre_tipo()+"')";
        
        c.ejecutar(sql);
        
    }
    
    public void crearProducto(Producto p) throws SQLException {
        sql = "insert into producto values("
                + " null ,"
                + "'" + p.getNombre_producto()+ "',"
                + "'" + p.getPrecio_producto()+ "',"
                + "'" + p.getStock_producto()+ "',"
                + "'" + p.getMarcaFK()+ "',"
                + "'" + p.getTipoFK()+ "')";

        c.ejecutar(sql);
    }
    
    
    public void crearUsuario(Usuario u) throws SQLException {
        
        sql = "insert into usuario values(null,'"+u.getNombre_usuario()+"','MD5("+u.getPassword_usuario()+")')";
        System.out.println(sql);
        c.ejecutar(sql);
    }
    
    
    public List<Marca> getMarcas() throws SQLException {
        marcas = new ArrayList<>();

        sql = "select * from marca";

        c.rs = c.ejecutarSelect(sql);

        Marca m;
        while (c.rs.next()) {
            m = new Marca();

            m.setId_marca(c.rs.getInt(1));
            m.setNombre_marca(c.rs.getString(2));

            marcas.add(m);
        }

        c.rs.close();

        return marcas;
    }
    
    public List<Tipo> getTipos() throws SQLException {
        tipos = new ArrayList<>();

        sql = "select * from tipo";

        c.rs = c.ejecutarSelect(sql);

        Tipo t;
        while (c.rs.next()) {
            t = new Tipo();

            t.setId_tipo(c.rs.getInt(1));
            t.setNombre_tipo(c.rs.getString(2));

            tipos.add(t);
        }

        c.rs.close();

        return tipos;
    }
    
    public List<Producto> getProductos() throws SQLException {
        productos = new ArrayList<>();

        sql = "select * from producto";

        c.rs = c.ejecutarSelect(sql);

        Producto p;
        while (c.rs.next()) {
            p = new Producto();

            p.setId_producto(c.rs.getInt(1));
            p.setNombre_producto(c.rs.getString(2));
            p.setPrecio_producto(c.rs.getInt(3));
            p.setStock_producto(c.rs.getInt(4));
            p.setMarcaFK(c.rs.getInt(5));
            p.setTipoFK(c.rs.getInt(6));

            productos.add(p);
        }

        c.rs.close();

        return productos;
    }
    
    
    public void eliminarProducto(int id) throws SQLException{
    
    sql = "delete from producto where id_producto = '"+ id +"'";
    
    c.ejecutar(sql);
    
    }
    
    public void eliminarMarca(int id) throws SQLException{
    
    sql = "delete from marca where id_marca = '"+ id +"'";
    
    c.ejecutar(sql);
    
    }
    
    public void eliminarTipo(int id) throws SQLException{
    
    sql = "delete from tipo where id_tipo = '"+ id +"'";
    
    c.ejecutar(sql);
    
    }
    
    public void actualizarTipo(String nombre, int id) throws SQLException{
    
    sql = "update tipo set nombre_tipo = '"+nombre+"' where id_tipo = '"+id+"'";
    
    c.ejecutar(sql);
    
    }
    
    public void actualizarMarca(String nombre, int id) throws SQLException{
    
    sql = "update marca set nombre_marca = '"+nombre+"' where id_marca = '"+id+"'";
    
    c.ejecutar(sql);
    
    }
    
    public void actualizarProducto(int precio,int stock, String nombre) throws SQLException{
    
    sql = "update producto set precio_producto = '"+precio+"', stock_producto = '"+stock+"' where nombre_producto = '"+nombre+"'";
    
    c.ejecutar(sql);
    
    }
    
    public Marca getMarca(int id) throws SQLException{
        
        Marca m = null;
         sql = "select * from marca where id_marca = '"+id+"' ";
         
         c.rs = c.ejecutarSelect(sql);
         if (c.rs.next()) {
            m = new Marca();
            m.setId_marca(c.rs.getInt(1));
            m.setNombre_marca(c.rs.getString(2));
        }

        c.rs.close();

        return m;
        
    }
    
    public Tipo getTipo(int id) throws SQLException{
        
        Tipo t = null;
         sql = "select * from tipo where id_tipo = '"+id+"' ";
         
         c.rs = c.ejecutarSelect(sql);
         if (c.rs.next()) {
            t = new Tipo();
            t.setId_tipo(c.rs.getInt(1));
            t.setNombre_tipo(c.rs.getString(2));
        }

        c.rs.close();

        return t;
        
    }
    
    public Usuario getUsuario(String nombre ,String pass) throws SQLException{
        
        Usuario u = null;
         sql = "select * from usuario where nombre_usuario = '"+nombre+"' and password_usuario='"+pass+"' ";
         c.rs = c.ejecutarSelect(sql);
         if (c.rs.next()) {
            u = new Usuario();
            u.setId_usuario(c.rs.getInt(1));
            u.setNombre_usuario(c.rs.getString(2));
            u.setPassword_usuario(c.rs.getString(3));
        }

        c.rs.close();

        return u;
    }
    
    public Producto getProducto(String busqueda) throws SQLException{
        
        Producto p = null;
        
        sql = "select * from producto where nombre_producto = '"+busqueda+"'";
         
         c.rs = c.ejecutarSelect(sql);
         
         if (c.rs.next()) {
            p = new Producto();
            p.setId_producto(c.rs.getInt(1));
            p.setNombre_producto(c.rs.getString(2));
            p.setPrecio_producto(c.rs.getInt(3));
            p.setStock_producto(c.rs.getInt(4));
            p.setMarcaFK(c.rs.getInt(5));
            p.setTipoFK(c.rs.getInt(6));
        }

        c.rs.close();

        return p;
        
    }
    
    public List<Usuario> getUsuarios() throws SQLException {
        usuarios = new ArrayList<>();

        sql = "select * from usuario";

        c.rs = c.ejecutarSelect(sql);

        Usuario u;
        while (c.rs.next()) {
            u = new Usuario();

            u.setId_usuario(c.rs.getInt(1));
            u.setNombre_usuario(c.rs.getString(2));
            u.setPassword_usuario(c.rs.getString(2));

            usuarios.add(u);
        }

        c.rs.close();

        return usuarios;
    }
    
    public List<MetodoPago> getMetodos() throws SQLException {
        metodos = new ArrayList<>();

        sql = "select * from metodopago";

        c.rs = c.ejecutarSelect(sql);

        MetodoPago me;
        while (c.rs.next()) {
            me = new MetodoPago();

            me.setId_metodoPago(c.rs.getInt(1));
            me.setNombre_metodoPago(c.rs.getString(2));

            metodos.add(me);
        }

        c.rs.close();

        return metodos;
    }
    
    public void crearVenta(Venta v) throws SQLException {
        sql = "insert into venta values("
                + " null ,"
                + "'Rancagua O´Carrol 129',"
                + "curdate(),"
                + "'" + v.getMetodoPagoFK()+ "',"
                + "'" + v.getId_usuarioFK()+ "',"
                + "'" + v.getRut_clienteFK()+ "')";

        c.ejecutar(sql);
    }
    
    public void crearCompra(Compra co) throws SQLException {
        sql = "insert into compra values("
                + " null ,"
                + "'"+co.getId_productoFK()+"',"
                + "'"+co.getId_ventaFK()+"',"
                + "'" + co.getCantidad()+ "')";

        c.ejecutar(sql);
    }
    
    public int getID(String nombre) throws SQLException{
        
        sql = "select id_producto from producto where nombre_producto = '"+nombre+"'";
        
        c.rs = c.ejecutarSelect(sql);
        int id = 0;
        if(c.rs.next()) {
        
             id = c.rs.getInt(1);
        
        }
        return id;

    }
    
    public void actualizarProductoStock(int stock, String nombre) throws SQLException{
    
    sql = "update producto set stock_producto = stock_producto - '"+stock+"' where nombre_producto = '"+nombre+"'";
    
    c.ejecutar(sql);
    
    }
  
   
    
}

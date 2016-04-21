/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.List;
import model.Marca;
import model.Producto;
import model.Tipo;
import model.Usuario;

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
                + "'" + p.getTipoFK()+ "'";

        c.ejecutar(sql);
    }
    
    
    public void crearUsuario(Usuario u) throws SQLException {
        sql = "insert into productosDetalles values("
                + " null ,"
                + "'" + u.getNombre_usuario()+ "',"
                + "'" + u.getPassword_usuario()+ "'";

        c.ejecutar(sql);
    }
    
    
    
    
    
    
}

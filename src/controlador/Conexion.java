/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection; // Clase para poder conectar
import java.sql.Statement; // Clase para enviar consultas SQL
import java.sql.ResultSet; // Clase para obtener los datos o resultados de
                           // un select
import java.sql.SQLException; // Para manejar excepciones de SQL

public class Conexion {
    private Connection con;
    public Statement sen;
    public ResultSet rs;
    
    public Conexion(String server, String bd, String user, String pass) throws SQLException{
        MysqlDataSource mysql = new MysqlDataSource();
        
        mysql.setServerName(server);
        mysql.setDatabaseName(bd);
        mysql.setUser(user);
        mysql.setPassword(pass);
        
        con = mysql.getConnection();
    }
    
    /**
    
    @param sql - Puede ser un Delete, Update o Insert 
     * @throws java.sql.SQLException 
    */
    public void ejecutar(String sql) throws SQLException{
        sen = con.createStatement();
        sen.executeUpdate(sql);
        sen.close();
    }
    
    /**
    
    @param select consulta select
    @return un opbjeto del Tipo ResultSet
    @throws SQLException 
    */
    public ResultSet ejecutarSelect(String select) throws SQLException{
        sen = con.createStatement();
        rs = sen.executeQuery(select);
        return rs;
    }
}


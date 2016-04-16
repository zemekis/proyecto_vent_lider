/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Zemekis
 */
public class Usuario {
    
    private int id_usuario;
    private String nombre_usuario,password_usuario;

    public Usuario() {
    }

    public Usuario(String nombre_usuario, String password_usuario) {
        this.nombre_usuario = nombre_usuario;
        this.password_usuario = password_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id_usuario + ", nombre_usuario=" + nombre_usuario + ", password_usuario=" + password_usuario + '}';
    }
    
    
    
    
    
    
    
}

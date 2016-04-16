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
public class MetodoPago {
   private int id_metodoPago;
   private String nombre_metodoPago;

    public MetodoPago(String nombre_metodoPago) {
        this.nombre_metodoPago = nombre_metodoPago;
    }

    public MetodoPago() {
    }

    public int getId_metodoPago() {
        return id_metodoPago;
    }

    public void setId_metodoPago(int id_metodoPago) {
        this.id_metodoPago = id_metodoPago;
    }

    public String getNombre_metodoPago() {
        return nombre_metodoPago;
    }

    public void setNombre_metodoPago(String nombre_metodoPago) {
        this.nombre_metodoPago = nombre_metodoPago;
    }

    @Override
    public String toString() {
        return "MetodoPago{" + "id_metodoPago=" + id_metodoPago + ", nombre_metodoPago=" + nombre_metodoPago + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luis Gabriel Herrera
 */
public class Compra {
    
    private int id_compra, id_productoFK, id_ventaFK, cantidad;

    public Compra(int id_compra, int id_productoFK, int id_ventaFK, int cantidad) {
        this.id_compra = id_compra;
        this.id_productoFK = id_productoFK;
        this.id_ventaFK = id_ventaFK;
        this.cantidad = cantidad;
    }

    public Compra() {
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public int getId_productoFK() {
        return id_productoFK;
    }

    public void setId_productoFK(int id_productoFK) {
        this.id_productoFK = id_productoFK;
    }

    public int getId_ventaFK() {
        return id_ventaFK;
    }

    public void setId_ventaFK(int id_ventaFK) {
        this.id_ventaFK = id_ventaFK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}

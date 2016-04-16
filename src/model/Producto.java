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
public class Producto {
    private int id_producto;
    private String nombre_producto;
    private int precio_producto,stock_producto,marcaFK,tipoFK;

    public Producto() {
    }

    public Producto(String nombre_producto, int precio_producto, int stock_producto, int marcaFK, int tipoFK) {
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
        this.stock_producto = stock_producto;
        this.marcaFK = marcaFK;
        this.tipoFK = tipoFK;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(int precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(int stock_producto) {
        this.stock_producto = stock_producto;
    }

    public int getMarcaFK() {
        return marcaFK;
    }

    public void setMarcaFK(int marcaFK) {
        this.marcaFK = marcaFK;
    }

    public int getTipoFK() {
        return tipoFK;
    }

    public void setTipoFK(int tipoFK) {
        this.tipoFK = tipoFK;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", precio_producto=" + precio_producto + ", stock_producto=" + stock_producto + ", marcaFK=" + marcaFK + ", tipoFK=" + tipoFK + '}';
    }
    
 
    
}

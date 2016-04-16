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
public class Venta {
private int id_venta;
private String direccionLocal_venta,fecha_venta,giro_venta;
private int metodoPagoFK,id_usuarioFK,id_clienteFK,id_producto;

    public Venta(String direccionLocal_venta, String fecha_venta, String giro_venta, int metodoPagoFK, int id_usuarioFK, int id_clienteFK, int id_producto) {
        this.direccionLocal_venta = direccionLocal_venta;
        this.fecha_venta = fecha_venta;
        this.giro_venta = giro_venta;
        this.metodoPagoFK = metodoPagoFK;
        this.id_usuarioFK = id_usuarioFK;
        this.id_clienteFK = id_clienteFK;
        this.id_producto = id_producto;
    }

    public Venta() {
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getDireccionLocal_venta() {
        return direccionLocal_venta;
    }

    public void setDireccionLocal_venta(String direccionLocal_venta) {
        this.direccionLocal_venta = direccionLocal_venta;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getGiro_venta() {
        return giro_venta;
    }

    public void setGiro_venta(String giro_venta) {
        this.giro_venta = giro_venta;
    }

    public int getMetodoPagoFK() {
        return metodoPagoFK;
    }

    public void setMetodoPagoFK(int metodoPagoFK) {
        this.metodoPagoFK = metodoPagoFK;
    }

    public int getId_usuarioFK() {
        return id_usuarioFK;
    }

    public void setId_usuarioFK(int id_usuarioFK) {
        this.id_usuarioFK = id_usuarioFK;
    }

    public int getId_clienteFK() {
        return id_clienteFK;
    }

    public void setId_clienteFK(int id_clienteFK) {
        this.id_clienteFK = id_clienteFK;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", direccionLocal_venta=" + direccionLocal_venta + ", fecha_venta=" + fecha_venta + ", giro_venta=" + giro_venta + ", metodoPagoFK=" + metodoPagoFK + ", id_usuarioFK=" + id_usuarioFK + ", id_clienteFK=" + id_clienteFK + ", id_producto=" + id_producto + '}';
    }
 
}

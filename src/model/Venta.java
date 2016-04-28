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
private String rut_clienteFK, direccionLocal_venta,fecha_venta;
private int metodoPagoFK,id_usuarioFK,id_producto;

    public Venta(String direccionLocal_venta, String fecha_venta, int metodoPagoFK, int id_usuarioFK, String rut_clienteFK, int id_producto) {
        this.direccionLocal_venta = direccionLocal_venta;
        this.fecha_venta = fecha_venta;
        this.metodoPagoFK = metodoPagoFK;
        this.id_usuarioFK = id_usuarioFK;
        this.rut_clienteFK = rut_clienteFK;
        this.id_producto = id_producto;
    }

    public Venta() {
    }

    

//    @Override
//    public String toString() {
//        return "Venta{" + "id_venta=" + id_venta + ", direccionLocal_venta=" + direccionLocal_venta + ", fecha_venta=" + fecha_venta + ", giro_venta=" + giro_venta + ", metodoPagoFK=" + metodoPagoFK + ", id_usuarioFK=" + id_usuarioFK + ", id_clienteFK=" + id_clienteFK + ", id_producto=" + id_producto + '}';
//    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getRut_clienteFK() {
        return rut_clienteFK;
    }

    public void setRut_clienteFK(String rut_clienteFK) {
        this.rut_clienteFK = rut_clienteFK;
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

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
 
}

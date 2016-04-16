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
public class RegistroVenta {
    private int id_registroVenta;
    private String fecha_registro;
    private int id_ventaFK;

    public RegistroVenta() {
    }

    public RegistroVenta(int id_registroVenta, String fecha_registro, int id_ventaFK) {
        this.id_registroVenta = id_registroVenta;
        this.fecha_registro = fecha_registro;
        this.id_ventaFK = id_ventaFK;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public int getId_registroVenta() {
        return id_registroVenta;
    }

    public int getId_ventaFK() {
        return id_ventaFK;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public void setId_registroVenta(int id_registroVenta) {
        this.id_registroVenta = id_registroVenta;
    }

    public void setId_ventaFK(int id_ventaFK) {
        this.id_ventaFK = id_ventaFK;
    }

    @Override
    public String toString() {
        return "RegistroVenta{" + "id_registroVenta=" + id_registroVenta + ", fecha_registro=" + fecha_registro + ", id_ventaFK=" + id_ventaFK + '}';
    }
    
    
    
    
}

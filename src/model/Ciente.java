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
public class Ciente {
private String nombre_cliente;
private int tipo_clienteFK;
private String rut_cliente ;

    public Ciente() {
    }

    public Ciente(String nombre_cliente, int tipo_clienteFK, String rut_cliente) {
        this.nombre_cliente = nombre_cliente;
        this.tipo_clienteFK = tipo_clienteFK;
        this.rut_cliente = rut_cliente;
    }


    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public String getRut_cliente() {
        return rut_cliente;
    }

    public int getTipo_clienteFK() {
        return tipo_clienteFK;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public void setTipo_clienteFK(int tipo_clienteFK) {
        this.tipo_clienteFK = tipo_clienteFK;
    }
//
//    @Override
//    public String toString() {
//        return "Ciente{" + "id_cliente=" + id_cliente + ", nombre_cliente=" + nombre_cliente + ", tipo_clienteFK=" + tipo_clienteFK + ", rut_cliente=" + rut_cliente + '}';
//    }
//



}

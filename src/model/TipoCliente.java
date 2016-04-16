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
public class TipoCliente {

    private int id_tipoCiente;
    private String nombre_tipoCliente;

    public TipoCliente() {
    }

    public TipoCliente(String nombre_tipoCliente) {

        this.nombre_tipoCliente = nombre_tipoCliente;
    }

    public int getId_tipoCiente() {
        return id_tipoCiente;
    }

    public String getNombre_tipoCliente() {
        return nombre_tipoCliente;
    }

    public void setId_tipoCiente(int id_tipoCiente) {
        this.id_tipoCiente = id_tipoCiente;
    }

    public void setNombre_tipoCliente(String nombre_tipoCliente) {
        this.nombre_tipoCliente = nombre_tipoCliente;
    }

    @Override
    public String toString() {
        return "TipoCliente{" + "id_tipoCiente=" + id_tipoCiente + ", nombre_tipoCliente=" + nombre_tipoCliente + '}';
    }

}

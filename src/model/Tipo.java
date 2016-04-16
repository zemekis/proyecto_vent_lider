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
public class Tipo {
    private int id_tipo;
    private String nombre_tipo;

    public Tipo() {
    }

    public Tipo( String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }

    @Override
    public String toString() {
        return "Tipo{" + "id_tipo=" + id_tipo + ", nombre_tipo=" + nombre_tipo + '}';
    }
    
}

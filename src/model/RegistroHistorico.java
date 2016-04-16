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
public class RegistroHistorico {
private int id_registroHistorico;
private String accion_registroHistorico,fecha_registroHistorico;

    public RegistroHistorico(String accion_registroHistorico, String fecha_registroHistorico) {
        this.accion_registroHistorico = accion_registroHistorico;
        this.fecha_registroHistorico = fecha_registroHistorico;
    }

    public RegistroHistorico() {
    }

    public int getId_registroHistorico() {
        return id_registroHistorico;
    }

    public void setId_registroHistorico(int id_registroHistorico) {
        this.id_registroHistorico = id_registroHistorico;
    }

    public String getAccion_registroHistorico() {
        return accion_registroHistorico;
    }

    public void setAccion_registroHistorico(String accion_registroHistorico) {
        this.accion_registroHistorico = accion_registroHistorico;
    }

    public String getFecha_registroHistorico() {
        return fecha_registroHistorico;
    }

    public void setFecha_registroHistorico(String fecha_registroHistorico) {
        this.fecha_registroHistorico = fecha_registroHistorico;
    }

    @Override
    public String toString() {
        return "RegistroHistorico{" + "id_registroHistorico=" + id_registroHistorico + ", accion_registroHistorico=" + accion_registroHistorico + ", fecha_registroHistorico=" + fecha_registroHistorico + '}';
    }



}

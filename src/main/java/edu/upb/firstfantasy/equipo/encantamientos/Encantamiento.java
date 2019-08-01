/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy.equipo.encantamientos;

/**
 *
 * @author Carlos
 */
public abstract class Encantamiento {

    protected String nombre;
    
    public abstract void activar();
    public abstract void aplicar();
    public abstract void desactivar();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

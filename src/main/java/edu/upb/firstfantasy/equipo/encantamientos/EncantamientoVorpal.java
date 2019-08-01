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
public class EncantamientoVorpal extends Encantamiento{

    
    public EncantamientoVorpal(){
        nombre = "SOY EL MEJOR";
    }
    
    @Override
    public void activar() {
        System.out.println("¡VAS A MORIR!");
    }

    @Override
    public void aplicar() {
        System.out.println("¡MUERE!");
    }

    @Override
    public void desactivar() {
        System.out.println("¡VIVIRÁS OTRO DÍA!");
    }
    
       public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

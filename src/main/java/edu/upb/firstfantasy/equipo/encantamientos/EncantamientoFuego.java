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
public class EncantamientoFuego extends Encantamiento{

    
    public EncantamientoFuego(){
        nombre = "ENCANTAMIENTO DE FUEGO";
    }
    
    @Override
    public void activar() {
        System.out.println("¡LLAMAS A MI!");
    }

    @Override
    public void aplicar() {
        System.out.println("¡ARDE, P****, ARDE!");
    }

    @Override
    public void desactivar() {
        System.out.println("¡************!");
    }

}

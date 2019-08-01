/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy.equipo;

import edu.upb.firstfantasy.equipo.encantamientos.Encantamiento;

/**
 *
 * @author Carlos
 */
public interface Equipable {
    
    void equipar();
    void usar();
    void desequipar();
    Encantamiento getEncantamiento();
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy.personajes;

import edu.upb.firstfantasy.equipo.armas.Arma;
import edu.upb.firstfantasy.equipo.armas.ArmaEnana;
import edu.upb.firstfantasy.equipo.armas.TipoArma;
import edu.upb.firstfantasy.equipo.encantamientos.Encantamiento;

/**
 *
 * @author Carlos
 */
public class ArmeroEnano extends Armero{
    
    
    @Override
    public Arma fabricarArma(TipoArma tipoArma) {
        return new ArmaEnana(tipoArma);
    }
    
    @Override
    public Arma fabricarArma(Encantamiento encantamiento, TipoArma tipoArma) {
        return new ArmaEnana(encantamiento,tipoArma);
    }
    
    @Override
    public String toString(){
        return "QUE ME MIRAS!";
    }
    
    
    
}

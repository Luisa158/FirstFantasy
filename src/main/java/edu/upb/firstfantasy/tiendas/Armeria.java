/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy.tiendas;

import edu.upb.firstfantasy.equipo.armas.Arma;
import edu.upb.firstfantasy.equipo.armas.TipoArma;
import edu.upb.firstfantasy.equipo.encantamientos.Encantamiento;
import edu.upb.firstfantasy.personajes.Armero;

/**
 *
 * @author Carlos
 */
public class Armeria {

    private Armero armero;

    public Arma fabricarArmas(TipoArma tipoArma) {
        Arma arma;
        arma = armero.fabricarArma(tipoArma);
        System.out.println(arma.toString());
        
        return arma;
    }
    
    public Arma fabricarArmas(Encantamiento encantamiento, TipoArma tipoArma ) {
        Arma arma;
        arma = armero.fabricarArma(encantamiento, tipoArma);
        System.out.println(arma.toString());
        
        return arma;
    }

    public Armero getArmero() {
        return armero;
    }

    public void setArmero(Armero armero) {
        this.armero = armero;
    }
    
    

}

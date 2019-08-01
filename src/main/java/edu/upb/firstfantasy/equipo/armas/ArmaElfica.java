/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy.equipo.armas;

import edu.upb.firstfantasy.equipo.armas.Arma;
import edu.upb.firstfantasy.equipo.encantamientos.Encantamiento;

/**
 *
 * @author Carlos
 */
public class ArmaElfica extends Arma{
    
    public ArmaElfica(TipoArma tipoArma) {
         super(tipoArma);
    }

    public ArmaElfica(Encantamiento encantamiento , TipoArma tipoArma) {
         super(encantamiento, tipoArma);
    }
    
    @Override
    public String toString() {
        return tipoArma +" de trabajo elfico";
    }

    @Override
    public TipoArma getTipoArma() {
        return tipoArma;
    }

    @Override
    public void equipar() {
        System.out.println("POR LOS ANCESTROS");
    }

    @Override
    public void usar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desequipar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

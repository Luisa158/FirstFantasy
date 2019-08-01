/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy.equipo.armas;

import edu.upb.firstfantasy.equipo.encantamientos.Encantamiento;
import edu.upb.firstfantasy.equipo.Equipable;

/**
 *
 * @author Carlos
 */
public abstract class Arma implements Equipable{
    
    protected Encantamiento encantamiento;
    protected TipoArma tipoArma;

    public Arma(Encantamiento encantamiento, TipoArma tipoArma){
        this.encantamiento = encantamiento;
        this.tipoArma = tipoArma;
    }

    public Arma(TipoArma tipoArma){
        this.encantamiento = null;
        this.tipoArma = tipoArma;    
    }
    
    public Arma(){
        this.encantamiento = null;
        this.tipoArma = TipoArma.DESARMADO;    
    }

    @Override
    public Encantamiento getEncantamiento() {
        return encantamiento;
    }
    
    public abstract TipoArma getTipoArma();
    
}

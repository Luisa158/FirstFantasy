/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy.personajes;

import edu.upb.firstfantasy.equipo.armas.ArmaElfica;
import edu.upb.firstfantasy.equipo.armas.TipoArma;
import edu.upb.firstfantasy.equipo.armas.Arma;
import edu.upb.firstfantasy.equipo.encantamientos.Encantamiento;

/**
 *
 * @author Carlos
 */
public class ArmeroElfo extends Armero{

    @Override
    public Arma fabricarArma(TipoArma tipoArma) {
        return new ArmaElfica(tipoArma);
    }

    @Override
    public Arma fabricarArma(Encantamiento encantamiento, TipoArma tipoArma) {
        return new ArmaElfica(encantamiento,tipoArma);
    }
    
}

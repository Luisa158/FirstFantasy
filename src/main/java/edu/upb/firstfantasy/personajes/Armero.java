/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy.personajes;
import edu.upb.firstfantasy.equipo.armas.Arma;
import edu.upb.firstfantasy.equipo.armas.TipoArma;
import edu.upb.firstfantasy.equipo.encantamientos.Encantamiento;

/**
 *
 * @author Carlos
 */
public abstract class Armero {
    
    public abstract Arma fabricarArma(TipoArma tipoArma);
    public abstract Arma fabricarArma(Encantamiento encantamiento , TipoArma tipoArma);
    
}

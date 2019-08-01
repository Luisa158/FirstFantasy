/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy.equipo;

import edu.upb.firstfantasy.equipo.armas.Arma;

/**
 *
 * @author Carlos
 */
public class Baul<T> {
    T objeto;
    
    public void agregarObjeto(T objeto){
        this.objeto = objeto;
    }
    
    public T mostrarObjeto(){
        return objeto;
    }
}

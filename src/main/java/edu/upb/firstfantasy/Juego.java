/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy;

import edu.upb.firstfantasy.armaduras.Armadura;
import edu.upb.firstfantasy.equipo.Baul;
import edu.upb.firstfantasy.equipo.armas.Arma;
import edu.upb.firstfantasy.equipo.armas.ArmaElfica;
import edu.upb.firstfantasy.equipo.armas.ArmaEnana;
import edu.upb.firstfantasy.equipo.armas.TipoArma;
import edu.upb.firstfantasy.equipo.encantamientos.EncantamientoFuego;
import edu.upb.firstfantasy.personajes.Armero;
import edu.upb.firstfantasy.personajes.ArmeroElfo;
import edu.upb.firstfantasy.personajes.ArmeroEnano;
import edu.upb.firstfantasy.tiendas.Armeria;

/**
 *
 * @author Carlos
 */
public class Juego {



    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {
      
        Baul b = new Baul();
        b.agregarObjeto(new ArmaElfica(TipoArma.MARTILLO));
        System.out.println("OBJETO :" +b.mostrarObjeto().toString());
        
        mostrarArma((Arma) b.mostrarObjeto());
        
    }

    public static void mostrarArma( Arma arma){
        arma.equipar();
    }
    
}

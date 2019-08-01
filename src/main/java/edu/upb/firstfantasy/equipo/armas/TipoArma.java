/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.firstfantasy.equipo.armas;

/**
 *
 * @author Carlos
 */
public enum TipoArma {
    
  ESPADA_CORTA("espada corta", "cortante"), LANZA("lanza", "puntante"), HACHA("hacha","cortante"), MARTILLO("martillo","contundente"), DESARMADO("","contundente");

  private final String nombre;
  private final String tipoDano;

  TipoArma(String nombre, String tipoDano) {
    this.nombre = nombre;
    this.tipoDano = tipoDano;
  }

  @Override
  public String toString() {
    return nombre;
  }
    
}

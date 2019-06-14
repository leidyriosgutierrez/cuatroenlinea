

package com.juegocuatroenlinea.modelo;

import java.io.Serializable;

public class Partida implements Serializable{
    private String id_partida;
    private int numerojugadores=4;
    private Tablero id_tablero;
    private Double tiempo_j1;
    private Double tiempo_j2;

    public Partida(String id_partida, Tablero id_tablero, Double tiempo_j2) {
        this.id_partida = id_partida;
        this.id_tablero = id_tablero;
        this.tiempo_j2 = tiempo_j2;
    }

    public String getId_partida() {
        return id_partida;
    }

    public void setId_partida(String id_partida) {
        this.id_partida = id_partida;
    }

    public int getNumerojugadores() {
        return numerojugadores;
    }

    public void setNumerojugadores(int numerojugadores) {
        this.numerojugadores = numerojugadores;
    }

    public Tablero getId_tablero() {
        return id_tablero;
    }

    public void setId_tablero(Tablero id_tablero) {
        this.id_tablero = id_tablero;
    }

    public Double getTiempo_j1() {
        return tiempo_j1;
    }

    public void setTiempo_j1(Double tiempo_j1) {
        this.tiempo_j1 = tiempo_j1;
    }

    public Double getTiempo_j2() {
        return tiempo_j2;
    }

    public void setTiempo_j2(Double tiempo_j2) {
        this.tiempo_j2 = tiempo_j2;
    }

    @Override
    public String toString() {
        return "Partida{" + "id_partida=" + id_partida + ", numerojugadores=" + numerojugadores + ", id_tablero=" + id_tablero + ", tiempo_j1=" + tiempo_j1 + ", tiempo_j2=" + tiempo_j2 + '}';
    }
    
    
}

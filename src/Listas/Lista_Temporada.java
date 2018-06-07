/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Temporada;
import java.util.ArrayList;

/**
 *
 * @author RONALDO
 */
public class Lista_Temporada {

    private ArrayList<Temporada> lista_Temporada;

    public Lista_Temporada() {
        this.lista_Temporada = new ArrayList<Temporada>();
    }

    public ArrayList<Temporada> getLista_Temporada() {
        return lista_Temporada;
    }

    public void setLista_Temporada(ArrayList<Temporada> lista_Temporada) {
        this.lista_Temporada = lista_Temporada;
    }
//    public void cargartipo(){
//        this.lista_Temporada.add(new Temporada("0", "Alta", 0.4));
//        this.lista_Temporada.add(new Temporada("1", "Media", 0.2));
//        this.lista_Temporada.add(new Temporada("2", "Baja", 0.1));
//    }
}

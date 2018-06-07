/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Habitacion;
import java.util.ArrayList;

/**
 *
 * @author RONALDO
 */
public class Lista_Habitacion {

    private ArrayList<Habitacion> Lista_Habitacion;

    public Lista_Habitacion() {
        this.Lista_Habitacion = new ArrayList<Habitacion>();
    }

    public ArrayList<Habitacion> getLista_Habitacion() {
        return Lista_Habitacion;
    }

    public void setLista_Habitacion(ArrayList<Habitacion> Lista_Habitacion) {
        this.Lista_Habitacion = Lista_Habitacion;
    }    

}

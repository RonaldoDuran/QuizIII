/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Tipo_Habitacion;
import java.util.ArrayList;

/**
 *
 * @author RONALDO
 */
public class Lista_Tipo_Habitacion {
    private ArrayList<Tipo_Habitacion> Lista_Tipo_Habitacion;
    public Lista_Tipo_Habitacion(){
        this.Lista_Tipo_Habitacion=new ArrayList<Tipo_Habitacion>();
    }

    public ArrayList<Tipo_Habitacion> getLista_Tipo_Habitacion() {
        return Lista_Tipo_Habitacion;
    }

    public void setLista_Tipo_Habitacion(ArrayList<Tipo_Habitacion> Lista_Tipo_Habitacion) {
        this.Lista_Tipo_Habitacion = Lista_Tipo_Habitacion;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Servicio_Especial;
import java.util.ArrayList;

/**
 *
 * @author RONALDO
 */
public class Lista_Servicio_Especial {

    private ArrayList<Servicio_Especial> Lista_Servicio_Especial;

    public Lista_Servicio_Especial() {
        this.Lista_Servicio_Especial = new ArrayList<Servicio_Especial>();
    }

    public ArrayList<Servicio_Especial> getLista_Servicio_Especial() {
        return Lista_Servicio_Especial;
    }

    public void setLista_Servicio_Especial(ArrayList<Servicio_Especial> Lista_Servicio_Especial) {
        this.Lista_Servicio_Especial = Lista_Servicio_Especial;
    }
}

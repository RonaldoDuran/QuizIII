/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Reserva;
import java.util.ArrayList;

/**
 *
 * @author RONALDO
 */
public class Lista_Reserva {
    private ArrayList<Reserva> Lista_Reserva;
    public Lista_Reserva(){
        this.Lista_Reserva=new ArrayList<Reserva>();
    }

    public ArrayList<Reserva> getLista_Reserva() {
        return Lista_Reserva;
    }

    public void setLista_Reserva(ArrayList<Reserva> Lista_Reserva) {
        this.Lista_Reserva = Lista_Reserva;
    }
    
}

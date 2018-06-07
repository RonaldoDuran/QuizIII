/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author RONALDO
 */
public class Factura {

    private String Id;
    private Reserva Rv;
    private ArrayList<Servicio_Especial> Lista_Servicios;

    public Factura(String Id, Reserva Rv, ArrayList<Servicio_Especial> Lista_Servicios) {
        this.Id = Id;
        this.Rv = Rv;
        this.Lista_Servicios = Lista_Servicios;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Reserva getRv() {
        return Rv;
    }

    public void setRv(Reserva Rv) {
        this.Rv = Rv;
    }

    public ArrayList<Servicio_Especial> getLista_Servicios() {
        return Lista_Servicios;
    }

    public void setLista_Servicios(ArrayList<Servicio_Especial> Lista_Servicios) {
        this.Lista_Servicios = Lista_Servicios;
    }
    
}
   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Factura;
import java.util.ArrayList;

/**
 *
 * @author RONALDO
 */
public class Lista_Factura {
    private ArrayList<Factura> Lista_Factura;

    public Lista_Factura() {
        this.Lista_Factura = new ArrayList<Factura>();
    }

    public ArrayList<Factura> getLista_Factura() {
        return Lista_Factura;
    }

    public void setLista_Factura(ArrayList<Factura> Lista_Factura) {
        this.Lista_Factura = Lista_Factura;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Listas.*;

/**
 *
 * @author RONALDO
 */
public class Listas {
    private Lista_Clientes lc = new Lista_Clientes();
    private  Lista_Usuario lu = new Lista_Usuario();
    private Lista_Servicio_Especial lse = new Lista_Servicio_Especial();
    private Lista_Habitacion lh = new Lista_Habitacion();
    private Lista_Temporada lt = new Lista_Temporada();
    private Lista_Tipo_Habitacion lth = new Lista_Tipo_Habitacion();
    private Lista_Factura lf = new Lista_Factura();
    private Lista_Reserva lr = new Lista_Reserva();

    public Lista_Clientes getLc() {
        return lc;
    }

    public Lista_Usuario getLu() {
        return lu;
    }

    public Lista_Servicio_Especial getLse() {
        return lse;
    }

    public Lista_Habitacion getLh() {
        return lh;
    }

    public Lista_Temporada getLt() {
        return lt;
    }

    public Lista_Tipo_Habitacion getLth() {
        return lth;
    }

    public Lista_Factura getLf() {
        return lf;
    }

    public Lista_Reserva getLr() {
        return lr;
    }
    
}

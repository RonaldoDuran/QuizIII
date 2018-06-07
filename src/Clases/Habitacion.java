/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author RONALDO
 */
public class Habitacion {
    private String Id;
    private Tipo_Habitacion th;

    public Habitacion(String Id, Tipo_Habitacion th) {
        this.Id = Id;
        this.th = th;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Tipo_Habitacion getTh() {
        return th;
    }

    public void setTh(Tipo_Habitacion th) {
        this.th = th;
    }

}

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
public class Servicio_Especial {
    private String Id;
    private String Nombre;
    private int Costo;

    public Servicio_Especial(String Id, String Nombre, int Costo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Costo = Costo;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }
    
}

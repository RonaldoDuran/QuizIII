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
public class Temporada {
    private String Id;
    private String Nombre_Temporada;
    private double Sobre_Costo;

    public Temporada(String Id, String Nombre_Temporada, double Sobre_Costo) {
        this.Id = Id;
        this.Nombre_Temporada = Nombre_Temporada;
        this.Sobre_Costo = Sobre_Costo;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre_Temporada() {
        return Nombre_Temporada;
    }

    public void setNombre_Temporada(String Nombre_Temporada) {
        this.Nombre_Temporada = Nombre_Temporada;
    }

    public double getSobre_Costo() {
        return Sobre_Costo;
    }

    public void setSobre_Costo(double Sobre_Costo) {
        this.Sobre_Costo = Sobre_Costo;
    }
    
}

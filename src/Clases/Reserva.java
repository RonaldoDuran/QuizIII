/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author RONALDO
 */
public class Reserva {

    private String Id;
    private Date FechaR;
    private Date FechaI;
    private Date FechaF;
    private Habitacion Ha;
    private Temporada Tm;
    private Cliente Cl;
    private Usuario Us;
    private String Tipo;

    public Reserva(String Id, Date FechaR, Date FechaI, Date FechaF, Habitacion Ha, Temporada Tm, Cliente Cl, Usuario Us, String Tipo) {
        this.Id = Id;
        this.FechaR = FechaR;
        this.FechaI = FechaI;
        this.FechaF = FechaF;
        this.Ha = Ha;
        this.Tm = Tm;
        this.Cl = Cl;
        this.Us = Us;
        this.Tipo = Tipo;
    }
   

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Date getFechaR() {
        return FechaR;
    }

    public void setFechaR(Date FechaR) {
        this.FechaR = FechaR;
    }

    public Date getFechaI() {
        return FechaI;
    }

    public void setFechaI(Date FechaI) {
        this.FechaI = FechaI;
    }

    public Date getFechaF() {
        return FechaF;
    }

    public void setFechaF(Date FechaF) {
        this.FechaF = FechaF;
    }

    public Habitacion getHa() {
        return Ha;
    }

    public void setHa(Habitacion Ha) {
        this.Ha = Ha;
    }

    public Temporada getTm() {
        return Tm;
    }

    public void setTm(Temporada Tm) {
        this.Tm = Tm;
    }

    public Cliente getCl() {
        return Cl;
    }

    public void setCl(Cliente Cl) {
        this.Cl = Cl;
    }

    public Usuario getUs() {
        return Us;
    }

    public void setUs(Usuario Us) {
        this.Us = Us;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

}

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
public class Cliente extends Persona {

    private String Telefono;
    private String Direccion;
    private String email;

    public Cliente(String Id, String Nombres, String Apellidos, String Telefono, String Direccion, String email) {
        super(Id, Nombres, Apellidos);
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

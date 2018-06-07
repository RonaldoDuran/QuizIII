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
public class Usuario extends Persona {

    private String Tipo_Usuario;
    private String Contraseña;

    public Usuario(String Tipo_Usuario, String Contraseña, String Id, String Nombres, String Apellidos) {
        super(Id, Nombres, Apellidos);
        this.Tipo_Usuario = Tipo_Usuario;
        this.Contraseña = Contraseña;
    }

    public String getTipo_Usuario() {
        return Tipo_Usuario;
    }

    public void setTipo_Usuario(String Tipo_Usuario) {
        this.Tipo_Usuario = Tipo_Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

}

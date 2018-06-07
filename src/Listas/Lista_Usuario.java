/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Cliente;
import Clases.Usuario;
import java.util.ArrayList;

/**
 *
 * @author RONALDO
 */
public class Lista_Usuario {

    private ArrayList<Usuario> lista_usuario;

    public Lista_Usuario() {
        this.lista_usuario = new ArrayList<Usuario>();
        this.Crear_Admin();
    }

    public ArrayList<Usuario> getLista_usuario() {
        return lista_usuario;
    }

    public void setLista_usuario(ArrayList<Usuario> lista_usuario) {
        this.lista_usuario = lista_usuario;
    }

    public Usuario Validar_Sesion(String Id, String pass) {
        for (Usuario us : lista_usuario) {           
            if ((Id.equals(us.getId())) && (pass.equals(us.getContraseña()))) {
                return us;
            }
        }
        return null;
    }

    private void Crear_Admin() {
        Usuario usu = new Usuario("Administrativo", "1", "1", "Ronaldo", "Duran");
        this.lista_usuario.add(usu);

    }
    public Usuario buscar(String id) {
        for (Usuario usu : lista_usuario) {
            if (usu.getId().equals(id)) {
                return usu;
            }
        }
        return null;
    }
        public boolean registrar(Usuario usu){
        if(buscar(usu.getId()) ==  null) {
            lista_usuario.add(usu);
            return true;
        }
        return false;
    }
}

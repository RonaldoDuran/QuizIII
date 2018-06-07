/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Clases.Cliente;
import java.util.ArrayList;

/**
 *
 * @author RONALDO
 */
public class Lista_Clientes {

    private ArrayList<Cliente> Lista_Cliente;

    public Lista_Clientes() {
        this.Lista_Cliente = new ArrayList<Cliente>();
    }

    public ArrayList<Cliente> getLista_Cliente() {
        return Lista_Cliente;
    }

    public void setLista_Cliente(ArrayList<Cliente> Lista_Cliente) {
        this.Lista_Cliente = Lista_Cliente;
    }

    public Cliente buscar(String id) {
        for (Cliente cli : Lista_Cliente) {
            if (cli.getId() == id) {
                return cli;
            }
        }
        return null;
    }
    
    public boolean registrar(Cliente cli){
        if(buscar(cli.getId()) ==  null) {
            Lista_Cliente.add(cli);
            return true;
        }
        return false;
    }
    
    public boolean modificar(Cliente cli) {
        boolean modificado = false;
        for (int i = 0; i < Lista_Cliente.size(); i++) {
            Cliente cli_buscar = Lista_Cliente.get(i);
            if (cli.getId() == cli_buscar.getId()) {
                Lista_Cliente.remove(i);
                modificado = true;
            }
        }
        
        if(modificado) {
            Lista_Cliente.add(cli);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(String cod) {
        for (int i = 0; i < Lista_Cliente.size(); i++) {
            Cliente cli_buscar = Lista_Cliente.get(i);
            if (cod == cli_buscar.getId()) {
                Lista_Cliente.remove(i);
                return true;
            }
        }
        
        return false;
    }
}

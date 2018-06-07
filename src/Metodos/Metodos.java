/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author RONALDO
 */
public class Metodos {
    public String Obtener_dia(String f1){           
        int num=f1.length();
        char k,q;
        String dia = null;
        switch (num){
            case 9:
                k=(char) f1.charAt(0);
                dia=Character.toString(k);
                return dia;
                
            case 10:
                k=(char) f1.charAt(0);
                q=(char) f1.charAt(1);
                dia=Character.toString(k)+Character.toString(q);
                return dia;                
        }
        return null;
    }
    public String Obtener_Mes(String M1){           
        int num=M1.length();
        char k,q;
        String dia = null;
        switch (num){
            case 9:
                k=(char) M1.charAt(2);
                q=(char) M1.charAt(3);
                dia=Character.toString(k)+Character.toString(q);
                return dia;
                
            case 10:
                k=(char) M1.charAt(3);
                q=(char) M1.charAt(4);
                dia=Character.toString(k)+Character.toString(q);
                return dia;                
        }
        return null;
    }
}

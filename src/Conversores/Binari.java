/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversores;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Binari implements Convertidor {

    @Override
    public String calcular(int a) {
        String aux = " ";
        String convertir = "";
    while(a>=2){
        aux=convertir+Integer.toString(a%2);
        a=a/2;
    }
    aux=aux+Integer.toString(1);
    int b = aux.length();
    System.out.println(b);
    for(int i = aux.length()-1;i>=0;i--){
        convertir = convertir+aux.charAt(i);
    }
    return convertir;
    }
    }
    


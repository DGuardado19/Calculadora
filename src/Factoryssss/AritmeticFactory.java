/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factoryssss;

import Aritmetic.Aritmetic;
import Aritmetic.*;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class AritmeticFactory {
     public static Aritmetic getAritmetic(AritmeticTypes tipo){
        switch(tipo){
            case Suma:
                return new Sum();
            case Resta:
                return new Rest();
            case Multiplicacion:
                 return new Mult();
            case Division:
                return new Divi();
        }     
        return null;
    }
}

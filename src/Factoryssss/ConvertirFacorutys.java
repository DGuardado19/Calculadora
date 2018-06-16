/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factoryssss;

import Conversores.Binari;
import Conversores.Convertidor;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class ConvertirFacorutys {
     public static Convertidor getConvertidor(ConvertirTypes tipo){
        switch(tipo){
            case Bina:
                return new Binari();
        }
        return null;
    }
}

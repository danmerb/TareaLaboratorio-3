/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetico;

import Factory.AbstractFactory;
import Conversion.Conversion;

/**
 *
 * @author UCA
 */
public class FactoryAritmetico implements AbstractFactory{

    @Override
    public Aritmetico getAritmetico(String type) {
        switch (type) {
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Division":
                return new Division();
            case "Multiplicacion":
                return new Multiplicacion();
        }
        return null;
    }

   
    @Override
    public Conversion getConversion(String type) {
        return null;
    }

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Aritmetico.FactoryAritmetico;
import Conversion.FactoryConversion;

/**
 *
 * @author UCA
 */
public class FactoryProducer {
    
    
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Aritmetico":
                return   new FactoryAritmetico();
            case "Conversion":
                return  new FactoryConversion();
        }
        return null;
    }
}


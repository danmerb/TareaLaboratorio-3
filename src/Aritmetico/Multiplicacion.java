/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetico;

/**
 *
 * @author UCA
 */
public class Multiplicacion implements Aritmetico{

    @Override
    public float operar(int a, int n) {
        int mult= a * n;
        return mult;
    }
    
}

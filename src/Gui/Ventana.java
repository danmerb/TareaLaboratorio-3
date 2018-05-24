/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Aritmetico.Aritmetico;
import Aritmetico.Suma;
import Conversion.Conversion;
import Factory.AbstractFactory;
import Factory.FactoryProducer;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author UCA
 */
public class Ventana extends JFrame{
    
    private JTextField caja,caja1,caja2;
    private JButton boton1, boton2,boton3, boton4,boton5;
    
    
    public Ventana(){
        super("Calculadora");
        initComponent();
        
        
    }

    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        caja = new JTextField("Ingrese los numeros");
        caja.setBounds(80, 50, 120, 30);
        caja1 = new JTextField();
        caja1.setBounds(10, 100, 80, 30);
        caja2 = new JTextField();
        caja2.setBounds(160, 100, 80, 30);
        
       
        
        boton1= new JButton("+");
        boton1.setBounds(10, 140, 80, 30);
        boton2= new JButton("-");
        boton2.setBounds(10, 180, 80, 30);
        boton3= new JButton("x");
        boton3.setBounds(10, 220, 80, 30);
        boton4= new JButton("%");
        boton4.setBounds(160, 180, 80, 30);
        boton5= new JButton("Binario");
        boton5.setBounds(160, 220, 80, 30);
        
        Container contenedor = getContentPane();
        contenedor.add(caja1);
        contenedor.add(caja);
        contenedor.add(caja2);
        contenedor.add(boton1);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        contenedor.add(boton5);
        
        
        boton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int num1 = Integer.parseInt(caja1.getText());
                int num2 = Integer.parseInt(caja2.getText());
                int resultado = 0;
                
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("Aritmetico");
                Aritmetico A = factory.getAritmetico("Suma");
                
                resultado=(int) A.operar(num1, num2);
                JOptionPane.showMessageDialog(null, resultado );
                
                              
            }
           
        });
        
        boton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int num1 = Integer.parseInt(caja1.getText());
                int num2 = Integer.parseInt(caja2.getText());
                int resultado = 0;
                
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("Aritmetico");
                Aritmetico A = factory.getAritmetico("Resta");
                
                resultado=(int) A.operar(num1, num2);
                JOptionPane.showMessageDialog(null, resultado );
                
                              
            }
           
        });
        
        boton3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int num1 = Integer.parseInt(caja1.getText());
                int num2 = Integer.parseInt(caja2.getText());
                int resultado = 0;
                
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("Aritmetico");
                Aritmetico A = factory.getAritmetico("Multiplicacion");
                
                resultado=(int) A.operar(num1, num2);
                JOptionPane.showMessageDialog(null, resultado );
                
                              
            }
           
        });
        boton4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int num1 = Integer.parseInt(caja1.getText());
                int num2 = Integer.parseInt(caja2.getText());
                int resultado = 0;
                
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("Aritmetico");
                Aritmetico A = factory.getAritmetico("Division");
                
                resultado=(int) A.operar(num1, num2);
                JOptionPane.showMessageDialog(null, resultado );
                
                              
            }
           
        });
        boton5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                int num1 = Integer.parseInt(caja1.getText());
                
                
                
                AbstractFactory factory;
                factory = FactoryProducer.getFactory("Conversion");
                Conversion C = factory.getConversion("Binario");
                
                String resultado = C.operar(num1);
                JOptionPane.showMessageDialog(null,resultado);
                
                              
            }
           
        });
        
        
        setSize(300,300);
        
        
    }
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                    new Ventana().setVisible(true);
            }
        });
    }
}

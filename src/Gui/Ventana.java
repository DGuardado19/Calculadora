/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Aritmetic.Aritmetic;
import Conversores.Convertidor;
import Factoryssss.AritmeticFactory;
import Factoryssss.AritmeticTypes;
import Factoryssss.ConvertirFacorutys;
import Factoryssss.ConvertirTypes;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author DGuardado <david.guardado at guardado.org>
 */
public class Ventana extends JFrame {

    private JTextField cajita, cajita1, Binario;
    private JButton botonSuma, botonResta, botonMultiplicacion, botonDivision, botonBinario;
    Aritmetic Aritc;
    Convertidor Conv;

    public Ventana() {
        super("Calcu");
        initComponent();
    }

    private void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        cajita = new JTextField("OP1 ");
        cajita.setBounds(50, 10, 50, 30);
        cajita1 = new JTextField("OP2 ");
        cajita1.setBounds(300, 10, 50, 30);

        botonSuma = new JButton("Suma");
        botonSuma.setBounds(150, 60, 150, 30);
        botonResta = new JButton("Restar");
        botonResta.setBounds(150, 100, 150, 30);
        botonMultiplicacion = new JButton("Multiplicacion");
        botonMultiplicacion.setBounds(150, 140, 150, 30);
        botonDivision = new JButton("Division");
        botonDivision.setBounds(150, 180, 150, 30);
        botonBinario = new JButton("Convertir");
        botonBinario.setBounds(300, 220, 100, 30);
        Binario = new JTextField("Numero a binario");
        Binario.setBounds(50, 220, 150, 30);
        Container contenedor = getContentPane();
        contenedor.add(Binario);
        contenedor.add(cajita);
        contenedor.add(cajita1);
        contenedor.add(Binario);
        contenedor.add(botonSuma);
        contenedor.add(botonResta);
        contenedor.add(botonMultiplicacion);
        contenedor.add(botonDivision);
        contenedor.add(botonBinario);
        setSize(450, 300);
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aritc = AritmeticFactory.getAritmetic(AritmeticTypes.Suma);
                JOptionPane.showMessageDialog(rootPane, "Suma: " + Aritc.calcular(Double.parseDouble(cajita.getText()), Double.parseDouble(cajita1.getText())));
            }
        });
        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aritc = AritmeticFactory.getAritmetic(AritmeticTypes.Resta);
                JOptionPane.showMessageDialog(rootPane, "Resta: " + Aritc.calcular(Double.parseDouble(cajita.getText()), Double.parseDouble(cajita1.getText())));
            }
        });
        botonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aritc= AritmeticFactory.getAritmetic(AritmeticTypes.Multiplicacion);
                JOptionPane.showMessageDialog(rootPane, "Mult: " + Aritc.calcular(Double.parseDouble(cajita.getText()), Double.parseDouble(cajita1.getText())));
            }
        });
        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aritc= AritmeticFactory.getAritmetic(AritmeticTypes.Division);
                JOptionPane.showMessageDialog(rootPane, "Viv: " + Aritc.calcular(Double.parseDouble(cajita.getText()), Double.parseDouble(cajita1.getText())));
            }
        });
        botonBinario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conv = ConvertirFacorutys.getConvertidor(ConvertirTypes.Bina);
                JOptionPane.showMessageDialog(rootPane, "Binario: " + Conv.calcular(Integer.parseInt(Binario.getText())));
            }
        }
        );
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });

    }
}

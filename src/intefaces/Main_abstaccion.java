package intefaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_abstaccion {
    public static void main(String[] args) {
        Cuadrado cuadrado  = new Cuadrado();
        /*Interfaz gráfica*/
        JFrame ventana = new JFrame("Cuadrado de un número");
        ventana.setSize(300,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel elemento = new JLabel("Ingrese un número: ");
        JTextField input =  new JTextField();
        input.setColumns(5);

        JLabel elemento2 = new JLabel("Su número es: ");
        JTextField input2 = new JTextField();
        input2.setColumns(5);
        JLabel elemento3 = new JLabel("Su cuadrado es: ");
        JTextField input3 = new JTextField();
        input3.setColumns(5);

        JButton boton = new JButton("Calcular");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(input.getText());
                int valor = cuadrado.obtenerNumero(number);
                int cuadrado_numero = cuadrado.cuadradoNumero(number);

                String valorString= Integer.toString(valor);
                String cuadradoString= Integer.toString(cuadrado_numero);

                input2.setText(valorString);
                input3.setText(cuadradoString);

            }
        });


        JPanel panel = new JPanel();
        panel.add(elemento);
        panel.add(input);
        JPanel panel2 = new JPanel();
        panel2.add(elemento2);
        panel.add(input2);

        JPanel panel3 = new JPanel();
        panel3.add(elemento3);
        panel.add(input3);

        JPanel panel4 = new JPanel();
        panel4.add(boton);

        ventana.add(panel, BorderLayout.NORTH);
        ventana.add(panel2, BorderLayout.CENTER);
        ventana.add(panel3, BorderLayout.AFTER_LINE_ENDS);
        ventana.add(panel4, BorderLayout.SOUTH);

        ventana.setVisible(true);


    }
}

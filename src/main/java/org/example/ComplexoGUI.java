package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.example.Complexo;

public class ComplexoGUI extends JFrame {
    private JTextField textFieldR1;
    private JTextField textFieldI1;
    private JTextField textFieldR2;
    private JTextField textFieldI2;
    private JTextField resultadoFieldR;
    private JTextField resultadoFieldI;

    public ComplexoGUI() {
        Complexo cpx = new Complexo();

        setLayout(new GridLayout(4,1));

        textFieldR1 = new JTextField(20);
        textFieldI1 = new JTextField(20);
        textFieldR2 = new JTextField(20);
        textFieldI2 = new JTextField(20);
        resultadoFieldR = new JTextField(20);
        resultadoFieldI = new JTextField(20);

        JButton somarButton = new JButton("Somar");
        JButton subtrairButton = new JButton("Subtrair");
        JButton moduloButton = new JButton("Módulo");
        JButton limparButton = new JButton("Limpar");

        somarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String R1 = textFieldR1.getText();
                String I1 = textFieldI1.getText();
                String R2 = textFieldR2.getText();
                String I2 = textFieldI2.getText();
//
                double resultR = cpx.soma(Double.parseDouble(R1), Double.parseDouble(R2));
                double resultI = cpx.soma(Double.parseDouble(I1), Double.parseDouble(I2));

                resultadoFieldR.setText(String.valueOf(resultR));
                resultadoFieldI.setText(String.valueOf(resultI));
            }
        });

        subtrairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String R1 = textFieldR1.getText();
                String I1 = textFieldI1.getText();
                String R2 = textFieldR2.getText();
                String I2 = textFieldI2.getText();
//
                double resultR = cpx.sub(Double.parseDouble(R1), Double.parseDouble(R2));
                double resultI = cpx.sub(Double.parseDouble(I1), Double.parseDouble(I2));

                resultadoFieldR.setText(String.valueOf(resultR));
                resultadoFieldI.setText(String.valueOf(resultI));
            }
        });

        moduloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String R1 = textFieldR1.getText();
                String I1 = textFieldI1.getText();
                textFieldR2.setText("*******");
                textFieldI2.setText("*******");
//
                double resultado = cpx.modulus(Double.parseDouble(R1), Double.parseDouble(I1));

                resultadoFieldR.setText(String.valueOf(resultado));
                resultadoFieldI.setText("*******");
            }
        });

        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldR1.setText("");
                textFieldI1.setText("");
                textFieldR2.setText("");
                textFieldI2.setText("");
                resultadoFieldR.setText("");
                resultadoFieldI.setText("");
            }
        });

        JPanel topRow = new JPanel(new GridLayout(2, 2));

        JPanel labelPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        labelPanel1.add(new JLabel("Real 1:"));
        JPanel fieldPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        fieldPanel1.add(textFieldR1);

        JPanel labelPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        labelPanel2.add(new JLabel("Imaginario 1:"));
        JPanel fieldPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        fieldPanel2.add(textFieldI1);

        topRow.add(labelPanel1);
        topRow.add(labelPanel2);
        topRow.add(fieldPanel1);
        topRow.add(fieldPanel2);

        add(topRow);

        JPanel middleRow = new JPanel(new GridLayout(2, 2));

        JPanel labelPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        labelPanel3.add(new JLabel("Real 2:"));
        JPanel fieldPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        fieldPanel3.add(textFieldR2);

        JPanel labelPanel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        labelPanel4.add(new JLabel("Imaginario 2:"));
        JPanel fieldPanel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        fieldPanel4.add(textFieldI2);

        middleRow.add(labelPanel3);
        middleRow.add(labelPanel4);
        middleRow.add(fieldPanel3);
        middleRow.add(fieldPanel4);

        add(middleRow);

        JPanel bottomRow = new JPanel(new GridLayout(2, 2));

        JPanel labelPanel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        labelPanel5.add(new JLabel("Resultado:"));
        JPanel fieldPanel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        fieldPanel5.add(resultadoFieldR);

        JPanel labelPanel6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        labelPanel6.add(new JLabel(" "));
        JPanel fieldPanel6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        fieldPanel6.add(resultadoFieldI);

        bottomRow.add(labelPanel5);
        bottomRow.add(labelPanel6);
        bottomRow.add(fieldPanel5);
        bottomRow.add(fieldPanel6);

        add(bottomRow);

        JPanel buttonRow = new JPanel(new FlowLayout());
        buttonRow.add(somarButton);
        buttonRow.add(subtrairButton);
        buttonRow.add(moduloButton);
        buttonRow.add(limparButton);
        add(buttonRow);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

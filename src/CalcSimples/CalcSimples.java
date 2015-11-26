/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcSimples;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jair Ferraz
 */
public class CalcSimples extends JFrame implements ActionListener {

    private JLabel labelValor1, labelValor2, labelOp, labelResultado;
    private JButton calc, novoCalc;
    private JTextField valor1, valor2, resultado;
    private JComboBox op;

    public CalcSimples() {
        super("Calculadora Simples");
        setBounds(150, 150, 250, 200);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciaComponentes();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void iniciaComponentes() {
        this.setLayout(new GridLayout(5, 2, 10, 10));

        labelValor1 = new JLabel("Valor 1: ");
        this.add(labelValor1, BorderLayout.NORTH);
        valor1 = new JTextField();
        this.add(valor1, BorderLayout.NORTH);

        labelValor2 = new JLabel("Valor 2: ");
        this.add(labelValor2, BorderLayout.NORTH);
        valor2 = new JTextField();
        this.add(valor2, BorderLayout.NORTH);

        labelOp = new JLabel("Operação: ");
        this.add(labelOp, BorderLayout.NORTH);
        op = new JComboBox();
        op.addItem("Soma");
        op.addItem("Subtração");
        op.addItem("Multiplicação");
        op.addItem("Divisão");
        this.add(op, BorderLayout.NORTH);

        labelResultado = new JLabel("Resultado: ");
        this.add(labelResultado, BorderLayout.NORTH);
        resultado = new JTextField();
        this.add(resultado, BorderLayout.NORTH);

        calc = new JButton("Calcular");
        calc.addActionListener(new TrataBotoes());
        this.add(calc);

        novoCalc = new JButton("Novo Calculo");
        novoCalc.addActionListener(new TrataBotoes());
        this.add(novoCalc);
    }

    private class TrataBotoes implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object fonte = e.getSource();
            if (fonte == novoCalc) {
                valor1.setText("");
                valor2.setText("");
                resultado.setText("");
                op.setSelectedItem("Suma");
            }
            if (fonte == calc) {
                double numero1 = Double.parseDouble(valor1.getText());
                double numero2 = Double.parseDouble(valor2.getText());

                if (op.getSelectedItem() == "Soma") {
                    resultado.setText("" + (numero1 + numero2));
                }
                if (op.getSelectedItem() == "Subtração") {
                    resultado.setText("" + (numero1 - numero2));
                }
                if (op.getSelectedItem() == "Multiplicação") {
                    resultado.setText("" + (numero1 * numero2));
                }
                if (op.getSelectedItem() == "Divisão") {
                    resultado.setText("" + (numero1 / numero2));
                }
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcSimples;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jair Ferraz
 */
public class CalcSimples extends JFrame implements ActionListener {

    private JLabel labelValor1, labelValor2, labelOp, labelResultado;
    private JButton calc, zerar;
    private JTextField valor1, valor2, resultado;
    private JComboBox op;

    String[] operacoes = {"","Soma", "Subtração", "Multiplicação", "Divisão"};

    public CalcSimples() {
        super("Calculadora Simples");
        setBounds(150, 150, 250, 200);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);

        iniciaComponentes();

        setVisible(true);
    }

    public String getStringValor1() {
        return (valor1.getText());
    }

    public String getStringValor2() {
        return (valor2.getText());
    }

    public String getStringResultado() {
        return (resultado.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void iniciaComponentes() {
        this.setLayout(new GridLayout(5, 2,10,10));

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
        op = new JComboBox(operacoes);
        this.add(op, BorderLayout.NORTH);

        labelResultado = new JLabel("Resultado: ");
        this.add(labelResultado, BorderLayout.NORTH);
        resultado = new JTextField();
        this.add(resultado, BorderLayout.NORTH);

        calc = new JButton("Calcular");
        calc.addActionListener(new TrataBotoes());
        this.add(calc);
        
        zerar = new JButton("Zerar");
        zerar.addActionListener(new TrataBotoes());
        this.add(zerar);
    }

    private class TrataBotoes implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JButton) {
                JButton botao = (JButton) e.getSource();
                JOptionPane.showMessageDialog(CalcSimples.this,
                        "teste");
            }

        }

    }

}

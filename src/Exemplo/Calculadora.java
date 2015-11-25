package Exemplo;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {

    JTextField nro1;
    JTextField nro2;
    JTextField resultado;
    JLabel n1;
    JLabel n2;
    JLabel operacion;
    JLabel res;
    JComboBox operatoria;
    JPanel panel;
    JButton calcular;
    JButton nuevo_cálculo;

    public Calculadora() {
        super("Calculadora");

        nro1 = new JTextField();
        nro2 = new JTextField();
        resultado = new JTextField();
        n1 = new JLabel("Ingrese el 1er número");
        n2 = new JLabel("Ingrese el 2do número");
        operacion = new JLabel("Escoja la operacion");
        res = new JLabel("Resultado");

        operatoria = new JComboBox();
        operatoria.addItem("Suma");
        operatoria.addItem("Resta");
        operatoria.addItem("Multiplicacion");
        operatoria.addItem("Division");
// operatoria.addItem("Combinatoria");

        calcular = new JButton("Calcular");
        nuevo_cálculo = new JButton("Nuevo Cálculo");

        panel = new JPanel();
        panel.add(n1);
        panel.add(nro1);
        panel.add(n2);
        panel.add(nro2);
        panel.add(operacion);
        panel.add(operatoria);
        panel.add(res);
        panel.add(resultado);
        panel.add(calcular);
        panel.add(nuevo_cálculo);

        setContentPane(panel);

        GridLayout g = new GridLayout(5, 2, 10, 10);

        panel.setLayout(g);

        resultado.setEditable(false);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        nuevo_cálculo.addActionListener(this);
        calcular.addActionListener(this);

        WindowListener l
                = new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                };
        addWindowListener(l);

    }

    /* double combinatoria(double primero,double segundo){
     double r;
     double nmk=(primero-segundo);
     double nf=1; 
     double nkf=1;
     double kf=1;

     for(int i=2;i<=primero;i++){
     nf=nf*i;
     }
     for(int p=1;p<=nmk;p++){
     nkf=nkf*p;
     }
     for(int q=1;q<=segundo;q++){
     kf=kf*q;
     }
     r=(nf/(nkf*kf));
     return r;
     }
     */
    public void actionPerformed(ActionEvent evento) {

        Object fuente = evento.getSource();
        if (fuente == nuevo_cálculo) {
            nro1.setText("");
            nro2.setText("");
            resultado.setText("");
            operatoria.setSelectedItem("Suma");
        }

        if (fuente == calcular) {
            double numero1 = Double.parseDouble(nro1.getText());
            double numero2 = Double.parseDouble(nro2.getText());

//if(operatoria.getSelectedItem()=="Combinatoria")
            // resultado.setText(""+combinatoria(numero1,numero2));
            if (operatoria.getSelectedItem() == "Suma") {
                resultado.setText("" + (numero1 + numero2));
            }
            if (operatoria.getSelectedItem() == "Resta") {
                resultado.setText("" + (numero1 - numero2));
            }
            if (operatoria.getSelectedItem() == "Multiplicacion") {
                resultado.setText("" + (numero1 * numero2));
            }
            if (operatoria.getSelectedItem() == "Division") {
                resultado.setText("" + (numero1 / numero2));
            }

        }
    }

    public static void main(String[] args) {

        Calculadora nueva = new Calculadora();

        nueva.setVisible(true);
        nueva.setSize(500, 300);
        nueva.setResizable(true);
    }

}

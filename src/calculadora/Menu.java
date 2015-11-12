/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jair Ferraz
 */
public class Menu extends JFrame implements ActionListener{

    private JButton botao1, botao2, botao3;
    
    public Menu() {
        super("Calculadoras");
        setBounds(100, 100, 300, 80);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciaComponentes();

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton botao = (JButton) e.getSource();
            JOptionPane.showMessageDialog(this,
                    "teste");
        }
    }

    private void iniciaComponentes() {
        this.setLayout(new BorderLayout());
        
        JPanel painelBotoes = new JPanel(
                new FlowLayout());
        
        botao1 = new JButton("Calc. Simples");
        botao1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                JButton botao = (JButton) e.getSource();
                new CalcSimples.CalcSimples();
            }
            }
        });
        painelBotoes.add(botao1);

        botao2 = new JButton("Calc. 2");
        botao2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                JButton botao = (JButton) e.getSource();
                JOptionPane.showMessageDialog(Menu.this,
                        "Calc. 2");
            }
            }
        });
        painelBotoes.add(botao2);
        
        botao3 = new JButton("Calc. 3");
        botao3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                JButton botao = (JButton) e.getSource();
                JOptionPane.showMessageDialog(Menu.this,
                        "Calc. 3");
            }
            }
        });
        painelBotoes.add(botao3);
        
        this.add(painelBotoes);
       
    }    
}

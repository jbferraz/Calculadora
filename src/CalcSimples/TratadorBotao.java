/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CalcSimples;

import calculadora.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lhries
 */
public class TratadorBotao implements ActionListener{
    private Menu janela;
    
    public TratadorBotao(Menu janela){
        this.janela = janela;
                
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JButton){
            JButton botao = (JButton) e.getSource();
            JOptionPane.showMessageDialog(janela, 
                    "Botao: "+botao.getText());
        }
    }
    
}

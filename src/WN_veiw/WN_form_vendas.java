/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WN_veiw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Wallison
 */
public class WN_form_vendas extends JPanel implements ActionListener {
    private JButton botao;
    private JTextField vendasdia;
     private JTextField vendasmes;
     private JTextField vendasano;
     private JTextField preço;
      private JTextField estoque;
    
    
public WN_form_vendas(){
 JLabel label = new JLabel("form_vendas");
    JLabel lbvendasdia = new JLabel("vendas por dia:");
        JLabel lbestoque = new JLabel("estoque:");
        JLabel lbvendasmes = new JLabel("vendas por mes:");
        JLabel lbvendasano = new JLabel("vendas por ano:");
        JLabel lbpreço= new JLabel("preço:");
    vendasdia=new JTextField(10);
 vendasmes=new JTextField(10);
 vendasano=new JTextField(10);
 preço=new JTextField(10);
 estoque=new JTextField(10);
botao=new JButton("exibir");
botao.addActionListener(this);


add(lbvendasdia);
add(vendasdia);
add(lbvendasmes);
add(vendasmes);
add(lbvendasano);
add(vendasano);
add(lbpreço);
add(preço);
add(lbestoque);
add(estoque);
add(botao);
add(label);

}

    @Override
    public void actionPerformed(ActionEvent ae) {
    
    String valor_vendasdia= vendasdia.getText();
    String valor_vendasmes= vendasmes.getText();
    String valor_vendasano= vendasano.getText();
    String valor_preço= preço.getText();
    String valor_estoque= estoque.getText();
    
    String texto = "vendas por dia: "+valor_vendasdia+"\n vendas por mes: "+valor_vendasmes
    +"\n numero de vendas por ano: "+valor_vendasano+"\n preço: "+valor_preço+"\n estoque: "+valor_estoque;
    
    JOptionPane.showMessageDialog(null, texto);
    
    
    }











}

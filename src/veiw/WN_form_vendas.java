/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiw;

import classes.WN_vendas;
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
    
    int valor_vendasdia=Integer.parseInt(vendasdia.getText() );
    int valor_vendasmes=Integer.parseInt(vendasmes.getText() );
    int valor_vendasano= Integer.parseInt(vendasano.getText() );
    double valor_preço=Double.parseDouble(preço.getText()) ;
    int valor_estoque= Integer.parseInt(estoque.getText() );
    
    WN_vendas vendas = new WN_vendas(valor_vendasdia,valor_vendasmes,valor_vendasano,valor_preço,valor_estoque);
    
    String texto = "vendas por dia: "+vendas.getwn_Nvendasdia()+"\n vendas por mes: "+vendas.getwn_Nvendasmes()
    +"\n numero de vendas por ano: "+vendas.getwn_Nvendasano()+"\n preço: "+vendas.getwn_preço()+"\n estoque: "+vendas.getwn_estoque();
    
    JOptionPane.showMessageDialog(null, texto);
    
    
    }











}

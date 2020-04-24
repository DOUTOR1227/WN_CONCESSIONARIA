/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiw;

import bean.WN_vendas;
import dao.vendasDAO;
import java.awt.GridLayout;
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
  private JTextField carro;
    private JTextField vendasdia;
     private JTextField vendasmes;
     private JTextField vendasano;
     private JTextField preço;
      private JTextField estoque;
    
    
public WN_form_vendas(){

    setLayout(new GridLayout(7,1));
    JLabel label = new JLabel("form_vendas");
 JLabel lbcarro= new JLabel("carro:");   
 JLabel lbvendasdia = new JLabel("vendas no dia:");
        JLabel lbestoque = new JLabel("estoque:");
        JLabel lbvendasmes = new JLabel("vendas no mes passado:");
        JLabel lbvendasano = new JLabel("vendas por ano:");
        JLabel lbpreço= new JLabel("preço:");
   carro = new JTextField(10);
        vendasdia=new JTextField(10);
 vendasmes=new JTextField(10);
 vendasano=new JTextField(10);
 preço=new JTextField(10);
 estoque=new JTextField(10);
botao=new JButton("exibir");
botao.addActionListener(this);


add(lbcarro);
add(carro);
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
    String valor_carro=carro.getText();
    int valor_vendasdia=Integer.parseInt(vendasdia.getText() );
    int valor_vendasmes=Integer.parseInt(vendasmes.getText() );
    int valor_vendasano= Integer.parseInt(vendasano.getText() );
    double valor_preço=Double.parseDouble(preço.getText()) ;
    int valor_estoque= Integer.parseInt(estoque.getText() );
    
    WN_vendas vendas = new WN_vendas(valor_vendasdia,valor_vendasmes,valor_vendasano,valor_preço,valor_estoque,valor_carro);
    
   vendasDAO.adicionar(vendas);
    
    }











}

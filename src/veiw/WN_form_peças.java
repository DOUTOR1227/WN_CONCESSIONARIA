/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiw;

import classes.WN_peças;
import dao.peçasDAO;
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
public class WN_form_peças extends JPanel implements ActionListener {
    private JButton botao;
    private JTextField estoque;
    private JTextField modelo;
    private JTextField tempodeuso;     
    private JTextField usada;
    private JTextField preço;
    
    public WN_form_peças(){
 setLayout(new GridLayout(6,1));
   JLabel label = new JLabel("form_peças"); 
      JLabel lbestoque =new JLabel("estoque:");  
      JLabel lbmodelo =new JLabel("modelo:");     
       JLabel lbtempodeuso =new JLabel("tempo de uso (dias)");    
  JLabel lbusada =new JLabel("usada");  
       JLabel lbpreço =new JLabel("preço");  
      
      estoque=new JTextField(10);
 modelo=new JTextField(10);
 tempodeuso=new JTextField(10);
 usada=new JTextField(10);
 preço=new JTextField(0);
 botao =new JButton("exibir");   
    botao.addActionListener(this);
    
    add(lbestoque);
    add(estoque);
    add(lbmodelo);
    add(modelo);
    add(lbusada);
    add(usada);
    add(lbtempodeuso);
    add(tempodeuso);
    add(lbpreço);
    add(preço);
    add(botao);
    add(label);
    }

   
    
    @Override
    public void actionPerformed(ActionEvent ae) {

    int valor_estoque=Integer.parseInt(estoque.getText()) ;
    String valor_modelo=modelo.getText();
    String valor_usada=usada.getText();
    int valor_tempodeuso=Integer.parseInt( tempodeuso.getText());
    double valor_preço=Double.parseDouble( preço.getText());
    
    WN_peças peça =new WN_peças(valor_estoque, valor_preço,valor_usada, valor_tempodeuso, valor_modelo);
    
   peçasDAO.adicionar(peça);
    
    }




















}

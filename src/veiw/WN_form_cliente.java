/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiw;

import classes.WN_cliente;
import dao.clienteDAO;
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
public class WN_form_cliente extends JPanel implements ActionListener{
  private JButton botao;
    private JTextField nome;
   private JTextField renda; 
    private JTextField cpf; 
     private JTextField rg;    
     private JTextField endereço;
     private JTextField score;
   
    
 public  WN_form_cliente(){
     //setLayout(new GridLayout(7,1));
     JLabel label =new JLabel("form_cliente");
     JLabel lbnome = new JLabel("nome:");
      JLabel lbrenda = new JLabel("renda:");
      JLabel lbcpf = new JLabel("cpf:");
      JLabel lbrg = new JLabel("rg:");
      JLabel lbendereço = new JLabel("endereço:");
      JLabel lbscore = new JLabel("score:");
     
     nome= new JTextField(10);
  renda= new JTextField(10);
  cpf= new JTextField(11);
  rg= new JTextField(10);
  endereço= new JTextField(10);
  score= new JTextField(10);
botao= new JButton("exibir");
botao.addActionListener(this);    

add(lbnome);
add(nome);
add(lbrenda);    
add(renda);
add(lbcpf);    
add(cpf);
add(lbrg);    
add(rg);
add(lbendereço);   
add(endereço);
add(lbscore);   
add(score);
    add(botao);
    add(label);
    
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      String valor_nome=nome.getText();
      double valor_renda=Double.parseDouble(renda.getText());
      String valor_cpf=cpf.getText() ;
      String valor_rg=rg.getText();       
    int valor_score=Integer.parseInt(score.getText());
    String valor_endereço=endereço.getText();
    
    
    
   
   WN_cliente cliente = new WN_cliente(valor_nome, valor_cpf, valor_rg, valor_endereço, valor_renda, valor_score); 
  
   clienteDAO.adicionar(cliente);
   
   
    
     
   
      
   

    }
    
    
    


















}

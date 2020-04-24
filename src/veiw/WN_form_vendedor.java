/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiw;

import bean.WN_vendedor;
import dao.vendedorDAO;
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
 * @author 201816992
 */
public class WN_form_vendedor extends JPanel implements ActionListener{
 
    private JButton botao;
    private JTextField nome ;
   private JTextField HT;
   private JTextField saldo;
   private JTextField cpf;
  
   private JTextField horaextra;
    
    public WN_form_vendedor(){
      setLayout(new GridLayout(8,1));
      JLabel label = new JLabel("for_vendedor"); 
      JLabel lbnome = new JLabel("nome:");
         JLabel lbHT = new JLabel("horas trabalhadas:");  
       JLabel lbcpf = new JLabel("cpf:");  
        JLabel lbsaldo=new JLabel("saldo:");
         JLabel lbhoraextra = new JLabel("horaextra:");  
      
         
         
         nome=new JTextField(10);  
      saldo=new JTextField(10); 
 HT=new JTextField(0); 

 cpf=new JTextField(10); 
 horaextra=new JTextField(10); 
botao = new JButton("exibir");
botao.addActionListener(this);
    
    add(lbnome);
    add(nome);
    add(lbsaldo);
    add(saldo);
    add(lbHT);
    add(HT);
   
    add(lbcpf);
    add(cpf);
    add(lbhoraextra);
    add(horaextra);
    add(botao);
    add(label);
    
    
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     String valor_nome = nome.getText();
        double valor_saldo=Double.parseDouble( saldo.getText());
     int valor_HT=Integer.parseInt(HT.getText()) ;
        String valor_cpf= cpf.getText();
         double valor_horaextra=Double.parseDouble(horaextra.getText()) ;
        
    
    WN_vendedor vendedor=new WN_vendedor(valor_nome,valor_saldo,valor_HT,valor_cpf,valor_horaextra);
        vendedorDAO.adicionar(vendedor);
    
    
    }
    
    }
    
    
    
    
    
    
    
    
   

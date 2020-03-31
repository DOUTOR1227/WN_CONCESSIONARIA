/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiw;

import classes.WN_gerente;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author 201816992
 */
public class WN_form_gerente extends JPanel implements ActionListener {
   private JButton botao;
   private JTextField nome ;
    private JTextField usuario;
   private JPasswordField senha;
   private JTextField telefone;
   private JTextField HT;
   private JTextField saldo;
   private JTextField cpf;
   private JTextField horaextra;
     
   
public WN_form_gerente(){
   setLayout(new GridLayout(10,1));
    
    JLabel label = new JLabel("form_gerente");
   JLabel lbnome = new JLabel("nome:");   
   JLabel lbusuario = new JLabel("usuario:");  
    JLabel lbsenha = new JLabel("senha:");  
     JLabel lbtelefone = new JLabel("telefone:");  
      JLabel lbHT = new JLabel("horas trabalhadas:");  
       JLabel lbcpf = new JLabel("cpf:");  
        JLabel lbsaldo=new JLabel("saldo:");
         JLabel lbhoraextra = new JLabel("horaextra:");  

         
         nome = new JTextField(10);
    
     usuario = new JTextField(10);
   senha = new JPasswordField(10);
     telefone = new JTextField(10);
 HT = new JTextField(10);


 saldo = new JTextField(10);
 
 cpf = new JTextField(10);

 horaextra = new JTextField(10);

    botao=new JButton("exibir");
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
   add(lbusuario);
   add(usuario);
   add(lbsenha);
   add(senha);
   add(lbtelefone);
   add(telefone);
 
add(botao);
add(label);
}

    
    @Override
    public void actionPerformed(ActionEvent ae) {
      String valor_nome = nome.getText();
        double valor_saldo=Double.parseDouble(saldo.getText()) ;
     int valor_HT=Integer.parseInt(HT.getText()) ;
        String valor_cpf=cpf.getText();
          double valor_horaextra=Double.parseDouble( horaextra.getText());
    
          String valor_usuario= usuario.getText();
          String valor_senha=senha.getText() ;
         int valor_telefone=Integer.parseInt(telefone.getText());
       
        
        
        
     WN_gerente gerente= new WN_gerente(valor_nome, valor_saldo, valor_HT, valor_cpf, valor_horaextra, valor_usuario, valor_senha, valor_telefone);
    
     String texto = "nome: "+gerente.getwn_nome()+"\n saldo: "+gerente.getwn_saldo()+
     "\n horas trabalhadas: "+gerente.getwn_HT()+"\n cpf: " +gerente.getwn_cpf()+
      "\n horaextra: "+gerente.getwn_horaextra()+"\n usuario: "+gerente.getwn_usuario()+
       "\n senha: "+gerente.getwn_senha()+"\ntelefone: "+gerente.getwn_telefone()+
             "\n FGTS: "+gerente.getwn_FGTS();       
     
     
     
     
      JOptionPane.showMessageDialog(null, texto);
    
    }
    


}

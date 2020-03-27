/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WN_veiw;

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
public class WN_form_officeboy extends JPanel implements ActionListener {
     private JButton botao;
   private JTextField nome ;
    private JTextField usuario;
   private JTextField senha;
   private JTextField HT;
   private JTextField saldo;
   private JTextField cpf;
   private JTextField FGTS;
   private JTextField horaextra;
    
    
    public WN_form_officeboy(){
     
        setLayout(new GridLayout(9,1));
        JLabel label =new JLabel("form_officeboy");
        JLabel lbnome = new JLabel("nome:");   
   JLabel lbusuario = new JLabel("usuario:");  
    JLabel lbsenha = new JLabel("senha:");  
      JLabel lbHT = new JLabel("horas trabalhadas:");  
       JLabel lbcpf = new JLabel("cpf:");  
        JLabel lbsaldo=new JLabel("saldo:");
         JLabel lbhoraextra = new JLabel("horaextra:");  
   JLabel lbFGTS = new JLabel("FGTS:"); 
        
        nome=new JTextField(10);  
 saldo=new JTextField(10); 
 HT=new JTextField(10); 
 cpf=new JTextField(10); 
 horaextra=new JTextField(10); 
 usuario=new JTextField(10);
 senha=new JTextField(10);
FGTS= new JTextField(10);
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
   add(lbFGTS);
   add(FGTS);
add(botao);
add(label);
    
    
    
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      
     String valor_nome = nome.getText();
        String valor_saldo= saldo.getText();
     String valor_HT= HT.getText();
        String valor_cpf= cpf.getText();
          String valor_horaextra= horaextra.getText();
         String valor_FGTS = FGTS.getText();
          String valor_usuario= usuario.getText();
          String valor_senha= senha.getText();
         
       
        
        
        
     String texto = "nome: "+valor_nome+"\n saldo: "+valor_saldo+
     "\n horas trabalhadas: "+valor_HT+"\n cpf: " + valor_cpf+
      "\n horaextra: "+valor_horaextra+"\n usuario: "+valor_usuario+
       "\n senha: "+valor_senha+"\n FGTS: "+valor_FGTS;       
     
     
     
     
      JOptionPane.showMessageDialog(null, texto);    
        
        
        
    }
    
    
    
    
    
    
    
    
    


































}

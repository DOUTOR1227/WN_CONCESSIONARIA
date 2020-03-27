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
public class WN_form_vendedor extends JPanel implements ActionListener{
 
    private JButton botao;
    private JTextField nome ;
   private JTextField HT;
   private JTextField saldo;
   private JTextField cpf;
   private JTextField FGTS;
   private JTextField horaextra;
    
    public WN_form_vendedor(){
      setLayout(new GridLayout(8,1));
      JLabel label = new JLabel("for_vendedor"); 
      JLabel lbnome = new JLabel("nome:");
         JLabel lbHT = new JLabel("horas trabalhadas:");  
       JLabel lbcpf = new JLabel("cpf:");  
        JLabel lbsaldo=new JLabel("saldo:");
         JLabel lbhoraextra = new JLabel("horaextra:");  
       JLabel lbFGTS = new JLabel("FGTS:");
         
         
         nome=new JTextField(10);  
      saldo=new JTextField(10); 
 HT=new JTextField(0); 
 FGTS = new JTextField(10);
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
    add(lbFGTS);
    add(FGTS);
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
        String valor_saldo= saldo.getText();
     String valor_HT= HT.getText();
        String valor_cpf= cpf.getText();
          String valor_horaextra= horaextra.getText();
         String valor_FGTS = FGTS.getText();  
    
    String texto = "nome: "+valor_nome+"\n saldo: "+valor_saldo+"\n horas trabalhadas: "+valor_HT+
     "\n FGTS: "+valor_FGTS+"\n cpf: "+valor_cpf+"\n hora extra: "+valor_horaextra;
    
     JOptionPane.showMessageDialog(null, texto);
    
    
    }
    
    }
    
    
    
    
    
    
    
    
   

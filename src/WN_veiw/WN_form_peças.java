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
       JLabel lbtempodeuso =new JLabel("tempo de uso");    
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

    String valor_estoque=estoque.getText();
    String valor_modelo=modelo.getText();
    String valor_usada=usada.getText();
    String valor_tempodeuso=tempodeuso.getText();
    String valor_preço=preço.getText();
    
    String texto="estoque: "+valor_estoque+"\n modelo: "+valor_modelo+"\n usada: "+valor_usada+
    "\n tempo de uso: "+valor_tempodeuso+"\n preço: "+valor_preço;
    
    
    
     JOptionPane.showMessageDialog(null, texto);
    
    
    }




















}

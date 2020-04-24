/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import veiw.WN_form_cliente;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import static layout.WN_janela.centro;
import veiw.WN_form_controladoria;
import veiw.WN_form_gerente;
import veiw.WN_form_mecanico;
import veiw.WN_form_officeboy;
import veiw.WN_form_peças;
import veiw.WN_form_vendas;
import veiw.WN_form_vendedor;

/**
 *
 * @author 201816992
 */
public class WN_topo extends JPanel{
 public WN_topo(){
 JButton botao1 = new JButton("cliente");
 JButton botao2 = new JButton("controladoria");
 JButton botao3 = new JButton("gerente");
 JButton botao4 = new JButton("mecanico");
 JButton botao5 = new JButton("officeboy");
 JButton botao6 = new JButton("peças");
JButton botao7 = new JButton("vendas");
 JButton botao8 = new JButton("vendedor");
 
 botao1.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent ae) {
      centro.removeAll();
      centro.add(new WN_form_cliente());   
         centro.repaint();
         centro.validate();
     }
 });
 
 botao2.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent ae) {
        centro.removeAll();
      centro.add(new WN_form_controladoria());   
         centro.repaint();
         centro.validate();
         
         
     }
 });
 
 botao3.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent ae) {
        centro.removeAll();
      centro.add(new WN_form_gerente());   
         centro.repaint();
         centro.validate();
         
         
     }
 });
 
 
 botao4.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent ae) {
        centro.removeAll();
      centro.add(new WN_form_mecanico());   
         centro.repaint();
         centro.validate();
         
         
     }
 });
 
 botao5.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent ae) {
        centro.removeAll();
      centro.add(new WN_form_officeboy());   
         centro.repaint();
         centro.validate();
         
         
     }
 });
 
 botao6.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent ae) {
        centro.removeAll();
      centro.add(new WN_form_peças());   
         centro.repaint();
         centro.validate();
         
         
     }
 });
 
 botao7.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent ae) {
        centro.removeAll();
      centro.add(new WN_form_vendas());   
         centro.repaint();
         centro.validate();
         
         
     }
 });
 
 botao8.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent ae) {
        centro.removeAll();
      centro.add(new WN_form_vendedor());   
         centro.repaint();
         centro.validate();
         
         
     }
 });
 
 
 
 
 
 
 
 
 
 add(botao1);
 add(botao2);
 add(botao3);
 add(botao4);
 add(botao5);
 add(botao6);
 add(botao7);
 add(botao8);
 
 
 
 
 
 
 }
    
    
    
}

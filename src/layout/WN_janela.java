/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author 201816992
 */
public class WN_janela extends JFrame{
    public WN_janela(){
    super("teste");
     setLayout(new BorderLayout());
    getContentPane().add(new WN_centro(), BorderLayout.CENTER);
    getContentPane().add(new WN_topo(), BorderLayout.NORTH);
    getContentPane().add(new WN_rodape(),BorderLayout.SOUTH);
   getContentPane().add(new WN_direita(),BorderLayout.EAST);
    getContentPane().add(new WN_esquerda(),BorderLayout.WEST);
   
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    show();
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}

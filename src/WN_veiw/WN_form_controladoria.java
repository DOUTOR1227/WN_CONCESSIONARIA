/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WN_veiw;

import WN_classes.WN_controladoria;
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
public class WN_form_controladoria extends JPanel implements ActionListener{
private JTextField lucros;
private JTextField salariofuncionario;
private JTextField cofre;
private JTextField compras; 
private JTextField manutenção;
private JButton botao;







    
public WN_form_controladoria(){
setLayout(new GridLayout(6,1));
 JLabel label=new JLabel("form_controladoria");
    JLabel lblucros = new JLabel("lucros:");
      JLabel lbsalariofuncionario = new JLabel("salario dos funcionarios:");
      JLabel lbcofre = new JLabel("cofre:");
      JLabel lbcompras = new JLabel("compras");
      JLabel lbmanutenção = new JLabel("manutenção");
    
    
    
    lucros=new JTextField(10);
 salariofuncionario=new JTextField(10);
 cofre=new JTextField(10);
 compras=new JTextField(10);
 manutenção=new JTextField(10);
botao = new JButton("exibir");
botao.addActionListener(this);
add(lblucros);
add(lucros);
add(lbsalariofuncionario);
add(salariofuncionario);
add(lbcofre);
add(cofre);
add(lbcompras);
add(compras);
add(lbmanutenção);
add(manutenção);
add(botao);
add(label);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
    double valor_lucros=Double.parseDouble(lucros.getText());
    double valor_salariofuncionario=Double.parseDouble(salariofuncionario.getText());
    double valor_cofre=Double.parseDouble(cofre.getText());
    double valor_compras=Double.parseDouble(compras.getText());
    double valor_manutenção=Double.parseDouble(manutenção.getText());
    
   
    WN_controladoria controladoria = new WN_controladoria(valor_lucros, valor_salariofuncionario, valor_cofre, valor_compras, valor_manutenção);
    
     String texto ="lucros: "+controladoria.getwn_lucros()+"\n salario dos funcionarios: "+controladoria.getwn_salariofuncionario()+
    "\n cofre: "+controladoria.getwn_cofre()+"\ncompras: "+controladoria.getwn_compras()+"\nmanutenção: "+controladoria.getwn_manutenção();
    
    JOptionPane.showMessageDialog(null, texto);
    
    
    
    
    
    
    
    
    
    }












}

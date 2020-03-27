/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author 201816992
 */
public class WN_form_gerente extends JPanel{
    
public WN_form_gerente(){

    JTextField nome = new JTextField();
JTextField HT = new JTextField();
JTextField saldo = new JTextField();
JTextField cpf = new JTextField();
JTextField FGTS = new JTextField();
JTextField horaextra = new JTextField();

    add(nome);
    add(saldo);
 add(HT);
    add(cpf);
add(FGTS);
    add(horaextra);
}
    


}

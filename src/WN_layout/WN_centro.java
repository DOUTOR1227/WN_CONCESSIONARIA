 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WN_layout;


import WN_veiw.WN_form_gerente;
import WN_veiw.WN_form_mecanico;
import WN_veiw.WN_form_officeboy;
import WN_veiw.WN_form_vendedor;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author 201816992
 */
public class WN_centro extends JPanel {
public WN_centro(){
setLayout(new GridLayout(2,2));
    add(new WN_form_gerente());
add(new WN_form_vendedor());
add(new WN_form_officeboy());
add(new WN_form_mecanico());












}


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WN_classes;

/**
 *
 * @author Wallison
 */
public class WN_officeboy extends WN_funcionarios {
    private String wn_usuario;
    private String wn_senha;


    @Override
    public double wn_h_extra() {
       return this.wn_saldo=this.wn_saldo+(this.wn_saldo*50)/100;
    }

public void setwn_usuario(String usuario){
this.wn_usuario=usuario;
}


public String getwn_usuario(){
return this.wn_usuario;

}

public void setwn_senha(String senha){
this.wn_senha=senha;

}

public String getwn_senha(){
return this.wn_senha;

}


WN_officeboy(String n, double s, double ht, int cpf, double hx, String u, String se){
this.wn_nome=n;
this.wn_saldo=s;
this.wn_HT=ht;
this.wn_cpf=cpf;
this.wn_horaextra=hx;
this.wn_usuario=u;
this.wn_senha=se;
this.wn_saldo=(this.wn_saldo*8)/100;
}















}

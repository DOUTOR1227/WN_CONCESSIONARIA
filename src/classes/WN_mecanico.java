/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Wallison
 */
public class WN_mecanico extends WN_funcionarios {
    private int wn_telefone;

public void setwn_telefone(int telefone){
this.wn_telefone=telefone;

}

public int getwn_telefone(){
return this.wn_telefone;

}




   
    
    @Override
    public double wn_h_extra() {
   return this.wn_saldo=this.wn_saldo+(this.wn_saldo*50)/100;
    }

public WN_mecanico(String n, double s, int ht, int cpf, double hx, int t){
this.wn_nome=n;
this.wn_saldo=s;
this.wn_HT=ht;
this.wn_cpf=cpf;
this.wn_horaextra=hx;
this.wn_telefone=t;

this.wn_FGTS=(this.wn_saldo*8)/100;

}














}

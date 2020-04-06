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
public class WN_vendedor extends WN_funcionarios {
 
    @Override 
  public double FGTS(){ 
return this.wn_saldo*50/100;


}
    
    @Override
    public double wn_h_extra() {
   return (6)*8/100;
    }   

public WN_vendedor(String n, double s, int ht, String cpf, double hx){
this.wn_nome=n;
this.wn_saldo=s;
this.wn_HT=ht;
this.wn_cpf=cpf;
this.wn_horaextra=hx;




}
}

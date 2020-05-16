/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Wallison
 */
public abstract class WN_funcionarios {
   protected String wn_nome;
   protected double wn_saldo;
   protected int wn_HT;
   protected String wn_cpf;
   protected double wn_horaextra;
protected int id;

public void getid(int id){
this.id=id;

}
public int getid(){
return this.id;

}
  
   
   
   
   public void setwn_nome(String nome){
   this.wn_nome=nome;
   }
   public String getwn_nome(){
   return this.wn_nome;
   }
   
   public void setwn_saldo(double wnsaldo){
   this.wn_saldo=wnsaldo;
   }
  
   public double getwn_saldo(){
   return this.wn_saldo;
       
 
   
   
   }
 
   public void setwn_HT(int wnHT){
   this.wn_HT=wnHT;
   }
   public double getwn_HT(){
   return this.wn_HT;
   }
   
   public void setwn_cpf(String wncpf){
   this.wn_cpf=wncpf;
   }
   
   public String getwn_cpf(){
   return this.wn_cpf;
   }
   
   public void setwn_horaextra(double wnhoraextra){
   this.wn_horaextra=wnhoraextra;
   }
   
   public double getwn_horaextra(){
   return this.wn_horaextra;
   
   }
   
   
   
   public abstract double wn_h_extra();
   
   
   public abstract double FGTS();
   
   
   
   
   
   
   
   
   
}

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
public class WN_gerente extends WN_funcionarios {
  private String wn_usuario;
  private String wn_senha;
private int wn_telefone;

public void setwn_usuario(String wnusuario){
this.wn_usuario=wnusuario;
}


public String getwn_usuario(){
return this.wn_usuario;

}

public void setwn_senha(String wnsenha){
this.wn_senha=wnsenha;

}

public String getwn_senha(){
return this.wn_senha;

}

public void setwn_telefone(int wntelefone){
this.wn_telefone=wntelefone;

}

public int getwn_telefone(){
 return this.wn_telefone;   
}

 

public WN_gerente(String n, double s, int ht, String cpf, double hx, String u, String se, int telefone){
this.wn_nome=n;
this.wn_saldo=s;
this.wn_telefone=telefone;
this.wn_HT=ht;
this.wn_cpf=cpf;
this.wn_horaextra=hx;
this.wn_usuario=u;
this.wn_senha=se;
this.wn_FGTS=(this.wn_saldo*8)/100;
}



   
    
   
@Override
    public double wn_h_extra() {
   return this.wn_horaextra=this.wn_saldo+(this.wn_saldo*50)/100;
    }

































}

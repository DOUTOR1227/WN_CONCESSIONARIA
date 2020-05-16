
package bean;

/**
 *nome
 * cpf
 * rg
 * enderaço
 *  renda(se for baixo reprova)
 *
 * analise de credito{
 * score - movimentação do cpf
 * 
 * }
 * valor do veiculo(sempre a entrada tem que ser 40% do valor cocarro)
 *
 * @author Wallison
 * 
 */
public class clienteBEAN {
  
private int id;    
private String wn_nome;
private String wn_cpf;
private String wn_rg;
private String wn_endereço;
private double wn_renda;
private int wn_score;


public void setid(int id){
this.id=id;

}
public int getid(){
return this.id;

}


public void setwn_nome(String wnnome){
this.wn_nome= wnnome;

}

public String getwn_nome(){
return this.wn_nome;
}

public void setwn_cpf(String wncpf){
this.wn_cpf= wncpf;

}

public String getwn_cpf(){
return this.wn_cpf;
}


public void setwn_rg(String wnrg){
this.wn_rg= wnrg;

}

public String getwn_rg(){
return this.wn_rg;
}


public void setwn_score(int  wnscore){
this.wn_score= wnscore;

}

public int getwn_score(){
return this.wn_score;
}


public void setwn_endereço(String  wnendereço){
this.wn_endereço= wnendereço;

}

public String getwn_endereço(){
return this.wn_endereço;
}

public void setwn_renda(double  wnrenda){
this.wn_renda= wnrenda;

}

public double getwn_renda(){
return this.wn_renda;
}


public String wn_analisedecradito(){
if(this.wn_score<100){
    return ", insuficiente";
    
    }else{
    return ", aprovado";
}
    
    
}

public String entrada(){
if(this.wn_renda<3000){
   return ", renda insuficiente";

}else{
    return ", renda aprovada";
}
    
    
    
    
  
}


public clienteBEAN(String nome, String cpf, String rg, String endereço, double renda, int score){
this.wn_nome=nome;
this.wn_cpf=cpf;
this.wn_rg=rg;
this.wn_endereço=endereço;
this.wn_renda=renda;
this.wn_score=score;



}



}

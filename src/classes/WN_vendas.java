/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author 201816992
 */
public class WN_vendas {
    public int wn_Nvendasdia;
    public int wn_Nvendasmes;
    public int wn_Nvendasano;
    public double wn_preço;
    public int wn_estoque;

public void setwn_Nvendasdia(int wnvendasdia){
this.wn_Nvendasdia=wnvendasdia;
}

public int getwn_Nvendasdia(){
return this. wn_Nvendasdia;
}

public void setwn_preço(double wnpreço){
this.wn_preço=wnpreço;
}

public double getwn_preço(){
return this.wn_preço;
}

public void setwn_estoque(int wnestoque){
this.wn_estoque=wnestoque;
}

public double getwn_estoque(){
return this.wn_estoque;

}

public int getwn_Nvendasmes(){
return this.wn_Nvendasmes;
}

public int getwn_Nvendasano(){
return this.wn_Nvendasano;

}

public double desconto(){
return this.wn_preço-100;


}


public WN_vendas(int vendasdia, int vendasmes, int vendasano, double preço, int estoque){
this.wn_Nvendasano=vendasano;
this.wn_Nvendasdia=vendasdia;
this.wn_Nvendasmes=vendasmes;
this.wn_estoque=estoque;
this.wn_preço=preço;







}

















}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.WN_peças;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Wallison
 */
public class peçasDAO {
  
    public static void adicionar(WN_peças peça){
    
     String sql ="insert into wn_peças (modelo,estoque,preço,usada,tempo_de_uso)\n" +
"     values\n" +
"     (?,?,?,?,?);";
  
  
  Connection conexao = null;
 PreparedStatement stmt = null;
 
try{

     conexao = ConexaoDB.retornaconexao();
     stmt = conexao.prepareStatement(sql);
     
     stmt.setString(1,peça.getwn_modelo());
    stmt.setInt(2, peça.getwn_estoque());
    stmt.setDouble(3,peça.getwn_preço());
    stmt.setString(4, peça.getwn_usada());
    stmt.setInt(5, peça.getwn_tempodeuso());
    
   stmt.execute();
    
    System.out.println("deu certo vei");
    

} catch(Exception e){

    System.out.println("erro em peças"+e.toString());

}
    }
    
    
    
    public static void atualizar(){}
 public static void excluir(){}
 public static void listar(){}
   



 
    
    
}

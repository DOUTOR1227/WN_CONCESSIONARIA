/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.WN_vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Wallison
 */
public class vendasDAO {
    
    public static void adicionar(WN_vendas vendas){
    String sql="insert into wn_vendas(carros,vendas_no_dia, vendas_no_mes_anterior,vendas_ano,preço,estoque)\n" +
"values\n" +
"(?,?,?,?,?,?);";
        
     Connection conexao = null;   
       PreparedStatement stmt = null;
       try{
        conexao = ConexaoDB.retornaconexao();
     stmt = conexao.prepareStatement(sql);
       
     stmt.setString(1,vendas.getwn_carro());  
     stmt.setInt(2,vendas.getwn_Nvendasdia());
     stmt.setInt(3, vendas.getwn_Nvendasmes());
     stmt.setInt(4, vendas.getwn_Nvendasano());
     stmt.setDouble(5, vendas.getwn_preço());
     stmt.setInt(6, vendas.getwn_estoque());
     
     stmt.execute();
           System.out.println("deu certo vei");
     
     
       
       }catch(Exception e){
       
           System.out.println("erro em vendas"+e.toString());
       
       
       
       }
       
       
       
       
       
       
       
       
      }
    
    
    
    
    public static void atualizar(){}
 public static void excluir(){}
 public static void listar(){}
    
    
    
    
    
    
    
    
    
    
    
    
    
}

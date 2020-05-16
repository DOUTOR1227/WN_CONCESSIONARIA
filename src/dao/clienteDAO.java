/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.clienteBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Wallison
 */
public class clienteDAO {
 public static void adicionar(clienteBEAN cliente){
 String sql = "INSERT INTO wn_clientes (nome,cpf,RG,endereço,renda,score) VALUES(?,?,?,?,?,?)";
 Connection conexao = null;
 PreparedStatement stmt = null;
 
 try{
 conexao = ConexaoDB.retornaconexao();
     stmt = conexao.prepareStatement(sql);
     
     stmt.setString(1,cliente.getwn_nome());
     stmt.setString(2,cliente.getwn_cpf());
     stmt.setString(3,cliente.getwn_rg());
      stmt.setString(4, cliente.getwn_endereço());
      stmt.setDouble(5, cliente.getwn_renda());
     stmt.setInt(6, cliente.getwn_score());
 
 stmt.execute();
     System.out.println("deu certo vei");
 
 
 
 
 
 
 
 
 
 
 
 
 }catch(Exception e){
     System.out.println("erro no adcionar clientes: "+e.toString());
 
 
 }
 
 }

 
 
 
 
  public static ArrayList<clienteBEAN> Listar(){
 ArrayList<clienteBEAN> cliente = new ArrayList<>();
  String sql = "SELECT * FROM wn_clientes";
  
  try{
   Connection conexao = null;
 PreparedStatement stmt = null;
   conexao = ConexaoDB.retornaconexao();
     stmt = conexao.prepareStatement(sql);
  ResultSet dados = stmt.executeQuery();
  
  while(dados.next()){
  clienteBEAN clientetemp = new clienteBEAN(dados.getString("nome"),dados.getString("cpf"),dados.getNString("RG"),dados.getString("endereço"),dados.getDouble("renda"), dados.getInt("score"));
      clientetemp.setid(dados.getInt("id"));
      cliente.add(clientetemp);
      
      
      
  
  
  }
  
  
  }catch(Exception e){
  
      System.out.println("erro em listar clientes: "+e.toString());
  
  
  }
  return cliente;
  
  
  }
 public static void atualizar(){}
 public static void excluir(){}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 



}

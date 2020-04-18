/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.WN_cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Wallison
 */
public class clienteDAO {
 public static void adicionar(WN_cliente cliente){
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
 
 };   




}

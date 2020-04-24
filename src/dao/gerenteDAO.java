/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.WN_gerente;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Wallison
 */
public class gerenteDAO {
   public static void adicionar(WN_gerente gerente){
   String sql= "insert into wn_gerente(nome,saldo,horas_trabalhadas,cpf,hora_extra,usuario,senha)\n" +
"values (?,?,?,?,?,?,?)";
   Connection conexao=  null;
   PreparedStatement stmt= null;
   
   try{
   conexao=ConexaoDB.retornaconexao();
     stmt = conexao.prepareStatement(sql);    
   
       stmt.setString(1, gerente.getwn_nome());
   stmt.setDouble(2,gerente.getwn_saldo());
   stmt.setDouble(3,gerente.getwn_HT());
   stmt.setString(4, gerente.getwn_cpf());
   stmt.setDouble(5,gerente.getwn_horaextra());
   stmt.setString(6,gerente.getwn_usuario());
   stmt.setString(7,gerente.getwn_senha());
   
   stmt.execute();
       System.out.println("deu certo vei");
   
   
   
   
   }catch(Exception e){
   
       System.out.println("erro na gerenteDAO: "+e.toString());
   
   }
   
  } 


public static void atualizar(){}
 public static void excluir(){}
 public static void listar(){}
   
   






}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.WN_mecanico;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Wallison
 */
public class mecanicoDAO {
  
    public static void adicionar(WN_mecanico mecanico){
    String sql = "insert into wn_mecanico(nome,saldo,horas_trabalhadas,cpf,hora_extra,telefone)\n" +
"values(?,?,?,?,?,?)";
    Connection conexao = null;
    PreparedStatement stmt = null;
    
    try{
    conexao=ConexaoDB.retornaconexao();
     stmt = conexao.prepareStatement(sql);    
     stmt.setString(1, mecanico.getwn_nome());
   stmt.setDouble(2,mecanico.getwn_saldo());
   stmt.setDouble(3,mecanico.getwn_HT());
   stmt.setString(4, mecanico.getwn_cpf());
   stmt.setDouble(5,mecanico.getwn_horaextra()); 
      stmt.setInt(6,mecanico.getwn_telefone());  
        
        stmt.execute();
        System.out.println("deu certo vei");
    
    }catch(Exception e){
    
        System.out.println("erro em mecanicoDAO"+e.toString());
        
    }
    
    
    
    
    
    
    }
    
    
    public static void atualizar(){}
 public static void excluir(){}
 public static void listar(){}
    
    
    
    
    
    
    
    
    
    
}

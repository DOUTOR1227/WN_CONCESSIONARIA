/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.WN_vendedor;
import static dao.ConexaoDB.retornaconexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Wallison
 */
public class vendedorDAO {
    public static void adicionar(WN_vendedor vendedor){
    String sql = "insert into wn_vendedor(nome,saldo,horas_trabalhadas,cpf,hora_extra) \n" +
"values (?,?,?,?,?)";
    Connection conexao = null;
    PreparedStatement stmt= null;
    
    try{
     conexao=ConexaoDB.retornaconexao();
     stmt = conexao.prepareStatement(sql);    
        
        stmt.setString(1, vendedor.getwn_nome());
   stmt.setDouble(2,vendedor.getwn_saldo());
   stmt.setDouble(3,vendedor.getwn_HT());
   stmt.setString(4, vendedor.getwn_cpf());
   stmt.setDouble(5,vendedor.getwn_horaextra()); 
        
        stmt.execute();
        System.out.println("deu certo vei");
    
    }catch(Exception e){
        System.out.println("erro em vendedor"+e.toString());
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    }



}

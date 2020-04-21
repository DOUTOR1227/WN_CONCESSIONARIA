/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.WN_officeboy;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Wallison
 */
public class officeboyDAO {
   public static void adicionar(WN_officeboy off){
   String sql="insert into wn_officeboy (nome,saldo,horas_trabalhadas,cpf,hora_extra,usuario,senha)\n" +
"values (?,?,?,?,?,?,?)";
   Connection conexao = null;
   PreparedStatement stmt = null;
   
   try{
    conexao=ConexaoDB.retornaconexao();
     stmt = conexao.prepareStatement(sql);    
     stmt.setString(1, off.getwn_nome());
   stmt.setDouble(2,off.getwn_saldo());
   stmt.setDouble(3,off.getwn_HT());
   stmt.setString(4, off.getwn_cpf());
   stmt.setDouble(5,off.getwn_horaextra()); 
   stmt.setString(6,off.getwn_usuario());
   stmt.setString(7,off.getwn_senha());
   
   stmt.execute();
       System.out.println("deu certo vei");
   
   }catch(Exception e){
   
       System.out.println("erro na officeboyDAO: "+e.toString());
   
   }
   
   
   
   
   
   } 









}

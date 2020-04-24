/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.WN_controladoria;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Wallison
 */
public class controladoriaDAO {
    public static void adicionar(WN_controladoria controladoria){
    
    String sql = "insert into wn_controladoria(lucros,salario_funcionarios,cofre,compras,manutencao) values (?,?,?,?,?)";
  Connection conexao = null;
 PreparedStatement stmt = null;
   
 try{
    
        conexao = ConexaoDB.retornaconexao();
     stmt = conexao.prepareStatement(sql);
        
        stmt.setDouble(1,controladoria.getwn_lucros());
        stmt.setDouble(2,controladoria.getwn_salariofuncionario());
        stmt.setDouble(3,controladoria.getwn_cofre());
        stmt.setDouble(4,controladoria.getwn_compras());
        stmt.setDouble(5,controladoria.getwn_manutenção());
  
        
        stmt.execute();
      System.out.println("deu certo vei");
    }catch(Exception e){
      System.out.println("erro no adcionar clientes: "+e.toString());
    
    }
    
    
    
    
    }



public static void atualizar(){}
 public static void excluir(){}
 public static void listar(){}






}

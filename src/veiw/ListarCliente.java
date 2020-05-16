/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiw;

import bean.clienteBEAN;
import dao.clienteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wallison
 */
public class ListarCliente extends JPanel{
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    private JTable tabela;
private String [] colunas = {"nome","cpf","RG","endereço","renda","score","id"};
private Object [][] dados;
 DefaultTableModel modelo = new DefaultTableModel(dados, colunas);

public ListarCliente(){
botaoAdicionar = new JButton("adicionar");
botaoEditar = new JButton("atualizar");
botaoExcluir = new JButton("excluir");

 botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new AtualizarListener());
          botaoExcluir.addActionListener(new ExcluirListener());

tabela = new JTable(modelo);
ArrayList<clienteBEAN> cliente = clienteDAO.Listar();
for(clienteBEAN clientes: cliente){

    String nome= clientes.getwn_nome();
    String cpf = clientes.getwn_cpf();
    String RG = clientes.getwn_rg();
    String endereço= clientes.getwn_endereço();
    String renda  = Double.toString(clientes.getwn_renda());
    String score  = Integer.toString(clientes.getwn_score());
    
    String linha [] = new String []{nome, cpf, RG, endereço, renda, score};
    
    modelo.addRow(linha);

}

add(tabela);

add(botaoAdicionar);
add(botaoEditar);
add(botaoExcluir);
}

    private static class AdicionarListener implements ActionListener {

        public AdicionarListener() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            
            
            
            
        }
    }

    private static class AtualizarListener implements ActionListener {

        public AtualizarListener() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
           
            
            
        }
    }

    private static class ExcluirListener implements ActionListener {

        public ExcluirListener() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
 
            
            
        }
    }







}

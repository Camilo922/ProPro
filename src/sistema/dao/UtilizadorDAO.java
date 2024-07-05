/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistema.jdbc.LigacaoBanco;
import sistema.model.Utilizador;
import sistema.view.AreaTrabalho;
import sistema.view.Login;

/**
 *
 * @author Wilson Lopes
 */
public class UtilizadorDAO {
    
   final private Connection conexao;
    
    public UtilizadorDAO(){
        this.conexao = new LigacaoBanco().estabelecerConexao();
    }
    
     public void salvarUtilizador(Utilizador obj){
        try {
            //1º Criar o SQL para o funcionario ao mesmo tempo para o utilizador
            String sql = "INSERT INTO utilizador (nomeUtilizador, palavraPasse, nivel) VALUES (?,?,?)";
            //2º Preparar a Conexao com o Banco para o USUARIO 
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNomeUtilizador());
            stmt.setString(2, obj.getPalavraPasse());
            stmt.setString(3, obj.getNivel());
            // 3º Executar o sql USUARIO
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Utilizador Cadastrado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
     
     public void atualizarUtilizador(Utilizador obj){
        try {
            //1º Criar o SQL para o funcionario ao mesmo tempo para o utilizador
            String sql = "UPDATE utilizador SET nomeUtilizador=?, palavraPasse=?, nivel=? WHERE codigo=?";
            //2º Preparar a Conexao com o Banco para o USUARIO 
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNomeUtilizador());
            stmt.setString(2, obj.getPalavraPasse());
            stmt.setString(3, obj.getNivel());
            stmt.setInt(4, obj.getCodigo());
            // 3º Executar o sql USUARIO
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Utilizador Atualizado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
     
     public List<Utilizador> listarUtilizador() {
        List<Utilizador> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM utilizador";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Utilizador obj = new Utilizador();
                obj.setCodigo(rs.getInt("codigo"));
                obj.setNomeUtilizador(rs.getString("nomeUtilizador"));
                obj.setPalavraPasse(rs.getString("palavraPasse"));
                obj.setNivel(rs.getString("nivel"));
                
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
    
    public List<Utilizador> filtrarUtilizador(String nome) {
        List<Utilizador> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM utilizador WHERE nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Utilizador obj = new Utilizador();
                obj.setCodigo(rs.getInt("codigo"));
                obj.setNomeUtilizador(rs.getString("nomeUtilizador"));
                obj.setNivel(rs.getString("nivel"));
                
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
     public void eliminarUtilizador(Utilizador obj){
        try {
            //1º Criar o SQL para a ESPECIALIDADE
            String sql = "DELETE FROM utilizador WHERE codigo=?";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo() );
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Utilizador Eliminado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao eliminar o utilizador " +erro);
          }
    }
     
     public void efetuarLogin(String utilizador, String passe){
        try{
            String sql = "SELECT * FROM utilizador WHERE nomeUtilizador = ? AND palavraPasse = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, utilizador);
            stmt.setString(2, passe);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Seja Bem-vindo ao Sistema!");
                AreaTrabalho at = new AreaTrabalho();
                at.setVisible(true);
                Login lg = new Login();
                lg.dispose();
            } else {
                Login lg = new Login();
                JOptionPane.showMessageDialog(null, "Dados Inválidos");
                lg.setVisible(true);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro "+e);
        }
    }
     
     public int buscarCodigo(String utilizador){
        try{
            String sql = "SELECT codigo FROM utilizador WHERE nomeUtilizador = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, utilizador);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return rs.getInt("codigo");
            } else {
                return 0;
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro na busca do codigo "+e);
        }
        return 0;
    }
}

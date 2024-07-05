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
import sistema.model.Sala;
/**
 *
 * @author Wilson Lopes
 */
public class SalaDAO {
    
    final private Connection conexao;
    
    public SalaDAO(){
        this.conexao = new LigacaoBanco().estabelecerConexao();
    }
    
     public void salvarSala(Sala obj){
        try {
            //1º Criar o SQL para a SALA
            String sql = "INSERT INTO sala (numero, descricao, estado) VALUES (?,?,?)";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNumero());
            stmt.setString(2, obj.getDescricao());
            stmt.setString(3, obj.getEstado());
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Sala Cadastrada com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
     
     public void atualizarSala(Sala obj){
        try {
            //1º Criar o SQL para a SALA
            String sql = "UPDATE sala  SET descricao=?, estado=? WHERE numero=?";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setString(2, obj.getEstado());
            stmt.setString(3, obj.getNumero());
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Sala Atualizada com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
     
     public List<Sala> listarSala() {
        List<Sala> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM sala";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Sala obj = new Sala();
                obj.setNumero(rs.getString("numero"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setEstado(rs.getString("estado"));
                
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
     
     
     public List<Sala> filtrarSala(String numero) {
        List<Sala> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM sala WHERE numero like ? OR estado like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, numero);
            stmt.setString(2, numero);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Sala obj = new Sala();
                obj.setNumero(rs.getString("numero"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setEstado(rs.getString("estado"));
                
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
     
     public void eliminarSala(Sala obj){
         try {
             String sql = "DELETE FROM sala WHERE numero=?";
             PreparedStatement stmt = conexao.prepareStatement(sql);
             stmt.setString(1, obj.getNumero());
             stmt.execute();
             stmt.close();
             JOptionPane.showMessageDialog(null, "Eliminado com sucesso");
         } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null, "Erro ao eliminar a Sala " + erro);
         }
     }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sistema.jdbc.LigacaoBanco;
import sistema.model.Especialidade;
/**
 *
 * @author Wilson Lopes
 */
public class EspecialidadeDAO {
    
    final private Connection conexao;
    
    public EspecialidadeDAO(){
        this.conexao = new LigacaoBanco().estabelecerConexao();
    }
    
     public void salvarEspecialidade(Especialidade obj){
        try {
            //1º Criar o SQL para a ESPECIALIDADE
            String sql = "INSERT INTO especialidade (nome, descricao) VALUES (?,?)";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getDescricao());
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Especialidade Cadastrada com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
     
    public List<Especialidade> listarEspecialidade() {
        List<Especialidade> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM especialidade";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Especialidade obj = new Especialidade();
                obj.setCodigo(rs.getInt("codigo"));
                obj.setNome(rs.getString("nome"));
                obj.setDescricao(rs.getString("descricao"));
                
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
    
    public List<Especialidade> filtrarEspecialidade(String nome) {
        List<Especialidade> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM especialidade WHERE nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Especialidade obj = new Especialidade();
                obj.setCodigo(rs.getInt("codigo"));
                obj.setNome(rs.getString("nome"));
                obj.setDescricao(rs.getString("descricao"));
                
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
    
    public void atualizarEspecialidade(Especialidade obj){
        try {
            //1º Criar o SQL para a ESPECIALIDADE
            String sql = "UPDATE especialidade SET nome=?, descricao=? WHERE codigo=?";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getDescricao());
            stmt.setString(3, Integer.toString(obj.getCodigo()));
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Especialidade Atualizada com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a Especialidade " +erro);
          }
    }
    
    public void eliminarEspecialidade(Especialidade obj){
        try {
            //1º Criar o SQL para a ESPECIALIDADE
            String sql = "DELETE FROM especialidade WHERE codigo=?";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo() );
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Especialidade Eliminada com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao eliminar a Especialidade " +erro);
          }
    }
    
    
}

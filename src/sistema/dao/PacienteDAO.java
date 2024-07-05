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
import sistema.model.Paciente;
/**
 *
 * @author Wilson Lopes
 */
public class PacienteDAO {
    
    final private Connection conexao;
    
    public PacienteDAO(){
    this.conexao = new LigacaoBanco().estabelecerConexao();
}
    public void salvarPaciente(Paciente obj){
        try {
            String sql = "INSERT INTO paciente (numeroDoc, nome, dataNascimento, telefone, provincia, municipio, bairro)"
                    + " VALUES (?,?,?,?,?,?,?)";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNumeroDoc());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getDataNascimento());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getProvincia());
            stmt.setString(6, obj.getMunicipio());
            stmt.setString(7, obj.getBairro());
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Paciente Cadastrado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no cadastrado" +erro);
          }
    }
    
    public void atualizarPaciente(Paciente obj){
        try {
            String sql = "UPDATE paciente SET nome=?, dataNascimento=?, telefone=?, provincia=?,municipio=?, bairro=? WHERE numeroDoc=?";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getDataNascimento());
            stmt.setString(3, obj.getTelefone());
            stmt.setString(4, obj.getProvincia());
            stmt.setString(5, obj.getMunicipio());
            stmt.setString(6, obj.getBairro());
            stmt.setString(7, obj.getNumeroDoc());
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Paciente Atualizado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao Actualizar" +erro);
          }
    }
    
    public void eliminarPaciente(Paciente obj){
         try {
             String sql = "DELETE FROM paciente WHERE numeroDoc=?";
             PreparedStatement stmt = conexao.prepareStatement(sql);
             stmt.setString(1, obj.getNumeroDoc());
             stmt.execute();
             stmt.close();
             JOptionPane.showMessageDialog(null, "Paciente eliminado com sucesso");
         } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null, "Erro ao eliminar o Paciente " + erro);
         }
     }
    
    public List<Paciente> listarPaciente() {
        List<Paciente> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM paciente";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Paciente obj = new Paciente();
                obj.setNumeroDoc(rs.getString("numeroDoc"));
                obj.setNome(rs.getString("nome"));
                obj.setDataNascimento((rs.getString("dataNascimento")));
                obj.setTelefone(rs.getString("telefone"));
                obj.setProvincia(rs.getString("provincia"));
                obj.setMunicipio(rs.getString("municipio"));
                obj.setBairro(rs.getString("bairro"));
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
    
    public List<Paciente> filtrarPacientes(String filtro) {
        List<Paciente> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM paciente WHERE nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, filtro);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Paciente obj = new Paciente();
                obj.setNumeroDoc(rs.getString("numeroDoc"));
                obj.setNome(rs.getString("nome"));
                obj.setDataNascimento(rs.getString("dataNascimento"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setProvincia(rs.getString("provincia"));
                obj.setMunicipio(rs.getString("municipio"));
                obj.setBairro(rs.getString("bairro"));
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
}

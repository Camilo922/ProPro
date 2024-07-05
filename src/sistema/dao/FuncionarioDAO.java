/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.dao;


import javax.swing.JOptionPane;
import sistema.jdbc.LigacaoBanco;
import sistema.model.Funcionario;
import sistema.model.Medico;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import sistema.model.Especialidade;

/**
 *
 * @author Wilson Lopes
 */
public class FuncionarioDAO {  
    
    private Connection conexao;
    
    public FuncionarioDAO(){
        this.conexao = new LigacaoBanco().estabelecerConexao();
    }
    
    public void salvarFuncionario(Funcionario obj){
        try {
            //1º Criar o SQL para o funcionario 
            String sql = "INSERT INTO funcionario (nome, bi, cargo, horario, utilizador) VALUES (?,?,?,?,?)";
            //2º Preparar a Conexao com o Banco para o FUNCIONARIO
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getBi());
            stmt.setString(3, obj.getCargo());
            stmt.setString(4, obj.getHorario());
            stmt.setString(5, obj.getUtilizador());
            // 3º Executar o sql FUNCIONARIO
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
    
    public void atualizarFuncionario(Funcionario obj){
        try {
            //1º Criar o SQL para o funcionario 
            String sql = "UPDATE funcionario SET nome=?, bi=?, cargo=?, horario=?, utilizador=?";
            //2º Preparar a Conexao com o Banco para o FUNCIONARIO
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getBi());
            stmt.setString(3, obj.getCargo());
            stmt.setString(4, obj.getHorario());
            stmt.setString(5, obj.getUtilizador());
            // 3º Executar o sql FUNCIONARIO
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
    
    public void eliminarFuncionario(Funcionario obj){
        try {
            //1º Criar o SQL para a ESPECIALIDADE
            String sql = "DELETE FROM funcionario WHERE codigo=?";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo() );
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionario Eliminado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao eliminar o utilizador " +erro);
          }
    }
    
    public List<Funcionario> listarFuncionarios() {
        List<Funcionario> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM funcionario";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Funcionario obj = new Funcionario();
                Especialidade e = new Especialidade();
                obj.setCodigo(rs.getInt("codigo"));
                obj.setBi(rs.getString("bi"));
                obj.setCargo(rs.getString("cargo"));
                obj.setHorario(rs.getString("horario"));
                obj.setUtilizador(rs.getString("utilizador"));
                
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
    
    public int buscarCodigo(){
        try{
            String sql = "SELECT MAX(codigo) FROM funcionario";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
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

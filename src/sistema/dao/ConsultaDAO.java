/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.dao;

/**
 *
 * @author Camilo Molowony
 */
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistema.jdbc.LigacaoBanco;
import sistema.model.Consulta;

/**
 *
 * @author Wilson Lopes
 */
public class ConsultaDAO {
  final  private Connection conexao;
    
  public ConsultaDAO(){
        this.conexao = new LigacaoBanco().estabelecerConexao();
    }
  
  public void salvarConsulta(Consulta obj){
        try {
            //1º Criar o SQL para o MEDICO
            String sql = "INSERT INTO consulta (data, estado, tipo, paciente, medico, sala, hora, resultado ) VALUES (?,?,?,?,?,?,?,?)";
            //2º Preparar a Conexao com o Banco para o MEDICO
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, (obj.getData()));
            stmt.setString(2, (obj.getEstado()));
            stmt.setString(3, (obj.getTipo()));
            stmt.setString(4, (obj.getPaciente()));
            stmt.setInt(5, (obj.getMedico()));
            stmt.setString(6, (obj.getSala()));
            stmt.setString(7, (obj.getHora()));
            stmt.setString(8, (obj.getResultado()));
            
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Consulta Cadastrada com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
  public void atualizarConsulta(Consulta obj){
        try {
            //1º Criar o SQL para o MEDICO
            String sql = "UPDATE consulta SET data = ?, estado = ?, tipo = ?, paciente = ?, medico = ?, sala = ?, hora = ?, resultado = ? WHERE numero=?";
            //2º Preparar a Conexao com o Banco para o MEDICO
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, (obj.getData()));
            stmt.setString(2, (obj.getEstado()));
            stmt.setString(3, (obj.getTipo()));
            stmt.setString(4, (obj.getPaciente()));
            stmt.setInt(5, (obj.getMedico()));
            stmt.setString(6, (obj.getSala()));
            stmt.setString(7, (obj.getHora()));
            stmt.setString(8, (obj.getResultado()));
            stmt.setInt(9, (obj.getCodigo()));
            
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Consulta Atualizada com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
  public void eliminarConsulta(Consulta obj){
        try {
            //1º Criar o SQL para a ESPECIALIDADE
            String sql = "DELETE FROM consulta WHERE codigo = ?";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Consulta Eliminada com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao eliminar o consulta " +erro);
          }
    }
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistema.jdbc.LigacaoBanco;
import sistema.model.Medico;

/**
 *
 * @author Wilson Lopes
 */
public class MedicoDAO {
  final  private Connection conexao;
    
  public MedicoDAO(){
        this.conexao = new LigacaoBanco().estabelecerConexao();
    }
  
  public void salvarMedico(Medico obj){
        try {
            //1º Criar o SQL para o MEDICO
            String sql = "INSERT INTO medico (numero, funcionario, especialidade) VALUES (?,?,?)";
            //2º Preparar a Conexao com o Banco para o MEDICO
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Integer.toString(obj.getNumero()));
            stmt.setInt(2, (obj.getFuncionario().getCodigo()));
            stmt.setInt(3, (obj.getEspecialidade().getCodigo()));
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Médico Cadastrado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
  public void atualizarMedico(Medico obj){
        try {
            //1º Criar o SQL para o MEDICO
            String sql = "UPDATE medico SET funcionario=?, especialidade=? WHERE numero=?";
            //2º Preparar a Conexao com o Banco para o MEDICO
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, (obj.getFuncionario().getCodigo()));
            stmt.setInt(2, (obj.getEspecialidade().getCodigo()));
            stmt.setString(3, Integer.toString(obj.getNumero()));
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Médico Atualizado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
  public void eliminarMedico(Medico obj){
        try {
            //1º Criar o SQL para a ESPECIALIDADE
            String sql = "DELETE FROM medico WHERE numero=?";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, obj.getNumero());
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Medico Eliminado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao eliminar o médico " +erro);
          }
    }
    
}

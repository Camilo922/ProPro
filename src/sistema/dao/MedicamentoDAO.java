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
import sistema.model.Medicamento;
/**
 *
 * @author Wilson Lopes
 */
public class MedicamentoDAO {
    
    final private Connection conexao;
    
    public MedicamentoDAO() {
        this.conexao = new LigacaoBanco().estabelecerConexao();
    }
    
     public void salvarMedicamento(Medicamento obj){
        try {
            String sql = "INSERT INTO medicamento (nome) VALUES (?)";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Medicamento Cadastrado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
     
     public void atualizarMedicamento(Medicamento obj){
        try {
            String sql = "UPDATE medicamento  SET nome=? WHERE codigo=?";
            //2º Preparar a Conexao com o Banco
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setInt(2, obj.getCodigo());
            // 3º Executar o sql
            stmt.execute();
            // 4º Fechar Conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Medicamento Atualizado com Sucesso");
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro " +erro);
          }
    }
     
     public List<Medicamento> listarMedicamento() {
        List<Medicamento> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM medicamento";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
                Medicamento obj = new Medicamento();
                obj.setCodigo(Integer.parseInt(rs.getString("codigo")));
                obj.setNome(rs.getString("nome"));
                
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
     
     
     public List<Medicamento> filtrarMedicamento(String codigo) {
        List<Medicamento> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM medicamento WHERE codigo like ? OR nome like ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, codigo);
            stmt.setString(2, codigo);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {                
               Medicamento obj = new Medicamento();
                obj.setCodigo(Integer.parseInt(rs.getString("codigo")));
                obj.setNome(rs.getString("nome"));
                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista "+erro);
        }
        return null;
    }
     
     public void eliminarMedicamento(Medicamento obj){
         try {
             String sql = "DELETE FROM medicamento WHERE codigo=?";
             PreparedStatement stmt = conexao.prepareStatement(sql);
             stmt.setInt(1, obj.getCodigo());
             stmt.execute();
             stmt.close();
             JOptionPane.showMessageDialog(null, "Eliminado com sucesso");
         } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null, "Erro ao eliminar o medicamento " + erro);
         }
     }
}

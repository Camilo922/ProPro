/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Wilson Lopes
 */
public class LigacaoBanco {
    final private String url = "jdbc:mysql://localhost:3306/girassol";
    final private String usuario = "root";
    final private String senha = "922566239";
    
    public Connection estabelecerConexao(){
        try{
            return DriverManager.getConnection(url,usuario,senha);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao estabelecer conexão com o Banco de Dados!"+e);
        }
        return null;
    }
    
}

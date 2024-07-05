/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wilson Lopes
 */
public class TestarConexao {
    
    public static void main(String[] args){
        try {
            new LigacaoBanco().estabelecerConexao();
            JOptionPane.showMessageDialog(null, "Conectado com Sucesso ao Banco de Dados Girassol!");
        } catch (HeadlessException erro) {
            JOptionPane.showMessageDialog(null,"Erro ao Conectar com o Banco de Dados" + erro.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.utilitarios;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Wilson Lopes
 */
public class Utilitarios {
    public void limpaTela(JPanel container){
        Component components[] = container.getComponents();
        for (Component c : components){
            if (c instanceof JTextField) {
                ((JTextField)c).setText(null);
            }
             if (c instanceof JTextArea) {
                ((JTextArea)c).setText(null);
            }
        }
    }
}

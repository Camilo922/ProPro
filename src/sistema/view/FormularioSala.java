/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import sistema.dao.EspecialidadeDAO;
import sistema.dao.SalaDAO;
import sistema.model.Especialidade;
import sistema.model.Sala;
import sistema.utilitarios.Utilitarios;

/**
 *
 * @author Wilson Lopes
 */
public class FormularioSala extends javax.swing.JFrame {

   public void listar(){
        SalaDAO dao = new SalaDAO();
        List<Sala> lista = dao.listarSala();
        DefaultTableModel dados = (DefaultTableModel) tbSalaR.getModel();
        dados.setRowCount(0);
        
        for (Sala s : lista) {
            dados.addRow(new Object[]{
                s.getNumero(),
                s.getDescricao(),
                s.getEstado()
            });
        }
    }
    
    public FormularioSala() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelGuias = new javax.swing.JTabbedPane();
        jpDadosSala = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        checkLivre = new javax.swing.JCheckBox();
        checkOcupado = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNumPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSalaR = new javax.swing.JTable();
        btnNovo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(27, 10, 7));

        jLabel1.setBackground(new java.awt.Color(27, 10, 7));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SALAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        painelGuias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jpDadosSala.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Descrição");
        jpDadosSala.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpDadosSala.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 340, 30));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/add_plus_icon.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNovo.setIconTextGap(2);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jpDadosSala.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 35));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/save_icon (2).png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalvar.setIconTextGap(2);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jpDadosSala.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 100, 35));

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/refresh_icon.png"))); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setIconTextGap(2);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jpDadosSala.add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 130, 35));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/dustbin_bin_trush_icon.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jpDadosSala.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, 35));

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDescricao.setRows(5);
        jpDadosSala.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 340, -1));
        jpDadosSala.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 340, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Estado da Sala");

        checkLivre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkLivre.setSelected(true);
        checkLivre.setText("Livre");
        checkLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLivreActionPerformed(evt);
            }
        });

        checkOcupado.setText("Ocupado");
        checkOcupado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOcupadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        checkLivre.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (checkLivre.isSelected()) {
                    checkOcupado.setSelected(false);
                }else {
                    checkOcupado.setSelected(true);
                }
            }
        });
        checkOcupado.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (checkOcupado.isSelected()) {
                    checkLivre.setSelected(false);
                }else {
                    checkLivre.setSelected(true);
                }
            }
        });

        jpDadosSala.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 260, 110));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Identificador da Sala");
        jpDadosSala.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        painelGuias.addTab("Registro de Sala", jpDadosSala);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Número");

        txtNumPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumPesquisaKeyReleased(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/search_icon (2).png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        tbSalaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Descricao", "Estado"
            }
        ));
        tbSalaR.setAutoscrolls(false);
        tbSalaR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSalaRMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSalaR);

        btnNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/add_plus_icon.png"))); // NOI18N
        btnNovo1.setText("NOVO");
        btnNovo1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNovo1.setIconTextGap(2);
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnNovo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        painelGuias.addTab("Lista de Salas Registradas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 335, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       listar();
    }//GEN-LAST:event_formWindowActivated

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        painelGuias.setSelectedIndex(0);
        Utilitarios util = new Utilitarios();
        util.limpaTela(jpDadosSala);
    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void tbSalaRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSalaRMouseClicked
        painelGuias.setSelectedIndex(0);
        txtNumero.setText(tbSalaR.getValueAt(tbSalaR.getSelectedRow(), 0).toString());
        txtDescricao.setText(tbSalaR.getValueAt(tbSalaR.getSelectedRow(), 1).toString());
        if (tbSalaR.getValueAt(tbSalaR.getSelectedRow(), 2).toString().equals("Livre")) {
            checkLivre.setSelected(true);
            checkOcupado.setSelected(false);
        } else{
            checkOcupado.setSelected(true);
            checkLivre.setSelected(false);
        }
    }//GEN-LAST:event_tbSalaRMouseClicked

    private void checkOcupadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOcupadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkOcupadoActionPerformed

    private void checkLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLivreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLivreActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Sala obj = new Sala();
        obj.setNumero(txtNumero.getText());
        SalaDAO dao = new SalaDAO();
        dao.eliminarSala(obj);
        Utilitarios util = new Utilitarios();
        util.limpaTela(jpDadosSala);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Sala obj = new Sala();
        obj.setNumero(txtNumero.getText());
        obj.setDescricao(txtDescricao.getText());
        if (checkLivre.isSelected()) {
           obj.setEstado(checkLivre.getText()); 
        } else {
            obj.setEstado(checkOcupado.getText());
        }
        SalaDAO objSalaDAO = new SalaDAO();
        objSalaDAO.atualizarSala(obj);
        Utilitarios util = new Utilitarios();
        util.limpaTela(jpDadosSala);
        checkOcupado.setSelected(false);
        checkLivre.setSelected(true);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Sala obj = new Sala();
        obj.setNumero(txtNumero.getText());
        obj.setDescricao(txtDescricao.getText());
        if (checkLivre.isSelected()) {
           obj.setEstado(checkLivre.getText()); 
        } else {
            obj.setEstado(checkOcupado.getText());
        }
        
        SalaDAO objSalaDAO = new SalaDAO();
        objSalaDAO.salvarSala(obj);
        Utilitarios util = new Utilitarios();
        util.limpaTela(jpDadosSala);
       checkOcupado.setSelected(false);
       checkLivre.setSelected(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        painelGuias.setSelectedIndex(0);
        Utilitarios util = new Utilitarios();
        util.limpaTela(jpDadosSala);
        checkLivre.setSelected(true);
        checkOcupado.setSelected(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String numero = "%"+ txtNumPesquisa.getText() + "%";
        SalaDAO dao = new SalaDAO();
        List<Sala> lista = dao.filtrarSala(numero);
        DefaultTableModel dados = (DefaultTableModel) tbSalaR.getModel();
        dados.setRowCount(0);
        
        for (Sala s : lista) {
            dados.addRow(new Object[]{
                s.getNumero(),
                s.getDescricao(),
                s.getEstado()
            });
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtNumPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumPesquisaKeyReleased
       String numero = "%"+ txtNumPesquisa.getText() + "%";
        SalaDAO dao = new SalaDAO();
        List<Sala> lista = dao.filtrarSala(numero);
        DefaultTableModel dados = (DefaultTableModel) tbSalaR.getModel();
        dados.setRowCount(0);
        
        for (Sala s : lista) {
            dados.addRow(new Object[]{
                s.getNumero(),
                s.getDescricao(),
                s.getEstado()
            });
        }
    }//GEN-LAST:event_txtNumPesquisaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioSala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkLivre;
    private javax.swing.JCheckBox checkOcupado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jpDadosSala;
    private javax.swing.JTabbedPane painelGuias;
    private javax.swing.JTable tbSalaR;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNumPesquisa;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}

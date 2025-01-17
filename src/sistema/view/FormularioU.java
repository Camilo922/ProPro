/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistema.view;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistema.dao.UtilizadorDAO;
import sistema.model.Utilizador;
import sistema.utilitarios.Utilitarios;

/**
 *
 * @author Wilson Lopes
 */
public class FormularioU extends javax.swing.JFrame {

     public void listar(){
        UtilizadorDAO dao = new UtilizadorDAO();
        List<Utilizador> lista = dao.listarUtilizador();
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setRowCount(0);
        
        for (Utilizador e : lista) {
            dados.addRow(new Object[]{
                e.getCodigo(),
                e.getNomeUtilizador(),
                e.getPalavraPasse(),
                e.getNivel()
            });
        }
    }
    public FormularioU() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelGuias = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jpDadosEspecialidades = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        lblcodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPasse1 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        cbxAutorizacao = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jLabel1.setText("UTILIZADORES DO SISTEMA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel1)
                .addContainerGap(392, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        painelGuias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Nome do utilizador");

        txtPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
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

        tabela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Utilizador", "Palavra Passe", "Nível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setAutoscrolls(false);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        painelGuias.addTab("Lista de Usuários", jPanel3);

        jpDadosEspecialidades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome do utilizador");
        jpDadosEspecialidades.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpDadosEspecialidades.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 340, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/save_icon (2).png"))); // NOI18N
        jButton5.setText("SALVAR");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.setIconTextGap(2);
        jpDadosEspecialidades.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 100, 35));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/delete_icon.png"))); // NOI18N
        jButton8.setText("ELIMINAR");
        jpDadosEspecialidades.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, 35));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/add_plus_icon.png"))); // NOI18N
        jButton9.setText("NOVO");
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton9.setIconTextGap(2);
        jpDadosEspecialidades.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 90, 35));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/refresh_icon.png"))); // NOI18N
        jButton10.setText("EDITAR");
        jButton10.setIconTextGap(2);
        jpDadosEspecialidades.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 100, 35));

        lblcodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblcodigo.setText("Código");
        jpDadosEspecialidades.add(lblcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 70, 20));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpDadosEspecialidades.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 110, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Palavra-Passe");
        jpDadosEspecialidades.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtPasse1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpDadosEspecialidades.add(txtPasse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Nível Autorização");
        jpDadosEspecialidades.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        cbxAutorizacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxAutorizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Básico", "Elementar", "Administrador", " " }));
        jpDadosEspecialidades.add(cbxAutorizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 150, 30));

        painelGuias.addTab("Registro de Usuários", jpDadosEspecialidades);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/add_plus_icon.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNovo.setIconTextGap(2);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/save_icon (2).png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalvar.setIconTextGap(2);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/refresh_icon.png"))); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.setIconTextGap(2);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/imagens/icones/dustbin_bin_trush_icon.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnNovo)
                        .addGap(100, 100, 100)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnAtualizar)
                        .addGap(93, 93, 93)
                        .addComponent(btnEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        String nome = "%"+ txtPesquisa.getText() + "%";
        UtilizadorDAO dao = new UtilizadorDAO();
        List<Utilizador> lista = dao.filtrarUtilizador(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setRowCount(0);

        for (Utilizador e : lista) {
            dados.addRow(new Object[]{
                e.getCodigo(),
                e.getNomeUtilizador(),
                e.getPalavraPasse(),
                e.getNivel()
            });
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nome = "%"+ txtPesquisa.getText() + "%";
        UtilizadorDAO dao = new UtilizadorDAO();
        List<Utilizador> lista = dao.filtrarUtilizador(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setRowCount(0);

        for (Utilizador e : lista) {
            dados.addRow(new Object[]{
                e.getCodigo(),
                e.getNomeUtilizador(),
                e.getPalavraPasse(),
                e.getNivel()
            });
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        painelGuias.setSelectedIndex(1);
        txtNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        txtPasse1.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        txtCodigo.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        cbxAutorizacao.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(), 3));
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        painelGuias.setSelectedIndex(1);
        Utilitarios util = new Utilitarios();
        util.limpaTela(jpDadosEspecialidades);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        Utilizador u = new Utilizador();
        
            u.setNomeUtilizador(txtNome.getText());
            u.setPalavraPasse(txtPasse1.getPassword().toString());
            u.setNivel(cbxAutorizacao.getSelectedItem().toString());
            UtilizadorDAO uDAO = new UtilizadorDAO();
            uDAO.salvarUtilizador(u);
            JOptionPane.showMessageDialog(null, "Utilizador criado com sucesso");
         
        Utilitarios util = new Utilitarios();
        util.limpaTela(jpDadosEspecialidades);

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Utilizador u = new Utilizador();
        
            u.setNomeUtilizador(txtNome.getText());
            u.setPalavraPasse(txtPasse1.getPassword().toString());
            u.setNivel(cbxAutorizacao.getSelectedItem().toString());
            u.setCodigo(Integer.parseInt(txtCodigo.getText()));
            UtilizadorDAO uDAO = new UtilizadorDAO();
            uDAO.atualizarUtilizador(u);
        Utilitarios util = new Utilitarios();
        util.limpaTela(jpDadosEspecialidades);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Utilizador u = new Utilizador();
        u.setCodigo(Integer.parseInt(txtCodigo.getText()));
        UtilizadorDAO dao = new UtilizadorDAO();
        dao.eliminarUtilizador(u);
        Utilitarios util = new Utilitarios();
        util.limpaTela(jpDadosEspecialidades);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxAutorizacao;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpDadosEspecialidades;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JTabbedPane painelGuias;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPasse1;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}

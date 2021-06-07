package visao;

import connection.ConnectionFactory;
import java.awt.CardLayout;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaMenu extends javax.swing.JFrame {
    public TelaMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPrincipal = new javax.swing.JPanel();
        jCard1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCard2 = new javax.swing.JPanel();
        jCard3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRMedic = new javax.swing.JButton();
        btnRFunc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        lblWelcome1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jPrincipal.setMaximumSize(new java.awt.Dimension(600, 454));
        jPrincipal.setLayout(new java.awt.CardLayout());

        jCard1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icons/menu.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 454));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 454));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 454));

        javax.swing.GroupLayout jCard1Layout = new javax.swing.GroupLayout(jCard1);
        jCard1.setLayout(jCard1Layout);
        jCard1Layout.setHorizontalGroup(
            jCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCard1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 82, Short.MAX_VALUE))
        );
        jCard1Layout.setVerticalGroup(
            jCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCard1Layout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPrincipal.add(jCard1, "card1");

        jCard2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jCard2Layout = new javax.swing.GroupLayout(jCard2);
        jCard2.setLayout(jCard2Layout);
        jCard2Layout.setHorizontalGroup(
            jCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        jCard2Layout.setVerticalGroup(
            jCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        jPrincipal.add(jCard2, "card2");

        jCard3.setBackground(new java.awt.Color(255, 255, 255));
        jCard3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icons/relatorio.png"))); // NOI18N

        btnRMedic.setBackground(new java.awt.Color(248, 176, 30));
        btnRMedic.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        btnRMedic.setForeground(new java.awt.Color(255, 255, 255));
        btnRMedic.setText("RELATORIO MEDICAMENTO");
        btnRMedic.setBorder(null);
        btnRMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRMedicActionPerformed(evt);
            }
        });

        btnRFunc.setBackground(new java.awt.Color(248, 176, 30));
        btnRFunc.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        btnRFunc.setForeground(new java.awt.Color(255, 255, 255));
        btnRFunc.setText("RELATORIO FUNCIONARIO");
        btnRFunc.setBorder(null);
        btnRFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCard3Layout = new javax.swing.GroupLayout(jCard3);
        jCard3.setLayout(jCard3Layout);
        jCard3Layout.setHorizontalGroup(
            jCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCard3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCard3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );
        jCard3Layout.setVerticalGroup(
            jCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCard3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(btnRMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPrincipal.add(jCard3, "card3");

        jPanel2.setBackground(new java.awt.Color(143, 195, 255));
        jPanel2.setForeground(new java.awt.Color(66, 52, 152));

        lblWelcome.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("PHARMACY");

        btnSair.setBackground(new java.awt.Color(143, 195, 255));
        btnSair.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("SAIR");
        btnSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSobre.setBackground(new java.awt.Color(255, 255, 255));
        btnSobre.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        btnSobre.setForeground(new java.awt.Color(143, 195, 255));
        btnSobre.setText("SOBRE");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btnRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        btnRelatorio.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        btnRelatorio.setForeground(new java.awt.Color(143, 195, 255));
        btnRelatorio.setText("RELATORIO");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(143, 195, 255));
        btnCadastro.setText("MEDICAMENTO");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        lblWelcome1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblWelcome1.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome1.setText("Dev");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblWelcome1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblWelcome)
                        .addGap(12, 12, 12))
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSobre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWelcome1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        // MOSTRANDO TELA SOBRE
        new TelaSobre().setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // SAINDO DO SISTEMA
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed

        // MUDANDO PARA O CARD COM CADASTRO
        CardLayout cl = (CardLayout) jPrincipal.getLayout();
        cl.show(jPrincipal, "card2");
        
        // MOSTRANDO TELA CADASTRO
        TelaCadastro telaCad = new TelaCadastro();
        jCard2.add(telaCad);
        telaCad.setVisible(true);
        
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
         // MUDANDO PARA O CARD COM RELATORIO
        CardLayout cl = (CardLayout) jPrincipal.getLayout();
        cl.show(jPrincipal, "card3");
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnRMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRMedicActionPerformed
    // IMPRIMINDO RELATORIO
        // ABRINDO CONEXAO
        Connection con = ConnectionFactory.getConnection();
        
        // LOCAL DO MODELO
        String src = "RelatorioMedicamento.jasper";
        
        JasperPrint jasperPrint = null;
        try {
            // LENDO BANCO DE DADOS
            jasperPrint = JasperFillManager.fillReport(src, null, con);
        } catch (JRException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // MOSTRANDO MODELO NA TELA
        JasperViewer view = new JasperViewer(jasperPrint,false);
        
        view.setVisible(true);
    }//GEN-LAST:event_btnRMedicActionPerformed

    private void btnRFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRFuncActionPerformed
        // IMPRIMINDO RELATORIO
        Connection con = ConnectionFactory.getConnection();
        String src = "RelatorioFuncionario.jasper";
        
        JasperPrint jasperPrint = null;
        try {
            jasperPrint = JasperFillManager.fillReport(src, null, con);
        } catch (JRException ex) {
            Logger.getLogger(TelaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer view = new JasperViewer(jasperPrint,false);
        
        view.setVisible(true);
    }//GEN-LAST:event_btnRFuncActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnRFunc;
    private javax.swing.JButton btnRMedic;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSobre;
    private javax.swing.JPanel jCard1;
    private javax.swing.JPanel jCard2;
    private javax.swing.JPanel jCard3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPrincipal;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblWelcome1;
    // End of variables declaration//GEN-END:variables
}

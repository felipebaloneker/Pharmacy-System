package visao;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import model.Medicamento;
import dao.MedicamentoDao;

public class TelaCadastro extends javax.swing.JInternalFrame {
    public TelaCadastro() {
        initComponents();
        
        //ORDERNA TABELA
        DefaultTableModel model = (DefaultTableModel) jtMedicamento.getModel();
        jtMedicamento.setRowSorter(new TableRowSorter(model));
        
        // LENDO TABELA AO INICIAR
        readTable();
    }
    
    //FUNCAO PARA APAGAR FILDSET
    public void apagarTxt()
    {
        txtDesc.setText("");
        txtPreco.setText("");
        txtQtd.setText("");
        txtFind.setText("");
    }
    
    
    // FUNCAO PARA LER A TABELA
    public void readTable()
    {
        DefaultTableModel model = (DefaultTableModel) jtMedicamento.getModel();
        // IMPEDIR VIZUALIZACAO DUPLICADA
        model.setNumRows(0);
        MedicamentoDao mdao = new MedicamentoDao();
        
        //PERCORENDO A LISTA DE MEDICAMENTO
        for(Medicamento m: mdao.read())
        {
            model.addRow(new Object[]{
                m.getId(),
                m.getDescricao(),
                m.getQtd(),
                m.getPreco()
            });
        }
    }
    
    // FUNCAO PARA BUSCAR MEDICAMENTO 
    public void find(String desc)
    {
        DefaultTableModel model = (DefaultTableModel) jtMedicamento.getModel();
        // IMPEDIR VIZUALIZACAO DUPLICADA
        model.setNumRows(0);
        MedicamentoDao mdao = new MedicamentoDao();
        
        //PERCORENDO A LISTA DE MEDICAMENTO
        for(Medicamento m: mdao.find(desc))
        {
            model.addRow(new Object[]{
                m.getId(),
                m.getDescricao(),
                m.getQtd(),
                m.getPreco()
            });
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCadastra = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtFind = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMedicamento = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setTitle("MEDICAMENTO");
        setPreferredSize(new java.awt.Dimension(665, 454));

        jPanel1.setBackground(new java.awt.Color(215, 233, 255));

        btnCadastra.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastra.setForeground(new java.awt.Color(110, 152, 200));
        btnCadastra.setText("CADASTRAR");
        btnCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setForeground(new java.awt.Color(110, 152, 200));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setForeground(new java.awt.Color(110, 152, 200));
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setForeground(new java.awt.Color(110, 152, 200));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtFind.setBackground(new java.awt.Color(255, 255, 255));

        txtPreco.setBackground(new java.awt.Color(255, 255, 255));

        txtQtd.setBackground(new java.awt.Color(255, 255, 255));

        txtDesc.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(110, 152, 200));
        jLabel1.setText("Descrição");

        jLabel2.setForeground(new java.awt.Color(110, 152, 200));
        jLabel2.setText("Qtd");

        jLabel3.setForeground(new java.awt.Color(110, 152, 200));
        jLabel3.setText("Preço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar)
                .addGap(18, 18, 18)
                .addComponent(txtFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastra)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnBuscar)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jtMedicamento.setBackground(new java.awt.Color(255, 255, 255));
        jtMedicamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Descrição", "Qtd", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMedicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMedicamentoMouseClicked(evt);
            }
        });
        jtMedicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtMedicamentoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtMedicamento);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastraActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCadastraActionPerformed
        // ADICIONANDO COLUNAS AO BANCO
        Medicamento m = new Medicamento();
        MedicamentoDao dao = new MedicamentoDao();
        
        //PEGANDO VALORES NA TELA
        m.setDescricao(txtDesc.getText());
        m.setQtd(Integer.parseInt(txtQtd.getText()));
        m.setPreco(Double.parseDouble(txtPreco.getText()));
        
        //INSERINDO NO BANCO
        dao.create(m);
        
        // RELENDO TABELA APOS CADASTRAR E APAGANDO FILDSET
        readTable();
        apagarTxt();
        
    }//GEN-LAST:event_btnCadastraActionPerformed

    private void btnExcluirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // EXCLUINDO COLUNAS DO BANCO
        if(jtMedicamento.getSelectedRow() != -1)
        {
            // ADICIONANDO COLUNAS NO BANCO DE DADOS
            Medicamento m = new Medicamento();
            MedicamentoDao mdao= new MedicamentoDao();
            
            //PEGANDO VALORES NA TELA
            m.setId((int)jtMedicamento.getValueAt(jtMedicamento.getSelectedRow(), 0));
            
            //DELETANDO DO BANCO
            mdao.delete(m);
            
            //APAGAR TEXTO NO FILDSET
            apagarTxt();
            
            // RELENDO TABELA APOS EXCLUIR
            readTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione um medicamento para excluir!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jtMedicamentoKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jtMedicamentoKeyPressed
        // PEGANDO VALORES DA COLUNA SELECIONADA PELO MOUSE
        if(jtMedicamento.getSelectedRow() != -1)
        {
            txtDesc.setText(jtMedicamento.getValueAt(jtMedicamento.getSelectedRow(),1).toString());
            txtQtd.setText(jtMedicamento.getValueAt(jtMedicamento.getSelectedRow(),2).toString());
            txtPreco.setText(jtMedicamento.getValueAt(jtMedicamento.getSelectedRow(),3).toString());
        }
    }//GEN-LAST:event_jtMedicamentoKeyPressed

    private void jtMedicamentoMouseClicked(MouseEvent evt) {//GEN-FIRST:event_jtMedicamentoMouseClicked
        // PEGANDO VALORES DA COLUNA SELECIONADA PELO MOUSE
        if(jtMedicamento.getSelectedRow() != -1)
        {
            txtDesc.setText(jtMedicamento.getValueAt(jtMedicamento.getSelectedRow(),1).toString());
            txtQtd.setText(jtMedicamento.getValueAt(jtMedicamento.getSelectedRow(),2).toString());
            txtPreco.setText(jtMedicamento.getValueAt(jtMedicamento.getSelectedRow(),3).toString());
        }
    }//GEN-LAST:event_jtMedicamentoMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
       // ALTERANDO VALORES DA COLUNA
       if(jtMedicamento.getSelectedRow() != -1)
       {
           // ATUALIZANDO COLUNAS
           Medicamento m = new Medicamento();
           MedicamentoDao mdao = new MedicamentoDao();
           
           // PEGANDO VALORES NA TELA
           m.setDescricao(txtDesc.getText());
           m.setQtd(Integer.parseInt(txtQtd.getText()));
           m.setPreco(Double.parseDouble(txtPreco.getText()));
           m.setId((int)jtMedicamento.getValueAt(jtMedicamento.getSelectedRow(), 0));
           
           // ATUALIZANDO BANCO
           mdao.update(m);
           
           //APAGANDO FILDSET RELENDO TABELA
           apagarTxt();
           readTable();
       }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         // ATUALIZANDO COLUNAS
         find(txtFind.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastra;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMedicamento;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}

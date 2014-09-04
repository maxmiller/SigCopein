/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.view;

import br.edu.ifrn.sigcopein.bean.Servidor;
import br.edu.ifrn.sigcopein.bean.ServidorProjeto;
import br.edu.ifrn.sigcopein.bean.Banco;
import br.edu.ifrn.sigcopein.bean.Projeto;
import br.edu.ifrn.sigcopein.combo.BancoComboBox;
import br.edu.ifrn.sigcopein.services.ServidorProjetoService;
import br.edu.ifrn.sigcopein.services.ServidorService;
import br.edu.ifrn.sigcopein.services.BancoService;
import br.edu.ifrn.sigcopein.services.ProjetoService;
import br.edu.ifrn.sigcopein.util.DateUtil;
import br.edu.ifrn.sigcopein.util.SigUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author 1935921
 */
public class ViewIncluirEditarServidorProjeto extends javax.swing.JDialog {

    /**
     * Creates new form ViewIncluirEditarProjeto
     */
    private Projeto projeto;
    private ProjetoService service;
    private Servidor servidor;
    private ServidorService servidorservice;
    private ServidorProjeto servidorprojeto;
    private ServidorProjetoService apservice;
    private byte[] arquivo;
    private String filename;

    public ViewIncluirEditarServidorProjeto(java.awt.Frame parent, boolean modal, ServidorProjeto s) {
        super(parent, modal);
        initComponents();
        carregarBanco();
        dtFim.setDate(null);
        if (s == null) {
            servidorprojeto = new ServidorProjeto();
        } else {

            txtNome.setText(s.getServidorId().getNome());
            txtSiape.setText(s.getServidorId().getSiape());
            txtAgencia.setText(s.getAgencia());
            txtCH.setText(String.valueOf(s.getCargaHoraria()));
            txtNomeProjeto.setText(s.getProjetoId().getNome());
            txtCodigoProjeto.setText(s.getProjetoId().getProjetoId().toString());
            txtConta.setText(s.getConta());
            filename = s.getNomeAnexo();
            arquivo = s.getAnexo();
            lbArquivo.setText(filename);
            dtInicio.setDate((s.getDataInicio()));
            if(s.getDataFim()!=null){
                dtFim.setDate((s.getDataFim()));
            }
            cbBanco.setSelectedItem(s.getBancoId());
            if(s.getBolsista()){
                cbBolsista.setSelectedIndex(0);
            }else{
                cbBolsista.setSelectedIndex(1);
            }
            servidorprojeto = s;
        }
        service = new ProjetoService();
        servidorservice = new ServidorService();
        apservice = new ServidorProjetoService();
        
        
    }
    
    private void  carregarBanco(){
        BancoComboBox cb = new BancoComboBox();
        cbBanco.setModel(cb);
        cbBanco.setSelectedIndex(-1);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSiape = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btArquivo = new javax.swing.JButton();
        lbArquivo = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtCodigoProjeto = new javax.swing.JFormattedTextField();
        btnPesquisarProjeto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNomeProjeto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbBolsista = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCH = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbBanco = new javax.swing.JComboBox();
        txtAgencia = new javax.swing.JTextField();
        txtConta = new javax.swing.JTextField();
        dtInicio = new com.toedter.calendar.JDateChooser();
        dtFim = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecionar Aluno do Projeto"));

        jLabel1.setText("MATRICULA:");

        jLabel2.setText("SERVIDOR:");

        jLabel3.setText("CÓDIGO PROJETO:");

        txtSiape.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#######"))));

        txtNome.setEnabled(false);

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("TERMO DO ALUNO:");

        btArquivo.setText("Selecione ");
        btArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArquivoActionPerformed(evt);
            }
        });

        lbArquivo.setText("Nenhum arquivo selecionado");

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/sigcopein/images/lupa.png"))); // NOI18N
        btnPesquisar.setMaximumSize(new java.awt.Dimension(47, 20));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(47, 20));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtCodigoProjeto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#######"))));

        btnPesquisarProjeto.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisarProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/sigcopein/images/lupa.png"))); // NOI18N
        btnPesquisarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProjetoActionPerformed(evt);
            }
        });

        jLabel4.setText("NOME DO PROJETO:");

        txtNomeProjeto.setEnabled(false);

        jLabel6.setText("VÍNCULO:");

        cbBolsista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BOLSISTA", "VOLUNTÁRIO" }));

        jLabel7.setText("ÍNICIO:");

        jLabel8.setText("FIM:");

        jLabel9.setText("CARGA-HORÁRIA:");

        txtCH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#######"))));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Bancários"));

        jLabel10.setText("AGENCIA:");

        jLabel11.setText("CONTA:");

        jLabel12.setText("BANCO:");

        cbBanco.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomeProjeto)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNome)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtFim, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCH, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBolsista, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisarProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSiape, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jButton2)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lbArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtSiape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarProjeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(cbBolsista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(txtCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(dtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(btArquivo)
                    .addComponent(lbArquivo))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPesquisar, btnPesquisarProjeto});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (arquivo != null) {
            servidorprojeto.setAnexo(arquivo);
            servidorprojeto.setNomeAnexo(filename);
        }
        if (servidor != null) {
            servidorprojeto.setServidorId(servidor);
        }
        if (projeto != null) {
            servidorprojeto.setProjetoId(projeto);
        }
        if(cbBolsista.getSelectedItem().toString().equalsIgnoreCase(SigUtils.BOLSISTA)){
            servidorprojeto.setBolsista(true);
        }else{
            servidorprojeto.setBolsista(false);
        }
        if(cbBolsista.getSelectedItem()!=null){
            servidorprojeto.setBancoId((Banco)cbBanco.getSelectedItem());
        }
        servidorprojeto.setConta(txtConta.getText());
        servidorprojeto.setAgencia(txtAgencia.getText());
        servidorprojeto.setDataInicio(dtInicio.getDate());
        servidorprojeto.setDataFim(dtFim.getDate());
        servidorprojeto.setCargaHoraria(Integer.parseInt(txtCH.getText()));
        if (servidorprojeto.getServidorProjetoId() != null) {
            apservice.update(servidorprojeto);
        } else {
            apservice.save(servidorprojeto);
        }
        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArquivoActionPerformed
        try {
            // TODO add your handling code here:
            JFileChooser j = new JFileChooser();
            j.showDialog(this, "Selecionar arquivo");
            arquivo = Files.readAllBytes(j.getSelectedFile().toPath());
            filename = j.getSelectedFile().getName();
            lbArquivo.setText(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btArquivoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        if (txtSiape.getText().length() == 14) {
            servidor = servidorservice.findBySiape(txtSiape.getText());
            if (servidor != null) {
                txtNome.setText(servidor.getNome());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Matricula incorreta");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProjetoActionPerformed
        // TODO add your handling code here:
        if (!txtCodigoProjeto.getText().isEmpty()) {
            projeto = service.findById(Integer.parseInt(txtCodigoProjeto.getText()));
            if (projeto != null) {
                txtNomeProjeto.setText(projeto.getNome());
            } else {
                JOptionPane.showMessageDialog(this, "Projeto não localizado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Código incorreta");
        }

    }//GEN-LAST:event_btnPesquisarProjetoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btArquivo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarProjeto;
    private javax.swing.JComboBox cbBanco;
    private javax.swing.JComboBox cbBolsista;
    private com.toedter.calendar.JDateChooser dtFim;
    private com.toedter.calendar.JDateChooser dtInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbArquivo;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JFormattedTextField txtCH;
    private javax.swing.JFormattedTextField txtCodigoProjeto;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeProjeto;
    private javax.swing.JFormattedTextField txtSiape;
    // End of variables declaration//GEN-END:variables
}

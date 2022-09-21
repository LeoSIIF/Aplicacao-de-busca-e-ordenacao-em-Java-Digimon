package javasort;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {

    ArrayList<Dados> lista = new ArrayList<>();
    Comparator<Dados> comparaNumero = (Dados a1, Dados a2) -> a1.getNumero() - a2.getNumero();
    Comparator<Dados> comparaDigimon = (Dados a1, Dados a2) -> a1.getDigimon().compareTo(a2.getDigimon());
    Comparator<Dados> comparaEstagio = (Dados a1, Dados a2) -> a1.getEstagio().compareTo(a2.getEstagio());
    Comparator<Dados> comparaTipo = (Dados a1, Dados a2) -> a1.getTipo().compareTo(a2.getTipo());
    Comparator<Dados> comparaAtributo = (Dados a1, Dados a2) -> a1.getAtributo().compareTo(a2.getAtributo());
    Comparator<Dados> comparaLv50HP = (Dados a1, Dados a2) -> a1.getLv50HP() - a2.getLv50HP();
    Comparator<Dados> comparaLv50SP = (Dados a1, Dados a2) -> a1.getLv50SP() - a2.getLv50SP();
    Comparator<Dados> comparaLv50Atk = (Dados a1, Dados a2) -> a1.getLv50Atk() - a2.getLv50Atk();
    Comparator<Dados> comparaLv50Def = (Dados a1, Dados a2) -> a1.getLv50Def() - a2.getLv50Def();
    Comparator<Dados> comparaLv50Int = (Dados a1, Dados a2) -> a1.getLv50Int() - a2.getLv50Int();
    Comparator<Dados> comparaLv50Spd = (Dados a1, Dados a2) -> a1.getLv50Spd() - a2.getLv50Spd();

    public FormSistema() {
        initComponents();
        carregaArquivo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        opBin = new javax.swing.JRadioButton();
        opSeq = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/digimon-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/check-list (1).png"))); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Digimon", "Estágio", "Tipo", "Atributo", "Lv50HP", "Lv50SP", "Lv50Atk", "Lv50Def", "Lv50Int", "Lv50Spd"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número", "Digimon", "Estágio", "Tipo" }));
        cbOrdena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenaActionPerformed(evt);
            }
        });

        txtBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados para busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 14))); // NOI18N

        btnBusca.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/task.png"))); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(opBin);
        opBin.setText("Binária");

        buttonGroup1.add(opSeq);
        opSeq.setText("Sequencial");
        opSeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSeqActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/digi.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(opSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(opBin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(opSeq)
                                    .addComponent(opBin))
                                .addGap(18, 18, 18)
                                .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo() {
        String csvFile = "Digi.csv";
        String line = "";
        String[] leitura = null;
        try ( BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Dados Digimon = new Dados();
                leitura = line.split(";");
                Digimon.setNumero(Integer.parseInt(leitura[0]));
                Digimon.setDigimon(leitura[1]);
                Digimon.setEstagio(leitura[2]);
                Digimon.setTipo(leitura[3]);
                Digimon.setAtributo(leitura[4]);
                Digimon.setLv50HP(Integer.parseInt(leitura[5]));
                Digimon.setLv50SP(Integer.parseInt(leitura[6]));
                Digimon.setLv50Atk(Integer.parseInt(leitura[7]));
                Digimon.setLv50Def(Integer.parseInt(leitura[8]));
                Digimon.setLv50Int(Integer.parseInt(leitura[9]));
                Digimon.setLv50Spd(Integer.parseInt(leitura[10]));

                /*System.out.println(leitura[0]+"\n");
                System.out.println(leitura[1]+"\n");
                System.out.println(leitura[2]+"\n");
                System.out.println(leitura[3]+"\n");
                System.out.println(leitura[4]+"\n");
                System.out.println(leitura[5]+"\n");
                System.out.println(leitura[6]+"\n");
                System.out.println(leitura[7]+"\n");
                
                System.out.println(leitura[8]+"\n");*/
                lista.add(Digimon);
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra() {
        //limpando a tabela
        tabelaDados.setModel(new DefaultTableModel(null, new String[]{"Número", "Digimon", "Estágio", "Tipo", "Atributo", "Lv50HP","Lv50SP","Lv50Atk","Lv50Def","Lv50Int","Lv50Spd"}));

        DefaultTableModel model
                = (DefaultTableModel) tabelaDados.getModel();
        Object rowData[] = new Object[11];// qtd colunas
        for (Dados d : lista) {
            rowData[0] = d.getNumero();
            rowData[1] = d.getDigimon();
            rowData[2] = d.getEstagio();
            rowData[3] = d.getTipo();
            rowData[4] = d.getAtributo();
            rowData[5] = d.getLv50HP();
            rowData[6] = d.getLv50SP();
            rowData[7] = d.getLv50Atk();
            rowData[8] = d.getLv50Def();
            rowData[9] = d.getLv50Int();
            rowData[10] = d.getLv50Spd();
                    
            model.addRow(rowData);
        }// fim preenche modelo
    }// fim mostra


    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
        switch (cbOrdena.getSelectedIndex()) {
            case 0:
                lista.sort(comparaNumero);
                break;
            case 1:
                lista.sort(comparaDigimon);
                break;
            case 2:
                lista.sort(comparaEstagio);
                break;
            case 3:
                lista.sort(comparaTipo);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Em construção!");
        }
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        int cont = 0;
        switch (cbOrdena.getSelectedIndex()) {
            case 0:
                 if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if(d.getNumero() == (Integer.parseInt(txtBusca.getText()))){
                            JOptionPane.showMessageDialog(null, "Tipo encontrado " + cont + " comparações");
                            break;
                        }
                    }
                }// fim if Sequencial;
                else {
                    Dados d = new Dados();
                    d.setNumero(Integer.parseInt(txtBusca.getText()));
                    // definir o comparator caso não seja o padrão na chamado da busca binária
                    int pos = Collections.binarySearch(lista, d); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Tipo encontrado, posicao " + pos);
                }// fim else binary
                break;
            case 1:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getDigimon().equals(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Digimon encontrado " + cont + " comparações");
                            break;
                        }
                    }
                }// fim if Sequencial;
                else {
                    Dados d = new Dados();
                    d.setDigimon(txtBusca.getText());
                    // definir o comparator caso não seja o padrão na chamado da busca binária
                    int pos = Collections.binarySearch(lista, d); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Digimon encontrado, posicao " + pos);
                }// fim else binary
                break;
            case 2:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getEstagio().equals(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Estágio encontrado " + cont + " comparações");
                            break;
                        }
                    }
                }// fim if Sequencial;
                else {
                    Dados d = new Dados();
                    d.setEstagio(txtBusca.getText());
                    // definir o comparator caso não seja o padrão na chamado da busca binária
                    int pos = Collections.binarySearch(lista, d); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Estágio encontrado, posicao " + pos);
                }// fim else binary
                break;
            case 3:
                if (opSeq.isSelected()) {
                    for (Dados d : lista) {
                        cont++;
                        if (d.getTipo().equals(txtBusca.getText())) {
                            JOptionPane.showMessageDialog(null, "Tipo encontrado " + cont + " comparações");
                            break;
                        }
                    }
                }// fim if Sequencial;
                else {
                    Dados d = new Dados();
                    d.setTipo(txtBusca.getText());
                    // definir o comparator caso não seja o padrão na chamado da busca binária
                    int pos = Collections.binarySearch(lista, d); // int pos = Collections.binarySearch(lista,d,compareTempMax);
                    JOptionPane.showMessageDialog(null, "Tipo encontrado, posicao " + pos);
                }// fim else binary
                break;
            default:
                JOptionPane.showMessageDialog(null, "Em construção!");
        }// switch
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void cbOrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenaActionPerformed

    private void opSeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSeqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opSeqActionPerformed

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
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton opBin;
    private javax.swing.JRadioButton opSeq;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}

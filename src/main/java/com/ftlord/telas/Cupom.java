/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.telas;

import com.ftlord.controle.ProdutosC;
import com.ftlord.model.Produtos;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LordFabricio
 */
public class Cupom extends javax.swing.JFrame{
    
    Produtos p;
    ProdutosC controleP;
    Integer linha;
    
    /**
     * Creates new form Cupom
     */
    public Cupom(Produtos prod, ProdutosC prodC) {
        this.p = prod;
        this.controleP = prodC;
        linha = 0;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        cupom = new javax.swing.JTable();
        valorTrocoC = new javax.swing.JTextField();
        valorTrocoT = new javax.swing.JLabel();
        valorPagoT = new javax.swing.JLabel();
        valorPagoC = new javax.swing.JTextField();
        valorC = new javax.swing.JTextField();
        valorT = new javax.swing.JLabel();
        quantidadeT = new javax.swing.JLabel();
        quantidadeC = new javax.swing.JTextField();
        codigoT = new javax.swing.JLabel();
        codigoC = new javax.swing.JTextField();
        concluir = new javax.swing.JButton();
        remover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 580));
        setPreferredSize(new java.awt.Dimension(900, 580));
        setSize(new java.awt.Dimension(900, 580));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cupom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cupom.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cupom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cupom);
        if (cupom.getColumnModel().getColumnCount() > 0) {
            cupom.getColumnModel().getColumn(0).setResizable(false);
            cupom.getColumnModel().getColumn(0).setPreferredWidth(30);
            cupom.getColumnModel().getColumn(1).setResizable(false);
            cupom.getColumnModel().getColumn(1).setPreferredWidth(200);
            cupom.getColumnModel().getColumn(2).setResizable(false);
            cupom.getColumnModel().getColumn(2).setPreferredWidth(30);
            cupom.getColumnModel().getColumn(3).setResizable(false);
            cupom.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 490, 490));

        valorTrocoC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(valorTrocoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 100, -1));

        valorTrocoT.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        valorTrocoT.setText("Valor Pago");
        getContentPane().add(valorTrocoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));

        valorPagoT.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        valorPagoT.setText("Valor Pago");
        getContentPane().add(valorPagoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        valorPagoC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(valorPagoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 100, -1));

        valorC.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(valorC, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 100, -1));

        valorT.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        valorT.setText("Valor Total");
        getContentPane().add(valorT, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        quantidadeT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        quantidadeT.setText("Quantidade");
        getContentPane().add(quantidadeT, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        quantidadeC.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        quantidadeC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantidadeCKeyReleased(evt);
            }
        });
        getContentPane().add(quantidadeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 50, -1));

        codigoT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        codigoT.setText("Código do Produto");
        getContentPane().add(codigoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        codigoC.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        codigoC.setText("CÓDIGO");
        codigoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoCKeyReleased(evt);
            }
        });
        getContentPane().add(codigoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));

        concluir.setText("Concluir");
        getContentPane().add(concluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 100, 30));

        remover.setText("Remover Item");
        getContentPane().add(remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void codigoCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoCKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            p = controleP.pegaPC(Integer.parseInt(codigoC.getText()));
            DefaultTableModel model = (DefaultTableModel) cupom.getModel();
            String id = String.valueOf(p.getIdProduto());
            String desc = p.getDescProduto();
            String quant = "";
            String val = String.valueOf(p.getValorProduto());
            model.addRow(new Object[]{id, desc, quant, val});
        }
    }//GEN-LAST:event_codigoCKeyReleased

    private void quantidadeCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeCKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            DefaultTableModel model = (DefaultTableModel) cupom.getModel();
            String id = String.valueOf(p.getIdProduto());
            String desc = p.getDescProduto();
            String quant = quantidadeC.getText();
            String val = String.valueOf(p.getValorProduto());
            model.setValueAt(quant, linha, 2);
            linha++;
        }
    }//GEN-LAST:event_quantidadeCKeyReleased
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoC;
    private javax.swing.JLabel codigoT;
    private javax.swing.JButton concluir;
    private javax.swing.JTable cupom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantidadeC;
    private javax.swing.JLabel quantidadeT;
    private javax.swing.JButton remover;
    private javax.swing.JTextField valorC;
    private javax.swing.JTextField valorPagoC;
    private javax.swing.JLabel valorPagoT;
    private javax.swing.JLabel valorT;
    private javax.swing.JTextField valorTrocoC;
    private javax.swing.JLabel valorTrocoT;
    // End of variables declaration//GEN-END:variables
}

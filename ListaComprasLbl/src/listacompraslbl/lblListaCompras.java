/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacompraslbl;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class lblListaCompras extends javax.swing.JFrame {
    ArrayList<String> lista = new ArrayList();
    /**
     * Creates new form lblListaCompras
     */
    public lblListaCompras() {
        initComponents();
        this.setTitle("Lista de Compras");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblItem = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jbtAnadir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jbtReiniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblItem.setText("Item:");

        jbtAnadir.setText("Añadir");
        jbtAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAnadirActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir Lista");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jbtReiniciar.setText("Reiniciar");
        jbtReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtReiniciarActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jbtReiniciar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblItem)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtAnadir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                    .addComponent(btnImprimir))
                                .addComponent(txtItem)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAnadir)
                    .addComponent(btnImprimir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jbtReiniciar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAnadirActionPerformed
        
        String tItem = txtItem.getText();
        
        if(!tItem.equals("")){
            int option = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(option == 0){ 
                this.lista.add(tItem);
                txtItem.setText("");
                JOptionPane.showMessageDialog(rootPane, "El elemento se añadió satisfactoriamente a la lista.");
            }else if (option == 1){
                JOptionPane.showMessageDialog(rootPane, "El elemento NO se añadió a la lista.");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese un item a su lista, por favor.");
        }
    }//GEN-LAST:event_jbtAnadirActionPerformed

    private void jbtReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtReiniciarActionPerformed
        txtItem.setText("");
        txtArea.setText("");
        lista.removeAll(lista);
    }//GEN-LAST:event_jbtReiniciarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        txtArea.setText("");
        for(String item : lista){
                    if(txtArea.getText().equals("")){
                        txtArea.setText(item);
                    }else{
                        txtArea.setText(txtArea.getText()+"\n"+item);
                    }
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(lblListaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lblListaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lblListaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lblListaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lblListaCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAnadir;
    private javax.swing.JButton jbtReiniciar;
    private javax.swing.JLabel lblItem;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtItem;
    // End of variables declaration//GEN-END:variables
}

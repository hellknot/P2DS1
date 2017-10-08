/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import model.Ingrediente;
import model.dao.IngredienteDAO;
import model.dao.ReceitaDAO;

/**
 *
 * @author hellk
 */
public class guiIngredientes extends javax.swing.JFrame {
    
    boolean edit = false;
    IngredienteDAO id;
    ReceitaDAO rd;

    /**
     * Creates new form guiIngredientes
     */
    public guiIngredientes() {
        initComponents();
        bloquearCampos();
        updateList();
        btmStartSet();
    }

   private void btmCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        edit = false;
        
        bloquearCampos();
        btmStartSet();
    }                                           

    private void btmNovoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        edit = false;
        
        liberarCampos();
        limparCampos();
        btmEditSet();
        
    }                                       

    private void btmEditarActionPerformed(java.awt.event.ActionEvent evt) {                                          
     
        edit = true;
        
        liberarCampos();
        btmEditSet();
        
    }                                         

    private void btmSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        Ingrediente p = new Ingrediente();
        
        p.setId(Integer.parseInt(txtID.getText()));
        p.setNome(txtIngrediente.getText());
        p.setDescricao(txtDescricao.getText());

        
        
        
        if(edit = true){
            id.update(p);
        }
        else{
            id.create(p);
            
        }
        
        edit = false;
        
    }                                         

    private void listIngredientesValueChanged(javax.swing.event.ListSelectionEvent evt) {                                            
        // TODO add your handling code here:
        //puxar dados da jlist pro txtfield quando seleciona usando select
        
    }                                           

            
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIngrediente = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btmNovo = new javax.swing.JButton();
        btmEditar = new javax.swing.JButton();
        btmSalvar = new javax.swing.JButton();
        btmCancelar = new javax.swing.JButton();
        btmSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listIngredientes = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrediente");

        jLabel2.setText("Descricao");

        txtIngrediente.setText("jTextField1");

        txtDescricao.setText("jTextField2");

        btmNovo.setText("Novo");

        btmEditar.setText("Editar");

        btmSalvar.setText("Salvar");

        btmCancelar.setText("Cancelar");

        btmSair.setText("Sair");

        jLabel3.setText("Lista deIngredientes ");

        listIngredientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listIngredientes);

        jLabel4.setText("ID");

        txtID.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtDescricao)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btmNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(btmSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtIngrediente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmNovo)
                    .addComponent(btmEditar)
                    .addComponent(btmSalvar)
                    .addComponent(btmCancelar)
                    .addComponent(btmSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(guiIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiIngredientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCancelar;
    private javax.swing.JButton btmEditar;
    private javax.swing.JButton btmNovo;
    private javax.swing.JButton btmSair;
    private javax.swing.JButton btmSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JList<String> listIngredientes;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIngrediente;
    // End of variables declaration//GEN-END:variables

private void btmStartSet() {
    
        btmSalvar.setEnabled(false);
        btmCancelar.setEnabled(false);
        btmEditar.setEnabled(false);
        
        btmSair.setEnabled(true);
        btmNovo.setEnabled(true);
        
    
    }

    private void btmEditSet() {
    
        btmCancelar.setEnabled(true);
        btmSalvar.setEnabled(true);
        
        btmSair.setEnabled(false);
        btmNovo.setEnabled(false);
        btmEditar.setEnabled(false);
    
    }

    private void liberarCampos() {
    
        txtDescricao.setEnabled(true);
        txtIngrediente.setEnabled(true);
    
        
    }

    public void bloquearCampos(){
        
        limparCampos();
        txtIngrediente.setEditable(false);
            
        txtDescricao.setEditable(false);    
    }
    
    public void limparCampos(){
        
          txtDescricao.setText(" ");
          txtIngrediente.setText(" ");
          txtID.setText(" ");
    }
    
    private void updateList() {
    
        listIngredientes = new JList((id.read()).toArray());
        
    
    }
    
}
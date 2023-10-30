/*
 *Autor: Zavaleta Cruz Jonathan Alexis  *
 *FechaCreacion: 29/10/2023
 *Detalles: 

 */
package view;

import controller.ConsultaController;
import controller.CrearBaseController;
import controller.CrearTablaController;
import controller.EliminarController;
import controller.InsertarController;

/**
 *
 * @author zavaletaax
 */
public class Principal extends javax.swing.JFrame {
    CrearBaseController CrearBase= new CrearBaseController();
    CrearTablaController CrearTabla= new CrearTablaController();
    ConsultaController Consulta= new ConsultaController();
    InsertarController Insertar= new InsertarController();
    EliminarController Eliminar= new EliminarController();
    
    public boolean bas;
    public boolean tab;
    
    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrear = new javax.swing.JButton();
        btnCrearTabla = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrear.setText("CrearBase");
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });

        btnCrearTabla.setText("CrearTabla");
        btnCrearTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearTablaMouseClicked(evt);
            }
        });

        btnInsertar.setText("InsertarTabla");
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarMouseClicked(evt);
            }
        });

        btnConsulta.setText("Consulta");
        btnConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultaMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnCrearTabla))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
       
        bas= CrearBase.CrearBase();
        
        
        
        
    }//GEN-LAST:event_btnCrearMouseClicked

    private void btnCrearTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearTablaMouseClicked
        tab=CrearTabla.crearTabla();
    }//GEN-LAST:event_btnCrearTablaMouseClicked

    private void btnInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseClicked
        if(bas==true){
            if(tab==true){Insertar.insertar();
            }
        }
    }//GEN-LAST:event_btnInsertarMouseClicked

    private void btnConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultaMouseClicked
         
        if(bas==true){
            if(tab==true){
                Consulta.Consulta();
            }
        }
    }//GEN-LAST:event_btnConsultaMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        
        if(bas==true){
            if(tab==true){
                Eliminar.eliminar();
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrearTabla;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    // End of variables declaration//GEN-END:variables
}

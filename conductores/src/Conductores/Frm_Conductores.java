
package Conductores;

import javax.swing.JOptionPane;

public class Frm_Conductores extends javax.swing.JFrame {

    String [][] conductor = new String [5][5];
    int fila=0;
    
    public Frm_Conductores() {
        initComponents();
    }


    protected void NuevoConductor()
    {
        if(fila>4)
        {
            JOptionPane.showMessageDialog(null,"YA no hay cupo we");
        }
        else
        {
            conductor[fila][0]= TxtCodigo.getText();
            conductor[fila][1]=TxtNombre.getText();
            conductor[fila][2]=TxtTelefono.getText();
            conductor[fila][3]=(String) CbxCategoria.getSelectedItem();
            String lic = TxtCodigo.getText()+""+CbxCategoria.getSelectedItem();
            conductor[fila][4]=lic;
            TxtLicencia.setText(lic);
            fila++;
        }
    }
    protected void Consultar()
    {
        int aux = 0, sw=0, wewe=0;
        while (aux<=4)
        {
            if (TxtCodigo.getText().equals(conductor [aux][0]))
            {
                sw=1;
                wewe= aux;
            }
            aux++;
        }
        if(sw==1)
        {
            TxtCodigo.setText(""+conductor[wewe][0]);
            TxtNombre.setText(""+conductor[wewe][1]);
            TxtTelefono.setText(""+conductor[wewe][2]);
            CbxCategoria.setSelectedItem(""+conductor[wewe][3]);
            TxtLicencia.setText(""+conductor[wewe][4]);
        }
        if(sw==0)
        {
            JOptionPane.showMessageDialog(null,"EL chofe"+"    "+ TxtCodigo.getText()+"    "+ "no esta en el registro we");
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        CbxCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TxtLicencia = new javax.swing.JTextField();
        BtnNuevo = new javax.swing.JButton();
        BtnConsultar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 50, 20));
        getContentPane().add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 110, 20));

        jLabel3.setText("Telefono:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 240, -1));

        jLabel4.setText("Categoria:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        getContentPane().add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, -1));

        CbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A1", "A2", "B1", "B2", "C1", "C2", " " }));
        getContentPane().add(CbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, -1));

        jLabel5.setText("N.licencia");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        TxtLicencia.setEnabled(false);
        getContentPane().add(TxtLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 100, -1));

        BtnNuevo.setText("Nuevo Conductor");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registro Conductores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel6)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        NuevoConductor();
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
        Consultar();
    }//GEN-LAST:event_BtnConsultarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtCodigo.setText("");
        TxtNombre.setText("");
        TxtTelefono.setText("");
        TxtLicencia.setText("");
        CbxCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_BtnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Conductores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JComboBox<String> CbxCategoria;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtLicencia;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

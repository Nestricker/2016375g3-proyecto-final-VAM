package gui;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;



public class TutoFrame extends javax.swing.JFrame {

    
    public TutoFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Tutoreando");
        setResizable(false);
        jPanel1.requestFocus();
        this.setSize(new Dimension(900, 620));


//ICON
        setIconImage(new ImageIcon(getClass().getResource("/resources/logo.png")).getImage());
        
        ((JPanel) getContentPane()).setOpaque(false);
        
        ImageIcon iconFondoImagen = new ImageIcon(this.getClass().getResource("/resources/background.jpg"));
        iconFondoImagen= new ImageIcon(iconFondoImagen.getImage().getScaledInstance( getWidth(),
                getHeight(), Image.SCALE_SMOOTH));
        
        JLabel fondo = new JLabel();
        fondo.setIcon(iconFondoImagen);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, iconFondoImagen.getIconWidth(),iconFondoImagen.getIconHeight());
        
        setVisible(true);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPublicidad = new javax.swing.JTextArea();
        btnContactarnos = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tutoreando");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        txtPublicidad.setEditable(false);
        txtPublicidad.setColumns(20);
        txtPublicidad.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtPublicidad.setRows(5);
        txtPublicidad.setText("                 \n                 Accede a tutorías \n        con los mejores estudiantes\n        de la Universidad Nacional");
        txtPublicidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPublicidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPublicidad.setHighlighter(null);
        txtPublicidad.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtPublicidad.setName(""); // NOI18N
        jScrollPane1.setViewportView(txtPublicidad);
        txtPublicidad.getAccessibleContext().setAccessibleName("");

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(76, 120, 270, 130);

        btnContactarnos.setBackground(new java.awt.Color(255, 255, 255));
        btnContactarnos.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnContactarnos.setText("Contactarnos");
        btnContactarnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactarnosActionPerformed(evt);
            }
        });
        jPanel1.add(btnContactarnos);
        btnContactarnos.setBounds(640, 20, 130, 31);

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(790, 20, 90, 31);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Registro c = new Registro();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnContactarnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactarnosActionPerformed
        TutoContactenos d = new TutoContactenos();
        d.setVisible(true);
        this.setVisible(false);
        btnContactarnos.setRolloverEnabled(false);
    }//GEN-LAST:event_btnContactarnosActionPerformed

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
            java.util.logging.Logger.getLogger(TutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutoFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContactarnos;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtPublicidad;
    // End of variables declaration//GEN-END:variables
}

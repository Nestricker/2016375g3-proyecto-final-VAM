/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import businessLogic.TutoApp;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author yovan
 */
public class Registro extends javax.swing.JFrame {
    
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Tutoreando");
        setResizable(false);
        jPanel2.requestFocus(false);
        
        this.setSize(new Dimension(900, 620));
        //ICON
        setIconImage(new ImageIcon(getClass().getResource("/resources/logo.png")).getImage());

        txtContraseñaR.setEchoChar((char)0); 
        setLocationRelativeTo(null);    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnIniciarSesionR = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCorreoR = new javax.swing.JTextField();
        txtNombresR = new javax.swing.JTextField();
        txtApellidosR = new javax.swing.JTextField();
        txtDocumentoR = new javax.swing.JTextField();
        txtCarreraR = new javax.swing.JTextField();
        txtCelularR = new javax.swing.JTextField();
        btnRegistroR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContraseñaR = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(251, 212));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("¿Ya tienes cuenta?");

        btnIniciarSesionR.setBackground(new java.awt.Color(153, 0, 255));
        btnIniciarSesionR.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesionR.setText("Iniciar Sesión");
        btnIniciarSesionR.setAutoscrolls(true);
        btnIniciarSesionR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIniciarSesionR.setBorderPainted(false);
        btnIniciarSesionR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnIniciarSesionR, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btnIniciarSesionR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(251, 384));
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("TUTOREANDO");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Registrate aquí para seguir aprendiendo");

        txtCorreoR.setBackground(new java.awt.Color(204, 204, 204));
        txtCorreoR.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        txtCorreoR.setText("Correo electronico");
        txtCorreoR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCorreoR.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCorreoR.setFocusTraversalPolicyProvider(true);
        txtCorreoR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoRFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoRFocusLost(evt);
            }
        });

        txtNombresR.setBackground(new java.awt.Color(204, 204, 204));
        txtNombresR.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        txtNombresR.setText("Nombres");
        txtNombresR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombresR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombresRFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresRFocusLost(evt);
            }
        });
        txtNombresR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresRActionPerformed(evt);
            }
        });

        txtApellidosR.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidosR.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        txtApellidosR.setText("Apellidos");
        txtApellidosR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellidosR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosRFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosRFocusLost(evt);
            }
        });

        txtDocumentoR.setBackground(new java.awt.Color(204, 204, 204));
        txtDocumentoR.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        txtDocumentoR.setText("Documento");
        txtDocumentoR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDocumentoR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDocumentoRFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDocumentoRFocusLost(evt);
            }
        });

        txtCarreraR.setBackground(new java.awt.Color(204, 204, 204));
        txtCarreraR.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        txtCarreraR.setText("Carrera");
        txtCarreraR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCarreraR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCarreraRFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCarreraRFocusLost(evt);
            }
        });

        txtCelularR.setBackground(new java.awt.Color(204, 204, 204));
        txtCelularR.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        txtCelularR.setText("Celular");
        txtCelularR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCelularR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularRFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularRFocusLost(evt);
            }
        });
        txtCelularR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularRActionPerformed(evt);
            }
        });

        btnRegistroR.setBackground(new java.awt.Color(153, 0, 255));
        btnRegistroR.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroR.setText("Registrarse");
        btnRegistroR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 255), 1, true));
        btnRegistroR.setBorderPainted(false);
        btnRegistroR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistroR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroRActionPerformed(evt);
            }
        });

        jLabel4.setText("Aceptas condiciones y politicas");

        txtContraseñaR.setBackground(new java.awt.Color(204, 204, 204));
        txtContraseñaR.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtContraseñaR.setText("Contraseña");
        txtContraseñaR.setToolTipText("");
        txtContraseñaR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtContraseñaR.setPreferredSize(new java.awt.Dimension(111, 16));
        txtContraseñaR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContraseñaRFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaRFocusLost(evt);
            }
        });
        txtContraseñaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreoR, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtNombresR)
                            .addComponent(txtApellidosR)
                            .addComponent(txtDocumentoR)
                            .addComponent(txtCarreraR)
                            .addComponent(txtCelularR)
                            .addComponent(txtContraseñaR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnRegistroR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombresR, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellidosR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDocumentoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCarreraR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCelularR, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseñaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnRegistroR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(49, 49, 49))
        );

        btnRegistroR.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresRActionPerformed

    private void txtCorreoRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoRFocusGained
        if(txtCorreoR.getText().trim().equals("Correo electronico")){
            txtCorreoR.setText("");
        }
        txtCorreoR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtCorreoRFocusGained

    private void txtCorreoRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoRFocusLost
        if(txtCorreoR.getText().trim().equals("")){
            txtCorreoR.setText("Correo electronico");
        }
        txtCorreoR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtCorreoRFocusLost

    private void txtNombresRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresRFocusGained
        if(txtNombresR.getText().trim().equals("Nombres")){
            txtNombresR.setText("");
        }
        txtNombresR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNombresRFocusGained

    private void txtNombresRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresRFocusLost
        if(txtNombresR.getText().trim().equals("")){
            txtNombresR.setText("Nombres");
        }
        txtNombresR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNombresRFocusLost

    private void txtApellidosRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosRFocusGained
         if(txtApellidosR.getText().trim().equals("Apellidos")){
            txtApellidosR.setText("");
        }
        txtApellidosR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtApellidosRFocusGained

    private void txtApellidosRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosRFocusLost
         if(txtApellidosR.getText().trim().equals("")){
            txtApellidosR.setText("Apellidos");
        }
        txtApellidosR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtApellidosRFocusLost

    private void txtDocumentoRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDocumentoRFocusGained
        if(txtDocumentoR.getText().trim().equals("Documento")){
            txtDocumentoR.setText("");
        }
        txtDocumentoR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtDocumentoRFocusGained

    private void txtDocumentoRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDocumentoRFocusLost
        if(txtDocumentoR.getText().trim().equals("")){
            txtDocumentoR.setText("Documento");
        }
        txtDocumentoR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtDocumentoRFocusLost

    private void txtCarreraRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCarreraRFocusGained
        if(txtCarreraR.getText().trim().equals("Carrera")){
            txtCarreraR.setText("");
        }
        txtCarreraR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtCarreraRFocusGained

    private void txtCarreraRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCarreraRFocusLost
        if(txtCarreraR.getText().trim().equals("")){
            txtCarreraR.setText("Carrera");
        }
        txtCarreraR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtCarreraRFocusLost

    private void txtCelularRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularRFocusGained
        if(txtCelularR.getText().trim().equals("Celular")){
            txtCelularR.setText("");
        }
        txtCelularR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtCelularRFocusGained

    private void txtCelularRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularRFocusLost
        if(txtCelularR.getText().trim().equals("")){
            txtCelularR.setText("Celular");
        }
        txtCelularR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtCelularRFocusLost

    private void btnIniciarSesionRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionRActionPerformed
        IniciarSesion b = new IniciarSesion();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIniciarSesionRActionPerformed

    private void txtCelularRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularRActionPerformed

    private void btnRegistroRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroRActionPerformed
        char[] arrayC = txtContraseñaR.getPassword();
        String pass = new String(arrayC);
        if(!txtApellidosR.equals("Apellidos") && !txtCarreraR.equals("Carrera") && !txtCelularR.equals("Celular") 
                && !pass.equals("Contraseña") && !txtCorreoR.equals("Correo electronico") &&
                !txtDocumentoR.equals("Documento")&& !txtNombresR.equals("Nombres")){
            if(TutoApp.documentoRegistrado(txtDocumentoR.getText())){
            JOptionPane.showMessageDialog(new JFrame(),"Ya existe un usuario con este Documento","Error 15#0!",
                    JOptionPane.INFORMATION_MESSAGE);
        }else if(TutoApp.correoRegistrado(txtCorreoR.getText())){
            JOptionPane.showMessageDialog(new JFrame(),"Este correo ya esta registrado","Error 16#0!",
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
        TutoApp.crearUsuario(txtDocumentoR.getText(),pass
                ,txtNombresR.getText(),txtApellidosR.getText(),txtCarreraR.getText()
                ,txtCorreoR.getText(),txtCelularR.getText());
        TutoIniciarSesion j = new TutoIniciarSesion();
        j.setVisible(true);
        this.setVisible(false);
        }
        }else{
            JOptionPane.showMessageDialog(new JFrame(),"RELLENE TODOS LOS CAMPOS","Error 15#0!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistroRActionPerformed

    private void txtContraseñaRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaRFocusGained
        char[] arrayC = txtContraseñaR.getPassword();
        String pass = new String(arrayC);
        if(pass.trim().equals("Contraseña")){
            txtContraseñaR.setText("");
            txtContraseñaR.setEchoChar('•');
        }
        txtContraseñaR.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtContraseñaRFocusGained

    private void txtContraseñaRFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaRFocusLost
        char[] arrayC = txtContraseñaR.getPassword();
        String pass = new String(arrayC);
        if(pass.trim().equals("")){
            txtContraseñaR.setText("Contraseña");
            txtContraseñaR.setEchoChar((char)0);
        }
        txtContraseñaR.setForeground(Color.BLACK);   
    }//GEN-LAST:event_txtContraseñaRFocusLost

    private void txtContraseñaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaRActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesionR;
    private javax.swing.JButton btnRegistroR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellidosR;
    private javax.swing.JTextField txtCarreraR;
    private javax.swing.JTextField txtCelularR;
    private javax.swing.JPasswordField txtContraseñaR;
    private javax.swing.JTextField txtCorreoR;
    private javax.swing.JTextField txtDocumentoR;
    private javax.swing.JTextField txtNombresR;
    // End of variables declaration//GEN-END:variables
}

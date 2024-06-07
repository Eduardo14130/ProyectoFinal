/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofinal;

import com.mycompany.proyectofinal.Administrador.CargasMasivas;
import com.mycompany.proyectofinal.Administrador.MenuAlumnos;
import com.mycompany.proyectofinal.Administrador.MenuCurso;
import com.mycompany.proyectofinal.Administrador.MenuProfesores;

/**
 *
 * @author Alway
 */
public class Bienvenida extends javax.swing.JFrame {

    private Usuario usuario;
    
    public Bienvenida(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        lblUserInfo.setText(usuario.getNombreUsuario()+" "+usuario.getApellidoUsuario());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblUserInfo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAlumnos = new javax.swing.JButton();
        btnProfesores = new javax.swing.JButton();
        btnCurso = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnCargas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido: ");

        lblUserInfo.setText("jLabel2");

        jLabel3.setText("Por favor, selecciona una opcion: ");

        btnAlumnos.setText("Alumnos");
        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });

        btnProfesores.setText("Profesores");
        btnProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfesoresActionPerformed(evt);
            }
        });

        btnCurso.setText("Curso");
        btnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursoActionPerformed(evt);
            }
        });

        btnPerfil.setText("Mi Perfil");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnCargas.setText("Cargas Masivas");
        btnCargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(lblUserInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAlumnos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProfesores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUserInfo)
                    .addComponent(btnPerfil))
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(btnAlumnos)
                .addGap(27, 27, 27)
                .addComponent(btnProfesores)
                .addGap(26, 26, 26)
                .addComponent(btnCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnCargas)
                .addGap(11, 11, 11)
                .addComponent(btnLogOut)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        MenuAlumnos alumnos = new MenuAlumnos(usuario);
        alumnos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        MiPerfil miperfil = new MiPerfil(usuario);
        miperfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfesoresActionPerformed
        MenuProfesores menu = new MenuProfesores(usuario);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProfesoresActionPerformed

    private void btnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursoActionPerformed
        MenuCurso menu = new MenuCurso(usuario);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCursoActionPerformed

    private void btnCargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargasActionPerformed
        CargasMasivas cargas = new CargasMasivas(usuario);
        cargas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCargasActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnCargas;
    private javax.swing.JButton btnCurso;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnProfesores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblUserInfo;
    // End of variables declaration//GEN-END:variables
}

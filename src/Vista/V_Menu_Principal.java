/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dani
 */
public class V_Menu_Principal extends JFrame {

    //variables
    JPanel panel;
    JLabel titulo;
    JButton bsesion, bmenup, bsalir, registrarse;
    //Constructores

    public V_Menu_Principal() {
        menu();
    }

    public V_Menu_Principal(JPanel panel, JLabel titulo, JButton bsesion, JButton bmenup, JButton bsalir, JButton registrarse) {
        this.panel = panel;
        this.titulo = titulo;
        this.bsesion = bsesion;
        this.bmenup = bmenup;
        this.bsalir = bsalir;
        this.registrarse = registrarse;
    }
    //métodos getter && setter

    public JButton getBsesion() {
        return bsesion;
    }

    public void setBsesion(JButton bsesion) {
        this.bsesion = bsesion;
    }

    public JButton getBmenup() {
        return bmenup;
    }

    public void setBmenup(JButton bmenup) {
        this.bmenup = bmenup;
    }

    public JButton getBsalir() {
        return bsalir;
    }

    public void setBsalir(JButton bsalir) {
        this.bsalir = bsalir;
    }

    public JButton getRegistrarse() {
        return registrarse;
    }

    public void setRegistrarse(JButton registrarse) {
        this.registrarse = registrarse;
    }

    //métodos
    public void menu() {

        panel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        bsesion = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        bmenup = new javax.swing.JButton();
        registrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        panel.setBackground(new java.awt.Color(0, 204, 204));

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setText("BIENVENIDO");

        bsesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bsesion.setText("INICIO SESIÓN");

        bsalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bsalir.setText("SALIR");

        bmenup.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bmenup.setText("VOLVER AL MENU PRINCIPAL");

        registrarse.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registrarse.setText("REGISTRARSE");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(145, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bsesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bmenup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(174, 174, 174))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(bsesion)
                        .addGap(45, 45, 45)
                        .addComponent(registrarse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(bmenup)
                        .addGap(53, 53, 53)
                        .addComponent(bsalir)
                        .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        //tooltip
        bsesion.setToolTipText("Pulse aqui para iniciar sesión y acceder al programa");
        bmenup.setToolTipText("Pulse aqui si desea volver al menu principal");
        bsalir.setToolTipText("Pulse aqui si desea salir del programa");
        registrarse.setToolTipText("Pulse aqui si desea registrarse en la aplicación");

        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Menu Principal");
        pack();
    }// </editor-fold>

}

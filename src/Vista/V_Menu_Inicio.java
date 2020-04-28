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
public class V_Menu_Inicio extends JFrame {

    //variables
    JPanel panel;
    JLabel titulo;
    JButton bdetalles, binicio, bsalir;

    //constructores
    public V_Menu_Inicio() {
        menu();
    }

    public V_Menu_Inicio(JPanel panel, JLabel titulo, JButton bdetalles, JButton binicio, JButton bsalir) {
        this.panel = panel;
        this.titulo = titulo;
        this.bdetalles = bdetalles;
        this.binicio = binicio;
        this.bsalir = bsalir;
    }

    public JButton getBdetalles() {
        return bdetalles;
    }

    public void setBdetalles(JButton bdetalles) {
        this.bdetalles = bdetalles;
    }

    public JButton getBinicio() {
        return binicio;
    }

    public void setBinicio(JButton binicio) {
        this.binicio = binicio;
    }

    public JButton getBsalir() {
        return bsalir;
    }

    public void setBsalir(JButton bsalir) {
        this.bsalir = bsalir;
    }

    public void menu() {

        panel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        binicio = new javax.swing.JButton();
        bdetalles = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        panel.setBackground(new java.awt.Color(0, 204, 204));

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setText("MUNDO CINE");

        binicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        binicio.setText("INICIO");

        bdetalles.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bdetalles.setText("DETALLES");

        bsalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bsalir.setText("SALIR");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(bdetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(binicio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(184, 184, 184)
                                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(177, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(binicio)
                        .addGap(47, 47, 47)
                        .addComponent(bdetalles)
                        .addGap(53, 53, 53)
                        .addComponent(bsalir)
                        .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        //toltip
        binicio.setToolTipText("Si pulsas aquí entraras al menu principal del programa");
        bdetalles.setToolTipText("Si pulsas aquí podrás ver quien ha realizado el programa");
        bsalir.setToolTipText("Si pulsas aquí podras salir de la aplicación");

        pack();

        this.setTitle("Menu");
        this.setVisible(true);
        this.setResizable(false);
    }

}

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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Dani
 */
public class V_verProductos extends JFrame {
//variables

    JPanel panel, panel2;
    JScrollPane jScrollPane1;
    JTextField textoseries, textopelicula;
    JTextArea textoarea;
    JButton mostrarseries, mostrarpelis, bpeliculas, bseries, salir;
    JLabel peliculas, series, productos;

    //constructores
    public V_verProductos() {
        menu();
    }

    public V_verProductos(JPanel panel, JScrollPane jScrollPane1, JTextField textoseries, JTextField textopelicula, JTextArea textoarea, JButton mostrarseries, JButton mostrarpelis, JButton bpeliculas, JButton bseries, JLabel peliculas, JLabel series, JButton salir) {
        this.panel = panel;
        this.jScrollPane1 = jScrollPane1;
        this.textoseries = textoseries;
        this.textopelicula = textopelicula;
        this.textoarea = textoarea;
        this.mostrarseries = mostrarseries;
        this.mostrarpelis = mostrarpelis;
        this.bpeliculas = bpeliculas;
        this.bseries = bseries;
        this.peliculas = peliculas;
        this.series = series;
        this.salir = salir;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getTextoseries() {
        return textoseries;
    }

    public void setTextoseries(JTextField textoseries) {
        this.textoseries = textoseries;
    }

    public JTextField getTextopelicula() {
        return textopelicula;
    }

    public void setTextopelicula(JTextField textopelicula) {
        this.textopelicula = textopelicula;
    }

    public JTextArea getTextoarea() {
        return textoarea;
    }

    public void setTextoarea(JTextArea textoarea) {
        this.textoarea = textoarea;
    }

    public JButton getMostrarseries() {
        return mostrarseries;
    }

    public void setMostrarseries(JButton mostrarseries) {
        this.mostrarseries = mostrarseries;
    }

    public JButton getMostrarpelis() {
        return mostrarpelis;
    }

    public void setMostrarpelis(JButton mostrarpelis) {
        this.mostrarpelis = mostrarpelis;
    }

    public JButton getBpeliculas() {
        return bpeliculas;
    }

    public void setBpeliculas(JButton bpeliculas) {
        this.bpeliculas = bpeliculas;
    }

    public JButton getBseries() {
        return bseries;
    }

    public void setBseries(JButton bseries) {
        this.bseries = bseries;
    }

    public JButton getSalir() {
        return salir;
    }

    public void setSalir(JButton salir) {
        this.salir = salir;
    }

    public void menu() {

        panel = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        productos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoarea = new javax.swing.JTextArea();
        series = new javax.swing.JLabel();
        peliculas = new javax.swing.JLabel();
        textoseries = new javax.swing.JTextField();
        textopelicula = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        mostrarseries = new javax.swing.JButton();
        bpeliculas = new javax.swing.JButton();
        bseries = new javax.swing.JButton();
        mostrarpelis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel2.setBackground(new java.awt.Color(0, 0, 255));

        productos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        productos.setForeground(new java.awt.Color(255, 255, 255));
        productos.setText("PRODUCTOS");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(productos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(productos)
                        .addContainerGap(18, Short.MAX_VALUE))
        );

        textoarea.setColumns(20);
        textoarea.setRows(5);
        textoarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jScrollPane1.setViewportView(textoarea);

        series.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        series.setForeground(new java.awt.Color(0, 0, 255));
        series.setText("Series");

        peliculas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        peliculas.setForeground(new java.awt.Color(0, 0, 255));
        peliculas.setText("Peliculas");

        salir.setBackground(new java.awt.Color(0, 0, 204));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");

        mostrarseries.setBackground(new java.awt.Color(204, 0, 0));
        mostrarseries.setForeground(new java.awt.Color(255, 255, 255));
        mostrarseries.setText("Mostrar");

        bpeliculas.setBackground(new java.awt.Color(0, 153, 0));
        bpeliculas.setForeground(new java.awt.Color(255, 255, 255));
        bpeliculas.setText("Ver peliculas");

        bseries.setBackground(new java.awt.Color(0, 204, 102));
        bseries.setForeground(new java.awt.Color(255, 255, 255));
        bseries.setText("Ver series");

        mostrarpelis.setBackground(new java.awt.Color(204, 204, 0));
        mostrarpelis.setForeground(new java.awt.Color(255, 255, 255));
        mostrarpelis.setText("Mostrar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(series)
                                                .addComponent(peliculas))
                                        .addGap(30, 30, 30)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textoseries)
                                                .addComponent(textopelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                                        .addGap(58, 58, 58)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mostrarpelis)
                                                .addComponent(mostrarseries))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(bseries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bpeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(30, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(series)
                                .addComponent(textoseries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mostrarseries)
                                .addComponent(bseries))
                        .addGap(12, 12, 12)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(peliculas)
                                .addComponent(textopelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mostrarpelis)
                                .addComponent(bpeliculas))
                        .addGap(18, 18, 18)
                        .addComponent(salir)
                        .addGap(0, 15, Short.MAX_VALUE))
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
        this.setVisible(true);
        this.setTitle("Ver productos");
        pack();
    }
}

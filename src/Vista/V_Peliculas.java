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
import javax.swing.JTextField;

/**
 *
 * @author Dani
 */
public class V_Peliculas extends JFrame {
//variables

    JPanel panel, panel2, panel3;
    JLabel titulo, ltitulo, lgenero, lsipnosis, lduracion, lcantidad, lid, lprecio;
    JButton bañadir, beliminar, bsalir, bmodificar, mostrar;
    JTextField jtitulo, jcantidad, jgenero, jsipnosis, jduracion, jcantdiad, jid, jprecio;

//constructores
    public V_Peliculas() {
        menu();
    }

    public V_Peliculas(JPanel panel, JLabel titulo, JLabel ltitulo, JLabel lgenero, JLabel lsipnosis, JLabel lduracion, JLabel lcantidad, JLabel lid, JLabel lprecio, JButton bañadir, JButton beliminar, JButton bsalir, JButton bmodificar, JTextField jtitulo, JTextField jgenero, JTextField jsipnosis, JTextField jduracion, JTextField jcantdiad, JTextField jid, JTextField jprecio, JTextField jcantidad, JButton mostrar) {
        this.panel = panel;
        this.titulo = titulo;
        this.ltitulo = ltitulo;
        this.lgenero = lgenero;
        this.lsipnosis = lsipnosis;
        this.lduracion = lduracion;
        this.lcantidad = lcantidad;
        this.lid = lid;
        this.lprecio = lprecio;
        this.bañadir = bañadir;
        this.beliminar = beliminar;
        this.bsalir = bsalir;
        this.bmodificar = bmodificar;
        this.jtitulo = jtitulo;
        this.jgenero = jgenero;
        this.jsipnosis = jsipnosis;
        this.jduracion = jduracion;
        this.jcantdiad = jcantdiad;
        this.jid = jid;
        this.jprecio = jprecio;
        this.jcantidad = jcantidad;
        this.mostrar = mostrar;
    }
    //métodos getter && setter

    public JButton getBañadir() {
        return bañadir;
    }

    public void setBañadir(JButton bañadir) {
        this.bañadir = bañadir;
    }

    public JButton getBeliminar() {
        return beliminar;
    }

    public void setBeliminar(JButton beliminar) {
        this.beliminar = beliminar;
    }

    public JButton getBsalir() {
        return bsalir;
    }

    public void setBsalir(JButton bsalir) {
        this.bsalir = bsalir;
    }

    public JButton getBmodificar() {
        return bmodificar;
    }

    public void setBmodificar(JButton bmodificar) {
        this.bmodificar = bmodificar;
    }

    public JTextField getJtitulo() {
        return jtitulo;
    }

    public void setJtitulo(JTextField jtitulo) {
        this.jtitulo = jtitulo;
    }

    public JTextField getJgenero() {
        return jgenero;
    }

    public void setJgenero(JTextField jgenero) {
        this.jgenero = jgenero;
    }

    public JTextField getJsipnosis() {
        return jsipnosis;
    }

    public void setJsipnosis(JTextField jsipnosis) {
        this.jsipnosis = jsipnosis;
    }

    public JTextField getJduracion() {
        return jduracion;
    }

    public void setJduracion(JTextField jduracion) {
        this.jduracion = jduracion;
    }

    public JTextField getJid() {
        return jid;
    }

    public void setJid(JTextField jid) {
        this.jid = jid;
    }

    public JTextField getJprecio() {
        return jprecio;
    }

    public void setJprecio(JTextField jprecio) {
        this.jprecio = jprecio;
    }

    public JTextField getJcantidad() {
        return jcantidad;
    }

    public void setJcantidad(JTextField jcantidad) {
        this.jcantidad = jcantidad;
    }

    public JButton getMostrar() {
        return mostrar;
    }

    public void setMostrar(JButton mostrar) {
        this.mostrar = mostrar;
    }

    //métodos
    public void menu() {
        panel = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        ltitulo = new javax.swing.JLabel();
        lgenero = new javax.swing.JLabel();
        lsipnosis = new javax.swing.JLabel();
        jtitulo = new javax.swing.JTextField();
        jgenero = new javax.swing.JTextField();
        jsipnosis = new javax.swing.JTextField();
        lduracion = new javax.swing.JLabel();
        lcantidad = new javax.swing.JLabel();
        lprecio = new javax.swing.JLabel();
        jduracion = new javax.swing.JTextField();
        jcantidad = new javax.swing.JTextField();
        jprecio = new javax.swing.JTextField();
        lid = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        mostrar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        beliminar = new javax.swing.JButton();
        bañadir = new javax.swing.JButton();
        bmodificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel3.setBackground(new java.awt.Color(0, 51, 255));

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("PELICULAS");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(titulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(titulo)
                        .addContainerGap(18, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 0, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 51, Short.MAX_VALUE)
        );

        ltitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ltitulo.setForeground(new java.awt.Color(0, 51, 255));
        ltitulo.setText("titulo:");

        lgenero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lgenero.setForeground(new java.awt.Color(0, 51, 255));
        lgenero.setText("genero:");

        lsipnosis.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lsipnosis.setForeground(new java.awt.Color(0, 51, 255));
        lsipnosis.setText("sipnosis:");

        lduracion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lduracion.setForeground(new java.awt.Color(0, 51, 255));
        lduracion.setText("duracion:");

        lcantidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lcantidad.setForeground(new java.awt.Color(0, 51, 255));
        lcantidad.setText("cantidad:");

        lprecio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lprecio.setForeground(new java.awt.Color(0, 51, 255));
        lprecio.setText("precio:");

        lid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lid.setForeground(new java.awt.Color(0, 51, 255));
        lid.setText("ID:");

        mostrar.setBackground(new java.awt.Color(102, 102, 102));
        mostrar.setForeground(new java.awt.Color(255, 255, 255));
        mostrar.setText("Mostrar");

        bsalir.setBackground(new java.awt.Color(255, 0, 0));
        bsalir.setForeground(new java.awt.Color(255, 255, 255));
        bsalir.setText("Salir");

        beliminar.setBackground(new java.awt.Color(51, 204, 0));
        beliminar.setForeground(new java.awt.Color(255, 255, 255));
        beliminar.setText("Eliminar");

        bañadir.setBackground(new java.awt.Color(0, 51, 255));
        bañadir.setForeground(new java.awt.Color(255, 255, 255));
        bañadir.setText("Añadir");

        bmodificar.setBackground(new java.awt.Color(255, 255, 51));
        bmodificar.setForeground(new java.awt.Color(255, 255, 255));
        bmodificar.setText("Modificar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ltitulo)
                                .addComponent(lgenero)
                                .addComponent(lsipnosis)
                                .addComponent(lid))
                        .addGap(53, 53, 53)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jgenero, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(jsipnosis)
                                .addComponent(jtitulo)
                                .addComponent(jid))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lduracion)
                                                .addComponent(lcantidad)
                                                .addComponent(lprecio))
                                        .addGap(30, 30, 30)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jduracion)
                                                .addComponent(jcantidad)
                                                .addComponent(jprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                                .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(mostrar)
                                        .addGap(49, 49, 49)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(bsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bañadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(bmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                                .addComponent(beliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(45, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ltitulo)
                                .addComponent(jtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lduracion)
                                .addComponent(jduracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lgenero)
                                .addComponent(jgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lcantidad)
                                .addComponent(jcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lsipnosis)
                                .addComponent(jsipnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lprecio)
                                .addComponent(jprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bañadir)
                                .addComponent(bmodificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lid, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mostrar)
                                        .addComponent(bsalir)
                                        .addComponent(beliminar)))
                        .addGap(38, 38, 38)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Peliculas");
    }
}

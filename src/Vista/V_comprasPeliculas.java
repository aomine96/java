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
public class V_comprasPeliculas extends JFrame {

    //variables
    JPanel panel, panel2;
    JLabel introduccion, peliculas, titulo, precio, stock, nombre, apellidos, direccion, unidades;
    JTextField textomostrar, textotitulo, textoprecio, textostock, textonombre, textoapellidos, textodireccion, textounidades;
    JButton comprar, salir, mostrar;

    //constructores
    public V_comprasPeliculas() {
        menu();
    }

    public V_comprasPeliculas(JPanel panel, JTextField textomostrar, JTextField textotitulo, JTextField textoprecio, JTextField textostock, JTextField textonombre, JTextField textoapellidos, JTextField textodireccion, JTextField textounidades, JButton comprar, JButton salir, JButton mostrar) {
        this.panel = panel;
        this.textomostrar = textomostrar;
        this.textotitulo = textotitulo;
        this.textoprecio = textoprecio;
        this.textostock = textostock;
        this.textonombre = textonombre;
        this.textoapellidos = textoapellidos;
        this.textodireccion = textodireccion;
        this.textounidades = textounidades;
        this.comprar = comprar;
        this.salir = salir;
        this.mostrar = mostrar;
    }
    //métodos getter && setter

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getTextomostrar() {
        return textomostrar;
    }

    public void setTextomostrar(JTextField textomostrar) {
        this.textomostrar = textomostrar;
    }

    public JTextField getTextotitulo() {
        return textotitulo;
    }

    public void setTextotitulo(JTextField textotitulo) {
        this.textotitulo = textotitulo;
    }

    public JTextField getTextoprecio() {
        return textoprecio;
    }

    public void setTextoprecio(JTextField textoprecio) {
        this.textoprecio = textoprecio;
    }

    public JTextField getTextostock() {
        return textostock;
    }

    public void setTextostock(JTextField textostock) {
        this.textostock = textostock;
    }

    public JTextField getTextonombre() {
        return textonombre;
    }

    public void setTextonombre(JTextField textonombre) {
        this.textonombre = textonombre;
    }

    public JTextField getTextoapellidos() {
        return textoapellidos;
    }

    public void setTextoapellidos(JTextField textoapellidos) {
        this.textoapellidos = textoapellidos;
    }

    public JTextField getTextodireccion() {
        return textodireccion;
    }

    public void setTextodireccion(JTextField textodireccion) {
        this.textodireccion = textodireccion;
    }

    public JTextField getTextounidades() {
        return textounidades;
    }

    public void setTextounidades(JTextField textounidades) {
        this.textounidades = textounidades;
    }

    public JButton getComprar() {
        return comprar;
    }

    public void setComprar(JButton comprar) {
        this.comprar = comprar;
    }

    public JButton getSalir() {
        return salir;
    }

    public void setSalir(JButton salir) {
        this.salir = salir;
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
        panel2 = new javax.swing.JPanel();
        peliculas = new javax.swing.JLabel();
        introduccion = new javax.swing.JLabel();
        textomostrar = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        stock = new javax.swing.JLabel();
        textotitulo = new javax.swing.JTextField();
        textoprecio = new javax.swing.JTextField();
        textostock = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        textonombre = new javax.swing.JTextField();
        textoapellidos = new javax.swing.JTextField();
        textodireccion = new javax.swing.JTextField();
        unidades = new javax.swing.JLabel();
        textounidades = new javax.swing.JTextField();
        comprar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel2.setBackground(new java.awt.Color(0, 0, 255));

        peliculas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        peliculas.setForeground(new java.awt.Color(255, 255, 255));
        peliculas.setText("PELICULAS");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(peliculas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(peliculas)
                        .addContainerGap(24, Short.MAX_VALUE))
        );

        introduccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        introduccion.setForeground(new java.awt.Color(0, 0, 255));
        introduccion.setText("Introduce  la pelicula :");

        titulo.setForeground(new java.awt.Color(0, 0, 255));
        titulo.setText("Titulo:");

        precio.setForeground(new java.awt.Color(0, 0, 255));
        precio.setText("Precio:");

        stock.setForeground(new java.awt.Color(0, 0, 255));
        stock.setText("Stock:");

        nombre.setForeground(new java.awt.Color(0, 0, 255));
        nombre.setText("Nombre:");

        apellidos.setForeground(new java.awt.Color(0, 0, 255));
        apellidos.setText("Apellidos:");

        direccion.setForeground(new java.awt.Color(0, 0, 255));
        direccion.setText("Direccion:");

        unidades.setForeground(new java.awt.Color(0, 0, 255));
        unidades.setText("Unidades a comprar:");

        comprar.setBackground(new java.awt.Color(255, 0, 0));
        comprar.setForeground(new java.awt.Color(255, 255, 255));
        comprar.setText("comprar");

        salir.setBackground(new java.awt.Color(0, 255, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("salir");

        mostrar.setBackground(new java.awt.Color(0, 0, 255));
        mostrar.setForeground(new java.awt.Color(255, 255, 255));
        mostrar.setText("mostrar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(unidades)
                                .addComponent(stock)
                                .addComponent(precio)
                                .addComponent(titulo)
                                .addComponent(introduccion))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textomostrar)
                                .addComponent(textotitulo)
                                .addComponent(textoprecio)
                                .addComponent(textostock, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(textounidades))
                        .addGap(58, 58, 58)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(nombre)
                                                .addGap(42, 42, 42)
                                                .addComponent(textonombre))
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(direccion)
                                                        .addComponent(apellidos))
                                                .addGap(33, 33, 33)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(textodireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                                        .addComponent(textoapellidos)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                .addComponent(comprar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(mostrar))
                        .addContainerGap(77, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(introduccion)
                                .addComponent(textomostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mostrar))
                        .addGap(23, 23, 23)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(titulo)
                                .addComponent(textotitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombre)
                                .addComponent(textonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(precio)
                                .addComponent(textoprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(apellidos)
                                .addComponent(textoapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(stock)
                                .addComponent(textostock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(direccion)
                                .addComponent(textodireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(unidades)
                                .addComponent(textounidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comprar)
                                .addComponent(salir))
                        .addContainerGap(33, Short.MAX_VALUE))
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

        this.setTitle("Compra peliculas");
        this.setVisible(true);
        pack();
    }
}

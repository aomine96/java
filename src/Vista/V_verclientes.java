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
public class V_verclientes extends JFrame {

    //variables
    JPanel panel, panel2;
    JTextArea textoarea;
    JButton vclientes, tclientes, clientesord, busqueda, salir;
    JScrollPane jScrollPane1;
    JTextField textonombre;
    JLabel bnombre, titulo;
//constructores

    public V_verclientes() {
        menu();
    }

    public V_verclientes(JPanel panel, JTextArea textoarea, JButton vclientes, JButton tclientes, JButton clientesord, JButton busqueda, JButton salir, JLabel bnombre, JTextField textonombre) {
        this.panel = panel;
        this.textoarea = textoarea;
        this.vclientes = vclientes;
        this.tclientes = tclientes;
        this.clientesord = clientesord;
        this.busqueda = busqueda;
        this.salir = salir;
        this.bnombre = bnombre;
        this.textonombre = textonombre;
    }

    public JTextArea getTextoarea() {
        return textoarea;
    }

    public void setTextoarea(JTextArea textoarea) {
        this.textoarea = textoarea;
    }

    public JButton getVclientes() {
        return vclientes;
    }

    public void setVclientes(JButton vclientes) {
        this.vclientes = vclientes;
    }

    public JButton getTclientes() {
        return tclientes;
    }

    public void setTclientes(JButton tclientes) {
        this.tclientes = tclientes;
    }

    public JButton getClientesord() {
        return clientesord;
    }

    public void setClientesord(JButton clientesord) {
        this.clientesord = clientesord;
    }

    public JButton getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(JButton busqueda) {
        this.busqueda = busqueda;
    }

    public JButton getSalir() {
        return salir;
    }

    public void setSalir(JButton salir) {
        this.salir = salir;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextField getTextonombre() {
        return textonombre;
    }

    public void setTextonombre(JTextField textonombre) {
        this.textonombre = textonombre;
    }

    //métodos
    public void menu() {
        panel = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoarea = new javax.swing.JTextArea();
        tclientes = new javax.swing.JButton();
        clientesord = new javax.swing.JButton();
        vclientes = new javax.swing.JButton();
        bnombre = new javax.swing.JLabel();
        textonombre = new javax.swing.JTextField();
        busqueda = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel2.setBackground(new java.awt.Color(0, 0, 255));
        panel2.setForeground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("CLIENTES");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(titulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(titulo)
                        .addContainerGap(15, Short.MAX_VALUE))
        );

        textoarea.setColumns(20);
        textoarea.setRows(5);
        textoarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jScrollPane1.setViewportView(textoarea);

        tclientes.setBackground(new java.awt.Color(0, 51, 255));
        tclientes.setForeground(new java.awt.Color(255, 255, 255));
        tclientes.setText("Total Clientes");

        clientesord.setBackground(new java.awt.Color(255, 102, 0));
        clientesord.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clientesord.setForeground(new java.awt.Color(255, 255, 255));
        clientesord.setText("Clientes ord");

        vclientes.setBackground(new java.awt.Color(0, 204, 0));
        vclientes.setForeground(new java.awt.Color(255, 255, 255));
        vclientes.setText("Ver Clientes");

        bnombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnombre.setForeground(new java.awt.Color(0, 0, 255));
        bnombre.setText("Buscar nombre:");

        busqueda.setBackground(new java.awt.Color(204, 0, 0));
        busqueda.setForeground(new java.awt.Color(255, 255, 255));
        busqueda.setText("Busqueda");

        salir.setBackground(new java.awt.Color(255, 255, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tclientes)
                                                .addComponent(bnombre))
                                        .addGap(87, 87, 87)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(clientesord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textonombre))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(vclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(51, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tclientes)
                                .addComponent(clientesord)
                                .addComponent(vclientes))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bnombre)
                                        .addComponent(textonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(busqueda))
                        .addGap(18, 18, 18)
                        .addComponent(salir)
                        .addContainerGap(22, Short.MAX_VALUE))
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

        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Clientes");
        pack();
    }
}

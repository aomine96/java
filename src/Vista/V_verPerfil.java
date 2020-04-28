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
public class V_verPerfil extends JFrame {

    //variables
    private JPanel panel, panel2, panel3;
    private JLabel titulo, nombre, apellidos, email, txtnombre, txtapellidos, txtemail;
    private JButton salir;

    public V_verPerfil() {
        menu();
    }

    public V_verPerfil(JPanel panel, JLabel nombre, JLabel apellidos, JLabel email, JLabel txtnombre, JLabel txtapellidos, JLabel txtemail, JButton salir) {
        this.panel = panel;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.txtnombre = txtnombre;
        this.txtapellidos = txtapellidos;
        this.txtemail = txtemail;
        this.salir = salir;
    }
    //métodos getter && setter

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getNombre() {
        return nombre;
    }

    public void setNombre(JLabel nombre) {
        this.nombre = nombre;
    }

    public JLabel getApellidos() {
        return apellidos;
    }

    public void setApellidos(JLabel apellidos) {
        this.apellidos = apellidos;
    }

    public JLabel getEmail() {
        return email;
    }

    public void setEmail(JLabel email) {
        this.email = email;
    }

    public JLabel getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JLabel txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JLabel getTxtapellidos() {
        return txtapellidos;
    }

    public void setTxtapellidos(JLabel txtapellidos) {
        this.txtapellidos = txtapellidos;
    }

    public JLabel getTxtemail() {
        return txtemail;
    }

    public void setTxtemail(JLabel txtemail) {
        this.txtemail = txtemail;
    }

    public JButton getSalir() {
        return salir;
    }

    public void setSalir(JButton salir) {
        this.salir = salir;
    }

    //métodos
    public void menu() {

        panel = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        txtnombre = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JLabel();
        txtemail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel2.setBackground(new java.awt.Color(0, 0, 255));

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("PERFIL");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(titulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo)
                        .addContainerGap(18, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(0, 0, 255));

        salir.setBackground(new java.awt.Color(255, 0, 0));
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir)
                        .addGap(18, 18, 18))
        );
        panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(salir))
        );

        nombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 255));
        nombre.setText("Nombre:");

        apellidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 255));
        apellidos.setText("Apellidos:");

        email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 255));
        email.setText("Email:");

        txtnombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtnombre.setText("jLabel4");

        txtapellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtapellidos.setText("jLabel5");

        txtemail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtemail.setText("jLabel6");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(email)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtemail))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addComponent(apellidos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtapellidos))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addComponent(nombre)
                                        .addGap(149, 149, 149)
                                        .addComponent(txtnombre)))
                        .addContainerGap(116, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombre)
                                .addComponent(txtnombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(apellidos)
                                .addComponent(txtapellidos))
                        .addGap(43, 43, 43)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(email)
                                .addComponent(txtemail))
                        .addGap(53, 53, 53)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        this.setTitle("Perfil");
        pack();
    }
}

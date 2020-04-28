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
public class V_Darse_Baja extends JFrame {
//variables

    private JPanel panel, panel2, panel3;
    private JLabel usuario, password, sesion;
    private JTextField tusuario, tpassword;
    private JButton baceptar, bcancelar;

    public V_Darse_Baja() {
        menu();
    }

    public V_Darse_Baja(JPanel panel, JLabel usuario, JTextField tusuario, JTextField tpassword, JButton baceptar, JButton bcancelar, JLabel password) {
        this.panel = panel;
        this.usuario = usuario;
        this.tusuario = tusuario;
        this.tpassword = tpassword;
        this.baceptar = baceptar;
        this.bcancelar = bcancelar;
        this.password = password;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getUsuario() {
        return usuario;
    }

    public void setUsuario(JLabel usuario) {
        this.usuario = usuario;
    }

    public JTextField getTusuario() {
        return tusuario;
    }

    public void setTusuario(JTextField tusuario) {
        this.tusuario = tusuario;
    }

    public JTextField getTpass() {
        return tpassword;
    }

    public void setTpass(JTextField tpass) {
        this.tpassword = tpass;
    }

    public JButton getBaceptar() {
        return baceptar;
    }

    public void setBaceptar(JButton baceptar) {
        this.baceptar = baceptar;
    }

    public JButton getBcancelar() {
        return bcancelar;
    }

    public void setBcancelar(JButton bcancelar) {
        this.bcancelar = bcancelar;
    }

    public JLabel getPassword() {
        return password;
    }

    public void setPassword(JLabel password) {
        this.password = password;
    }

    public void menu() {
        panel = new javax.swing.JPanel();
        panel3 = new javax.swing.JPanel();
        sesion = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        tusuario = new javax.swing.JTextField();
        baceptar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        tpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel3.setBackground(new java.awt.Color(51, 51, 255));

        sesion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sesion.setForeground(new java.awt.Color(255, 255, 255));
        sesion.setText("Sesión");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(sesion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(sesion)
                        .addGap(17, 17, 17))
        );

        panel2.setBackground(new java.awt.Color(51, 51, 255));

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

        usuario.setForeground(new java.awt.Color(0, 51, 255));
        usuario.setText("Usuario:");

        password.setForeground(new java.awt.Color(0, 51, 255));
        password.setText("Contraseña:");

        baceptar.setBackground(new java.awt.Color(0, 51, 255));
        baceptar.setForeground(new java.awt.Color(255, 255, 255));
        baceptar.setText("Aceptar");

        bcancelar.setBackground(new java.awt.Color(204, 0, 0));
        bcancelar.setForeground(new java.awt.Color(255, 255, 255));
        bcancelar.setText("Cancelar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usuario)
                                .addComponent(password))
                        .addGap(54, 54, 54)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(baceptar)
                                        .addGap(18, 18, 18)
                                        .addComponent(bcancelar))
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(tpassword))
                                        .addComponent(tusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(57, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(usuario)
                                .addComponent(tusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(password)
                                .addComponent(tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(baceptar)
                                .addComponent(bcancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        this.setVisible(true);
        this.setTitle("Darse de baja");
        pack();
    }
}

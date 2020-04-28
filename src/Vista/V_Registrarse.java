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
public class V_Registrarse extends JFrame {

    //variables
    JPanel panel, panel2;
    JLabel usuario, password, nombre, apellidos, registro;
    JTextField tpassword, tnombre, tapellidos, temail;
    JButton baceptar, bcancelar;

    //constructores
    public V_Registrarse() {
        menu();
    }

    public V_Registrarse(JPanel panel, JLabel usuario, JLabel password, JLabel nombre, JLabel apellidos, JLabel registro, JTextField tpassword, JTextField tnombre, JTextField tapellidos, JTextField temail, JButton baceptar) {
        this.panel = panel;
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.registro = registro;
        this.tpassword = tpassword;
        this.tnombre = tnombre;
        this.tapellidos = tapellidos;
        this.temail = temail;
        this.baceptar = baceptar;
    }

    public JTextField getTpassword() {
        return tpassword;
    }

    public void setTpassword(JTextField tpassword) {
        this.tpassword = tpassword;
    }

    public JTextField getTnombre() {
        return tnombre;
    }

    public void setTnombre(JTextField tnombre) {
        this.tnombre = tnombre;
    }

    public JTextField getTapellidos() {
        return tapellidos;
    }

    public void setTapellidos(JTextField tapellidos) {
        this.tapellidos = tapellidos;
    }

    public JTextField getTemail() {
        return temail;
    }

    public void setTemail(JTextField temail) {
        this.temail = temail;
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

    //métodos
    public void menu() {

        panel = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        registro = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        tnombre = new javax.swing.JTextField();
        tapellidos = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        tpassword = new javax.swing.JTextField();
        baceptar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panel2.setBackground(new java.awt.Color(0, 153, 255));
        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        registro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setText("Registrar");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(registro)
                        .addContainerGap(27, Short.MAX_VALUE))
        );

        nombre.setBackground(new java.awt.Color(51, 153, 255));
        nombre.setForeground(new java.awt.Color(51, 153, 255));
        nombre.setText("Nombre:");

        apellidos.setForeground(new java.awt.Color(51, 153, 255));
        apellidos.setText("Apellidos:");

        usuario.setForeground(new java.awt.Color(0, 153, 255));
        usuario.setText("Email:");

        password.setForeground(new java.awt.Color(51, 153, 255));
        password.setText("Contraseña:");

        baceptar.setBackground(new java.awt.Color(51, 153, 255));
        baceptar.setForeground(new java.awt.Color(255, 255, 255));
        baceptar.setText("Registrar");

        bcancelar.setBackground(new java.awt.Color(204, 0, 0));
        bcancelar.setForeground(new java.awt.Color(255, 255, 255));
        bcancelar.setText("Cancelar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nombre)
                                                .addComponent(apellidos)
                                                .addComponent(usuario)
                                                .addComponent(password))
                                        .addGap(62, 62, 62)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                                .addComponent(tapellidos)
                                                .addComponent(temail)
                                                .addComponent(tpassword, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(baceptar)
                                        .addGap(27, 27, 27)
                                        .addComponent(bcancelar)))
                        .addGap(84, 84, 84))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombre)
                                .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(apellidos)
                                .addComponent(tapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(usuario)
                                .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(password)
                                .addComponent(tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bcancelar)
                                .addComponent(baceptar))
                        .addGap(20, 20, 20))
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
        this.setTitle("Registro");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//CERRAR CON LA VENTANA
        pack();
    }

}

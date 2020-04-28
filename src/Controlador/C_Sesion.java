/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.database;
import Vista.V_Sesion;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class C_Sesion {
//Instancia de la clase

    V_Sesion v = new V_Sesion();
    database db = new database();

    String email = "", pass = "";
    int status = 0;

    //constructor por defecto
    public C_Sesion() {
        cancelar();
        Aceptar();

    }

    //métodos
    public void Aceptar() {
        v.getBaceptar().addActionListener((ActionEvent e) -> {
            //variables para capturar los elementos de la base de datos
            String sql = "SELECT * from usuarios;";//consulta de la base de datos
            try {
                db.conex();
                PreparedStatement st = db.getConexion().prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                String p = String.valueOf(v.getTpassword().getPassword());//pasamos a String el textpassword

                while (rs.next()) {
                    email = rs.getString("email");
                    pass = rs.getString("password");
                    status = rs.getInt("status_usuario");
                    //para poder acceder al administrador deberemos acceder con usuario y contraseña y que el estado sea equivalente a 1 en caso de no
                    if (v.getTusuario().getText().equals(email) && p.equals(pass) && status == 1) {
                        C_Menu_Administrador ad = new C_Menu_Administrador();
                        v.setVisible(false);
                        break;
                    } else if (v.getTusuario().getText().equals(email) && p.equals(pass) && status == 2) {
                        C_Menu_Clientes cl = new C_Menu_Clientes();
                        v.setVisible(false);
                        break;
                    }

                }
                if (!v.getTusuario().getText().equals(email) || !p.equals(pass)) {
                    JOptionPane.showMessageDialog(null, "El email o la contraseña son incorrectos repita");
                }

                db.getConexion().close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

    }

    public void cancelar() {
        v.getBcancelar().addActionListener((ActionEvent e) -> {
            v.setVisible(false);
        });
    }

}

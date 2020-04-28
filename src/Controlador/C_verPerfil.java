/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.database;
import Vista.V_verPerfil;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dani
 */
public class C_verPerfil {

    //instancia
    V_verPerfil vp = new V_verPerfil();
    database db = new database();
    String sql = "";

    //constructor
    public C_verPerfil() {
        misdatos();
        salir();
    }

    //método
    public void misdatos() {

        sql = "select * from usuarios where status_usuario=2";
        db.conex();
        String nombre = "", apellidos = "", email = "";
        try {
            PreparedStatement st = db.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                nombre = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                email = rs.getString("email");
            }
            vp.getTxtnombre().setText(nombre);
            vp.getTxtapellidos().setText(apellidos);
            vp.getTxtemail().setText(email);
            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void salir() {
        vp.getSalir().addActionListener((ActionEvent e) -> {
            vp.setVisible(false);
        });
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.usuarios;
import Vista.V_Registrarse;
import java.awt.event.ActionEvent;

/**
 *
 * @author Dani
 */
public class C_Registrarse {

    V_Registrarse v = new V_Registrarse();
    usuarios u = new usuarios();

    public C_Registrarse() {
        registro();
        cancelar();

    }

    public void registro() {
        v.getBaceptar().addActionListener((ActionEvent e) -> {

            u.setNombre(v.getTnombre().getText());
            u.setApellidos(v.getTapellidos().getText());
            u.setEmail(v.getTemail().getText());
            u.setPass(v.getTpassword().getText());
            u.registro();//método que realiza la consulta de base de datos en el modelo

        });
    }

    public void cancelar() {//salimos de la pantalla de registro de usuarios
        v.getBcancelar().addActionListener((ActionEvent e) -> {
            C_Menu_Principal cm = new C_Menu_Principal();
            v.setVisible(false);

        });

    }

}

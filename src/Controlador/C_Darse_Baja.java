/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.database;
import Modelo.usuarios;
import Vista.V_Darse_Baja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dani
 */
public class C_Darse_Baja {

    V_Darse_Baja vb = new V_Darse_Baja();
    database db = new database();
    usuarios u = new usuarios();

    //constructor
    public C_Darse_Baja() {
        baja();
        cancelar();
    }

    public void baja() {
        vb.getBaceptar().addActionListener((ActionEvent e) -> {
            //pasamos por los set de nuestra clase los valores que le daremos que serán por nuestros textos
            u.setEmail(vb.getTusuario().getText());
            u.setPass(vb.getTpass().getText());

            //invocamos al método
            u.baja();

        });

    }

    public void cancelar() {
        vb.getBcancelar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                vb.setVisible(false);
            }
        });
    }
}

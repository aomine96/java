/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.database;
import Modelo.usuarios;
import Vista.V_verclientes;
import java.awt.event.ActionEvent;

/**
 *
 * @author Dani
 */
public class C_verclientes {
//variables

    database db = new database();
    V_verclientes vc = new V_verclientes();
    usuarios u = new usuarios();

    public C_verclientes() {
        salir();
        verclientes();
        busqueda();
        orden_clientes();
        total_usuarios();

    }

    //métodos
    public void verclientes() {

        vc.getVclientes().addActionListener((ActionEvent e) -> {
            borrado();
            u.mostrar_clientes();//método para ver  a los clientes
            vc.getTextoarea().setText(u.getInfo());//instroducimos la información en el textoarea

        });
    }

    public void orden_clientes() {

        vc.getClientesord().addActionListener((ActionEvent e) -> {
            borrado();//método para resetear la información antes de empezar a mostrar los datos
            u.orden_clientes();
            vc.getTextoarea().setText(u.getInfo());

        });

    }

    public void total_usuarios() {
        vc.getTclientes().addActionListener((ActionEvent e) -> {
            borrado();//método para resetear los datos
            u.total_usuarios();
            vc.getTextoarea().setText(u.getInfo());

        });
    }

    public void busqueda() {
        vc.getBusqueda().addActionListener((ActionEvent e) -> {
            borrado();
            u.setNombre(vc.getTextonombre().getText());

            u.busqueda();
            vc.getTextoarea().setText(u.getInfo());

        });
    }

    public void salir() {
        vc.getSalir().addActionListener((ActionEvent e) -> {
            //     C_Menu_Administrador ca = new C_Menu_Administrador();
            vc.setVisible(false);
        });
    }

    public void borrado() {
        u.setInfo(" ");
        vc.getTextoarea().setText(u.getInfo());
    }
}

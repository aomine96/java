/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.database;
import Modelo.peliculas;
import Modelo.series;
import Vista.V_verProductos;
import java.awt.event.ActionEvent;

/**
 *
 * @author Dani
 */
public class C_verProductos {

    V_verProductos vp = new V_verProductos();
    database db = new database();
    peliculas p = new peliculas();
    series s = new series();

    public C_verProductos() {
        ver_peliculas();
        ver_series();
        salir_programa();
        nombrar_series();
        nombrar_pelis();
    }

    public void nombrar_pelis() {
        vp.getMostrarpelis().addActionListener((ActionEvent e) -> {
            p.setTitulo(vp.getTextopelicula().getText());
            p.nombrar_peliculas();//método para poder mostrar los productos
            //introducimos los valores en texto area para poder mostrarlo
            vp.getTextoarea().setText(p.getInfo());
        });
    }

    public void nombrar_series() {
        vp.getMostrarseries().addActionListener((ActionEvent e) -> {
            s.setTitulo(vp.getTextoseries().getText());
            s.nombrar_series();
            vp.getTextoarea().setText(s.getInfo());

        });
    }

    public void ver_series() {
        vp.getBseries().addActionListener((ActionEvent e) -> {
            s.mostrar_todo();//método para mostrar todas las series
            vp.getTextoarea().setText(s.getInfo());

        });
    }

    public void ver_peliculas() {
        vp.getBpeliculas().addActionListener((ActionEvent e) -> {
            p.mostrar_todo();//método para poder mostrar los productos
            //introducimos los valores en texto area para poder mostrarlo
            vp.getTextoarea().setText(p.getInfo());

        }
        );
    }

    public void salir_programa() {
        vp.getSalir().addActionListener((ActionEvent e) -> {
            C_Menu_Clientes mc = new C_Menu_Clientes();
            vp.setVisible(false);
        });
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.database;
import Modelo.peliculas;
import Vista.V_Peliculas;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

/**
 *
 * @author Dani
 */
public class C_Peliculas {

    V_Peliculas p = new V_Peliculas();
    database db = new database();
    peliculas pe = new peliculas();

    public C_Peliculas() {
        mostrar();
        añadir();
        eliminar();
        modificar();
        salir();
    }

    public void mostrar() {
        p.getMostrar().addActionListener((ActionEvent e) -> {
            pe.setId(Integer.parseInt(p.getJid().getText()));//pasamos el id del producto para poder mostrarlo
            pe.mostrar();//método para poder mostrar los productos

            //introducimos los valores en los textos para poder mostrarlo
            p.getJtitulo().setText(pe.getTitulo());
            p.getJgenero().setText(pe.getGenero());
            p.getJsipnosis().setText(pe.getSipnosis());
            p.getJprecio().setText(String.valueOf(pe.getPrecio()));
            p.getJduracion().setText(String.valueOf(pe.getDuracion()));
            p.getJcantidad().setText(String.valueOf(pe.getCantidad()));
        });
    }

    public void añadir() {
        p.getBañadir().addActionListener((ActionEvent e) -> {
            pe.setTitulo(p.getJtitulo().getText());
            pe.setGenero(p.getJgenero().getText());
            pe.setSipnosis(p.getJsipnosis().getText());
            pe.setDuracion(Double.parseDouble(p.getJduracion().getText()));
            pe.setCantidad(Integer.parseInt(p.getJcantidad().getText()));
            pe.setPrecio(Double.parseDouble(p.getJprecio().getText()));
            pe.añadir();//cargamos el insert

            //realizamos un limpiado de datos para que una vez insertado los datos desaparezcan de los campos de texto
            limpiado_cierre();

        });
    }

    public void eliminar() {
        p.getBeliminar().addActionListener((ActionEvent e) -> {

            pe.setId(Integer.parseInt(p.getJid().getText()));
            pe.eliminar();//invocacion de consulta en base de datos
            //limpiado de datos
            limpiado_cierre();

        });
    }

    public void modificar() {
        p.getBmodificar().addActionListener((ActionEvent e) -> {
            pe.setTitulo(p.getJtitulo().getText());
            pe.setGenero(p.getJgenero().getText());
            pe.setSipnosis(p.getJsipnosis().getText());
            pe.setDuracion(Double.parseDouble(p.getJduracion().getText()));
            pe.setCantidad(Integer.parseInt(p.getJcantidad().getText()));
            pe.setPrecio(Double.parseDouble(p.getJprecio().getText()));
            pe.modificar();//llamada al metodo de la base de datos
            limpiado_cierre();//limpiado de datos

        });
    }

    public void salir() {
        p.getBsalir().addActionListener((ActionEvent e) -> {
            p.setVisible(false);
        });
    }

    //limpiado de datos y cierre conexion
    public void limpiado_cierre() {
        p.getJtitulo().setText("");
        p.getJgenero().setText("");
        p.getJsipnosis().setText("");
        p.getJcantidad().setText("");
        p.getJduracion().setText("");
        p.getJprecio().setText("");
        try {
            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}

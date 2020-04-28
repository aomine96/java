/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.database;
import Modelo.series;
import Vista.V_Series;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

/**
 *
 * @author Dani
 */
public class C_Series {

    V_Series s = new V_Series();
    database db = new database();
    series se = new series();

    public C_Series() {//los métodos los carga el constructor por defecto
        mostrar();
        añadir();
        eliminar();
        modificar();
        salir();
    }

    //métodos
    public void mostrar() {//método para mostrar los productos que tenemos
        s.getMostrar().addActionListener((ActionEvent e) -> {
            //id para poder mmostrar serie deseada
            se.setId(Integer.parseInt(s.getTextid().getText()));
            se.mostrar();//métdo para poder mostrar las series

            //muestra de datos en los textos
            s.getJtitulo().setText(se.getTitulo());
            s.getJgenero().setText(String.valueOf(se.getTemporadas()));
            s.getJsipnosis().setText(se.getSipnosis());
            s.getJcantidad().setText(String.valueOf(se.getCantidad()));
            s.getJprecio().setText(String.valueOf(se.getPrecio()));

        });
    }

    public void añadir() {
        s.getBañadir().addActionListener((ActionEvent e) -> {
            //introducimos los datos para la consulta
            se.setTitulo(s.getJtitulo().getText());
            se.setTemporadas(Integer.parseInt(s.getJgenero().getText()));
            se.setSipnosis(s.getJsipnosis().getText());
            se.setCantidad(Integer.parseInt(s.getJcantidad().getText()));
            se.setPrecio(Double.parseDouble(s.getJprecio().getText()));
            se.añadir();
            //limpiado de articulo una vez introducido
            limpiado();

        });

    }

    public void eliminar() {
        s.getBeliminar().addActionListener((ActionEvent e) -> {

            se.setId(Integer.parseInt(s.getTextid().getText()));
            se.eliminar();
            //limpiado de articulo una vez introducido
            limpiado();

        });
    }

    public void modificar() {
        s.getBmodificar().addActionListener((ActionEvent e) -> {
            //introducimos los datos para la consulta
            se.setTitulo(s.getJtitulo().getText());
            se.setTemporadas(Integer.parseInt(s.getJgenero().getText()));
            se.setSipnosis(s.getJsipnosis().getText());
            se.setCantidad(Integer.parseInt(s.getJcantidad().getText()));
            se.setPrecio(Double.parseDouble(s.getJprecio().getText()));
            se.modificar();
            limpiado();

        });
    }

    public void salir() {
        s.getBsalir().addActionListener((ActionEvent e) -> {
            s.setVisible(false);
            // C_Menu_Administrador ma = new C_Menu_Administrador();
        });
    }

    //limpiado y cierre de conexion
    public void limpiado() {
        s.getJtitulo().setText("");
        s.getJgenero().setText("");
        s.getJsipnosis().setText("");
        s.getJcantidad().setText("");
        s.getJprecio().setText("");
        try {
            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}

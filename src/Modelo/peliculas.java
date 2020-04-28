/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class peliculas {

    //variables
    private int id;
    String titulo, genero, sipnosis, info = " ";
    private double precio, duracion;
    private int cantidad;
    database db = new database();

    //constructores
    public peliculas() {

    }

    public peliculas(String info, int id, String titulo, String genero, String sipnosis, double precio, double duracion, int cantidad) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.sipnosis = sipnosis;
        this.precio = precio;
        this.duracion = duracion;
        this.cantidad = cantidad;
        this.info = info;
    }
    //métodos getter && setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    //métodos de consulta en nuestro modelo
    public void mostrar() {
        int id = this.getId();
        String sql = "";
        db.conex();
        int resp;
        ResultSet rs;
        try {
            sql = "select * from peliculas where id =" + id;
            PreparedStatement st = db.getConexion().prepareStatement(sql);

            rs = st.executeQuery();

            if (rs.next()) {
                titulo = rs.getString("titulo");
                genero = rs.getString("genero");
                sipnosis = rs.getString("sipnosis");
                precio = rs.getDouble("precio");
                duracion = rs.getDouble("duracion");
                cantidad = rs.getInt("cantidad");
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningun titulo con ese id actualmente");

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void añadir() {
        String titulo = this.getTitulo();
        String genero = this.getGenero();
        String sipnosis = this.getSipnosis();
        double duracion = this.getDuracion();
        int cantidad = this.getCantidad();
        double precio = this.getPrecio();

        String sql = "";
        db.conex();
        try {
            Statement st = db.getConexion().createStatement();
            sql = "insert into peliculas values (NULL,date(),"
                    + "'" + titulo + "',"
                    + "'" + genero + "',"
                    + "'" + sipnosis + "',"
                    + "'" + duracion + "',"
                    + "'" + cantidad + "',"
                    + "'" + precio + "')";

            int resp = JOptionPane.showConfirmDialog(null, "¿Desea insertar la pelicula?", "Pulsaste el boton", 1);
            if (resp == JOptionPane.YES_OPTION) {
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se pudo añadir la pelicula debido algun error");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo añadir la pelicula debido algun error");
            }
            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
//eliminacion de productos

    public void eliminar() {
        int id = this.getId();
        String sql = "";
        db.conex();
        try {
            Statement st = db.getConexion().createStatement();
            sql = "DELETE from peliculas where id =" + id;
            int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este producto?", "Pulsaste el boton eliminar", 1);
            if (resp == JOptionPane.YES_OPTION) {
                st.executeUpdate(sql);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la pelicula");
            }
            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
//modificacion de productos

    public void modificar() {
        String titulo = this.getTitulo();
        String genero = this.getGenero();
        String sipnosis = this.getSipnosis();
        double duracion = this.getDuracion();
        int cantidad = this.getCantidad();
        double precio = this.getPrecio();
        String sql = "";
        int resp;
        db.conex();
        try {
            Statement st = db.getConexion().createStatement();
            sql = "UPDATE peliculas set titulo ='" + titulo + "'," + "genero =" + "'" + genero
                    + "'," + "sipnosis =" + "'" + sipnosis + "'," + "cantidad =" + "'" + cantidad + "'," + "duracion="
                    + "'" + duracion + "'," + "precio=" + "'" + precio + "'" + "where id =" + duracion;
            resp = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos del producto?", "Pulsaste el boton modificar", 1);
            if (resp == JOptionPane.YES_OPTION) {
                st.executeUpdate(sql);
            } else {
                JOptionPane.showMessageDialog(null, "No se modifico nada");
            }
            JOptionPane.showMessageDialog(null, "Se modifico el articulo deseado");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //método para el controlador de los productos
    public void mostrar_todo() {
        String sql = "";
        db.conex();
        int resp;
        ResultSet rs;
        try {
            sql = "select * from peliculas";
            PreparedStatement st = db.getConexion().prepareStatement(sql);
            resp = JOptionPane.showConfirmDialog(null, "¿Desea ver los datos de este articulo?", "Pulsaste el boton de mostrar", 1);
            if (resp == JOptionPane.YES_OPTION) {
                rs = st.executeQuery();
                while (rs.next()) {
                    titulo = rs.getString("titulo");
                    genero = rs.getString("genero");
                    sipnosis = rs.getString("sipnosis");
                    precio = rs.getDouble("precio");
                    duracion = rs.getDouble("duracion");
                    cantidad = rs.getInt("cantidad");

                    info = info + this.getTitulo() + " ->" + this.getSipnosis() + "->" + this.getDuracion() + "->" + this.getDuracion() + "->" + this.getCantidad() + "\n";
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra el articulo");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //méotodo para ver pelicula en concreto
    public void nombrar_peliculas() {
        String sql = "";
        String t = this.getTitulo();
        ResultSet rs;
        int resp;
        db.conex();
        try {
            sql = "select * from peliculas  where titulo LIKE" + "'" + t + "'";
            PreparedStatement st = db.getConexion().prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                titulo = rs.getString("titulo");
                genero = rs.getString("genero");
                sipnosis = rs.getString("sipnosis");
                precio = rs.getDouble("precio");
                duracion = rs.getDouble("duracion");
                cantidad = rs.getInt("cantidad");

                info = info + this.getTitulo() + " ->" + this.getSipnosis() + "->" + this.getPrecio() + "->" + this.getDuracion() + "->" + this.getCantidad() + "\n";
            } else {
                JOptionPane.showMessageDialog(null, "No tenemos la pelicula que desea ver");
            }

            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

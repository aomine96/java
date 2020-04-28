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
public class series {

    //variables
    private int id, cantidad;
    private String titulo, info = " ";
    private int temporadas;
    private String sipnosis;
    private double precio;
    database db = new database();

    //constructores
    public series() {

    }

    public series(String info, int id, int cantidad, String titulo, int temporadas, String sipnosis, double precio) {
        this.id = id;
        this.cantidad = cantidad;
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.sipnosis = sipnosis;
        this.precio = precio;
        this.info = info;
    }
    //métodos getter && setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

//métodos
    public void mostrar() {
        int id = this.getId();
        String sql = "";
        db.conex();
        int resp;
        ResultSet rs;
        try {
            sql = "select * from series where id =" + id;
            PreparedStatement st = db.getConexion().prepareStatement(sql);
            resp = JOptionPane.showConfirmDialog(null, "¿Desea ver los datos de este articulo?", "Pulsaste el boton de mostrar", 1);
            if (resp == JOptionPane.YES_OPTION) {
                rs = st.executeQuery();
                while (rs.next()) {
                    titulo = rs.getString("titulo");
                    temporadas = rs.getInt("temporadas");
                    sipnosis = rs.getString("sipnosis");
                    cantidad = rs.getInt("cantidad");
                    precio = rs.getDouble("precio");

                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra el articulo");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void añadir() {
        String titulo = this.getTitulo();
        int temporadas = this.getTemporadas();
        String sipnosis = this.getSipnosis();
        int cantidad = this.getCantidad();
        double precio = this.getPrecio();
        String sql = "";
        int resp;
        db.conex();
        try {
            Statement st = db.getConexion().createStatement();
            sql = "insert into series values (NULL,date(),"
                    + "'" + titulo + "',"
                    + "'" + temporadas + "',"//temporadas
                    + "'" + sipnosis + "',"
                    + "'" + cantidad + "',"
                    + "'" + precio + "')";
            resp = JOptionPane.showConfirmDialog(null, "¿Desea insertar la serie?", "Pulsaste el boton añadir", 1);
            if (resp == JOptionPane.YES_OPTION) {
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se ha insertado la serie");
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no inserto ningun articulo");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void eliminar() {
        int id = this.getId();
        String sql = "";
        int resp;
        db.conex();
        try {
            Statement st = db.getConexion().createStatement();
            sql = "DELETE from series where id =" + id;
            resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este producto?", "Pulsaste el boton eliminar", 1);
            if (resp == JOptionPane.YES_OPTION) {
                st.executeUpdate(sql);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la serie");
            }
            JOptionPane.showMessageDialog(null, "Exito al eliminar la serie");
            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void modificar() {
        String titulo = this.getTitulo();
        int temporadas = this.getTemporadas();
        String sipnosis = this.getSipnosis();
        int cantidad = this.getCantidad();
        double precio = this.getPrecio();
        String sql = "";
        int resp;
        db.conex();
        try {
            Statement st = db.getConexion().createStatement();
            //consulta para modificar los datos que previamente se mostraran por pantalla
            sql = "UPDATE series set titulo ='" + titulo + "'," + "temporadas =" + "'" + temporadas
                    + "'," + "sipnosis =" + "'" + sipnosis + "'," + "cantidad =" + "'" + cantidad + "',"
                    + "precio=" + "'" + precio + "'" + "where id =" + id;
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

    public void mostrar_todo() {
        String sql = "";
        db.conex();
        int resp;
        ResultSet rs;
        try {
            sql = "select * from series";
            PreparedStatement st = db.getConexion().prepareStatement(sql);
            resp = JOptionPane.showConfirmDialog(null, "¿Desea ver los datos de este articulo?", "Pulsaste el boton de mostrar", 1);
            if (resp == JOptionPane.YES_OPTION) {
                rs = st.executeQuery();
                while (rs.next()) {
                    titulo = rs.getString("titulo");
                    temporadas = rs.getInt("temporadas");
                    sipnosis = rs.getString("sipnosis");
                    precio = rs.getDouble("precio");
                    cantidad = rs.getInt("cantidad");

                    info = info + this.getTitulo() + "->" + this.getTemporadas() + "->" + this.getSipnosis() + "->" + this.getPrecio() + "->" + this.getCantidad() + "\n";
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra el articulo");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void nombrar_series() {
        String sql = "";
        String t = this.getTitulo();
        ResultSet rs;
        int resp;
        db.conex();
        try {
            sql = "select * from series  where titulo LIKE" + "'" + t + "'";
            PreparedStatement st = db.getConexion().prepareStatement(sql);

            rs = st.executeQuery();

            if (rs.next()) {
                titulo = rs.getString("titulo");
                temporadas = rs.getInt("temporadas");
                sipnosis = rs.getString("sipnosis");
                precio = rs.getDouble("precio");
                cantidad = rs.getInt("cantidad");

                info = info + this.getTitulo() + "->" + this.getTemporadas() + "->" + this.getSipnosis() + "->" + this.getPrecio() + "->" + this.getCantidad() + "\n";
            } else {
                JOptionPane.showMessageDialog(null, "La serie que desea ver no la tenemos en estos momentos");
            }

            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

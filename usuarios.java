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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class usuarios {

    //variables
    String nombre, apellidos, email, pass, info = " ";
    int id;
    database db = new database();

    //constructores
    public usuarios() {

    }

    public usuarios(int id, String nombre, String apellidos, String email, String pass) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.pass = pass;
        this.id = id;

    }
    //métodos getter && setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String patt = "^([A-ZÁÉÍÓÚ]{1}[a-zñáéíóú]+[\\s]*)+$";
        Pattern pat = Pattern.compile(patt);
        Matcher mat = pat.matcher(nombre);

        if (mat.matches()) {
            this.nombre = nombre;
        } else {
            JOptionPane.showMessageDialog(null, "Nombre no válido,solo carácteres");
        }

    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String patt = "^[A-Za-zƒŠŒŽšœžŸÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖØÙÚÛÜÝÞßàáâãäåæçèé êëìíîïðñòóôõöøùúûüýþÿ\\s]*$";
        Pattern pat = Pattern.compile(patt);
        Matcher mat = pat.matcher(apellidos);

        if (mat.matches()) {
            this.apellidos = apellidos;
        } else {
            JOptionPane.showMessageDialog(null, "Apellidos no válido");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern pat = Pattern.compile("([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*)");
        Matcher mat = pat.matcher(email);

        if (mat.matches()) {
            this.email = email;
        } else {
            JOptionPane.showMessageDialog(null, "Email no válido");
        }

    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    //métodos
    public void registro() {
        String nombre = this.getNombre();
        String apellidos = this.getApellidos();
        String email = this.getEmail();
        String password = this.getPass();

        String sql = "";
        db.conex();
        try {
            Statement st = db.getConexion().createStatement();
            //creamos consulta para insertar los usuarios en la bd
            sql = "insert into usuarios values (NULL,2,date(),"
                    + "'" + nombre + "',"
                    + "'" + apellidos + "',"
                    + "'" + email + "',"
                    + "'" + password + "')";
            if (email != null && nombre != null && apellidos != null) {
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "El registro fue completado");
            } else if (email == null || email == " " && nombre == null || nombre == " " && apellidos == null || apellidos == " ") {
                JOptionPane.showMessageDialog(null, "No se pudo completar el registro");
            }

            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //método para tramitar la baja del cliente
    public void baja() {
        String email = this.getEmail();
        String password = this.getPass();
        String sql = "";
        int resp;
        db.conex();
        try {
            Statement st = db.getConexion().createStatement();
            sql = "DELETE from usuarios where email =" + "'" + email + "'" + "and password=" + "'" + password + "'";
            if (email != null && password != null) {//pendiente
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "El usuario fue dado de baja");
                System.exit(0);
            } else if (email == null || email != " " && password == null || password == " ") {
                JOptionPane.showMessageDialog(null, "Usted no pudo ser dado de baja el email o la contraseña son incorrectos");
            }
            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //métodos para ver a los usuarios del controlador ver-clientes
    public void mostrar_clientes() {
        String sql = "";
        db.conex();
        try {
            //realizamos consulta para visualizar a los clientes en el texto area
            sql = "select * from usuarios where status_usuario =2";
            PreparedStatement st = db.getConexion().prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                id = rs.getInt("id");
                nombre = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                email = rs.getString("email");
                info = info + "id: " + this.getId() + " - nombre :" + this.getNombre() + " - apellidos: " + this.getApellidos() + "- email: " + this.getEmail() + "\n";
            }

            db.getConexion().close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    //método para ver en orden los clientes
    public void orden_clientes() {
        String sql = "";
        db.conex();
        try {
            sql = "select * from usuarios where status_usuario=2 ORDER BY nombre ASC";
            PreparedStatement st = db.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                id = rs.getInt("id");
                nombre = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                email = rs.getString("email");

                info = info + "id: " + this.getId() + " - nombre :" + this.getNombre() + " - apellidos: " + this.getApellidos() + "- email: " + this.getEmail() + "\n";

            }
            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

//método para contabilizar los usuarios
    public void total_usuarios() {
        db.conex();
        try {
            String sql = "select count(id) from usuarios where status_usuario=2";//consulta para ver cuantos clientes tenemos en la bd
            PreparedStatement st = db.getConexion().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
                info = "El total de clientes son: " + id;
            }
            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //método para buscar un usuario en concreto
    public void busqueda() {
        String n = this.getNombre();
        db.conex();

        try {
            //consulta para ver por entrada de teclado el cliente especifico que deseamos
            String sql = "select * from usuarios where nombre LIKE" + "'" + n + "'" + "and status_usuario=2";
            PreparedStatement st = db.getConexion().prepareStatement(sql);

            ResultSet rs = st.executeQuery();//iniciamos la consulta

            if (rs.next()) {
                nombre = rs.getString("nombre");
                apellidos = rs.getString("apellidos");
                email = rs.getString("email");

                info = info + this.getNombre() + " -- " + this.getApellidos() + " -- " + this.getEmail();
            } else {
                JOptionPane.showMessageDialog(null, "No hay ningun cliente con ese nombre actualmente");
            }

            db.getConexion().close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

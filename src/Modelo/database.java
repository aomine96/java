/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dani
 */
public class database {

    //variables
    Connection conexion;

    Statement sentencia = null;
    ResultSet rs;
    PreparedStatement st = null;

    public database() {
        conex();
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Statement getSentencia() {
        return sentencia;
    }

    public void setSentencia(Statement sentencia) {
        this.sentencia = sentencia;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public PreparedStatement getSt() {
        return st;
    }

    public void setSt(PreparedStatement st) {
        this.st = st;
    }

    public void conex() {

        try {
            String url = "jdbc:sqlite:src\\Modelo\\tienda.db";
            String controlador = "org.sqlite.JDBC";
            Class.forName(controlador);
            conexion = DriverManager.getConnection(url);
            if (conexion != null) {
                //   System.out.println("La conexión ha tenido exito");
            } else {
                System.out.println("No se ha podido conectar");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    /*
     public void selecto() throws SQLException {
     String sql = "select * from usuarios";
     PreparedStatement st = conexion.prepareStatement(sql);

     rs = st.executeQuery();

     while (rs.next()) {
     String nombre = rs.getString("nombre");
     System.out.println(nombre);
     }
     conexion.close();

     }
     */

}

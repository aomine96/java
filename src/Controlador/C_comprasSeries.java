/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.database;
import Vista.V_comprarSeries;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Dani
 */
public class C_comprasSeries {

    //variables
    V_comprarSeries cs = new V_comprarSeries();
    database db = new database();

    public C_comprasSeries() {
        mostrar();
        calculos();
        salir();
    }

    //métodos
    public void mostrar() {

        cs.getMostrar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "", titulo = "", precio = "", cantidad = "";
                ResultSet rs;
                db.conex();
                int resp;
                try {
                    sql = "select * from series where titulo LIKE " + "'" + cs.getTextomostrar().getText() + "'";
                    PreparedStatement st = db.getConexion().prepareStatement(sql);
                    resp = JOptionPane.showConfirmDialog(null, "¿Este es el producto que desea?", "Producto para compra", 1);
                    if (resp == JOptionPane.YES_OPTION) {
                        rs = st.executeQuery();
                        while (rs.next()) {
                            titulo = rs.getString("titulo");
                            precio = rs.getString("precio");
                            cantidad = rs.getString("cantidad");
                        }
                        cs.getTextotitulo().setText(titulo);
                        cs.getTextoprecio().setText(precio);
                        cs.getTextostock().setText(cantidad);

                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

    }

    public void calculos() {
        cs.getComprar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = 0;
                String sql = "";
                db.conex();
                int resp;
                try {
                    Statement st = db.getConexion().createStatement();
                    sql = "insert into compras values(null,date(),"
                            + "'" + cs.getTextotitulo().getText() + "',"
                            + "'" + cs.getTextoprecio().getText() + "',"
                            + "'" + cs.getTextounidades().getText() + "',"
                            + "'" + cs.getTextonombre().getText() + "',"
                            + "'" + cs.getTextoapellidos().getText() + "',"
                            + "'" + cs.getTextodireccion().getText() + "')";
                    String sql2 = "update peliculas set cantidad = cantidad -" + "'" + cs.getTextounidades().getText() + "'" + " where titulo LIKE " + "'" + cs.getTextomostrar().getText() + "'";
                    JTextField n = cs.getTextoprecio();
                    String s = n.getText();
                    double numero = Double.parseDouble(s);

                    JTextField n2 = cs.getTextounidades();
                    String s2 = n2.getText();
                    double numero2 = Double.parseDouble(s2);

                    JTextField n3 = cs.getTextostock();
                    String s3 = n3.getText();
                    double numero3 = Double.parseDouble(s3);

                    if (numero3 > numero2) {
                        resultado = numero * numero2;

                    } else {
                        JOptionPane.showMessageDialog(null, "No puede sobrepasar las existencias actuales");
                    }

                    resp = JOptionPane.showConfirmDialog(null, "¿Desea efectuar esta compra por un total de " + Math.round(resultado * 100) / 100 + "€" + "?", "Pulso comprar", 1);
                    if (resp == JOptionPane.YES_OPTION) {
                        st.executeUpdate(sql);
                        st.executeUpdate(sql2);
                        JOptionPane.showMessageDialog(null, "Su compra fue un exito");
                    } else if (resp == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(null, "La compra no fue realizada");
                    } else {
                        JOptionPane.showMessageDialog(null, "Pudo haber problemas al realizar su compra");
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
//método para salir de ventana

    public void salir() {
        cs.getSalir().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cs.setVisible(false);
            }
        });
    }
}

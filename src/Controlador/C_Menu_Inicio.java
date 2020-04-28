/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.V_Menu_Inicio;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class C_Menu_Inicio {

    //Instanciamos la vista del menu inicio para poder manejarla en el controlador
    V_Menu_Inicio m = new V_Menu_Inicio();

    //Constructores
    public C_Menu_Inicio() {
        inicio();
        salir();
        detalles();

    }

    //métodos
    public void inicio() {//Instanciamos la clase del menu principal dentro del método para poder acceder a ella
        m.getBinicio().addActionListener((ActionEvent e) -> {
            C_Menu_Principal mp = new C_Menu_Principal();
            m.setVisible(false);
        });
        //métodos de ratón
        m.getBinicio().addMouseListener((new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getSource() == m.getBinicio()) {
                    m.getBinicio().setBackground(Color.RED);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (e.getSource() == m.getBinicio()) {
                    m.getBinicio().setBackground(Color.WHITE);
                }
            }
        }));
    }

    public void detalles() {//metodo para indicar quien creo la aplicación
        m.getBdetalles().addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(m.getBdetalles(), "Esta aplicación fue creada por Daneri :)");
        });
        //métodos de raton
        m.getBdetalles().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                m.getBdetalles().setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                m.getBdetalles().setBackground(Color.WHITE);
            }
        });
    }

    public void salir() {//método para salir del programa
        m.getBsalir().addActionListener((ActionEvent e) -> {
            int i = JOptionPane.showConfirmDialog(m.getBsalir(), "¿Desea salir del progama?", "Pulsate el botón", 1);
            if (i == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
        //métodos de ratón
        m.getBsalir().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                m.getBsalir().setBackground(Color.DARK_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                m.getBsalir().setBackground(Color.WHITE);
            }
        });
    }

}

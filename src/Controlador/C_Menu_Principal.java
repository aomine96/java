/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.V_Menu_Principal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class C_Menu_Principal {

    //Instanciamos la vista del menu principal
    V_Menu_Principal mp = new V_Menu_Principal();

    //Constructores
    public C_Menu_Principal() { // sobrecargamos los métodos en el constructor por defecto
        sesion();
        volver();
        salir();
        registro();
    }

    //métodos
    public void sesion() {
        mp.getBsesion().addActionListener((ActionEvent e) -> {
            C_Sesion c = new C_Sesion();
            mp.setVisible(false);
        });
        //métodos de ratón
        mp.getBsesion().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mp.getBsesion().setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mp.getBsesion().setBackground(Color.white);
            }
        });

    }

    public void volver() { // método para volver al menu principal
        mp.getBmenup().addActionListener((ActionEvent e) -> {
            C_Menu_Inicio mi = new C_Menu_Inicio();
            mp.setVisible(false);
        });
        //métodos de ratón
        mp.getBmenup().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mp.getBmenup().setBackground(Color.yellow);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mp.getBmenup().setBackground(Color.white);
            }
        });
    }

    public void salir() {//método para salir del programa con previa confirmación del usuario
        mp.getBsalir().addActionListener((ActionEvent e) -> {
            int i = JOptionPane.showConfirmDialog(mp.getBsalir(), "¿Desea salir del programa?", "Pulsaste el botón", 1);
            if (i == JOptionPane.YES_OPTION) {
                System.exit(0);
            }

        });
        //métodos de ratón
        mp.getBsalir().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mp.getBsalir().setBackground(Color.ORANGE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mp.getBsalir().setBackground(Color.white);
            }
        });
    }

    public void registro() {
        mp.getRegistrarse().addActionListener((ActionEvent e) -> {
            C_Registrarse r = new C_Registrarse();
        });
        //métodos de ratón
        mp.getRegistrarse().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mp.getRegistrarse().setBackground(Color.MAGENTA);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mp.getRegistrarse().setBackground(Color.white);
            }
        });

    }

}

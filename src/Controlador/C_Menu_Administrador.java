/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.V_Menu_Administrador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Dani
 */
public class C_Menu_Administrador {

    V_Menu_Administrador ad = new V_Menu_Administrador();

    public C_Menu_Administrador() {
        atajos();
        ver_peliculas();
        ver_series();
        ver_clientes();
        salir();
        menuprincipal();
        cambiar_fondo1();
        cambiar_fondo2();
        cambiar_fondo3();
    }

    public void atajos() {
        ad.getItem1().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        ad.getItem2().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        ad.getItem3().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        ad.getItem4().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        ad.getItem5().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.ALT_MASK));
        ad.getItem6().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.ALT_MASK));
        ad.getItem7().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        ad.getItem8().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

    }
//métodos

    public void ver_peliculas() {
        ad.getItem1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                C_Peliculas p = new C_Peliculas();
                // ad.setVisible(false);
            }
        });
    }

    //método ver serie
    public void ver_series() {
        ad.getItem2().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                C_Series s = new C_Series();
                //  ad.setVisible(false);
            }
        });
    }

    //método para ver clientes
    public void ver_clientes() {
        ad.getItem3().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                C_verclientes cl = new C_verclientes();
                //   ad.setVisible(false);
            }
        });
    }

    public void salir() {
        ad.getItem8().addActionListener((ActionEvent e) -> {
            int resp = JOptionPane.showConfirmDialog(ad, "¿Desea Salir del programa?", "Pulsaste el boton", 1);
            if (resp == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
    }

    public void menuprincipal() {
        ad.getItem7().addActionListener((ActionEvent e) -> {
            C_Menu_Principal cp = new C_Menu_Principal();
            ad.setVisible(false);
        });
    }

    public void cambiar_fondo1() {
        ad.getItem4().addActionListener((ActionEvent e) -> {
            ad.getPanel().setBackground(Color.red);
        });
    }

    public void cambiar_fondo2() {
        ad.getItem5().addActionListener((ActionEvent e) -> {
            ad.getPanel().setBackground(Color.yellow);
        });
    }

    public void cambiar_fondo3() {
        ad.getItem6().addActionListener((ActionEvent e) -> {
            ad.getPanel().setBackground(Color.darkGray);
        });
    }
}

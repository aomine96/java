/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.V_Menu_Clientes;
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
public class C_Menu_Clientes {

    V_Menu_Clientes c = new V_Menu_Clientes();

    public C_Menu_Clientes() {
        ver_productos();
        volver_menuprincipal();
        salir_programa();
        cambiar_fondo1();
        cambiar_fondo2();
        cambiar_fondo3();
        atajos();
        darse_de_baja();
        perfil();
        compras_de_peliculas();
        compras_de_series();
    }

    //métodos
    public void atajos() {
        //    c.getItem1().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        c.getItem2().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        c.getItem3().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        c.getItem4().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        c.getItem5().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.ALT_MASK));
        c.getItem6().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.ALT_MASK));
        c.getItem7().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        c.getItem8().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        c.getItem9().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
    }

    public void ver_productos() {
        c.getItem2().addActionListener((ActionEvent e) -> {
            C_verProductos cv = new C_verProductos();
            c.setVisible(false);
        });
    }

    public void volver_menuprincipal() {
        c.getItem7().addActionListener((ActionEvent e) -> {
            C_Menu_Principal cp = new C_Menu_Principal();
            c.setVisible(false);
        });
    }

    public void salir_programa() {
        c.getItem8().addActionListener((ActionEvent e) -> {
            int resp = JOptionPane.showConfirmDialog(c, "¿Desea Salir del programa?", "Pulsaste el boton", 1);
            if (resp == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
    }

    public void perfil() {
        c.getItem3().addActionListener((ActionEvent e) -> {
            C_verPerfil cp = new C_verPerfil();
        });
    }

    public void cambiar_fondo1() {
        c.getItem4().addActionListener((ActionEvent e) -> {
            c.getPanel().setBackground(Color.red);
        });
    }

    public void cambiar_fondo2() {
        c.getItem5().addActionListener((ActionEvent e) -> {
            c.getPanel().setBackground(Color.yellow);
        });
    }

    public void cambiar_fondo3() {
        c.getItem6().addActionListener((ActionEvent e) -> {
            c.getPanel().setBackground(Color.darkGray);
        });
    }

    public void darse_de_baja() {
        c.getItem9().addActionListener((ActionEvent e) -> {
            C_Darse_Baja cb = new C_Darse_Baja();
        });
    }

    public void compras_de_peliculas() {
        c.getItempeliculas().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                C_comprasPeliculas p = new C_comprasPeliculas();
            }
        });
    }

    public void compras_de_series() {
        c.getItemseries().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                C_comprasSeries cs = new C_comprasSeries();
            }
        });
    }

}

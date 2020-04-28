/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Dani
 */
public class V_Menu_Administrador extends JFrame {

    //variables
    //JPopupMenu jPopupMenu1;
    private JPanel panel;
    private JMenuBar menubar;
    private JMenu menu1, menu2, menu3, menu4;
    private JMenuItem item1, item2, item3, item4, item5, item6, item7, item8;

    //constructores
    public V_Menu_Administrador() {
        menu();
    }

    public V_Menu_Administrador(JPanel panel, JMenuBar menubar, JMenu menu1, JMenu menu2, JMenu menu3, JMenu menu4, JMenuItem item1, JMenuItem item2, JMenuItem item3, JMenuItem item4, JMenuItem item5, JMenuItem item6, JMenuItem item7, JMenuItem item8) {
        this.panel = panel;
        this.menubar = menubar;
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
        this.menu4 = menu4;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.item6 = item6;
        this.item7 = item7;
        this.item8 = item8;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JMenuItem getItem7() {
        return item7;
    }

    public void setItem7(JMenuItem item7) {
        this.item7 = item7;
    }

    public JMenuItem getItem8() {
        return item8;
    }

    public void setItem8(JMenuItem item8) {
        this.item8 = item8;
    }

    public JMenu getMenu1() {
        return menu1;
    }

    public void setMenu1(JMenu menu1) {
        this.menu1 = menu1;
    }

    public JMenu getMenu2() {
        return menu2;
    }

    public void setMenu2(JMenu menu2) {
        this.menu2 = menu2;
    }

    public JMenu getMenu3() {
        return menu3;
    }

    public void setMenu3(JMenu menu3) {
        this.menu3 = menu3;
    }

    public JMenu getMenu4() {
        return menu4;
    }

    public void setMenu4(JMenu menu4) {
        this.menu4 = menu4;
    }

    public JMenuItem getItem1() {
        return item1;
    }

    public void setItem1(JMenuItem item1) {
        this.item1 = item1;
    }

    public JMenuItem getItem2() {
        return item2;
    }

    public void setItem2(JMenuItem item2) {
        this.item2 = item2;
    }

    public JMenuItem getItem3() {
        return item3;
    }

    public void setItem3(JMenuItem item3) {
        this.item3 = item3;
    }

    public JMenuItem getItem4() {
        return item4;
    }

    public void setItem4(JMenuItem item4) {
        this.item4 = item4;
    }

    public JMenuItem getItem5() {
        return item5;
    }

    public void setItem5(JMenuItem item5) {
        this.item5 = item5;
    }

    public JMenuItem getItem6() {
        return item6;
    }

    public void setItem6(JMenuItem item6) {
        this.item6 = item6;
    }

    //métodos
    public void menu() {

        panel = new javax.swing.JPanel();
        menubar = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        item1 = new javax.swing.JMenuItem();
        item2 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        item3 = new javax.swing.JMenuItem();
        menu4 = new javax.swing.JMenu();
        item7 = new javax.swing.JMenuItem();
        item8 = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();
        item4 = new javax.swing.JMenuItem();
        item5 = new javax.swing.JMenuItem();
        item6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 697, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 392, Short.MAX_VALUE)
        );

        menu1.setText("Productos");

        item1.setText("Peliculas");
        menu1.add(item1);

        item2.setText("Series");
        menu1.add(item2);

        menubar.add(menu1);

        menu2.setText("Clientes");

        item3.setText("Ver Clientes");
        menu2.add(item3);

        menubar.add(menu2);

        menu4.setText("Opciones");

        item7.setText("Volver Al Menu Principal");
        menu4.add(item7);

        item8.setText("Salir");
        menu4.add(item8);

        menubar.add(menu4);

        menu3.setText("Cambiar Fondo");

        item4.setText("Fondo 1");
        menu3.add(item4);

        item5.setText("Fondo 2");
        menu3.add(item5);

        item6.setText("Fondo 3");
        menu3.add(item6);

        menubar.add(menu3);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

        this.setVisible(true);

        this.setTitle("Panel del administrador");
    }
}

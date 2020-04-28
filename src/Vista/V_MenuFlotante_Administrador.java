/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Dani
 */
public class V_MenuFlotante_Administrador extends JPopupMenu {

    //variables
    JMenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9;

    public V_MenuFlotante_Administrador() {
        MenuF();
    }

    public V_MenuFlotante_Administrador(JMenuItem item1, JMenuItem item2, JMenuItem item3, JMenuItem item4, JMenuItem item5, JMenuItem item6, JMenuItem item7, JMenuItem item8, JMenuItem item9) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.item6 = item6;
        this.item7 = item7;
        this.item8 = item8;
        this.item9 = item9;
    }

//métodos getter && setter
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

    public JMenuItem getItem9() {
        return item9;
    }

    public void setItem9(JMenuItem item9) {
        this.item9 = item9;
    }

    public void MenuF() {
        //creando los elementos para el menu flotante
        item1 = new JMenuItem(" peliculas");
        item2 = new JMenuItem(" Series");
        item3 = new JMenuItem("Ver Clientes");
        item4 = new JMenuItem("Fondo 1");
        item5 = new JMenuItem("Fondo 2");
        item6 = new JMenuItem(" Fondo 3");
        item7 = new JMenuItem("Volver al menu principal");
        item8 = new JMenuItem("Salir");
        item9 = new JMenuItem("Ayuda");

        //Añadimos los elementos al menu flotante
        this.add(item1);
        this.add(item2);
        this.add(item3);
        this.add(item4);
        this.add(item5);
        this.add(item6);
        this.add(item7);
        this.add(item8);
        this.add(item9);

    }

}

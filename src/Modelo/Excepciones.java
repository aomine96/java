/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dani
 */
public class Excepciones extends Exception {

    int codigoError;

    public Excepciones() {

    }

    public Excepciones(int codigoError) {
        super();
        this.codigoError = codigoError;
    }

    @Override
    public String getMessage() {
        String mensaje = "";
        try {
            switch (codigoError) {
                case 111:
                    JOptionPane.showMessageDialog(null, "Escriba el nombre correctamente");
                    break;
            }

        } catch (Exception ex) {
            Logger.getLogger(Excepciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mensaje;
    }
}

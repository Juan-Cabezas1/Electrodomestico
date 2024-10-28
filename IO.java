/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomestico;

/**
 *
 * @author h
 */

import javax.swing.JOptionPane;

public class IO {

    public static String leerEntrada(String mensaje) {
        return JOptionPane.showInputDialog(null, mensaje);
    }

    public static void mostrarSalida(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

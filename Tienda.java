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

import javax.swing.JOptionPane;

public class Tienda {
    private Electrodomestico electrodomestico1;
    private Electrodomestico electrodomestico2;
    private Electrodomestico electrodomestico3;
    private Electrodomestico electrodomestico4;

   
    public void agregarElectrodomestico(Electrodomestico e1, Electrodomestico e2, Electrodomestico e3, Electrodomestico e4) {
        this.electrodomestico1 = e1;
        this.electrodomestico2 = e2;
        this.electrodomestico3 = e3;
        this.electrodomestico4 = e4;
    }

    
    public void mostrarInformacion() {
        String info = "Información de los electrodomésticos: \n\n" +
                      electrodomestico1.toString() + " \n " +
                      electrodomestico2.toString() + " \n " +
                      electrodomestico3.toString() + " \n " +
                      electrodomestico4.toString();
        
        JOptionPane.showMessageDialog(null, info, "Electrodomésticos", JOptionPane.INFORMATION_MESSAGE);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomestico;

/**
 *
 * @author h
 */
public class MainClass {
    public static void main(String[] args) {
        
        String tipo1 = IO.leerEntrada("Ingrese el primer electrodoméstico:");
        String marca1 = IO.leerEntrada("Ingrese la marca del primer electrodoméstico:");
        String modelo1 = IO.leerEntrada("Ingrese el modelo del primer electrodoméstico:");
        double precio1 = Double.parseDouble(IO.leerEntrada("Ingrese el precio del primer electrodoméstico:"));
        String eficiencia1 = IO.leerEntrada("Ingrese la eficiencia energética del primer electrodoméstico:");

        Electrodomestico e1 = new Electrodomestico(tipo1, marca1, modelo1, precio1, eficiencia1);

     
        String tipo2 = IO.leerEntrada("Ingrese el segundo electrodoméstico:");
        String marca2 = IO.leerEntrada("Ingrese la marca del segundo electrodoméstico:");
        String modelo2 = IO.leerEntrada("Ingrese el modelo del segundo electrodoméstico:");
        double precio2 = Double.parseDouble(IO.leerEntrada("Ingrese el precio del segundo electrodoméstico:"));
        String eficiencia2 = IO.leerEntrada("Ingrese la eficiencia energética del segundo electrodoméstico:");

        Electrodomestico e2 = new Electrodomestico(tipo2, marca2, modelo2, precio2, eficiencia2);

        String tipo3 = IO.leerEntrada("Ingrese el tercer electrodoméstico:");
        String marca3 = IO.leerEntrada("Ingrese la marca del tercer electrodoméstico:");
        String modelo3 = IO.leerEntrada("Ingrese el modelo del tercer electrodoméstico:");
        double precio3 = Double.parseDouble(IO.leerEntrada("Ingrese el precio del tercer electrodoméstico:"));
        String eficiencia3 = IO.leerEntrada("Ingrese la eficiencia energética del tercer electrodoméstico:");

        Electrodomestico e3 = new Electrodomestico(tipo3, marca3, modelo3, precio3, eficiencia3);

        String tipo4 = IO.leerEntrada("Ingrese el cuarto electrodoméstico:");
        String marca4 = IO.leerEntrada("Ingrese la marca del cuarto electrodoméstico:");
        String modelo4 = IO.leerEntrada("Ingrese el modelo del cuarto electrodoméstico:");
        double precio4 = Double.parseDouble(IO.leerEntrada("Ingrese el precio del cuarto electrodoméstico:"));
        String eficiencia4 = IO.leerEntrada("Ingrese la eficiencia energética del cuarto electrodoméstico:");

        Electrodomestico e4 = new Electrodomestico(tipo4, marca4, modelo4, precio4, eficiencia4);

        
        Tienda tienda = new Tienda();
        tienda.agregarElectrodomestico(e1, e2, e3, e4);

       
        tienda.mostrarInformacion();
    }
}

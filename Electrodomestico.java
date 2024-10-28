/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electrodomestico;

/**
 *
 * @author h
 */
public class Electrodomestico {
    private String tipo;
    private String marca;
    private String modelo;
    private double precio;
    private String eficienciaEnergetica;

   
    public Electrodomestico(String tipo, String marca, String modelo, double precio, String eficienciaEnergetica) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEficienciaEnergetica() {
        return eficienciaEnergetica;
    }

    public void setEficienciaEnergetica(String eficienciaEnergetica) {
        this.eficienciaEnergetica = eficienciaEnergetica;
    }


    @Override
    public String toString() {
        return "Tipo: " + tipo + "  * Marca: " + marca + " *  Modelo: " + modelo + " *  Precio: " + precio + " *  Eficiencia Energética: " + eficienciaEnergetica;
    }
}

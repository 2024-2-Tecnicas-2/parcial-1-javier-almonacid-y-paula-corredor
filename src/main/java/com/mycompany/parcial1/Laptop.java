
package com.mycompany.parcial1;


public class Laptop extends Producto{
    private int tamañoPantalla;
    private String procesador;
    private String modelo;

    public Laptop(int tamañoPantalla, String procesador, String modelo, String nombre, String descripcion, double precio, int cantidadInventario) {
        super(nombre, descripcion, precio, cantidadInventario);
        this.tamañoPantalla = tamañoPantalla;
        this.procesador = procesador;
        this.modelo = modelo;
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() +  "Laptop{" + "tama\u00f1oPantalla=" + tamañoPantalla + ", procesador=" + procesador + ", modelo=" + modelo + '}';
    }
    
}

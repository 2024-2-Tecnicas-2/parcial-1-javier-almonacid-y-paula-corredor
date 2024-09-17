/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1;


public class Telefono extends Producto{
    private String marca;
    private double tamañoPantalla;
    private int almacenamiento;

    public Telefono(String marca, double tamañoPantalla, int almacenamiento, String nombre, String descripcion, double precio, int cantidadInventario) {
        super(nombre, descripcion, precio, cantidadInventario);
        this.marca = marca;
        this.tamañoPantalla = tamañoPantalla;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return super.toString() +  "Telefono{" + "marca=" + marca + ", tama\u00f1oPantalla=" + tamañoPantalla + ", almacenamiento=" + almacenamiento + '}';
    }
    
    
}

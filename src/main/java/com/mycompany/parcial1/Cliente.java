
package com.mycompany.parcial1;

public class Cliente {
    private String nombre;
    private String direccionEnvio;
    private double listaPedidos;

    public Cliente(String nombre, String direccionEnvio, double listaPedidos) {
        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.listaPedidos = listaPedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public double getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(double listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", direccionEnvio=" + direccionEnvio + ", listaPedidos=" + listaPedidos + '}';
    }
    
    
}


package com.mycompany.parcial1;


public class Accesorios extends Producto{
    private double durabilidadBateria;
    private double sonido;

    public Accesorios(double durabilidadBateria, double sonido, String nombre, String descripcion, double precio, int cantidadInventario) {
        super(nombre, descripcion, precio, cantidadInventario);
        this.durabilidadBateria = durabilidadBateria;
        this.sonido = sonido;
    }

    public double getDurabilidadBateria() {
        return durabilidadBateria;
    }

    public void setDurabilidadBateria(double durabilidadBateria) {
        this.durabilidadBateria = durabilidadBateria;
    }

    public double getSonido() {
        return sonido;
    }

    public void setSonido(double sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return super.toString() + "Accesorios{" + "durabilidadBateria=" + durabilidadBateria + ", sonido=" + sonido + '}';
    }
    
    
    
}

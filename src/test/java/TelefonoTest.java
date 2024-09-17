/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */import com.mycompany.parcial1.Telefono;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
public class TelefonoTest {
    private Telefono telefono;

    @BeforeEach
    public void setUp() {
        telefono = new Telefono("Samsung", 6.5, 128, "Galaxy S21", "Smartphone de alta gama", 999.99, 50);
    }

    @Test
    public void testGetMarca() {
        assertEquals("Samsung", telefono.getMarca());
    }

    @Test
    public void testSetMarca() {
        telefono.setMarca("Apple");
        assertEquals("Apple", telefono.getMarca());
    }

    @Test
    public void testGetTamañoPantalla() {
        assertEquals(6.5, telefono.getTamañoPantalla());
    }

    @Test
    public void testSetTamañoPantalla() {
        telefono.setTamañoPantalla(5.8);
        assertEquals(5.8, telefono.getTamañoPantalla());
    }

    @Test
    public void testGetAlmacenamiento() {
        assertEquals(128, telefono.getAlmacenamiento());
    }

    @Test
    public void testSetAlmacenamiento() {
        telefono.setAlmacenamiento(256);
        assertEquals(256, telefono.getAlmacenamiento());
    }

    @Test
    public void testToString() {
        String expected = "Producto{nombre=Galaxy S21, descripcion=Smartphone de alta gama, precio=999.99, cantidadInventario=50}"
                + "Telefono{marca=Samsung, tamañoPantalla=6.5, almacenamiento=128}";
        assertEquals(expected, telefono.toString());
    }

    // Pruebas de métodos heredados de Producto

    @Test
    public void testGetNombre() {
        assertEquals("Galaxy S21", telefono.getNombre());
    }

    @Test
    public void testSetNombre() {
        telefono.setNombre("iPhone 13");
        assertEquals("iPhone 13", telefono.getNombre());
    }

    @Test
    public void testGetDescripcion() {
        assertEquals("Smartphone de alta gama", telefono.getDescripcion());
    }

    @Test
    public void testSetDescripcion() {
        telefono.setDescripcion("Smartphone de Apple");
        assertEquals("Smartphone de Apple", telefono.getDescripcion());
    }

    @Test
    public void testGetPrecio() {
        assertEquals(999.99, telefono.getPrecio());
    }

    @Test
    public void testSetPrecio() {
        telefono.setPrecio(899.99);
        assertEquals(899.99, telefono.getPrecio());
    }

    @Test
    public void testGetCantidadInventario() {
        assertEquals(50, telefono.getCantidadInventario());
    }

    @Test
    public void testSetCantidadInventario() {
        telefono.setCantidadInventario(30);
        assertEquals(30, telefono.getCantidadInventario());
    }
}
 

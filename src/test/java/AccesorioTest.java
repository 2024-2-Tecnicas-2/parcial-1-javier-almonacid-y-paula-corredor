/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */import com.mycompany.parcial1.Accesorios;
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
public class AccesorioTest {
    private Accesorios accesorio;

    @BeforeEach
    public void setUp() {
        accesorio = new Accesorios(10.5, 8.5, "Audífonos Bluetooth", "Audífonos con cancelación de ruido", 150.00, 100);
    }

    @Test
    public void testGetDurabilidadBateria() {
        assertEquals(10.5, accesorio.getDurabilidadBateria());
    }

    @Test
    public void testSetDurabilidadBateria() {
        accesorio.setDurabilidadBateria(12.0);
        assertEquals(12.0, accesorio.getDurabilidadBateria());
    }

    @Test
    public void testGetSonido() {
        assertEquals(8.5, accesorio.getSonido());
    }

    @Test
    public void testSetSonido() {
        accesorio.setSonido(9.0);
        assertEquals(9.0, accesorio.getSonido());
    }

    @Test
    public void testToString() {
        String expected = "Producto{nombre=Audífonos Bluetooth, descripcion=Audífonos con cancelación de ruido, precio=150.0, cantidadInventario=100}"
                + "Accesorios{durabilidadBateria=10.5, sonido=8.5}";
        assertEquals(expected, accesorio.toString());
    }

    // Pruebas de métodos heredados de Producto

    @Test
    public void testGetNombre() {
        assertEquals("Audífonos Bluetooth", accesorio.getNombre());
    }

    @Test
    public void testSetNombre() {
        accesorio.setNombre("Altavoz Bluetooth");
        assertEquals("Altavoz Bluetooth", accesorio.getNombre());
    }

    @Test
    public void testGetDescripcion() {
        assertEquals("Audífonos con cancelación de ruido", accesorio.getDescripcion());
    }

    @Test
    public void testSetDescripcion() {
        accesorio.setDescripcion("Altavoz portátil");
        assertEquals("Altavoz portátil", accesorio.getDescripcion());
    }

    @Test
    public void testGetPrecio() {
        assertEquals(150.00, accesorio.getPrecio());
    }

    @Test
    public void testSetPrecio() {
        accesorio.setPrecio(120.00);
        assertEquals(120.00, accesorio.getPrecio());
    }

    @Test
    public void testGetCantidadInventario() {
        assertEquals(100, accesorio.getCantidadInventario());
    }

    @Test
    public void testSetCantidadInventario() {
        accesorio.setCantidadInventario(80);
        assertEquals(80, accesorio.getCantidadInventario());
    }
}
    


import com.mycompany.parcial1.Producto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
    
   private Producto producto; 

    public void setUp() {
        producto = new Producto("Laptop", "Laptop de alta gama", 1500.00, 10);
    }

    public void testGetNombre() {
        assertEquals("Laptop", producto.getNombre());
    }

    public void testSetNombre() {
        producto.setNombre("Tablet");
        assertEquals("Tablet", producto.getNombre());
    }

    public void testGetDescripcion() {
        assertEquals("Laptop de alta gama", producto.getDescripcion());
    }

    @Test
    public void testSetDescripcion() {
        producto.setDescripcion("Tablet media");
        assertEquals("Tablet moderna", producto.getDescripcion());
    }

    @Test
    public void testGetPrecio() {
        assertEquals(1500.00, producto.getPrecio());
    }

    @Test
    public void testSetPrecio() {
        producto.setPrecio(1200.00);
        assertEquals(1200.00, producto.getPrecio());
    }

    @Test
    public void testGetCantidadInventario() {
        assertEquals(10, producto.getCantidadInventario());
    }

    @Test
    public void testSetCantidadInventario() {
        producto.setCantidadInventario(5);
        assertEquals(5, producto.getCantidadInventario());
    }

    @Test
    public void testToString() {
        String expected = "Producto{nombre=Laptop, descripcion=Laptop de alta gama, precio=1500.0, cantidadInventario=10}";
        assertEquals(expected, producto.toString());
    }
}


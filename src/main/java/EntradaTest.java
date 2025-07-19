import org.junit.Test;
import static org.junit.Assert.*;

public class EntradaTest {

    @Test
    public void testTipoEntradaPorDefecto() {
        Entrada entrada = new Entrada();
        assertEquals("VIP", entrada.getTipo());
    }

    @Test
    public void testPrecioEntradaPorDefecto() {
        Entrada entrada = new Entrada();
        assertEquals(120000, entrada.getPrecio());
    }

    @Test
    public void testMostrarInfoNoLanzaExcepcion() {
        Entrada entrada = new Entrada();
        try {
            entrada.mostrarInfo();
        } catch (Exception e) {
            fail("mostrarInfo() lanzó una excepción: " + e.getMessage());
        }
    }
}


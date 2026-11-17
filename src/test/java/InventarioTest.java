import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {
    @Test
    void calculaRestaAsignada() {
        int resultado = Inventario.calcularResta(85, 27);
        assertEquals(58, resultado);
    }
}

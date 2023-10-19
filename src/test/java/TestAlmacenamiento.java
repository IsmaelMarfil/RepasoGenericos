import org.example.Almacenamiento;
import org.junit.Assert;
import org.junit.Test;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestAlmacenamiento <T> {
    @Test
    public void testAlmacenamiento(){
        List<T> lista = new ArrayList<>();
        Almacenamiento alm = new Almacenamiento(lista);
        alm.agregar("Hola");
        alm.agregar(22);
        alm.agregar(BigDecimal.valueOf(1));
        alm.agregar('c');
        Assert.assertEquals("Hola", alm.elementoPorIndice(0));
        Assert.assertEquals('c', alm.elementoPorIndice(3));
        Assert.assertTrue(alm.existe(22));
        Assert.assertEquals(1, alm.contar(22));

    }
}

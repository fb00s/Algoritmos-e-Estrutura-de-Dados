package com.aula.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lkreuch
 */
public class BuscaLinearVetorOrdenadoTest {

    /**
     * Test of buscar method, of class BuscaLinearVetorOrdenado.
     */
    @Test
    public void testBuscar() {
        var arr = new Object[] {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        var buscaLinearOrdenada = new BuscaLinearVetorOrdenado<Integer>();
        buscaLinearOrdenada.setInfo(arr);
        
        int expResult = 4;
        int result = buscaLinearOrdenada.buscar(40);
        
        assertEquals(expResult, result);
    }
    
}

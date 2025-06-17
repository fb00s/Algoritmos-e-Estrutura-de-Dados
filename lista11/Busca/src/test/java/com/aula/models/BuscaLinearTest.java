package com.aula.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lkreuch
 */
public class BuscaLinearTest {
    /**
     * Test of buscar method, of class BuscaLinear.
     */
    @Test
    public void testBuscar() {
        var arr = new Object[] {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        var buscaLinear = new BuscaLinear<Integer>();
        buscaLinear.setInfo(arr);
        
        int expResult = 2;
        int result = buscaLinear.buscar(20);
        
        assertEquals(expResult, result);
    }
}

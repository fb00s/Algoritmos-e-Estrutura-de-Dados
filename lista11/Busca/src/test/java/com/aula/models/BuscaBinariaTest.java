package com.aula.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lkreuch
 */
public class BuscaBinariaTest {
    /**
     * Test of buscar method, of class BuscaBinaria.
     */
    @Test
    public void testBuscar() {
        var arr = new Object[] {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        var buscaBinaria = new BuscaBinaria<Integer>();
        buscaBinaria.setInfo(arr);
        
        int expResult = 7;
        int result = buscaBinaria.buscar(70);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuscar_NotFound() {
        var arr = new Object[] {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        var buscaBinaria = new BuscaBinaria<Integer>();
        buscaBinaria.setInfo(arr);
        
        int expResult = -1;
        int result = buscaBinaria.buscar(75);
        
        assertEquals(expResult, result);
    }
}

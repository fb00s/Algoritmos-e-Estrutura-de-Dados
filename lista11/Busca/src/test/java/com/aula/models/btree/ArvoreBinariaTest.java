package com.aula.models.btree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucas
 */
public class ArvoreBinariaTest {
    
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Object info = null;
        ArvoreBinaria instance = new ArvoreBinaria();
        NoArvoreBinaria expResult = null;
        NoArvoreBinaria result = instance.buscar(info);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

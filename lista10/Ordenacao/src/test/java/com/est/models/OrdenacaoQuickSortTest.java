package com.est.models;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucas
 */
public class OrdenacaoQuickSortTest {
    
    @Test
    public void testOrdenar() {
        var arr = new Integer[] {70,2,88,15,90,30};
        
        var instance = new OrdenacaoQuickSort<Integer>();
        instance.setInfo(arr);
        instance.ordenar();
        
        var expected = new Integer[] {2,15,30,70,88,90};
        assertEquals(Arrays.toString(instance.getInfo()), Arrays.toString(expected));
    }
}

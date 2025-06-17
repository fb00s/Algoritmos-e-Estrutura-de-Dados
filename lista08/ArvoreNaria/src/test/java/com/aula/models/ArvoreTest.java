
package com.aula.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lucas
 */
public class ArvoreTest {
    private Arvore<Integer> criarArvore() {
        NoArvore<Integer> n1 = new NoArvore<>(1);
        NoArvore<Integer> n2 = new NoArvore<>(2);
        NoArvore<Integer> n3 = new NoArvore<>(3);
        NoArvore<Integer> n4 = new NoArvore<>(4);
        NoArvore<Integer> n5 = new NoArvore<>(5);
        NoArvore<Integer> n6 = new NoArvore<>(6);
        NoArvore<Integer> n7 = new NoArvore<>(7);
        NoArvore<Integer> n8 = new NoArvore<>(8); 
        NoArvore<Integer> n9 = new NoArvore<>(9);
        NoArvore<Integer> n10 = new NoArvore<>(10);

        n2.inserirFilho(n7);
        n2.inserirFilho(n6);
        n2.inserirFilho(n5);

        n3.inserirFilho(n8);
        
        n4.inserirFilho(n10);
        n4.inserirFilho(n9);

        n1.inserirFilho(n4);
        n1.inserirFilho(n3);
        n1.inserirFilho(n2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(n1);
        
        return arvore;
    }
    

    /**
     * Test of toString method, of class Arvore.
     */
    @Test
    public void testToString() {
        var instance = criarArvore();
        
        String expResult = "<1<2<5><6><7>><3<8>><4<9><10>>>";
        String result = instance.toString();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of pertence method, of class Arvore.
     */
    @Test
    public void testPertence() {
        Integer info = 7;
        Arvore instance = criarArvore();
        
        boolean expResult = true;
        boolean result = instance.pertence(info);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of pertence method, of class Arvore.
     */
    @Test
    public void testPertence_expectFalse() {
        Integer info = 55;
        Arvore instance = criarArvore();
        
        boolean expResult = false;
        boolean result = instance.pertence(info);
        
        assertEquals(expResult, result);
    }

    /**
     * Test of contarNos method, of class Arvore.
     */
    @Test
    public void testContarNos() {
        Arvore instance = criarArvore();
        
        int expResult = 10;
        int result = instance.contarNos();
        assertEquals(expResult, result);
    }
}

package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class ArvoreBinariaTest {
    @Test
    public void teste1EstaVazia(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        assertTrue(arvore.estaVazia());
    }

    @Test
    public void teste2EstaVazia(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> n1 = new NoArvoreBinaria<>(5);
        arvore.setRaiz(n1);

        assertFalse(arvore.estaVazia());
    }

    @Test
    public void teste3ToString(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> n4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> n5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> n6 = new NoArvoreBinaria<>(6);

        NoArvoreBinaria<Integer> n2 = new NoArvoreBinaria<>(2, null, n4);
        NoArvoreBinaria<Integer> n3 = new NoArvoreBinaria<>(3, n5, n6);

        NoArvoreBinaria<Integer> n1 = new NoArvoreBinaria<>(1, n2, n3);
        arvore.setRaiz(n1);

        assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arvore.toString());
    }

    @Test
    public void teste4PertenceRaiz(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> n4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> n5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> n6 = new NoArvoreBinaria<>(6);

        NoArvoreBinaria<Integer> n2 = new NoArvoreBinaria<>(2, null, n4);
        NoArvoreBinaria<Integer> n3 = new NoArvoreBinaria<>(3, n5, n6);

        NoArvoreBinaria<Integer> n1 = new NoArvoreBinaria<>(1, n2, n3);
        arvore.setRaiz(n1);

        assertTrue(arvore.pertence(1));
    }

    @Test
    public void teste5PertenceNoNaoFolha(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> n4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> n5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> n6 = new NoArvoreBinaria<>(6);

        NoArvoreBinaria<Integer> n2 = new NoArvoreBinaria<>(2, null, n4);
        NoArvoreBinaria<Integer> n3 = new NoArvoreBinaria<>(3, n5, n6);

        NoArvoreBinaria<Integer> n1 = new NoArvoreBinaria<>(1, n2, n3);
        arvore.setRaiz(n1);

        assertTrue(arvore.pertence(3));
    }

    @Test
    public void teste6PertenceNoFolha(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> n4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> n5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> n6 = new NoArvoreBinaria<>(6);

        NoArvoreBinaria<Integer> n2 = new NoArvoreBinaria<>(2, null, n4);
        NoArvoreBinaria<Integer> n3 = new NoArvoreBinaria<>(3, n5, n6);

        NoArvoreBinaria<Integer> n1 = new NoArvoreBinaria<>(1, n2, n3);
        arvore.setRaiz(n1);

        assertTrue(arvore.pertence(6));
    }

    @Test
    public void teste7PertenceValorInexistente(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> n4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> n5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> n6 = new NoArvoreBinaria<>(6);

        NoArvoreBinaria<Integer> n2 = new NoArvoreBinaria<>(2, null, n4);
        NoArvoreBinaria<Integer> n3 = new NoArvoreBinaria<>(3, n5, n6);

        NoArvoreBinaria<Integer> n1 = new NoArvoreBinaria<>(1, n2, n3);
        arvore.setRaiz(n1);

        assertFalse(arvore.pertence(10));
    }

    @Test
    public void teste8ContarNos(){
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> n4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> n5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> n6 = new NoArvoreBinaria<>(6);

        NoArvoreBinaria<Integer> n2 = new NoArvoreBinaria<>(2, null, n4);
        NoArvoreBinaria<Integer> n3 = new NoArvoreBinaria<>(3, n5, n6);

        NoArvoreBinaria<Integer> n1 = new NoArvoreBinaria<>(1, n2, n3);
        arvore.setRaiz(n1);

        assertEquals(6, arvore.contarNos());
    }

}
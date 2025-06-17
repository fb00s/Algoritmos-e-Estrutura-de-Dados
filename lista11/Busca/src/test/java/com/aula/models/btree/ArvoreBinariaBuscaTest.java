package com.aula.models.btree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lkreuch
 */
public class ArvoreBinariaBuscaTest {

    @Test
    public void testInserir() {
        var bTreeBusca = new ArvoreBinariaBusca<Integer>();
        
        bTreeBusca.inserir(50);
        bTreeBusca.inserir(30);
        bTreeBusca.inserir(70);
        bTreeBusca.inserir(40);
        bTreeBusca.inserir(25);
        bTreeBusca.inserir(75);
        bTreeBusca.inserir(65);
        bTreeBusca.inserir(35);
        bTreeBusca.inserir(60);
        
        var expected = "<50<30<25<><>><40<35<><>><>>><70<65<60<><>><>><75<><>>>>";
        assertEquals(expected, bTreeBusca.toString());
    }
    
    @Test
    public void testRemoverNoFolha() {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);

        // Remover folha 5
        arvore.retirar(5);

        assertNull(arvore.buscar(5));
        assertNotNull(arvore.buscar(10));
        assertNotNull(arvore.buscar(15));
    }
    
    @Test
    public void testRemoverNoComUmFilho() {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(2); // Filho único de 5

        // Remover 5, que tem um filho (2)
        arvore.retirar(5);

        assertNull(arvore.buscar(5));
        assertNotNull(arvore.buscar(2));
        assertNotNull(arvore.buscar(10));
    }

    @Test
    public void testRemoverNoComDoisFilhos() {
        ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(12);
        arvore.inserir(18);

        // Remover 15, que tem dois filhos: 12 e 18
        arvore.retirar(15);

        assertNull(arvore.buscar(15));
        assertNotNull(arvore.buscar(12));
        assertNotNull(arvore.buscar(18));
        assertNotNull(arvore.buscar(10));
    }
}

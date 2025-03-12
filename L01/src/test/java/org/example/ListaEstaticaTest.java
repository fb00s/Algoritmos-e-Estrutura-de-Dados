package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class ListaEstaticaTest {

    @Test
    public void teste1Inclusao(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals("5, 10, 15, 20", lista.toString());
    }

    @Test
    public void teste2MetodoObterTamanho(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(4, lista.getTamanho());
    }

    @Test
    public void teste3MetodoBuscarComItemExistente(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(2, lista.buscar(15));
    }

    @Test
    public void teste4MetodoBuscarComItemInexistente(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(-1, lista.buscar(30));
    }

    @Test
    public void teste5MetodoRetirar(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(10);

        assertEquals("5, 15, 20", lista.toString());
        assertEquals(3, lista.getTamanho());
    }

    @Test
    public void teste6InclusaoQueCauseRedimensionamento(){
        ListaEstatica lista = new ListaEstatica();
        for(int i = 1; i <= 15; i++){
            lista.inserir(i);
        }

        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15", lista.toString());
        assertEquals(15, lista.getTamanho());
    }

    @Test
    public void teste7ObterElemento(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(20, lista.obterElemento(3));
    }

    @Test
    public void teste8ExcecaoObterElemento(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertThrows(IndexOutOfBoundsException.class, () -> lista.obterElemento(5));
    }

    @Test
    public void teste9Liberar(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.liberar();

        assertEquals(true, lista.estaVazia());
    }
}
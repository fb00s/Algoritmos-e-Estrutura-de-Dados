package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ListaEstaticaTest {

    @Test
    public void teste1Inclusao(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.toString(), "5,10,15,20");
    }

    @Test
    public void teste2ObterTamanho(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.getTamanho(), 4);
    }

    @Test
    public void teste3Buscar(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.buscar(15), 2);
    }

    @Test
    public void teste4BuscarInexistente(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.buscar(30), -1);
    }

    @Test
    public void teste5Retirar(){
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(10);
        assertEquals(lista.toString(), "5,15,20");
        assertEquals(lista.getTamanho(), 3);
    }

    @Test
    public void teste6InclusaoRedimensionamento(){
        ListaEstatica lista = new ListaEstatica();
        for (int i = 1; i <= 15; i++){
            lista.inserir(i);
        }

        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", lista.toString());
        assertEquals(15, lista.getTamanho());
    }

//    @Test
//    public void teste7
  
}
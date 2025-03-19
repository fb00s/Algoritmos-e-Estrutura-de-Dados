package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEncadeadaTest {

    @Test
    public void teste1ReconhecerListaVazia(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        assertEquals(true, lista.estaVazia());
    }

    @Test
    public void teste2ReconhecerListaNaoVazia(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        assertEquals(false, lista.estaVazia());
    }

    @Test
    public void teste3ValidarInclusao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        assertEquals(5, lista.getPrimeiro().getInfo());
        assertEquals(null, lista.getPrimeiro().getProximo());
        assertEquals(1, lista.obterComprimento());
    }

    @Test
    public void teste4ValidarInclusaoQuatroNumeros(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);

        NoLista primeiro = lista.getPrimeiro();
        NoLista segundo = primeiro.getProximo();
        NoLista terceiro = segundo.getProximo();

        assertEquals(15, primeiro.getInfo());
        assertEquals(10, segundo.getInfo());
        assertEquals(5, terceiro.getInfo());
        assertEquals(3, lista.obterComprimento());
    }

    @Test
    public void teste5ValidarBuscaPrimeiraPosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(20, lista.buscar(20).getInfo());
    }

    @Test
    public void teste6ValidarBuscaMeioDaLista(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(15, lista.buscar(15).getInfo());
    }

    @Test
    public void teste7ValidarBuscaDadoInexistente(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(null, lista.buscar(50));
    }

    @Test
    public void teste8ValidarExclusaoPrimeiroItem(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(20);
        assertEquals("15, 10, 5", lista.toString());
    }

    @Test
    public void teste9ValidarExclusaoItemMeioDaLista(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(15);
        assertEquals("20, 10, 5", lista.toString());
    }

    @Test
    public void teste10ObterNoPosicao0(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(20, lista.obterNo(0).getInfo());
    }

    @Test
    public void teste11ObterNoUltimaPosicao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(5, lista.obterNo(3).getInfo());
    }

    @Test
    public void teste12ObterNoExcecao(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertThrows(IndexOutOfBoundsException.class, () -> lista.obterNo(10));
    }

    @Test
    public void teste13ObterComprimentoListaVazia(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        assertEquals(0, lista.obterComprimento());
    }

    @Test
    public void teste14ObterComprimentoListaNaoVazia(){
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(4, lista.obterComprimento());
    }
}
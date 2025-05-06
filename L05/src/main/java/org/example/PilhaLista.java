package org.example;

public class PilhaLista<T> implements Pilha<T> {
    private ListaEncadeada<T> lista;

    public PilhaLista() {
        lista = new ListaEncadeada<>();
    }

    @Override
    public void push(T info) {
        lista.inserir(info); // insere no topo (início da lista)
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }
        T valor = (T) lista.getPrimeiro().getInfo();
        lista.retirar(valor);
        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }
        return (T) lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public void liberar() {
        while (!estaVazia()) {
            pop();
        }
    }

    @Override
    public String toString() {
        return lista.toString();
    }
}

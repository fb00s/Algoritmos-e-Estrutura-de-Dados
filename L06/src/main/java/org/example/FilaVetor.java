package org.example;

public class FilaVetor<T> implements Fila<T>{
    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        this.limite = limite;
        this.info = new Object[limite];
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException();
        }
        int fim = (inicio + tamanho) % limite;
        info[fim] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        return (T) info[inicio];
    }

    @Override
    public T retirar() {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        T valor = (T) info[inicio];
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    @Override
    public void liberar() {
        while (!estaVazia()) {
            retirar();
        }
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> novaFila = new FilaVetor<>(this.tamanho + f2.tamanho);

        // Inserir elementos da fila atual (this)
        for (int i = 0; i < this.tamanho; i++) {
            int pos = (this.inicio + i) % this.limite;
            novaFila.inserir((T) this.info[pos]);
        }

        // Inserir elementos da fila recebida (f2)
        for (int i = 0; i < f2.tamanho; i++) {
            int pos = (f2.inicio + i) % f2.limite;
            novaFila.inserir((T) f2.info[pos]);
        }

        return novaFila;
    }

    public int getLimite() {
        return this.limite;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            int pos = (inicio + i) % limite;
            s.append(info[pos]);
            if (i < tamanho - 1) {
                s.append(", ");
            }
        }
        return s.toString();
    }
}

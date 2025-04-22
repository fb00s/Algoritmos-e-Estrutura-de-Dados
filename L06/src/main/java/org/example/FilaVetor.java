package org.example;

public class FilaVetor<T> {
    private Object info[];
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite){
        info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    public void inserir(T valor){
        
    }
}

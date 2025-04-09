package org.example;

public class PilhaVetor<T> implements Pilha<T> {
    private Object info[];
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite){
        info = new Object[limite];
        this.limite = limite;
        tamanho = 0;
    }

    public void push(T info){
        if (tamanho == limite){
            throw new PilhaCheiaException();
        }


        this.info[tamanho] = info;
        tamanho++;
    }

    public T peek(){
        if (tamanho == 0){
            throw new PilhaVaziaException("A pilha está vazia");
        }

        return (T) this.info[tamanho - 1];
    }

    public T pop(){
        if (tamanho == 0){
            throw new PilhaVaziaException("A pilha está vazia");
        }

        tamanho--;
        return (T) this.info[tamanho - 1];
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public void liberar(){
        tamanho = 0;
    }

    public String toString(){
        if (tamanho == 0) return "";

        String strPilha = "" + info[tamanho - 1];

        for(int i = tamanho - 2; i >= 0; i--){
            strPilha += "," + info[i];
        }

        return strPilha;
    }




}

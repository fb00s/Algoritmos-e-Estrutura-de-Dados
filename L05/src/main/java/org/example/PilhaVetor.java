package org.example;

public class PilhaVetor<T> implements Pilha<T>{
    private Object info[];
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite){
        this.limite = limite;
        this.info = new Object[limite];
        this.tamanho = 0;
    }

    @Override
    public void push(T info){
        if(tamanho == limite) {
            throw new PilhaCheiaException("A pilha está cheia");
        }

        this.info[tamanho] = info;
        tamanho++;
    }

    @Override
    public T pop(){
        if(estaVazia()) throw new PilhaVaziaException("A pilha está vazia");

        tamanho--;
        return (T) info[tamanho];
    }

    @Override
    public T peek(){
        if(estaVazia()) throw new PilhaVaziaException("A pilha está vazia");

        return (T) info[tamanho - 1];
    }

    @Override
    public boolean estaVazia(){
        return (tamanho == 0);
    }

    @Override
    public void liberar(){
        for(int i = 0; i < tamanho; i++){
            info[i] = null;
        }

        tamanho = 0;
    }

    public String toString(){
        if (tamanho == 0) return "";

        String str = "" + info[0];

        for(int i = 1; i < tamanho; i++){
            str += "," + info[i];
        }

        return str;
    }

    public void concatenar(PilhaVetor<T> p){
        if (this.tamanho + p.tamanho > this.limite) throw new PilhaCheiaException("A pilha está cheia");

        Object dados[] = p.info;

        for(int i = 0; i < p.tamanho; i++){
            this.push((T) dados[i]);
        }
    }


}

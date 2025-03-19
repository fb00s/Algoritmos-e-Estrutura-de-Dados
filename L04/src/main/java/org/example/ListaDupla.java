package org.example;

public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;

    public ListaDupla(){
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro(){
        return primeiro;
    }

    public void inserir(T valor){
        NoListaDupla<T> item = new NoListaDupla<>(valor);
        
    }
}

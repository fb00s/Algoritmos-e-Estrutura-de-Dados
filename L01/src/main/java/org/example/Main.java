package org.example;

public class Main {
    public static void main(String[] args) {

        ListaEstatica vazia = new ListaEstatica();
        ListaEstatica lista15 = new ListaEstatica();
        ListaEstatica umEl = new ListaEstatica();

        for(int i = 1; i <= 15; i++){
            lista15.inserir(i);
        }

        umEl.inserir(1);

        System.out.println(vazia.toString());
        System.out.println(lista15.toString());
        System.out.println(umEl.toString());
    }
}
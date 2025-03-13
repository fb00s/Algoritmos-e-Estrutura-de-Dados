package org.example;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> listaFrutas = new ListaEncadeada<>();

        listaFrutas.inserir("banana");
        listaFrutas.inserir("pêra");
        listaFrutas.inserir("uva");
        listaFrutas.inserir("maçã");

        listaFrutas.retirar("banana");
        System.out.println(listaFrutas.toString());
    }
}
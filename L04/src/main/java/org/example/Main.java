package org.example;

public class Main {
    public static void main(String[] args) {
        ListaDupla<String> frutas = new ListaDupla<>();

        frutas.inserir("Maçã");
        frutas.inserir("Pêra");
        frutas.inserir("Uva");
        frutas.inserir("Banana");
        frutas.inserir("Melancia");
        frutas.inserir("Mamão");
        frutas.inserir("Laranja");

        frutas.exibirOrdemInversa();
    }
}
package org.example;

public class Main {
    public static void main(String[] args) {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(15);

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);

        pilha.liberar();

        System.out.println(pilha.peek());
    }
}
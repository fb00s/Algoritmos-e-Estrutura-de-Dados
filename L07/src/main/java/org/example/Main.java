package org.example;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();

        NoArvoreBinaria<Integer> no8 = new NoArvoreBinaria<>(8);

        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4, null, no8);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);

        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no6, no7);

        NoArvoreBinaria<Integer> raiz = new NoArvoreBinaria<>(1, no2, no3);

        arvore.setRaiz(raiz);

        System.out.println(arvore.toString());
        System.out.println(arvore.contarNos());
    }
}
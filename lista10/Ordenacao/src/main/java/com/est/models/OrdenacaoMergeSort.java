package com.est.models;

/**
 *
 * @author lucas
 * @param <T>
 */
public class OrdenacaoMergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    @Override
    public void ordenar() {
        mergeSort(0, this.getInfo().length - 1);
    }

    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, meio, fim);
        }
    }

    @SuppressWarnings("unchecked")
    private void merge(int inicio, int meio, int fim) {
        T[] arr = this.getInfo();
        
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        T[] esquerda = (T[]) new Comparable[n1];
        T[] direita = (T[]) new Comparable[n2];

        // Copia os dados para arrays temporários
        for (int i = 0; i < n1; i++) {
            esquerda[i] = arr[inicio + i];
        }
        for (int j = 0; j < n2; j++) {
            direita[j] = arr[meio + 1 + j];
        }

        int i = 0, j = 0;
        int k = inicio;

        // Merge dos arrays temporários
        while (i < n1 && j < n2) {
            if (esquerda[i].compareTo(direita[j]) <= 0) {
                arr[k] = esquerda[i];
                i++;
            } else {
                arr[k] = direita[j];
                j++;
            }
            k++;
        }

        // Copia o restante de esquerda, se houver
        while (i < n1) {
            arr[k] = esquerda[i];
            i++;
            k++;
        }

        // Copia o restante de direita, se houver
        while (j < n2) {
            arr[k] = direita[j];
            j++;
            k++;
        }
    }
}


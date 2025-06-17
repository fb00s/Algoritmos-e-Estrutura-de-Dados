package com.est.models;

/**
 *
 * @author lucas
 * @param <T>
 */
public class OrdenacaoQuickSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    @Override
    public void ordenar() {
        var arr = this.getInfo();
        var n = arr.length;
        quickSort(0, n - 1); // Corrigido
    }

    private void quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int idxPivo = particionar(inicio, fim);
            quickSort(inicio, idxPivo - 1);
            quickSort(idxPivo + 1, fim);
        }
    }

    private int particionar(int inicio, int fim) {
        var arr = this.getInfo();
        T pivo = arr[inicio];
        int a = inicio;
        int b = fim + 1;

        while (true) {
            do {
                a++;
            } while (a <= fim && arr[a].compareTo(pivo) < 0);

            do {
                b--;
            } while (b >= inicio && arr[b].compareTo(pivo) > 0);

            if (a >= b) {
                break;
            }

            trocar(a, b);
        }

        trocar(inicio, b);
        return b;
    }
}
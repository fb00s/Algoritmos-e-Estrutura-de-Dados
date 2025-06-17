package com.est.models;

/**
 *
 * @author lucas
 * @param <T>
 */
public class OrdenacaoBolha<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

    @Override
    public void ordenar() {
        T[] array = getInfo();
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    trocar(j, j + 1);
                }
            }
        }
    }
}

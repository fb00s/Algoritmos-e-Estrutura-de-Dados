package com.aula.models;

/**
 *
 * @author lkreuch
 * @param <T>
 */
public class BuscaBinaria<T extends Comparable<T>> extends BuscaAbstract {
    public int buscar(T valor) {
        var arr = this.getInfo();
        
        var inicio = 0;
        var fim = arr.length - 1;

        while (inicio <= fim) {
            Integer meio = (inicio + fim) / 2;
            
            if (valor.compareTo((T) arr[meio]) < 0) {
                fim = meio - 1;
            }
            else if (valor.compareTo((T) arr[meio]) > 0) {
                inicio = meio + 1;
            }
            else {
                return meio;
            }
        }
        
        return -1;
    }
}

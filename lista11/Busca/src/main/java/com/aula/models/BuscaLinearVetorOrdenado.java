package com.aula.models;

/**
 *
 * @author lkreuch
 * @param <T>
 */
public class BuscaLinearVetorOrdenado<T extends Comparable<T>> extends BuscaAbstract {
    public int buscar(T valor) {
        var arr = this.getInfo();
        
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i].equals(valor)) {
                return i;
            }
            else if (valor.compareTo((T) arr[i]) < 0) {
                break;
            }
        }
        
        return -1;
    }
}

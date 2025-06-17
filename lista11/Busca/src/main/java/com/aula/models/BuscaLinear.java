package com.aula.models;

/**
 *
 * @author lkreuch
 * @param <T>
 */
public class BuscaLinear<T> extends BuscaAbstract {
    public int buscar(T valor) {
        var arr = this.getInfo();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(valor)) {
                return i;
            }
        }
        
        return -1;
    }
}

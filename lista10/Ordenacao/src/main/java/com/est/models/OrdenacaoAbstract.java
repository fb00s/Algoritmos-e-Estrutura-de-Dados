package com.est.models;

/**
 *
 * @author lucas
 * @param <T>
 */
public abstract class OrdenacaoAbstract<T extends Comparable<T>> {
    private T info[];

    public abstract void ordenar();

    public void trocar(int a, int b) {
        var tmp = info[a];
        info[a] = info[b];
        info[b] = tmp;
    }
    
    public T[] getInfo() {
        return info;
    }

    public void setInfo(T[] info) {
        this.info = info;
    }
}

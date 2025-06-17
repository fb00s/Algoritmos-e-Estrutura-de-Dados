package com.aula.models.mapadispersao;

import java.util.Objects;

/**
 *
 * @author lkreuch
 * @param <T>
 */
public class NoMapa<T> {
    private int chave;
    private T valor;

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (o == null || getClass() != o.getClass())
            return false;
        
        var other = (NoMapa) o;
        return this.chave == other.chave;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chave);
    }
}

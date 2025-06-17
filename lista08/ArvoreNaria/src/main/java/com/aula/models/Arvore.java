package com.aula.models;

/**
 *
 * @author lkreuch
 * @param <T>
 */
public class Arvore<T> {
    private NoArvore<T> raiz;
    
    public Arvore() {
        raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }
    
    @Override
    public String toString() {
        if (raiz == null) {
            return "";
        }
        
        return obterRepresentacaoTextual(raiz);
    }
    
    private String obterRepresentacaoTextual(NoArvore<T> no) {
        var s = "<" + no.getInfo();
        
        var p = no.getPrimeiro();
        while (p != null) {
            s += obterRepresentacaoTextual(p);
            p = p.getProximo();
        }
        
        s += ">";
        return s;
    }
    
    public boolean pertence(T info) {
        if (raiz == null)
            return false;
        
        return pertence(raiz, info);
    }
    
    private boolean pertence(NoArvore<T> no, T info) {
        if (no.getInfo() == info) {
            return true;
        }
        
        var p = no.getPrimeiro();
        while (p != null) {
            if (pertence(p, info)) {
                return true;
            }
            
            p = p.getProximo();
        }
        
        return false;
    }
    
    public int contarNos() {
        if (raiz == null) {
            return 0;
        }
        
        return contarNos(raiz);
    }
    
    private int contarNos(NoArvore<T> no) {
        var p = no.getPrimeiro();
        var c = 1;
        
        while (p != null) {
            c += contarNos(p);
            p = p.getProximo();
        }
        
        return c;
    }
}

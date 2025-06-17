package com.aula.models.list;

/**
 *
 * @author lkreuch
 * @param <T>
 */
public class ListaEncadeada<T> {
    private NoLista<T> primeiro;

    public ListaEncadeada() {
        primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }
    
    public void inserir(T valor) {
        var novoNo = new NoLista();
        novoNo.setInfo(valor);
        novoNo.setProximo(primeiro);
        this.primeiro = novoNo;
    }
    
    public boolean estaVazia() {
        return primeiro == null;
    }
    
    public NoLista<T> buscar(T valor) {
        var p = primeiro;
        
        while(p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            
            p = p.getProximo();
        }
        
        return null;
    }
    
    public void retirar(T valor) {
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;
        
        while (p != null && !p.getInfo().equals(valor)) {
            anterior = p;
            p = p.getProximo();
        }
        
        if (p != null) {
            if (p.equals(primeiro)) {
                this.primeiro = this.primeiro.getProximo();
            } 
            else {
                anterior.setProximo(p.getProximo());
            }
        }
    }
    
    public int obterComprimento() {
        int qtd = 0;
        var p = primeiro;
        
        while (p != null) {
            qtd++;
            p = p.getProximo();
        }
        
        return qtd;
    }
    
    public NoLista<T> obterNo(int idx) {
        if (idx < 0) {
            throw new IndexOutOfBoundsException("O index não pode ser menor que 0.");
        }
        
        NoLista itemObj = null;
        
        while (primeiro != null) {
            itemObj = primeiro;
        }
        
        if (itemObj == null) {
            throw new IndexOutOfBoundsException("O index fornecido é maior que a lista.");
        }
        
        return itemObj;
    }
    
    @Override
    public String toString() {
        var str = "";
        
        var p = primeiro;
        
        while(p != null) {
            str += p.getInfo();
            
            if (p.getProximo() != null) {
                str += ",";
            }
        }
        
        return  str;
    }
}

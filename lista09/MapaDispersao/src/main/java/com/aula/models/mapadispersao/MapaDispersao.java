package com.aula.models.mapadispersao;

import com.aula.models.list.ListaEncadeada;
import com.aula.models.list.NoLista;

/**
 *
 * @author lkreuch
 * @param <T>
 */
public class MapaDispersao<T> {
    private final ListaEncadeada<NoMapa<T>>[] info;
    
    public MapaDispersao(int tamanho) {
        info = new ListaEncadeada[tamanho];
    }
    
    private int calcularHash(int chave) {
        return chave % info.length;
    }
    
    public void inserir(int chave, T dado) {
        var idx = calcularHash(chave);
        
        if (info[idx] == null)
            info[idx] = new ListaEncadeada<>();
        
        var noMapa = new NoMapa<T>();
        noMapa.setChave(chave);
        noMapa.setValor(dado);
        
        info[idx].inserir(noMapa);
    }
    
    public void remover(int chave) {
        int idx = calcularHash(chave);
        
        if (info[idx] != null) {
            var no = new NoMapa<T>();
            no.setChave(chave);
            info[idx].retirar(no);
        }
    }
    
    public T buscar(int chave) {
        var idx = calcularHash(chave);
        
        if (info[idx] != null) {
            var noMapa = new NoMapa<T>();
            noMapa.setChave(chave);
            
            NoLista<NoMapa<T>> no = info[idx].buscar(noMapa);
            
            if (no != null) {
                return no.getInfo().getValor();
            }
        }
        
        return null;
    }
    
    // para melhor performace, implementar uma propriedade que guarda o total de elementos
    public double calcularFatorCarga() {
        int totalElementos = 0;

        for (ListaEncadeada<NoMapa<T>> lista : info) {
            if (lista != null) {
                totalElementos += lista.obterComprimento();
            }
        }

        return (double) totalElementos / info.length;
    }
}

package org.example;

public class ListaEncadeada<T> {
    private NoLista primeiro;

    public ListaEncadeada(){
        this.primeiro = null;
    }

    public NoLista getPrimeiro(){
        return primeiro;
    }

    public void inserir(T valor){
        NoLista<T> novoNo = new NoLista<>(valor);
        novoNo.setProximo(primeiro);
        primeiro = novoNo;
    }

    public boolean estaVazia(){
        return primeiro == null;
    }

    public NoLista<T> buscar(T valor){
        NoLista<T> itemAtual = primeiro;

        while(itemAtual != null){
            if (itemAtual.getInfo() == valor){
                return itemAtual;
            }
            itemAtual = itemAtual.getProximo();
        }

        return null;
    }

    public void retirar(T valor){
        if (estaVazia()) return;

        if (primeiro.getInfo().equals(valor)){
            primeiro = primeiro.getProximo();
            return;
        }

        if (this.obterNo(this.obterComprimento() - 1).getInfo().equals(valor)){
            this.obterNo(this.obterComprimento() - 2).setProximo(null);
        }

        NoLista<T> itemAtual = primeiro;

        while (itemAtual.getProximo() != null){
            if(itemAtual.getProximo().getInfo().equals(valor)){
                itemAtual.setProximo(itemAtual.getProximo().getProximo());
            }

            itemAtual = itemAtual.getProximo();
        }
    }

    public int obterComprimento(){
        int contadorItens = 0;

        NoLista<T> itemAtual = primeiro;

        while (itemAtual != null){
            contadorItens++;
            itemAtual = itemAtual.getProximo();
        }

        return contadorItens;
    }

    public NoLista<T> obterNo(int idx) throws IndexOutOfBoundsException{
        if (idx > this.obterComprimento() - 1 || idx < 0) throw new IndexOutOfBoundsException();

        NoLista<T> itemAtual = primeiro;

        for(int i = 0; i < idx; i++){
            itemAtual = itemAtual.getProximo();
        }

        return itemAtual;
    }

    public String toString(){
        if (primeiro == null) return "";

        String strLista = "";
        NoLista<T> itemAtual = primeiro;

        if (primeiro.getProximo() == null) return strLista + itemAtual.getInfo();

        while(itemAtual.getProximo() != null){
            strLista += itemAtual.getInfo() + ", ";
            itemAtual = itemAtual.getProximo();
        }

        return strLista + itemAtual.getInfo();
    }


}

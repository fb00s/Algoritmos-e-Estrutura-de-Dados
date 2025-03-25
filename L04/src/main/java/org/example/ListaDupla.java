package org.example;

public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;
    private NoListaDupla<T> ultimo;

    public ListaDupla(){
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro(){
        return primeiro;
    }

    public void inserir(T valor){
        NoListaDupla<T> novoNo = new NoListaDupla<>(valor);
        novoNo.setProximo(primeiro);

        if (primeiro != null){
            primeiro.setAnterior(novoNo);
        }
        primeiro = novoNo;
    }

    public NoListaDupla<T> buscar(T valor){
        NoListaDupla<T> p = primeiro;

        while (p != null){
            if (p.getInfo().equals(valor)){
                return p;
            }
            p = p.getProximo();
        }

        return null;
    }

    public void retirar(T valor){
        NoListaDupla<T> p = buscar(valor);

        if (p != null){
            if (primeiro.equals(p)){
                primeiro = p.getProximo();
            } else {
                p.getAnterior().setProximo(p.getProximo());
            }

            if (p.getProximo() != null){
                p.getProximo().setAnterior(p.getAnterior());
            }
        }
    }

    public void exibirOrdemInversa(){
        NoListaDupla<T> item = obterUltimo();

        while (item != null){
            System.out.println(item.getInfo() + " ");
            item = item.getAnterior();
        }
    }

    private NoListaDupla<T> obterUltimo(){
        NoListaDupla<T> ultimo = primeiro;

        NoListaDupla<T> p = primeiro;

        while (p != null){
            ultimo = p;
            p = p.getProximo();
        }

        return ultimo;
    }

    public void liberar(){

    }
}

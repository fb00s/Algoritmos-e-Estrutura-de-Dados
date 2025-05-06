package org.example;

public class NoArvore<T> {
    private T info;
    private NoArvore<T> primeiro;
    private NoArvore<T> proximo;

    public NoArvore(T info){
        setInfo(info);
        setPrimeiro(null);
        setProximo(null);
    }

//    public void inserirFilho(NoArvore<T> sa){
//        if(primeiro == null){
//            this.primeiro = sa;
//        }
//
//        NoArvore<T> p = primeiro;
//
//        while(p.getProximo() != null){
//            p = p.getProximo();
//        }
//
//        p.setProximo(sa);
//
//    }

    public void inserirFilho(NoArvore<T> sa){
        sa.proximo = this.primeiro;
        this.primeiro = sa;
    }

    public void setInfo(T info){
        this.info = info;
    }

    public T getInfo(){
        return info;
    }

    public NoArvore<T> getPrimeiro(){
        return primeiro;
    }

    public void setPrimeiro(NoArvore<T> no){
        this.primeiro = no;
    }

    public NoArvore<T> getProximo(){
        return proximo;
    }

    public void setProximo(NoArvore<T> no){
        this.proximo = no;
    }


}

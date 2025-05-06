package org.example;

public class Arvore<T> {
    private NoArvore<T> raiz;

    public Arvore(){
        setRaiz(null);
    }

    public NoArvore<T> getRaiz(){
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz){
        this.raiz = raiz;
    }

    public String toString(){
        return obterRepresentacaoTextual(raiz);
    }

    private String obterRepresentacaoTextual(NoArvore<T> no){
        if(no == null){
            return "<>";
        }

        String strIrmaos = "<" + no.getInfo();

        NoArvore<T> filho = no.getPrimeiro();

        while (filho != null){

            strIrmaos += obterRepresentacaoTextual(filho);

            filho = filho.getProximo();
        }

        return strIrmaos + ">";
    }

    public boolean pertence(T info){
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvore<T> no, T info){
        if(no == null) return false;

        if(no.getInfo().equals(info)) return true;

        NoArvore<T> filho = no.getPrimeiro();

        while(filho != null){
            if(pertence(filho, info)) return true;
            filho = filho.getProximo();
        }

        return false;
    }

    public int contarNos(){
        return contarNos(raiz);
    }

    private int contarNos(NoArvore<T> no){
        if(no == null){
            return 0;
        }

        NoArvore<T> filho = no.getPrimeiro();
        int total = 1;

        while(filho != null){
            total += contarNos(filho);
            filho = filho.getProximo();
        }

        return total;
    }

}

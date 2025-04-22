package org.example;

public class ArvoreBinaria <T>{
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz){
        this.raiz = raiz;
    }

    public boolean estaVazia(){
        return (raiz == null);
    }

    public boolean pertence(T info){
        //verificar raiz (info é diferente)
        //verificar esquerda (é diferente de null)
        //  verificar nó 2 (info é diferente)
        //  verificar esquerda (é diferente de null)
        //      verificar nó 4
        //      verificar esquerda (é igual a null)
        //      verificar direita (é igual a null)
        //      voltar para nó 2
        //  verificar direita (é diferente de null)
        //      verificar nó 5
        //      verificar esquerda (é igual a null)
        //      verificar direita (é igual a null)
        //      voltar para nó 2
        //  voltar para nó 1
        //verificar direita (é diferente de null)
        //  verificar nó 3
        //  verificar esquerda (é igual a null)
        //  verificar direita (é diferente de null)
        //      verificar nó 6
        //      verificar esquerda (é diferente de null)
        //          verificar nó 7
        //          verificar esquerda (é igual a null)
        //          verificar direita (é igual a null)

        //NoArvoreBinaria noIndice = raiz;
        //if (noIndice.info = info){

        /*
        if (no == null) {
            return false;
        } else {
            return (no.getInfo().equals(info)) ||
                    pertence(no.getEsquerda(), info) ||
                    pertence(no.getDireita(), info);
            }
        }
         */

        /*
        if (no == null) {
            return false;
        } else {
            if (no.getInfo().equals(info)) {
                return true;
            } else {
                if (pertence2(no.getEsquerda(), info)) {
                    return true;
                } else {

         */

        return false;
        // fazer
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info){
        return false;
        //fazer
    }

    public String toString(){
        /*
        if (no == null) {
            return "<>";
        else {
            return "<" +
                no.getInfo() +
                arvorePre(no.getEsquerda()) +
                arvorePre(no.getDireita()) +
                ">";
         }
         */

        return " ";
        // fazer
    }

    private String arvorePre(NoArvoreBinaria<T> no){
        return " ";
        // fazer
    }

    public NoArvoreBinaria<T> getRaiz(){
        return raiz;
    }

    public int contarNos(){
        return contarNos(getRaiz());
    }

    private int contarNos(NoArvoreBinaria<T> no){
        return 0;
        // fazer
    }
}

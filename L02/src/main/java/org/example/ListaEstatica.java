package org.example;

public class ListaEstatica<T> {
    private Object[] info;
    private int tamanho;

    public ListaEstatica(){
        info = new Object[10];
        tamanho = 0;
    }

    private void redimensionar(){
        Object[] novaLista = new Object[info.length + 10];

        for(int i = 0; i < tamanho; i++){
            novaLista[i] = info[i];
        }

        info = novaLista;
    }

    public void inserir(T valor){
        if (tamanho == info.length) redimensionar();

        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir(){
        for(int i = 0; i < tamanho; i++){
            System.out.println(info[i]);
        }
    }

    public int buscar(T valor){
        for(int i = 0; i < tamanho; i++){
            if(info[i] == valor){
                return i;
            }
        }

        return -1;
    }

    public void retirar(T valor){
        for(int i = 0; i < tamanho; i++){
            if(info[i] == valor){
                for(int j = i; j < tamanho - 1; j++){
                    info[j] = info[j + 1];
                }
                tamanho--;
                break;
            }
        }
    }

    public void liberar(){
        info = new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao) throws IndexOutOfBoundsException{
        if (posicao > tamanho - 1) throw new IndexOutOfBoundsException();

        return (T) info[posicao];
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int getTamanho(){
        return tamanho;
    }

    public String toString(){
        if(tamanho == 0) return "";

        String strLista = "";

        if(tamanho == 1) return strLista + info[0];

        for(int i = 0; i < tamanho - 1; i++){
            strLista += info[i] + ", ";
        }

        return strLista + info[tamanho - 1];
    }

    public void inverter(){
        int numTrocas = tamanho / 2;

        for(int i = 0; i < numTrocas; i++){
            Object bolha = info[i];
            info[i] = info[tamanho -1 - i];
            info[tamanho - 1 - i] = bolha;
        }
    }
}

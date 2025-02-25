package org.example;

import java.lang.IndexOutOfBoundsException;

public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica(){
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar(){
        int[] novoVetor = new int[info.length + 10];

        for (int i = 0; i <= info.length - 1; i++){
            novoVetor[i] = info[i];
        }

        info = novoVetor;
    }

    public void inserir(int num){
        if (info.length == tamanho){
            redimensionar();
        }

        info[tamanho] = num;
        tamanho++;
    }

    public void exibir(){
        for (int i = 0; i <= tamanho - 1; i++){
            System.out.println(info[i]);
        }
    }

    public int buscar(int num){
        for (int i = 0; i <= tamanho - 1; i++){
            if (info[i] == num) return i;
        }
        return -1;
    }

    public void retirar(int num){
        for (int i = 0; i <= tamanho - 1; i++){
            if (info[i] == num){
                tamanho--;
                for(int j = i; j <= tamanho - 1; j++){
                    info[j] = info[j + 1];
                }
                break;
            }
        }
    }

    public void liberar(){
        info = new int[10];
        tamanho = 0;
    }

    public int obterElemento(int indice) throws IndexOutOfBoundsException{
        return info[indice];
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public int getTamanho(){
        return tamanho;
    }

    public String toString(){
        String txt = "";
        for (int i = 0; i < tamanho; i++){
            if (i < tamanho - 1){
                txt += info[i] + ",";
            } else {
                txt += info[i];
            }
        }

        return txt;
    }

}


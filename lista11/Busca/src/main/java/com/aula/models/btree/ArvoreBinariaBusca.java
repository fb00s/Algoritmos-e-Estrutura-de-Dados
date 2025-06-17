package com.aula.models.btree;

/**
 *
 * @author lkreuch
 * @param <T>
 */
public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

    public void inserir(T info) {
        var novo = new NoArvoreBinaria<T>(info);
        
        if (this.getRaiz() == null) {
            this.setRaiz(novo);
            return;
        }
        
        var p = this.getRaiz();
        while (true) {
            var pai = p;
            
            if (info.compareTo(pai.getInfo()) < 0) {
                p = pai.getEsquerda();
                if (p == null) {
                    pai.setEsquerda(novo);
                    return;
                }
            }
            else {
                p = pai.getDireita();
                if (p == null) {
                    pai.setDireita(novo);
                    return;
                }
            }
        }
    }
    
    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(this.getRaiz(), info);
    }
    
    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return null;
        }
        
        if (info.equals(no.getInfo())) {
            return no;
        }
        
        if (info.compareTo(no.getInfo()) < 0) {
            return buscar(no.getEsquerda(), info);
        }
        else {
            return buscar(no.getDireita(), info);
        }
    }

    public void retirar(T info) {
        setRaiz(retirar(getRaiz(), info));
    }

    private NoArvoreBinaria<T> retirar(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return null;
        }

        int comparacao = info.compareTo(no.getInfo());

        if (comparacao < 0) {
            no.setEsquerda(retirar(no.getEsquerda(), info));
        } else if (comparacao > 0) {
            no.setDireita(retirar(no.getDireita(), info));
        } else {
            // Caso 1: nó folha
            if (no.getEsquerda() == null && no.getDireita() == null) {
                return null;
            }

            // Caso 2: só tem filho à direita
            if (no.getEsquerda() == null) {
                return no.getDireita();
            }

            // Caso 2: só tem filho à esquerda
            if (no.getDireita() == null) {
                return no.getEsquerda();
            }

            // Caso 3: dois filhos – substitui pelo menor da subárvore direita
            NoArvoreBinaria<T> sucessor = encontrarMinimo(no.getDireita());
            no.setInfo(sucessor.getInfo());
            no.setDireita(retirar(no.getDireita(), sucessor.getInfo()));
        }

        return no;
    }

    private NoArvoreBinaria<T> encontrarMinimo(NoArvoreBinaria<T> no) {
        while (no.getEsquerda() != null) {
            no = no.getEsquerda();
        }
        return no;
    }
}

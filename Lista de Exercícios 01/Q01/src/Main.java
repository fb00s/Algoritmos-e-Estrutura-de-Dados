public class Main {
    public static void main(String[] args) {

        ListaEstatica lista = new ListaEstatica();

        lista.inserir(7);
        lista.inserir(5);
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(4);
        lista.inserir(3);
        lista.inserir(7);
        lista.inserir(9);
        lista.inserir(8);
        lista.inserir(0);
        lista.inserir(13);

        System.out.println(lista.buscar(13));
        System.out.println(lista.buscar(7));
        System.out.println(lista.buscar(9));
        System.out.println(lista.buscar(15));
    }
}
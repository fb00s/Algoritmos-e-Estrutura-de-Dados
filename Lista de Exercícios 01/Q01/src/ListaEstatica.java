public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica(){
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar(){
        int[] novaLista = new int[info.length + 10];

        for (int i = 0; i < info.length - 1; i++){
            novaLista[i] = info[i];
        }

        info = novaLista;
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
                    info[j] = info[j] + 1;
                }
                break;
            }
        }
    }




}

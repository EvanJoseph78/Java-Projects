public class PesquisaBinaria{
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        pesquisa(lista, 8);
        
    }
    public static void pesquisa(int[] lista, int elemento) {
        int meio = lista.length / 2;
        if (meio == elemento) {
            System.out.println("O elemento está na lista");
        }else {
            pesquisa(lista, elemento);
        }
        System.out.println(meio);
    }
}
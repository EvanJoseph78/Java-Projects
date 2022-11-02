public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.add(7);
        lista.add(11);
        lista.add(12);
        lista.add(777);
        tamanhoLista(lista);
        System.out.println(lista.get(2).getAnterior().getValor());
        System.out.println("====================");
        mostrarLista(lista);
    }


    public static void tamanhoLista(ListaEncadeada lista) {
        System.out.println("O tamanho da lista é: " + lista.getTamanhoLista());
    }


    public static void mostrarLista(ListaEncadeada lista) {
        for (int i = 0; i < lista.getTamanhoLista(); i++) {
            System.out.println(lista.get(i).getValor());
        }
    }
}

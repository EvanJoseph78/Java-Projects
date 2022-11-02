public class ListaTeste {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirElemento(10, 0);
        lista.inserirElemento(11, 1);
        lista.inserirElemento(12, 2);
        lista.inserirElemento(200, 3);
        mostrarVetor(lista);
    }
    
    public static void mostrarVetor(Lista lista) { 
        System.out.print("[");
        for (int i = 0; i < lista.getElemento().length - 1; i++) {
           System.out.print(lista.getElemento()[i] + ", "); 
        }
        System.out.println(lista.getElemento()[lista.getElemento().length - 1] + "]");
    }
    public static void mostrarLista(Lista lista) { 
        System.out.print("[");
        for (int i = 0; i < lista.getTamanhoLista(); i++) {
           System.out.print(lista.getElemento()[i] + ", "); 
        }
        System.out.println(lista.getElemento()[lista.getTamanhoLista() - 1] + "]");
    }
}

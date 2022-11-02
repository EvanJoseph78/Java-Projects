public class Programa {
    public static void main(String[] args) {
        Lista l = new Lista();
        l.insereElemento(10);
        l.insereElemento(11);
        l.insereElemento(12);
        // System.out.println(l.ultimo.valor);
        l.mostrarLista();
        l.buscaPosicao(2);
        l.insereElemento(100,2);
        // System.out.println("teste" + l.primeiro.proximo.proximo.valor);
        l.mostrarLista();
    }    
}

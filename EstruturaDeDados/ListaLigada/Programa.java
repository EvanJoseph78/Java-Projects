public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar("Pará");
        lista.adicionar("Curitiba");
        lista.adicionar("Santa Catarina");
        lista.adicionar("Rio grande do sul");
        lista.remover("Curitiba");
        lista.remover("Pará");
        lista.remover("Santa Catarina");
        lista.remover("Rio grande do sul");
        imprimeLista(lista);
        System.out.println(lista.getTamanho());
    }
    

    public static void imprimeLista(ListaLigada lista) {
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
    }
}

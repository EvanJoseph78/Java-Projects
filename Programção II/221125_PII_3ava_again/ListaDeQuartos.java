public class ListaDeQuartos {
    Quarto[] listaDeQuartos;

    public ListaDeQuartos(Quarto[] listaDeQuartos) {
        this.listaDeQuartos = listaDeQuartos;
    }

    public void mostrarQuartos() {
        for (int i = 0; i < listaDeQuartos.length; i++) {
            System.out.println("Quarto " + listaDeQuartos[i].getNumQuarto() + " " + listaDeQuartos[i].getStatus());
        }
    }
    
}

public class Main {
   public static void main(String[] args) {
        Quarto quarto[] = new Quarto[5];
        quarto[0] = new Quarto("solteiro", 101);
        quarto[1] = new Quarto("duplo", 102);
        quarto[2] = new Quarto("triplo", 103);
        quarto[3] = new Quarto("solteiro", 104);
        quarto[4] = new Quarto("duplo", 105);


        ListaDeQuartos listaDeQuartos = new ListaDeQuartos(quarto);

        listaDeQuartos.mostrarQuartos();

        // Cliente c1 = new Cliente("892.192.212-21", "10-11-2021");
        // c1.pedirQuarto(quarto[0]);
        // Cliente c2 = new Cliente("111.111.111-11", "11-11-1121");

        // quarto[0].infomacoesQuarto();
        // quarto[0].pedirContasCliente(1, 1, 1, 1, 1);
        // quarto[0].infomacoesQuarto();
        // c1.pedirContas(1, 1, 1, 1, 1);
        // quarto[0].infomacoesQuarto();

        // quarto[0].infomacoesQuarto();
        // c2.pedirQuartoVip(quarto[0]);
        // quarto[0].infomacoesQuarto();
        // c2.pedirContas(1, 1, 1, 1, 1);
        // quarto[0].infomacoesQuarto();

        Cliente evandro = new Cliente("871.657.752-34", "04-02-1998", listaDeQuartos);
        evandro.pedirQuarto(quarto[4]);
        quarto[4].infomacoesQuarto();
        // System.out.println(quarto[4].getCpfQuarto());
        evandro.cpfEstaCadastrado(quarto, "871.657.752-34");

   } 
}

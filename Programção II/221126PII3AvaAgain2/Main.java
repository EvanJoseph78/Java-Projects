public class Main {
   public static void main(String[] args) {

        Hotel h1 = new Hotel();
        h1.mostrarQuartos();
        h1.infomacoesQuarto(109);

        Cliente c1 = new Cliente();
        c1.setCpf("871.999.111-22");
        h1.cadastrarCliente(c1, 101);
        h1.mostrarQuartos();
        h1.infomacoesQuarto(101);
   } 
}

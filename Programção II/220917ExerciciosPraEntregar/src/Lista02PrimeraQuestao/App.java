package Lista02PrimeraQuestao;

public class App {
    public static void main(String[] args) {

        System.out.println("\n=====Cliente comum=====");
        ContaCorrente pessoa1 = new ContaCorrente();
        pessoa1.setSaldo(1000);
        pessoa1.sacarQuantia(160);
        pessoa1.obterSaldo();
        pessoa1.fazerDeposito(100);
        pessoa1.obterSaldo();

        System.out.println("\n=====Cliente especial=====");
        ClienteEspecial clienteEspecial1 = new ClienteEspecial();
        clienteEspecial1.setSaldo(2000);
        clienteEspecial1.fazerDeposito(2500);
        clienteEspecial1.obterSaldo();
        clienteEspecial1.sacarQuantia(239.98f);
        clienteEspecial1.obterSaldo();

       
    }
    
}

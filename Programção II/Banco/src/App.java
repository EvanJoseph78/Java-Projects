/*
Evandro Mariano
202118640004
Tarefa 01 - SALA - 23/09/22
*/

public class App {
    public static void main(String[] args) throws Exception {

        Conta[] contas = new Conta[1000];
        contas[0] = new ContaCorrente();
        contas[1] = new ContaPoupanca();
        contas[2] = new ContaCorrente();
        contas[3] = new ContaPoupanca();
        contas[4] = new ContaCorrente();
        contas[5] = new ContaPoupanca();
        contas[6] = new ContaPoupanca();
        contas[7] = new ContaPoupanca();
        contas[8] = new ContaPoupanca();
        contas[9] = new ContaPoupanca();
        
        Cliente[] lClientes = new Cliente[1000];
        lClientes[0] = new PessoaFisica("Rafael", contas[0], 1000);
        lClientes[1] = new PessoaFisica("Elias", contas[1], 2000);
        lClientes[2] = new PessoaJuridica("Antônio", contas[2], 300);
        lClientes[3] = new PessoaFisica("Bejamin", contas[3], 200);
        lClientes[4] = new PessoaJuridica("Marta", contas[4], 3400);
        lClientes[5] = new PessoaJuridica("José", contas[5], 2030);
        lClientes[6] = new PessoaJuridica("Naruto", contas[6], 2070);
        lClientes[7] = new PessoaFisica("Minato", contas[7], 1200);
        lClientes[8] = new PessoaJuridica("Goku", contas[8], 3440);
        lClientes[9] = new PessoaFisica("Tite", contas[9], 20320);


        lClientes[6].depositar(1000000);
        lClientes[0].sacar(100);

        mostraVetor(lClientes);

        
    }

    public static void mostraVetor(Cliente[] vetor) {
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i].getNome() + " ");
            vetor[i].verSaldo();
        }
    } 
}

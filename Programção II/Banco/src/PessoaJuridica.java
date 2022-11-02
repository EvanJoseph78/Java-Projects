/*
Evandro Mariano
202118640004
Tarefa 01 - SALA - 23/09/22
*/

public class PessoaJuridica extends Cliente {

    public PessoaJuridica(String nome, Conta tipoConta, double saldoConta) {
        super(nome, tipoConta, saldoConta);
        tipoConta.setSaldo(tipoConta.getSaldo() + (tipoConta.getSaldo() * 0.005f));
    }

  
    
    
}

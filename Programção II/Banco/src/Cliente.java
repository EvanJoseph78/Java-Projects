/*
Evandro Mariano
202118640004
Tarefa 01 - SALA - 23/09/22
*/

public class Cliente {
    private String nome;
    private Conta tipoConta;
    private double saldoConta;

    public Cliente() {}

    public Cliente(String nome, Conta tipoConta, double saldoConta) {
        this.saldoConta = saldoConta;
        tipoConta.setSaldo(saldoConta);
        this.nome = nome;
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldoConta;
    }

    public void setSaldo(double saldo) {
        this.saldoConta = saldo;
        tipoConta.setSaldo(saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(Conta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void verSaldo() {
        System.out.format("o saldo é: %.2f\n", tipoConta.getSaldo());
    }

    public void depositar(double valor) {
        tipoConta.depositar(valor);
    }

    public void sacar(double valor) {
        tipoConta.sacar(valor);
    }

    
    
    
}

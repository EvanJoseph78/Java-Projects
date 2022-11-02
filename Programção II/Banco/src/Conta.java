/*
Evandro Mariano
202118640004
Tarefa 01 - SALA - 23/09/22
*/

public class Conta {
    private double saldo;

    public Conta() {}
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        setSaldo(saldo + valor);
    }

    public void sacar(double valor) {
        if (getSaldo() < valor) {
            System.out.println("Saldo insuficiente");
        }else {
            setSaldo(saldo - valor);
        }
    }

    public void verSaldo() {
        System.out.println(getSaldo());
    }
    
    
}

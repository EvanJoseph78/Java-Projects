package Lista04.Questao03;

public class ContaCorrente extends Cliente {
    protected float saldo;
    public ContaCorrente(String nome, float saldo) {
        super(nome);
        this.saldo = saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cliente: " + getNome() + "\nSaldo: R$ " + this.saldo;
    }

    //métodos especiais

    public void depositar(float depositar) {
        saldo = getSaldo();
        saldo = saldo + depositar;
        setSaldo(saldo);
    }

    public boolean sacar (float sacarValor) {
        saldo = getSaldo();
        if (sacarValor > saldo ) {
            System.out.println("Seu saldo é insuficiente!");
            System.out.println("Você tentou sacar R$" + sacarValor + " Mas possui apenas: R$" + saldo + " Disponível em sua conta.");
            return false;
        }else {
            saldo = saldo - sacarValor;
            setSaldo(saldo);
            return true;
        }
    }

    public boolean transferir(ContaCorrente outraConta, float transferirValor) {
        if (this.saldo < transferirValor) {
            System.out.println("O saldo que você deseja transferir excedeu o limite da sua conta");
            return false;
        }else {
            this.sacar(transferirValor);
            outraConta.depositar(transferirValor);
            return true;
        }
    }
    

}

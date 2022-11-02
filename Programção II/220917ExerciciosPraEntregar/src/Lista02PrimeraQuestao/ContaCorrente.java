package Lista02PrimeraQuestao;

public class ContaCorrente {
    private float saldo, deposito, saque;


    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setSaque(float saque) {
        this.saque = saque;
    }

    public float getDeposito() {
        return deposito;
    }
    public float getSaldo() {
        return saldo;
    }
    public float getSaque() {
        return saque;
    }

    public void obterSaldo() {
        System.out.println("Seu saldo é de: " + getSaldo());
    }

    public void fazerDeposito(float deposito) {
        this.deposito = deposito;
        this.saldo = saldo + deposito;
        setSaldo(saldo);
    }

    public void sacarQuantia(float saque) {
        this.saque = saque;
        saque = saque + (saque * 5/100);
        this.saldo = saldo - saque;
        this.setSaldo(saldo);
    }
    
}

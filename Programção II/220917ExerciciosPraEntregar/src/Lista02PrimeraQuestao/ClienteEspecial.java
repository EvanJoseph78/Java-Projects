package Lista02PrimeraQuestao;

public class ClienteEspecial extends ContaCorrente{

    public void sacarQuantia(float saque) {
        saque = saque + (saque * 1/100);
        float saldo = getSaldo();
        saldo = saldo - saque;
        this.setSaldo(saldo);
    }


}

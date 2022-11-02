package Lista04.Questao03;

public class ContaEspecial extends ContaCorrente {
    private float limite;
    public ContaEspecial(String nome, float saldo, float limite) {
        super(nome, saldo);
        this.limite = limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        return "Cliente: " + getNome() + "\nSaldo: " + getSaldo() + "\nPossui um limite especial de: " + this.limite;
    }
    
    public boolean sacar (float sacarValor) {
        saldo = getSaldo();
        limite = getLimite();
        if (sacarValor > limite + saldo) {
            System.out.println("Você excedeu seu limite de saque");
            System.out.println("Você tentou sacar R$" + sacarValor + " Mas possui um limite de: R$" + (limite + saldo) + " Disponível em sua conta.");
            return false;
        }else {
            saldo = saldo - sacarValor;
            setSaldo(saldo);
            return true;
        }
    }
    

}

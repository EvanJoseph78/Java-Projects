package Lista04.Questao02;

public class Vendedor extends Empregado {
    protected float pecentualComissao;
    public Vendedor(String nome, float salario, float comissao) {
        super(nome, salario);
        this.pecentualComissao = comissao;

    }

    public void setPecentualComissao(float pecentualComissao) {
        this.pecentualComissao = pecentualComissao;
    }

    public float getPecentualComissao() {
        return pecentualComissao;
    }

    @Override
    public String toString() {
        
        return "Nome: " + this.nome + "Cargo: Vendedor\n" + "Salário sem comissão: " + getSalario() + "\nSalário com comissão: R$ " + (getSalario() + (getSalario() * this.pecentualComissao/100));
    }
    
}

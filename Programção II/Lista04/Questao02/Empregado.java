package Lista04.Questao02;

public class Empregado {
    protected String nome;
    protected float salario;

    //construtor

    public Empregado(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    //setters e getters
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nSalário: R$ " + this.salario;
    }
}

package Lista04.Questao02;
    
public class Gerente extends Empregado {
    protected String departamento;
    public Gerente(String departamento, String nome, float salario) {
        super(nome, salario);
        this.departamento = departamento;
    }

    //setters e getters

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nCargo: Gerente\n" + "Departamento: " + this.departamento + "\nSalário: R$ " + this.salario;
    }
    
}

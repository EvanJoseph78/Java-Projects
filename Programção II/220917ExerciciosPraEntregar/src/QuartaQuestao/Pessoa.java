package QuartaQuestao;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa () {
        
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void dizerONome () {
        System.out.println("Olá! Meu nome é " + this.nome);
    }

    public void dizerAIdade() {
        System.out.println("Eu tenho " + this.idade + " anos");
    }
    
    public void fazerAniversario() {
        System.out.println("Hoje o " + this.nome + " faz " + (this.idade + 1) + " anos");
    }
}

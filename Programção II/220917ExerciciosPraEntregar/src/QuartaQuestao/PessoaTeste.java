package QuartaQuestao;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setIdade(18);
        p1.setNome("Evandro Mariano");

        p1.dizerAIdade();
        p1.dizerONome();
        p1.fazerAniversario();
    }    
}

/*
 	Aluno: Evandro José da Silva Mariano
 	Matricula: 202118640004
	Tarefa 01-SIGAA
*/
package PrimeiraQuestao;
public class App {
    public static void main(String[] args) throws Exception {
        CadernoDeEnderecos pessoa1 = new CadernoDeEnderecos();
        pessoa1.setDataDeAniversario("04/02/1998");
        pessoa1.setNome("Evandro Mariano");
        pessoa1.setTelefone("(91) 940028922");
        pessoa1.setEmail("evandromariano@email.com");
        
        System.out.println("========Primeira Questão========");
        System.out.format("Nome: %s\nData de Aniversário: %s\nEmail: %s\nTelefone: %s\n", pessoa1.getNome(), pessoa1.getDataDeAniversario(), pessoa1.getEmail(), pessoa1.getTelefone());
        
        
    }
}

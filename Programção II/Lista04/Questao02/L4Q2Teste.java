package Lista04.Questao02;

public class L4Q2Teste {
    
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Evandro mariano", 10000);
        System.out.println(empregado1);
        
        System.out.println("----------------------------------");
        Gerente gerente = new Gerente("Vendas", "Ednaldo Pereira", 9000);
        System.out.println(gerente);

        System.out.println("----------------------------------");
        Vendedor vendedor = new Vendedor("Jim", 4000, 9);
        System.out.println(vendedor);
    }
}

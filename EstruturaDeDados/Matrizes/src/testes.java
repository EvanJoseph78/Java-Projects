import java.util.Scanner;

public class testes {
   public static void main(String[] args) {
        String nome = entradaDeTexto();
        System.out.println("O nome do usuário é: " + nome);

        // System.out.println("teste");
        String nome2 = entradaDeTexto();
        System.out.println("O nome do usuário é: " + nome2);
        
} 

    public static String entradaDeTexto() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um texto: ");
        String texto = entrada.next();
        // entrada.close();
        return texto;
    }
}

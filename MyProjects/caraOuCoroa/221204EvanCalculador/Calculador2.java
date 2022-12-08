import java.util.Scanner;

public class Calculador2 {

    static String calBotoes = "0123456789+-*/=exyz";
    static String numList = "0123456789";

    public static void interfaceCalculadora() {
        System.out.println("\nDigite no teclado o número ou a operação correspondente: ");
        System.out.println("Digite e para finalizar.");
        System.out.println("-------------");
        System.out.println("1  2  3  +  ");
        System.out.println("4  5  6  -  ");
        System.out.println("7  8  9  *  =");
        System.out.println("0  x  y  /  e");
        System.out.println("-------------");
    }

    public static void entradaUsuario() {
        try (Scanner scanner = new Scanner(System.in)) {
            String tela = "";
            String[] numEmString = new String[20]; 
            int index = 0;
            System.out.println("Digite sua equação: ");
            while(true) {
                String[] expressao = new String[20];
                char entrada = scanner.next().charAt(0);
                while (verificaDigito(entrada, calBotoes)) {
                    System.out.println("Apenas digitos válidos");
                    entrada = scanner.next().charAt(0);
                }
                if (verificaDigito(entrada, numList)) {
                    numEmString[index] = Character.toString(entrada);
                    System.out.println("======" + numEmString[index]);
                }
                tela = tela + Character.toString(entrada);
                System.out.print(tela + " ");
                System.out.println();
                if (entrada == 'e') {
                    System.out.println("kkkkkkkkkkkkkkkkk");
                    break;
                }
            }
        }
    }

    public static Boolean verificaDigito(char c, String s) {
        String aux;
        aux = Character.toString(c);
        if (s.contains(aux)) {
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        interfaceCalculadora();
        entradaUsuario();

        // String i = "e";
        // if (i == "e") {
        //     System.out.println("Que estranho");
        // }
    }
}

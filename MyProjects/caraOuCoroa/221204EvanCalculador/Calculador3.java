import java.util.Scanner;

public class Calculador3 {
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
            while (true) {
                
                String entrada = scanner.nextLine();

                // while (calBotoes.contains(entrada) == false) {
                //     System.out.println("Entre com um digito válido!");
                //     entrada = scanner.next();
                // }


                entrada = entrada.replace(" ", "").toString();

                
                expressaoSimples(divExpresaao(entrada));
                
                
                // System.out.print(entrada.length());
            }
            
        }

        
    }

    public static void expressaoSimples(String[] s) {
        float a = Integer.parseInt(s[0]);
        float b = Integer.parseInt(s[2]);
        switch (s[1]) {
            case "+":
                System.out.println(" = "+ (a+b));
                break;
            case "-":
                System.out.println(" = "+ (a-b));
                break;
            case "*":
                System.out.println(" = "+ (a*b));
                break;
            case "/":
                System.out.println(" = "+ (a/b));
                break;
        }   
    }

    public static String[] strToVetor(String s) {
        char[] c = s.toCharArray();
        String[] aux = new String[c.length];
        for (int i = 0; i < c.length; i++) {
            aux[i] = Character.toString(c[i]);
        }
        return aux;
    }

    public static String[] divExpresaao(String str) {
        String[] s = strToVetor(str);
        String[] sAux = new String[3];
        String aux = "";
        int index = 0;

        for (int i = 0; i < s.length; i++) {
            if (numList.contains(s[i])) {
                aux =  aux + s[i];
                sAux[index] = aux;
            }else{  
                index++;
                sAux[index] = s[i];
                index++;
                aux = "";
            }
        }

        return sAux;

    }


    public static void main(String[] args) {
        interfaceCalculadora();
        entradaUsuario();
        // String[] e = {"100","*","23"};
        // expressaoSimples(e);
        // divExpresaao("8+10");


        // String MyString = "12 12"; 
        // System.out.println("The string before removing character: " + MyString); 
        // MyString = MyString.replace(" ", ""); 
        // System.out.println("The string after removing character: " + MyString); 

        // System.out.println(MyString.length());

        
        
    }
}

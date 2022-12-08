
public class Calculador {
    
    String [] numList = {"0","1","2","3","4","5","6","7","8","9"};
    String [] operadores = {"+", "-"};
    

    public static void mostrar(char[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

    public static void equacao(String e) {
        e = e.replace(" ", "");
        char[] vetor = e.toCharArray();
        // mostrar(vetor);
        calcula(vetor);
        
    }

    public static void calcula(char[] c) {
        int[] constantes = new int[3];
        String sNum = "";
        String listNum = "0123456789";
        String[] equation = new String[c.length];
        for (int i = 0; i < c.length; i++) {
            equation[i] = Character.toString(c[i]);
            if (listNum.contains(equation[i])) {
                System.out.println(equation[i]);
                sNum = sNum + equation[i]; 
            }else {
                // constantes[i] = Integer.parseInt(String.valueOf(sNum));
                sNum = "";
            }
            // System.out.println(sNum);

            
            // System.out.println(equation[i]);
        }

    }

    public static void isNumber() {

    }

    

    public static void main(String[] args) {
        equacao("4x + 10 = 99");
        
    }
}  
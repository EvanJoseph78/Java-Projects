import java.util.Date;

public class Ordenacao{
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data);
        int[] vetor = {9,2,3,1, 777, -21, -1, 4,6,100};
        String[] c = {"e","j","l","a","u","k"};
        // ordenaString(c);
        // mostrarVetor(vetor);
        // ordena(vetor);
        

    }

    public static void ordena(int[] v) {
        int aux;
        int n = 0;
        for (int i = 0; i < v.length; i++) {
            mostrarVetor(v);
            for (int j = i + 1; j < v.length; j++) {
                n++;
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        System.out.println("iterações " + n);
        mostrarVetor(v);
    }

    public static void mostrarVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void pesquisa(int[] v) {
        
    }

    //cada etapa ele seleciona o menor elemento pra trocar a posição do vetor
    public static void mSelecao(int[] v) {}

    public static void quickSort() {}

    public static void bubblesort() {}

    public static void mInsercao() {}

    public static void ordenaString(String[] s) {
        int[] v = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            v[i] = s[i].hashCode();
        }
        ordena(v);
        for (int i = 0; i < v.length; i++) {
            s[i] = String.valueOf(v[i]);
            System.out.print(s[i] + " ");
            
        }
        
        mostrarVetor(v);
    }
}
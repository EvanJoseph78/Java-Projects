import java.util.Arrays;

public class MetodosOrdenação {

    public static void mostrarVetor(int[] vetor) {
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }


    // Método da seleção: Busca o menor número e coloca na primeira poisição. O segundo menor na segunda...
    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            int aux;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }
        
        mostrarVetor(vetor);
    }

    public static void insertionSort(int[] vetor) {
        int x, j;
        for (int i = 1; i < vetor.length; i++) {
            x = vetor[i];
            j = i - 1;
            while((j >= 0) && vetor[j] > x){
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = x;
        }
        System.out.println(Arrays.toString(vetor));
    }

    public static void quickSort(int[] vetor)
    
    


    public static void main(String[] args) {
        int[] lista = {10, 8, 111, 21, 42};
        // selectionSort(lista); 
        System.out.println(Arrays.toString(lista));
        insertionSort(lista);

    }

}

public class Teste {
    
    private static void bubbleSort(int vetor[]) {
        Boolean troca = true;
        int aux;
        int n = 0;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                // System.out.println(i + "ª iteração");
                // mostrar(vetor);
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    n = n + 1;
                    System.out.println("Número de trocas " + n);
                    mostrar(vetor);
                    troca = true;
                }
            }
        }
        

    }

    public static void mostrar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int[] v = {2, 7, 34, 22, 90, 1, 12, 20, 40, 55, 80};
        bubbleSort(v);
        mostrar(v);

    }



}

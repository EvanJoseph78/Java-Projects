public class BuscaBinByEvan {
    public static void buscaBin(int[] vetor, int numProcurado) {
        int n = vetor.length;
        int meio = n / 2;
        int menor = 0;
        int maior = 0;

        if (numProcurado < vetor[meio]) {
            n = vetor.length - meio;
            
        }
    }
}

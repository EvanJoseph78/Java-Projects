import javax.swing.JOptionPane;

public class vetores {
    public static void main(String[] args) {
        int vetorA[] = entraComVetor();
        mostraVetor(vetorA);
        int vetorB[] = multiplicaVetor(vetorA);
        mostraVetor(vetorB);
    }



    public static int[] entraComVetor() {
        int tamanhoDoVetor = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de elementos"));
        int vetorEntrada[] = new int[tamanhoDoVetor];
        for (int i = 0; i < vetorEntrada.length; i++) {
           vetorEntrada[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número")); 
        }
        return vetorEntrada;
    }


    public static void mostraVetor(int vetor[]) {
        System.out.print("Você entrou com o vetor:\n[");
        for (int i = 0; i < vetor.length - 1; i++) {
            System.out.print(vetor[i] + ", ");
            
        }
        System.out.println(vetor[vetor.length - 1] + "]");
    }

    public static int[] multiplicaVetor(int vetor[]) {
        int vetorSaida [] = new int[vetor.length];
        int multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número que deseja multiplicar o vetor"));
        for (int i = 0; i < vetorSaida.length; i++) {
            vetorSaida[i] = vetor[i] * multiplicador;
        }
        return vetorSaida;
    }

    public static int menorNum (int vetor[]) {
        int i = 0;
        int menorNum = 1000000;
        while (i < vetor.length) {
           if (vetor[i] < menorNum) {
                menorNum = vetor[i];
           } 
           i++;
        }
       
       return menorNum; 
    }
}

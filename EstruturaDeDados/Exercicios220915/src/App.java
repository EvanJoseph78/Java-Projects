import javax.swing.JOptionPane;

//faça um programa em Java que carregue um vetor com 15 posições, calcule e mostre:
//O usuário entra com as informações ou pode ser randomico
//a) Informar o maior elemento do vetor e que posição esse elemeneto se encontra (com método).
//b)Informar o menor elemento do vetor e em que posição esse elemento se encontra (com método)
//c) Ler um valor numérico. Multiplicar o vetor por este valor e imprimir o novo resultado (com método, e criar um novo vetor para guardar os novos valores)



public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor15 = new int[15];
        int i = 0;
        while (i < 15) {
            vetor15[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número"));
            i = i + 1;
        }
        mostraVetor(vetor15);
        System.out.println("O maior número é: " + maiorNum(vetor15));
        System.out.println("O menor número é: " + menorNum(vetor15));
        
        multiplicaVetores(vetor15);
        System.out.println("A posição do maior número é: " + posicaoMaiorNum(vetor15));
    }


    public static void mostraVetor(int vetor[]) {
        int i = 0;
        System.out.print("[");
        while (i < vetor.length) {
           System.out.print(vetor[i]);
           System.out.print(", ");
           i++;
        }
        System.out.println("]");
    }

    public static int maiorNum (int vetor[]) {
        int i = 0;
        int maiorNum = 0;
        while (i < vetor.length) {
           if (vetor[i] > maiorNum) {
                maiorNum = vetor[i];
           } 
           i++;
        }
       
       return maiorNum; 
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


    
    public static void multiplicaVetores (int vetorEntrada[]) {
        int multiplicador = 0;
        multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Qual número pra multiplicar o vetor"));
        int i = 0;
        int[] multVetor15 = new int[15];
        System.out.print("O novo vetor é: ");
        while (i < 15) {
            multVetor15[i] = vetorEntrada[i] * multiplicador;
            i++;
        }
        mostraVetor(multVetor15);
    }

    public static int posicaoMaiorNum (int vetor[]) {
        int maiorNum = maiorNum(vetor);
        int i = 0;
        int posicaoMaiorNum = 0;
        while (i < vetor.length) {
            if (maiorNum == vetor[i]) {
                posicaoMaiorNum = i;
            }
            i++;
        }
        return posicaoMaiorNum;
    }
}


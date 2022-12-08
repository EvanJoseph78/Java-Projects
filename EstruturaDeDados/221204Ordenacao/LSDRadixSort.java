
public class LSDRadixSort {


    public static int[] divInteiro(int inteiro) {

        int[] vetor = new int[10];

        if (inteiro < 10) {
            vetor[9] = (inteiro / 1) % 10;
        }else if (inteiro < 100) {
            vetor[9] = (inteiro / 1) % 10;
            vetor[8] = (inteiro / 10) % 10;
        }else if (inteiro < 1000) {
            vetor[9] = (inteiro / 1) % 10;
            vetor[8] = (inteiro / 10) % 10;
            vetor[7] = (inteiro / 100) % 10;
        }


        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        return vetor;

    }

    public static void radix(int[] list) {    

        int[] listAux = new int[10];

        for (int i = 0; i < listAux.length; i++) {
            int[] listAux2 = new int[10];
        }

        for (int i = 0; i < list.length; i++) {
            
        }

    }


    public static void main(String[] args) {
        // int[] listNum = {10, 20, 30, 121, 22};
        

        divInteiro(923);
    
    }

}
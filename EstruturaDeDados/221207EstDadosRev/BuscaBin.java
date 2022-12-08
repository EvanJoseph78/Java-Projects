public class BuscaBin {
    public static void buscaBIn (int[] vetor, int num) {

        int n = vetor.length;
        int baixo = 0;
        int alto = n - 1;
        int meio = 0;

        while (baixo <= alto) {
            meio = (baixo + alto) / 2;
            if (num < vetor[meio]) {
                alto = meio - 1;

            }else if (num > vetor[meio]){
                baixo = meio + 1;
                System.out.println("-----" + baixo);

            }else {
                System.out.println(vetor[meio]);
            }
        }

        System.out.println(meio);

        

    }    

    public static void main(String[] args) {
        int[] v = {10, 11, 15, 88, 122};
        buscaBIn(v, 88);
    }
}
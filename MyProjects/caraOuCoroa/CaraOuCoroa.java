import java.util.Random;

public class CaraOuCoroa {
    public static void main(String[] args) {
        jogarNvezes(10000);
    }

    public static String jogarMoeda() {
        String [] moeda = {"Cara", "Coroa"};
        Random aletorio = new Random();
        int aux = aletorio.nextInt(2);
        if (aux == 1) {
            System.out.println(moeda[0]);
            return moeda[0];
        } else {
            System.out.println(moeda[1]);
            return moeda[1];
        }


    }

    public static void jogarNvezes(int nVezes) {
        int cara = 0;
        int coroa = 0;
        String aux;
        for (int i = 0; i < nVezes; i++) {
            aux = jogarMoeda();
            if (aux == "Cara") {
                cara++;
            }
            if (aux == "Coroa") {
                coroa++;
            }

        }
        double porcentagemCara = (float) cara * 100 / nVezes;
        double porcentagemCoroa = (float) coroa * 100 /nVezes;
        System.out.format("Porcentagem de vezes vezes que deu cara: %.2f%%", porcentagemCara);
        System.out.format("\nPorcentagem de vezes vezes que deu coroa: %.2f%%\n", porcentagemCoroa);
    }
}
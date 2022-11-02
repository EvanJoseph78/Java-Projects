import java.util.Random;

public class Telesena{
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            sorteio();
            
        }
    }


    public static void sorteio() {
        Random r = new Random();

        String[] urna = {"V", "V", "A", "A", "A"};

        int num = r.nextInt(urna.length);

        int num2 = r.nextInt(urna.length);

        System.out.println("Sorteio");

        System.out.println(urna[num] + "-" + urna[num2]);

    }
}



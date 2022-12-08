public class Main {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Bulbasaur", 20, 45, "grass", 49  , 45, 49);
        Pokemon p2 = new Pokemon("Charmander", 11, 39, "fire", 52, 65, 50);
        System.out.println(p1);
        System.out.println(p2);
        Batalha b1 = new Batalha();
        b1.iniciarBatalha(p1, p2);
    }
    
}

public class Pookemon {
    public static void main(String[] args) {
        Pokemon p1 = new Fogo("Charmander", 10);
        Pokemon p2 = new Agua("Skirtle", 9);

        Batalha batalha = new Batalha();
        batalha.iniciarBatalha(p1, p2);
    }
} 
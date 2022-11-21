public class POOkemons {
    public static void main(String args[]) {
        Pokemon p1 = new Eletrico("Pikachu", 100, 100, 100);
        Pokemon p2 = new Agua("Blaistoise", 20, 10, 21);

        Atacar batalha = new Atacar(p1, p2);
        batalha.inciarBatalha();
    }    
}

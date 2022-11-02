public class App {
    public static void main(String[] args) throws Exception {
        Pokemon p1 = new Agua();
        Atacar atacar = new Atacar(p1);
        atacar.poder();

        Pokemon p2 = new Fogo();
        Atacar atacar2 = new Atacar(p2);
        atacar2.poder();

        Pokemon p3 = new Grama();
        Atacar atacar3 = new Atacar(p3);
        atacar3.poder();
        // atacar2.mov2();
        
    }
}

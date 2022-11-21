public class Atacar {
    Pokemon p1, p2;

    public Atacar(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void inciarBatalha() {
        System.out.println(p1.getNome() + " usou o:");
        p1.mov1();
        System.out.println(p2.getNome() + " usou o: ");
        p2.mov1();
    }

    public void batalhaEpica() {
        
    }


}

public class Batalha {
    private Pokemon p1, p2;
    
    public void iniciarBatalha(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
        System.out.println("====================================");
        System.out.println(p1.getNome() + " Vs " + p2.getNome());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.getNome() + " usou " + p1.getMov001().getNome());
        p2.setHp((p2.getHp() - p1.getMov001().getDano()));
        System.out.println(p2);
        status(p2);
        p2.setHp((p2.getHp() - p1.getMov001().getDano()));
        status(p2);

        System.out.println("====================================");
    }

    public void p1Atacar() {
        p2.setHp((p2.getHp() - p1.getMov001().getDano()));
    }

    public void p2Atacar() {
        p1.setHp((p1.getHp() - p2.getMov001().getDano()));
    }

    public void status(Pokemon p) {
        System.out.println("=================================================");
        System.out.print(p.getNome() + "  HP: " + p.getHp() + " - ");
        barraDevida(p);
        System.out.println(p.getMov001().getNome() + "          " + p.getMov002().getNome());
        System.out.println("=================================================");
    }

    public void barraDevida(Pokemon p) {
        for (int i = 0; i < p.getHp(); i++) {
            System.out.print("❤️ ");
        }
        System.out.println();
    }
}

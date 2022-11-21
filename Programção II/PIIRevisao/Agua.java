public class Agua extends Pokemon {

    public Agua (String nome, int hp, int ataque, int defesa) {
        setAtaque(ataque);
        setDefesa(defesa);
        setHp(hp);
        setNome(nome);
    }

    @Override
    public void mov1() {
        System.out.println("Pistola d'gua!");
    }
}

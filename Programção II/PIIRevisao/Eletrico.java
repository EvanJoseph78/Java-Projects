public class Eletrico extends Pokemon {

    public Eletrico (String nome, int hp, int ataque, int defesa) {
        setAtaque(ataque);
        setDefesa(defesa);
        setHp(hp);
        setNome(nome);
    }

    @Override
    public void mov1() {
        System.out.println("Choque do trovão!");
    }


}

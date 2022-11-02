
public class Atacar {
    private Pokemon tipoPokemon;

    public Atacar(Pokemon tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }
    
    public void poder() {
        tipoPokemon.poder();
    }
    
}

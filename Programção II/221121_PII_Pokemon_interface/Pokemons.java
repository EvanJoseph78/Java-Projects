public class Pokemons{

    private int vida, atk, def, nivel;
    String nome;

    public Pokemons(String nome, int vida, int atk, int def, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.atk = atk;
        this.def = def;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void info(){}

} 
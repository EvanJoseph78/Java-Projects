public class Pokemon {
    private String nome;
    private int nivel, atk, def, hp;
    private Poder mov001, mov002;
    
    public Pokemon(String nome, int nivel) {
        setAtk(nivel * 3);
        setDef(nivel * 2);
        setHp(nivel * 5);
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
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
    public int getHp() {
        return hp;
    }
    public Poder getMov001() {
        return mov001;
    }

    public void setMov001(Poder mov001) {
        this.mov001 = mov001;
    }

    public Poder getMov002() {
        return mov002;
    }

    public void setMov002(Poder mov002) {
        this.mov002 = mov002;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    @Override
    public String toString() {
        return "Pokemon [nome=" + nome + ", nivel=" + nivel + ", atk=" + atk + ", def=" + def + ", hp=" + hp + "]";
    }

    
    
    

    
}

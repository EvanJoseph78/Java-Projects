public class Pokemon {
    private String nome, type;
    private int level, atk, speed, defense, hp;
    private Mov mov001, mov002;

    public Pokemon (String nome, int level, int baseHp, String type, int baseAtk, int baseSpeed, int baseDefense) {
        this.nome = nome;
        this.level = level;
        this.type = type;
        this.speed = baseSpeed + level;
        this.atk = baseAtk + level;
        this.defense = baseDefense + level;
        this.hp = baseHp + level * 10;

        if (type == "fire") {
            mov001 = new Mov("Ember", 40, 100, 25, "fire");
            mov002 = new Mov("Growl", 40, 100, 40, "normal");
        }

        if (type == "grass") {
            mov001 = new Mov("Folha navalha", 55, 95, 25, "grass");
            mov002 = new Mov("Tackle", 40, 100, 35, "normal");
        }
        
    }

    @Override
    public String toString() {
        return 
                "===========================================================================\n" +
                nome + " - Tipo: " + type + " - Nível: " + level + " - HP: " + hp + "\nAtaque: " + atk + " - speed: " + speed
                + " - defense: " + defense + " = hp: " + hp + "\nmov001: " + mov001 + "\nmov002: " + mov002 +
                "\n===========================================================================\n";
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getNome() {
        return nome;
    }

    public Mov getMov001() {
        return mov001;
    }

    public void setMov001(Mov mov001) {
        this.mov001 = mov001;
    }

    public Mov getMov002() {
        return mov002;
    }

    public void setMov002(Mov mov002) {
        this.mov002 = mov002;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    

}

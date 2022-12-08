public class Agua extends Pokemon{
    private Poder mov001 = new Poder(5, "Pistola d'agua", "Água");
    private Poder mov002 = new Poder(3, "Ataque bolhas", "Água");

    public Agua(String nome, int nivel) {
        super(nome, nivel);
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

    


    
    
}

public class Fogo extends Pokemon{
    private Poder mov001 = new Poder(5, "Lança chamas", "Fogo");
    private Poder mov002 = new Poder(3, "Queimar", "Fogo");

    public Fogo(String nome, int nivel) {
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

public class Agua implements Pookemon, Poder{
    private String nome;
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void status() {
        System.out.println(nome + getMov001());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getMov001() {
        // TODO Auto-generated method stub
        return " Furacao de fogoo";
    }
    
}

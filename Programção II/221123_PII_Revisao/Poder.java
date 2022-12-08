public class Poder {
    private int dano;
    private String nome, tipo;

    public Poder(int dano, String nome, String tipo) {
        this.dano = dano;
        this.nome = nome;
        this.tipo = tipo;
    }


    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}

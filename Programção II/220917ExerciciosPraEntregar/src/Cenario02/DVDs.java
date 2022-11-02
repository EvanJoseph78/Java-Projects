package Cenario02;

public class DVDs extends Produtos{
    private float duracao;

    public DVDs(float duracao, String nome, float preco) {
        super(nome, preco);
        this.duracao = duracao;
    }
    
    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public float getDuracao() {
        return duracao;
    }
    
    public String toString() {
        // TODO Auto-generated method stub
        return "Tamanho do filme: " + duracao + "minutos\nNome do filme: " + getNome() + "\nPreço: " + getPreco();
    }

    public void mostraInformacoes() {
        System.out.println("Nome do filme: " + this.getNome());
        System.out.println("Tempo: " + this.getDuracao() + " minutos");
        System.out.println("Preço: " + this.getPreco());
    }
}

package Cenario02;

public class Produtos {
    private String nome;
    private float preco;

    public Produtos(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub

        return super.toString();
    }

    public void mostraInformacoes() {
        System.out.println("Mostra Informações");
    }
}

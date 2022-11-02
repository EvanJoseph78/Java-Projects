package Cenario02;

public class Livros extends Produtos{
    private String autor;
    
    public Livros(String autor, String nome, float preco){
        super(nome, preco);
        this.autor = autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Autor: " + autor + "\nNome do livro: " + getNome() + "\nPreço: " + getPreco();
    }
    public void mostraInformacoes() {
        System.out.println("livro: " + this.getNome());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Preço: " + this.getPreco());
    }
}

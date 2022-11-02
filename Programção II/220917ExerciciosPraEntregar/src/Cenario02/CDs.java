package Cenario02;

public class CDs extends Produtos {
    private int faixas;
    public CDs(int faixas, String nome, float preco) {
        super(nome, preco);
        this.faixas = faixas;
    }
    
    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    public int getFaixas() {
        return faixas;
    }
    
    public String toString() {
        // TODO Auto-generated method stub
        return "Número de faixas: " + faixas + "\nNome do CD: " + getNome() + "\nPreço: " + getPreco();
    }

    public void mostraInformacoes() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Número de faixas: " + this.getFaixas());
        System.out.println("Preço: " + this.getPreco());
    }
}

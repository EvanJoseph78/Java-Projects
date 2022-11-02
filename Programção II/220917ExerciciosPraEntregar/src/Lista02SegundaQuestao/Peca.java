package Lista02SegundaQuestao;

public class Peca {
    private String nome;
    private float custo, lucro;

    //construtor
    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }
    
    //seters

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //getters
    public float getCusto() {
        return custo;
    }

    public float getLucro() {
        return lucro;
    }

    public String getNome() {
        return nome;
    }

    //funções especiais

    public float calcularPreco() {
        float custo = getCusto();
        float lucro = getLucro();
        
        //System.out.println("O custo da peça é de R$: " + (custo + lucro));
        return custo + lucro;
    }

    public void exibir() {
        System.out.println("Peça: " + getNome() + "\nCusto: " + getCusto() + "\nPreço: " + calcularPreco());
        System.out.println();
    }
}


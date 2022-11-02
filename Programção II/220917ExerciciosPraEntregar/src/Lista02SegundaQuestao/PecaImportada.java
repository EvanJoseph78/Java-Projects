package Lista02SegundaQuestao;

public class PecaImportada extends Peca {

    private float taxaImportacao, taxaTransporte;
    
    //construtor
    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaTransporte) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaTransporte = taxaTransporte;
    }


    //setters e getters
    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public void setTaxaTransporte(float taxaTransporte) {
        this.taxaTransporte = taxaTransporte;
    }

    public float getTaxaTransporte() {
        return taxaTransporte;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    //funções especiais

    @Override
    public float calcularPreco() {
        float custo = getCusto();
        float lucro = getLucro();
        float taxaImportacao = custo * (getTaxaImportacao() / 100);
        float taxaTransporte = custo * (getTaxaTransporte() / 100);
        
        //System.out.println("O custo da peça é de R$: " + (custo + lucro + taxaImportacao + taxaTransporte));
        return custo + lucro + taxaImportacao + taxaTransporte;
    }
    
    @Override
    public void exibir() {
        System.out.println("Peça Importada: " + getNome() + "\nCusto: " + getCusto() + "\nTaxa de importação: " + getTaxaImportacao() + "%\nTaxa de Transporte: " + getTaxaTransporte() + "%\nPreço: " + calcularPreco());
        System.out.println();
    }
    
}

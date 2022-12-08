public class Quarto {
    private float valorDiaria;
    private Boolean status;
    private String dataLocacao;
    private int qdias;
    private String tipoQuarto;
    private Frigobar frigobar;

    public Quarto(float valorDiaria, Boolean status, String dataLocacao, int qdias) {
        this.valorDiaria = valorDiaria;
        this.status = status;
        this.dataLocacao = dataLocacao;
        this.qdias = qdias;
    }


    public String getTipoQuarto() {
        return tipoQuarto;
    }


    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }


    public Quarto (int qdias) {
        this.qdias = qdias;
        this.status = true;
    }


    public void valorLocacao() {
        float valor = getQdias() * getValorDiaria();
        System.out.println(valor);
    }


    @Override
    public String toString() {
        return "Quarto [valorDiaria=" + valorDiaria + ", status=" + status + ", dataLocacao=" + dataLocacao + ", qdias="
                + qdias + "]";
    }


    public float getValorDiaria() {
        return valorDiaria;
    }


    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }


    public Boolean getStatus() {
        return status;
    }


    public void setStatus(Boolean status) {
        this.status = status;
    }


    public String getDataLocacao() {
        return dataLocacao;
    }


    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }


    public int getQdias() {
        return qdias;
    }


    public void setQdias(int qdias) {
        this.qdias = qdias;
    }
    
    public void pedirConta(float qbebida, float qdoces, float qpetiscos, float qbiscoitos) {
        if (getStatus()) {
            frigobar = new Frigobar(qbebida, qdoces, qpetiscos, qbiscoitos);
            float valorDaconta = frigobar.valorDaConta();
            System.out.println(valorDaconta);
        } else {
            System.out.println("Este quarto está desocupado");
        }
    }

    public float valorConta(float qbebida, float qdoces, float qpetiscos, float qbiscoitos) {
        frigobar = new Frigobar(qbebida, qdoces, qpetiscos, qbiscoitos);
        float valorConta = frigobar.valorDaConta() + getQdias() * getValorDiaria();
        return valorConta;
    }

    

    

    

    
    
    
    

    
}

public class Quarto {
    private float valorDiaria;
    private String capacidade;
    private String status;
    private String cpfQuarto = null;
    private String dataQuarto = "Não alocado";
    private float bebidaPreco = 6.00f;
    private float docePreco = 1.50f;
    private float petiscoPreco = 1.40f;
    private float biscoitoPreco = 3.50f;
    private Boolean vip = false;
    private int numQuarto;

    
    public Quarto(String capacidade, int numQuarto) {
        this.capacidade = capacidade;
        this.numQuarto = numQuarto;
        if (capacidade == "solteiro") {
            this.valorDiaria = 100;
        } else if (capacidade == "duplo") {
            this.valorDiaria = 150;
        } else if (capacidade == "triplo"){
            this.valorDiaria = 200;
        } else {
            System.out.println("Este quarto não está disponível");
        }
        this.status = "Desocupado";
    }


    public int getNumQuarto() {
        return numQuarto;
    }


    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }


    @Override
    public String toString() {
        return "Quarto [valorDiaria=" + valorDiaria + ", capacidade=" + capacidade + "]";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCpfQuarto(String cpfQuarto) {
        this.cpfQuarto = cpfQuarto;
    }

    public String getCpfQuarto() {
        return cpfQuarto;
    }

    public void infomacoesQuarto() {
        System.out.println("=================================================");
        System.out.println("Quarto de " + capacidade + "\nValor da diária R$: " + valorDiaria + "\nData de alocação: " + dataQuarto + "\nSituação: " + status);
        System.out.println("=================================================");
    }

    public void setDataQuarto(String dataQuarto) {
        this.dataQuarto = dataQuarto;
    }

    public String getDataQuarto() {
        return dataQuarto;
    }

    public float pedirContas(int qdias, int qBebidas, int qDoces, int qPetiscos, int qBiscoitos) {
        if (status == "Ocupado") {
            float frigobarValor = (float) (qBebidas * bebidaPreco + qDoces * docePreco + qPetiscos * petiscoPreco + qBiscoitos * biscoitoPreco);
            float valorDiariaTotal = valorDiaria * qdias;
            float valorLocacao = valorDiariaTotal + frigobarValor;
            setCpfQuarto(null);
            setDataQuarto("Não alocado");
            setStatus("Desocupado");
            if (vip) {
                setVip(false);
                return valorLocacao - valorLocacao * 0.05f;
            } else {
                return valorLocacao;
            }

        } else {
            return 0;
        }
        
    }

    public void pedirContasCliente(int qdias, int qBebidas, int qDoces, int qPetiscos, int qBiscoitos) {
        System.out.println(pedirContas(qdias, qBebidas, qDoces, qPetiscos, qBiscoitos));
    }

    public float valorDiaria() {

        return 0;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    


}
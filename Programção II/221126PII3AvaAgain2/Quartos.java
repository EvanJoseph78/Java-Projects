import javax.xml.crypto.Data;

public class Quartos {
    private int numQuarto;
    private String tipoQuarto;
    private String status;
    private String dataQuarto = "Não alocado";
    private String cpfVinculado = null;
    private Data data;
    


    private float valorDiaria;


    //construtor
    public Quartos(int numQuarto, String tipoQuarto) {
        this.numQuarto = numQuarto;
        this.tipoQuarto = tipoQuarto;
        if (tipoQuarto == "solteiro") {
            this.valorDiaria = 100;
        } else if (tipoQuarto == "duplo") {
            this.valorDiaria = 150;
        } else if (tipoQuarto== "triplo"){
            this.valorDiaria = 200;
        } else {
            System.out.println("Este quarto não está disponível");
        }
        this.status = "Desocupado";
    }


    public float getValorDiaria() {
        return valorDiaria;
    }


    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    


    public int getNumQuarto() {
        return numQuarto;
    }


    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }


    public String getTipoQuarto() {
        return tipoQuarto;
    }


    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }


    public String getDataQuarto() {
        return dataQuarto;
    }


    public void setDataQuarto(String dataQuarto) {
        this.dataQuarto = dataQuarto;
    }

    public String getCpfVinculado() {
        return cpfVinculado;
    }


    public void setCpfVinculado(String cpfVinculado) {
        this.cpfVinculado = cpfVinculado;
    }

    public Data getData() {
        return data;
    }


    public void setData(Data data) {
        this.data = data;
    }


    

    

   


    //funções 

    

    
    
}
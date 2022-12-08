public class Cliente {
    private int cpf;
    private int qDias;
    private Quarto tipoQuarto;


    public Cliente(int cpf, int qDias, Quarto quarto) {
        this.cpf = cpf;
        this.qDias = qDias;
        this.tipoQuarto = quarto;
        if (quarto.getStatus()) {
            System.out.println("Quarto ocupado");
        } else {
            System.out.println("Quarto adquirido");
        }
        
        
        
    }


    public int getCpf() {
        return cpf;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    public int getqDias() {
        return qDias;
    }


    public void setqDias(int qDias) {
        this.qDias = qDias;
    }


    public Quarto getTipoQuarto() {
        return tipoQuarto;
    }


    public void setTipoQuarto(Quarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }



    

    
}
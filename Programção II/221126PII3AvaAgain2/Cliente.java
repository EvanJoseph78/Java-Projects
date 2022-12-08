public class Cliente {

    private String cpf;

    public Cliente() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(validaCpf(cpf)) {
            this.cpf = cpf;
        }else {
            System.out.println("CPF Inválido!");
        }
    }
   
    // Valida o cpf do cliente
    public Boolean validaCpf(String cpf) {
        if ((cpf.indexOf(".", 3) == 3) && (cpf.indexOf(".", 7) == 7) && (cpf.indexOf("-", 11) == 11)) {
            return true;
        } else {
            return false;
        }

    } 
    
}

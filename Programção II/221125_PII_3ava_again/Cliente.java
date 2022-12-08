public class Cliente {
    private String cpf;
    private String data;
    private Quarto clienteQuarto;
    private ListaDeQuartos l;

    public Cliente(String cpf, String data, ListaDeQuartos l) {
        if (validaCpf(cpf)) {
            this.cpf = cpf;
            this.data = data;
        } else {
            System.out.println("CPF Inválido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void pedirQuarto(Quarto q) {
        if (validaCpf(cpf)) {
            if(q.getStatus() == "Desocupado") {
                q.setStatus("Ocupado");
                q.setCpfQuarto(cpf);
                q.setDataQuarto(data);  
                clienteQuarto = q;
            } else {
                System.out.println("O quarto já está ocupado!");
            }
        }else {
            System.out.println("CPF inválido");
        }
        
    }

    // public void pedirQuartos(int num) {
        
    //     if (validaCpf(cpf)) {
    //         if(q.getStatus() == "Desocupado") {
    //             q.setStatus("Ocupado");
    //             q.setCpfQuarto(cpf);
    //             q.setDataQuarto(data);  
    //             clienteQuarto = q;
    //         } else {
    //             System.out.println("O quarto já está ocupado!");
    //         }
    //     }else {
    //         System.out.println("CPF inválido");
    //     }
        
    // }




    public void pedirContas(int qdias, int qBebidas, int qDoces, int qPetiscos, int qBiscoitos) {
        System.out.print("Valor gasto: R$");
        System.out.println(clienteQuarto.pedirContas(qdias, qBebidas, qDoces, qPetiscos, qBiscoitos));
    }

    public void pedirQuartoVip(Quarto q) {
        pedirQuarto(q);
        q.setVip(true);
    }

    public Boolean validaCpf(String cpf) {
        if ((cpf.indexOf(".", 3) == 3) && (cpf.indexOf(".", 7) == 7) && (cpf.indexOf("-", 11) == 11)) {
            return true;
        } else {
            return false;
        }

    }

    public void cpfValido(String cpf) {
        if(validaCpf(cpf)) {
            System.out.println("CPF válido");
        }else {
            System.out.println("CPF inválido");
        }
    }

    public void cpfEstaCadastrado(Quarto[] q, String cpf) {
        
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i].getCpfQuarto() + " ---------- " + cpf);
            if(q[i].getCpfQuarto() == cpf) {
                System.out.println("O cliente está cadastrado no quarto: " + q[i].getNumQuarto());
                q[i].infomacoesQuarto();
            }
        }
        if (q[q.length - 1].getCpfQuarto() != cpf) {
            System.out.println("O cliente não está cadastrado");

        }
    }

    public void mostrarQuartos(ListaDeQuartos l) {
        this.l = l;
        l.mostrarQuartos();
    }

   


    
}

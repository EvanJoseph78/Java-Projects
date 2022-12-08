public class Hotel {
    private Quartos[] quarto = new Quartos[5];

    public Hotel() {
        listaQuartos();
    }

    public Quartos[] listaQuartos() {
        quarto[0] = new Quartos(101,"solteiro");
        quarto[1] = new Quartos(102,"duplo");
        quarto[2] = new Quartos(103,"triplo");
        quarto[3] = new Quartos(104,"solteiro");
        quarto[4] = new Quartos(105,"duplo");
        return quarto;
    }

    public void mostrarQuartos() {
        System.out.println("=================================================");
        for (int i = 0; i < quarto.length; i++) {
            System.out.println("Quarto " + quarto[i].getNumQuarto() + " " + quarto[i].getStatus());
        }
        System.out.println("=================================================");
    }

    public void infomacoesQuarto(int num) {
        Boolean quartoIndisponivel = true;
        for (int i = 0; i < quarto.length; i++) {
            if (quarto[i].getNumQuarto() == num) {
                System.out.println("=================================================");
                System.out.println("Quarto de " + quarto[i].getTipoQuarto() + "\nValor da diária R$: " + quarto[i].getValorDiaria() + "\nData de alocação: " + quarto[i].getDataQuarto() + "\nSituação: " + quarto[i].getStatus());
                System.out.println("=================================================");
                quartoIndisponivel = false;
            }
        }
        if (quartoIndisponivel) {
            System.out.println("O quarto de número " + num + " não está disponível neste hotel!");
        }
        
    }

    public void cadastrarCliente(Cliente c, int num) {
        for (int i = 0; i < quarto.length; i++) {
            if (quarto[i].getNumQuarto() == num) {
                if (quarto[i].getStatus() == "Desocupado"){
                    if (c.getCpf() == null || c.validaCpf(c.getCpf()) == false) {
                        System.out.println("CPF inválido ou não cadastrado!");
                    }else {
                        quarto[i].setStatus("Ocupado");
                        quarto[i].setCpfVinculado(c.getCpf());
                        quarto[i].setData();
                    }
                }else {
                    System.out.println("O quarto " + num + " já está ocupado!");
                }
            }
        }
    }

    
}

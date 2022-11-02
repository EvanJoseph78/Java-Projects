import javax.swing.JOptionPane;

public class Lista {
    private int tamanhoLista = 0;
    private int numeroMaximoElementosLista = 0;
    private int [] elementosLista = new int[numeroMaximoElementosLista]; 
    
    public Lista(int numeroMaximoElementosLista) {
        this.numeroMaximoElementosLista = numeroMaximoElementosLista;
        this.elementosLista = new int[numeroMaximoElementosLista];
    }
    
    public void setarElemento(int elemento, int posicao) {
        this.elementosLista[posicao] = elemento;
        this.tamanhoLista++;
    }

    public int[] getElementosLista() {
        return this.elementosLista;
    }
    

    public void mostrarVetor() {
        System.out.println("Vetor: ");
        for (int i = 0; i < this.elementosLista.length; i++) {
            System.out.print(this.elementosLista[i] + " ");
        }
        System.out.println();
    }
    // questão 01
    public void inserir(int posicao, int elemento) {
        posicao = posicao - 1; 
        if (this.tamanhoLista == this.elementosLista.length) {
            System.out.println("Espaço esgotado! Não pode inserir!");
        } else if (posicao == this.tamanhoLista) {
            this.elementosLista[posicao] = elemento;
            this.tamanhoLista++;
        } else if (posicao < 0 || posicao > this.tamanhoLista) {
            System.out.println("Impossivel inserir em um indice inválido!");
        } else {
            for (int i = this.tamanhoLista; i > posicao; i--) {
                this.elementosLista[i] = this.elementosLista[i - 1];
            }
            this.elementosLista[posicao] = elemento; 
            this.tamanhoLista++;
        }
    }

    
    // questao 02
    public void alterar(int posicao, int elemento) {
        posicao = posicao - 1;
        if(posicao < 0 || posicao > this.tamanhoLista) {
            System.out.println("Não se pode alterar um indice invalido!");
        } else {
            this.elementosLista[posicao] = elemento;
        }
    }
    // questao 03
    public void remover(int posicao) {
    posicao = posicao - 1;
        if (this.tamanhoLista != 0){
            if(posicao < 0 || posicao > this.tamanhoLista) {
                System.out.println("Impossivel remover um indice inválido!");
            } else {
                for (int i = posicao; i < this.tamanhoLista - 1; i++) {
                    this.elementosLista[i] = this.elementosLista[i + 1];
                }
                this.elementosLista[this.tamanhoLista - 1] = 0;
                this.tamanhoLista--;
            }
        } else {
            System.out.println("Lista vazia! Nenhum elemento pode ser removido!");
        }
    }
    // questao 04
    public void exibir() {
        if (this.tamanhoLista == 0) {
            System.out.println("Lista vazia, sem elementos");
        } else {
            System.out.print("Lista: {");
            for (int i = 0; i < this.tamanhoLista - 1; i++) {
                System.out.print(this.elementosLista[i] + ", ");
            }
            System.out.println(this.elementosLista[this.tamanhoLista - 1] + "}");
        }
    }
    // questao 05
    public void tamanhoDaLista() {
        System.out.println("A lista contém: " + this.tamanhoLista + " elementos");
    }

    // tamanho da lista
    public void tamanhoLista() {
        if (this.tamanhoLista == 0) {
            System.out.println("A lista ainda não possui nenhum elemento!");
        } else {
            System.out.println("O tamanho da lista é: " + this.tamanhoLista);
        }
    }

    public int tamanhoRetorno() {
        return this.tamanhoLista;
    }
    
    // questao 06
    public void pesquisar(int elemento) {
        int aux = -1;
        for (int i = 0; i < this.tamanhoLista; i++) {
            if(elemento == this.elementosLista[i]){
                aux = i; 
                System.out.println("O elemento " + elemento + " está na lista e está na posião: " + aux);
            } 
        }

        if(aux == -1) {
            System.out.println("O elemento " + elemento + " não está na lista");
        }
        
    }
    
    // questao 07
    public int acesso(int posicao) {
        posicao = posicao - 1;
        if (posicao < 0 || posicao > this.tamanhoLista) {
            return -9999;
        } else {
            return this.elementosLista[posicao];
        }
    }
    public void acessarValor(int posicao) {
        posicao = posicao - 1;
        if (posicao < 0 || posicao + 1 > this.tamanhoLista) {
            System.out.println("Acesso inválido. Numero fora da lista!");
        } else {
            System.out.println("O número da posicao " + (posicao + 1) + " é " + this.elementosLista[posicao]);
        }
    }
    
    // questao 08
    public void somaMedia() {
        if (this.tamanhoLista == 0) {
            System.out.println("Lista vazia, sem elementos");
        } else {
            int soma = 0;
            for (int i = 0; i < this.tamanhoLista; i++) {
                soma = soma + this.elementosLista[i];
            } 
            System.out.println("A soma dos elementos da lista é: " + soma);
            System.out.println("A média dos elementos da lista é: " + ((float) soma / this.tamanhoLista));
        }
    }

    
    




    //Interface para o usuário
    public void entradaUsuario() {
       
        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número")); 
        int posicao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a posição que quer inserir o elemento"));
        inserir(elemento, posicao);
        
    }
    public void removerElementoUsuario() {
       
        int posicao = Integer.parseInt(JOptionPane.showInputDialog("Entre com a posição que quer remover o elemento"));
        remover(posicao);
        
    }
    public int painel() {
        String[] options = new String[] {"Inserir elemento", "Remover elemento", "Posição do elemento", "Sair"};
        int response = JOptionPane.showOptionDialog(null, "O que você deseja fazer na lista", "Title",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);
        System.out.println(response);
        if (response == 0) {
            int aux = 0;
            String mensagem = "Deseja inserir outro elemento?";
            while (aux == 0) {
                entradaUsuario();
                aux = painelSimNao(mensagem);
            }
        } else if (response == 1) {
            int aux = 0;
            String mensagem = "Deseja remover outro elemento?";
            while (aux == 0) {
                removerElementoUsuario();
                exibir();
                tamanhoDaLista();
                aux = painelSimNao(mensagem);
            }
        }
        return response;
    }

    public void inciarPrograma() {
        int aux = -1;
        while (aux == -1) {
            aux = painel();
        }
    }

    public int painelSimNao(String mensagem) {
        String[] options = new String[] {"Sim", "Não"};
        int response = JOptionPane.showOptionDialog(null, mensagem, "Title",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);
        System.out.println(response);
        return response;
    }
}

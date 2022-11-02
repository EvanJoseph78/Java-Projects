public class Lista {
    private int tamanhoLista = 0;
    private int[] elemento = new int[4];
    public int getTamanhoLista() {
        return tamanhoLista;
    }
    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }
    public int[] getElemento() {
        return elemento;
    }
    public void setElemento(int[] elemento) {
        this.elemento = elemento;
    }
    public void definirElemento(int elemento, int posicao) {
        this.elemento[posicao] = elemento;
        setTamanhoLista(getTamanhoLista() + 1);
    }
   
    public void inserirElemento (int elemento, int posicao) {
        if(this.tamanhoLista == this.elemento.length) {
            System.out.println("A lista está cheia");
        } else if (posicao == this.tamanhoLista) {
            this.elemento[posicao] = elemento;
            setTamanhoLista(getTamanhoLista() + 1);
        } else if (posicao < 0 || posicao > this.tamanhoLista) {
            System.out.println("Não é possível inserir um elemento nessa posição");
        } else {
            for (int i = this.tamanhoLista - 1; i > posicao; i--) {
                this.elemento[i + 1] = this.elemento[i];
            }
            this.elemento[posicao] = elemento;
            setTamanhoLista(getTamanhoLista() + 1);
        }

    }

    // public void removerPosicao (int posicao) {
    //     if (posicao < 0 || posicao >= this.tamanhoLista) {
    //         System.out.println("Esta posição não existe na lista!");
    //     } else if (posicao == tamanhoLista - 1){
    //         this.elemento[posicao] = 0;
    //         setTamanhoLista(getTamanhoLista() - 1);
    //         System.out.println(tamanhoLista);
    //     }else {
    //         for (int i = posicao; i < tamanhoLista; i++) {
    //             System.out.println("==========");
    //             System.out.println(tamanhoLista);
    //             System.out.println(i);
    //             System.out.println(i + 1);
    //             this.elemento[i] = this.elemento[i + 1];
    //         }
    //         setTamanhoLista(getTamanhoLista() - 1);
    //     }
    // }
    
    // public void estaNalista(int elemento) {
    //     // int aux = 
    // }
}

public class Metodos {
    public No inicioLista;

    public void InserirPri(String peca, int qtd) {
        if (inicioLista == null) {
            inicioLista = new No();

            if (inicioLista != null) {
                inicioLista.qtd = qtd;
                inicioLista.peca = peca;
                inicioLista.proximo = null;
            }
        }
    }

    public void InserirInicio(String peca, int qtd) {
        No NovoNo = new No();

        NovoNo.peca = peca;
        NovoNo.qtd = qtd;
        NovoNo.proximo = inicioLista;
        inicioLista = NovoNo;
    }

    public void ImprimirLista() {

        if (inicioLista == null) {
            System.out.print("Lista vazia, não pode imprimir!");
        } else {
            No atual = inicioLista;
            System.out.println("Imprimindo a lista...");

            while (atual != null) {
                System.out.print("["+atual.peca + ": " + atual.qtd+"]");
                atual = atual.proximo;
            }
        }
        System.out.println("");
    }

    public void VerificarEstoque(){
        No atual = inicioLista;
        if(atual == null){
            System.out.println("Impossível verificar estoque. Lista fazia!");
        }else{
            while(atual != null){
                if(atual.qtd < 5){
                    System.out.println(atual.peca + " -> Abaixo do estoque!(COMPRAR MAIS)");
                }else{
                    System.out.println(atual.peca + " -> OK!");
                }
                atual = atual.proximo;
            }

        }
    }

    public void qtd_media(){
        No atual = inicioLista;
        float soma = 0;
        float cont = 0;
        float media = 0;
        if(atual == null){
            System.out.println("Impossível ver qtd e media. Lista vazia!");
        }else{
            while(atual != null){
                soma += atual.qtd;
                cont++;
                atual = atual.proximo;
            }
        media = soma/cont;
        System.out.format("total de peças: %.0f, media: %.2f\n", soma, media);

        }
    }

    public void maisMenos(){
        No atual = inicioLista;
        int menor = atual.qtd;
        int maior = atual.qtd;
        String Pmaior = "";
        String Pmenor = "";

        while(atual != null){
            if(atual.qtd < menor){
                menor = atual.qtd;
                    Pmenor = atual.peca;
            }
            if(atual.qtd > maior){
                maior = atual.qtd;                    
                Pmaior = atual.peca;
            }
            atual = atual.proximo;
        }
        System.out.format("A peça com a maior quantidade é: %s, tendo %d unidades\n", Pmaior, maior);
        System.out.format("A peça com a menor quantidade é: %s, tendo %d unidades\n", Pmenor, menor);
    }
}

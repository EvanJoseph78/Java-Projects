public class Lista {

    No inicio;


    //leitura e infomações dos produtos

    public void peca(String peca) {
        if (inicio == null) {
            System.out.println("Nenhum elemento na lista");
        } else {
            No atual = inicio;
            while(atual != null) {
                if (atual.peca == peca) {
                    System.out.println(atual.peca + " possui " + atual.qtPecas + " peças");
                    break;
                }
                atual = atual.proximo;
            }
            if (atual == null) {
                System.out.println(peca + " não está no estoque!");
            }
        }

    }

    // modulo para impressão das informações. 

    public void ImprimirLista() {

        if (inicio == null) {
            System.out.println("Lista vazia, não pode imprimir!");
        } else {
            No atual = inicio;
            System.out.println("Imprimindo a lista...");

            while (atual != null) {
                System.out.println(atual.peca + ", " + atual.qtPecas + " peças.");
                atual = atual.proximo;
            }
        }
        System.out.println("");
    }


    public int Tamanho() {
        No atual = inicio;
        int tam = 0;
        //System.out.print("Tamanho da lista: ");
        if (atual == null) {
            return 0;
        } else {
            while (atual != null) {
                tam = tam + 1;
                atual = atual.proximo;
            }
            return tam;
        }
    }
    
    public void InsereInicio(String peca, int qtPecas) {
        if (Tamanho() == 0) {
            inicio = new No(peca, qtPecas);
        } else {
            No NovoNo = new No(peca, qtPecas);
            NovoNo.proximo = inicio;
            inicio = NovoNo;
        }
    }

    public void InsereFim(String peca, int qtPecas) {
        No novoNo = new No(peca, qtPecas);
        novoNo.proximo = null;
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    

    // Descrever um módulo que forneça a situação de cada peça no estoque (se o
    // Gerente precisa pedir mais peças). Assim, se a quantidade for menor que 5, a
    // SITUAÇÃO é: COMPRA, caso contrario a situação será: OK. Ex: Peça x, COMPRA.
    // Peça y, OK...

    public void comprarPecas(int qtPecasComprar) {
        No atual = inicio;
        if (inicio == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("===========================================================================");
            System.out.println("Lista de peças faltando: ");
            while (atual != null) {
                if (atual.qtPecas < qtPecasComprar) {
                    System.out.println(atual.peca + ", comprar " + (qtPecasComprar - atual.qtPecas) + " peças");
                } else {
                    System.out.println(atual.peca + " OK.");
                }
                atual = atual.proximo;
            }
            System.out.println("===========================================================================");

        }
        
    }

    //Descrever um módulo que forneça a quantidade de todas as peças juntas e a média das peças.

    public void qtPecasTotal() {
        if (inicio == null) {
            System.out.println("Lista vazia");
        } else {
            No atual = inicio;
            int qtPecasTotal = 0;
            while (atual != null) {
                qtPecasTotal = qtPecasTotal + atual.qtPecas;
                atual = atual.proximo;
            }
            System.out.println("A quantidade total de peças é de: " + qtPecasTotal);
            System.out.println("A media da quantidade de peças é de : " + (float)(qtPecasTotal/(float)Tamanho()));
        }
    }

    //Descrever um módulo que forneça a quantidade de peça mais baixa entre todas as peças e a peça com mais quantidade (peça e quantidade - qt).

    public void menorQntPecas() {
        if (inicio == null) {
            System.out.println("Lista vazia");
        } else {
            No atual = inicio;
            int menorNum = atual.qtPecas;
            int maiorNum = atual.qtPecas;
            String menorP = atual.peca;
            String maiorP = atual.peca;

            while (atual != null) {
                if (atual.qtPecas < menorNum) {
                    menorNum = atual.qtPecas;
                    menorP = atual.peca;
                }

                if (atual.qtPecas > maiorNum) {
                    maiorNum = atual.qtPecas;
                    maiorP = atual.peca;
                }
                atual = atual.proximo;
            }
            
            System.out.println("===========================================================================");
            System.out.println(menorP + " possui a menor quantidade de peças, possui apenas " + menorNum + " peças");
            System.out.println(maiorP + " possui a menor quantidade de peças, possui apenas " + maiorNum + " peças");
            System.out.println("===========================================================================");
        }
    }


    //main
    public static void main(String[] args) {
        Lista l = new Lista();
        l.InsereInicio("Maçaneta", 2);
        l.InsereInicio("Prego", 12);
        l.InsereFim("Tomada", 1);
        l.InsereFim("Martelo", 2);
        l.InsereFim("Rebimboca", 10);
        l.ImprimirLista();
        l.comprarPecas(10);
        l.qtPecasTotal();
        l.menorQntPecas();
        l.peca("Maçaneta");
        l.peca("Ripa");
    
    }
}


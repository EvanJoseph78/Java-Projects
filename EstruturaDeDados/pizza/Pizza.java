public class Pizza {
    
    No inicio;
    int tamanho = 0;


    public void imprimirLista() {
        if (inicio == null) {
            System.out.println("Lista vazia");
        } else {
            No atual = inicio;
            System.out.println("Imprimindo elementos da lista...");
            System.out.println("================================================");

            while (atual != null) {
                System.out.println("Pizza: " + atual.nome + " - Quantidade: " + atual.qntPizza);
                atual = atual.proximo;
            }


            System.out.println("================================================");


        }
    }

    public void insereFim(String nome, int qntPizza) {
        No novoNo = new No(nome, qntPizza);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;

            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = novoNo;
        }
        tamanho++;
    }

    public void info(String nome) {
        No atual = inicio;
        while (atual != null) {
            if (atual.nome == nome) {
                System.out.println("A quantidade de pizza de " + atual.nome + " é de: " + atual.qntPizza);
                break;
            }
            atual = atual.proximo;
        }
        if (atual == null) {
            System.out.println("A pizza " + nome + " não está na lista");
        }
    }

    public void melhorarPizza(int qntPizzaMelhorar) {
        if (inicio == null) {
            System.out.println("Lista vazia!");
        } else {
            No atual = inicio;

            System.out.println("================================================");
            while (atual != null) {
                if(atual.qntPizza < qntPizzaMelhorar) {
                    System.out.println("Melhorar pizza " + atual.nome);
                } else {
                    System.out.println("Pizza " + atual.nome + " OK");
                }
                atual = atual.proximo;
            }
            System.out.println("================================================");
        }
    }

    public void qntPizzasVendidas() {
        if (inicio == null) {
            System.out.println("Lista vazia");
        } else {
            No atual = inicio;
            int qntPizzasVendidas = 0;
            while (atual != null) {
                qntPizzasVendidas = qntPizzasVendidas + atual.qntPizza;
                atual = atual.proximo;
            }
            System.out.println("A quantidade de pizzas vendidas é de: " + qntPizzasVendidas);
            System.out.println("A média de pizzas vendidas foi de: " + ((float) qntPizzasVendidas) / (float) this.tamanho);
        }
    }

    public void maisEmenosVen() {
        if (inicio == null) {
            System.out.println("Nenhuma pizza vendida");
        } else {
            No atual = inicio;
            int menorQnt = atual.qntPizza;
            int maiorQnt = atual.qntPizza;
            String pizzaMaisVendida = atual.nome;
            String pizzaMenosVendida = atual.nome;
            while (atual != null) {
                if (atual.qntPizza < menorQnt) {
                    menorQnt = atual.qntPizza;
                    pizzaMenosVendida = atual.nome;
                }

                if (atual.qntPizza > maiorQnt) {
                    maiorQnt = atual.qntPizza;
                    pizzaMaisVendida = atual.nome;
                }

                atual = atual.proximo;

            }

            System.out.println("A pizza mais vendida foi a de: " + pizzaMaisVendida + " - vendeu " + maiorQnt);
            System.out.println("A pizza menos vendida foi a de: " + pizzaMenosVendida + " - vendeu " + menorQnt);
        }

    }

    public static void main(String[] args) {
        Pizza p = new Pizza();
        p.insereFim("Calabresa", 3);
        p.insereFim("Parense", 5);
        p.insereFim("Napolitana", 7);
        p.imprimirLista();
        p.info("Palmito");
        p.melhorarPizza(4);
        p.qntPizzasVendidas();
        p.maisEmenosVen();
    }
}

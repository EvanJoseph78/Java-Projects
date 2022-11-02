public class Lista {

    private No inicio; //nó indicador da lista

    public void ImprimirLista() {

        if (inicio == null) {
            System.out.println("Lista vazia, não pode imprimir!");
        } else {
            No atual = inicio;
            System.out.println("Imprimindo a lista...");

            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.proximo;
            }
        }
        System.out.println("");
    }

    // inserindo primeiro NO
    public void InseriPri(int val) {
        if (inicio == null) {
            inicio = new No();

            if (inicio != null) {
                inicio.valor = val;
                inicio.proximo = null;
            }
        }
    }

    public void InsereInicio(int val) {
        No NovoNo = new No();
        NovoNo.valor = val;
        NovoNo.proximo = inicio;
        inicio = NovoNo;
    }

    public void RemoverInicio() {
        if (inicio == null) {
            System.out.println("A lista está vazia, não pode remover do inicio!");
        } else {
            inicio = inicio.proximo;
        }
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

    public void RemoverFim() {
        No atual = inicio;

        if (inicio == null) {
            System.out.println("Lista vazia, não se pode remover o ultimo nó!");
        } else if (atual.proximo == null) {
            inicio = null;
        } else {
            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = null;
        }
    }

    public void InsereFim(int val) {
        No novoNo = new No();
        novoNo.valor = val;
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

    public void BuscaPosicao(int k) {

        if (inicio == null) {
            System.out.println("A lista está vazia, busca não executada!");

        } else if (k == 1) {
            System.out.println("A posicao buscada (1) possui conteudo : " + inicio.valor);

        } else if ((k <= Tamanho()) && (k > 1)) {
            No atual = inicio.proximo;
            int contador = 2;
            while (contador != k) {
                atual = atual.proximo;
                contador++;
            }
            System.out.println("A posicao buscada possui conteudo : " + atual.valor);

        } else {
            System.out.println("Não se pode buscar item fora da lista!");
        }
        
        
    }

    // Funcionalidades extras

    public void somarElemLista() {
        if (Tamanho() == 0) {
            System.out.println("Lista vazia, impossível somar os elementos");  
        } else {
            No atual = inicio;
            int soma = 0;
            while (atual != null) {
                soma = soma + atual.valor;
                atual = atual.proximo;
            }
            System.out.println("A soma dos elementos da lista é: " + soma);
        }
    }

    public void somarImpares() {
            
        if (Tamanho() == 0) {
            System.out.println("Lista vazia, impossível somar os elementos");  
        } else {
            No atual = inicio;
            int soma = 0;
            while (atual != null) {
                if (atual.valor % 2 == 1) {
                    soma = soma + atual.valor;
                }
                atual = atual.proximo;
            }
            System.out.println("A soma dos elementos ímpares da lista é: " + soma);
        }
    }

    public void somarImpares(int num) {
            
        if (Tamanho() == 0) {
            System.out.println("Lista vazia, impossível somar os elementos");  
        } else {
            No atual = inicio;
            int soma = 0;
            while (atual != null) {
                if (atual.valor % 2 == 1 && atual.valor > num) {
                    soma = soma + atual.valor;
                }
                atual = atual.proximo;
            }
            System.out.println("A soma dos elementos ímpares da lista maiores que " + num + " é " + soma);
        }
    }
    

    public void somarPares() {
            
        if (Tamanho() == 0) {
            System.out.println("Lista vazia, impossível somar os elementos");  
        } else {
            No atual = inicio;
            int soma = 0;
            while (atual != null) {
                if (atual.valor % 2 == 0) {
                    soma = soma + atual.valor;
                }
                atual = atual.proximo;
            }
            System.out.println("A soma dos elementos pares da lista é: " + soma);
        }
    }

    public void somarPares(int num) {
            
        if (Tamanho() == 0) {
            System.out.println("Lista vazia, impossível somar os elementos");  
        } else {
            No atual = inicio;
            int soma = 0;
            while (atual != null) {
                if (atual.valor % 2 == 0 && atual.valor > num) {
                    soma = soma + atual.valor;
                }
                atual = atual.proximo;
            }
            System.out.println("A soma dos elementos pares da lista maiores que " + num + " é " + soma);
        }
    }

    public void seRepete(int valor) {
        if (Tamanho() == 0) {
            System.out.println("Lista vazia! Nenhum elemento!");
        } else {
            No atual = inicio;
            int qElem = 0;

            while (atual != null) {
                if (atual.valor == valor) {
                    qElem++;
                }
                atual = atual.proximo;
            }

            System.out.println("O elemento " + valor + " se repete " + qElem + " vezes");
        }
    }

    public boolean estaNaLista (int elemento) {
        if (Tamanho() == 0) {
            return false;
        } else {
            No atual = inicio;
            boolean aux = false;

            while (atual != null) {
                if (atual.valor == elemento) {
                    aux = true;
                }
                atual = atual.proximo;
            }
            
            return aux;
        }
    }

    public void insereDepoisDe(int elemento, int valor) {
        No novoValor = new No();
        novoValor.valor = valor;
        if (estaNaLista(elemento)) {
            No atual = inicio;
            while (atual != null) {
                if (atual.valor == elemento) {
                    novoValor.proximo = atual.proximo;
                    atual.proximo = novoValor;
                    break;
                }
                atual = atual.proximo;
            }
        } else {
            System.out.println("Este elemento não está na lista");
        }
    }

    public void posicao() {}

    public void limparLista() {
        inicio = null;
    }

    public static void main(String args[]) {

        Lista L = new Lista();
        L.inicio = null;
        L.InsereInicio(1);
        L.InsereFim(2);
        L.InsereFim(3);
        L.InsereFim(4);
        L.InsereFim(5);  
        L.insereDepoisDe(3, 777);
        L.ImprimirLista();
        L.seRepete(0);
        L.limparLista();
        L.ImprimirLista();
        System.out.println();
    }

}
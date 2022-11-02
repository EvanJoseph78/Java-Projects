public class Lista {
    public No primeiro = null;
    public No ultimo = null;
    public int tamanho = 0;

    public void insereElemento(int valor) {
        No novoElemento = new No();
        novoElemento.valor = valor;


        if (primeiro == null) {
            primeiro = novoElemento;
            ultimo = novoElemento;
        } else {
            ultimo.proximo = novoElemento;
            ultimo = novoElemento;
        }

        tamanho++;
    }

    public void insereElemento(int valor, int posicao) {
        No novoElemento = new No();
        novoElemento.valor = valor;

        if (tamanho == 0) {
            System.out.println("A lista está vazia!!!");
        } else if (posicao == tamanho + 1) {
            ultimo.proximo = novoElemento;
        } else if (posicao == 1) {
            novoElemento.proximo = primeiro;
            primeiro = novoElemento;
        } else {
            No atual = new No();
            atual = primeiro;
            for (int index = 1; index < posicao - 1; index++) {
                atual = atual.proximo;
            }
            novoElemento.proximo = atual.proximo.proximo;
            atual.proximo = novoElemento;

        }
        tamanho++;
    }
    
    public void mostrarLista() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia!!!");
        } else {
            No atual = new No();
            atual = primeiro;
            while (atual != null) {
                System.out.println(atual.valor);
                atual = atual.proximo;
            }
        }
    }

    public void buscaPosicao(int posicao) {
        if (tamanho == 0) {
            System.out.println("A lista está vazia!!!");
        } else {
            No atual = new No();
            atual = primeiro;
            for (int i = 1; i < posicao; i++) {
                atual = atual.proximo;
            }            
            System.out.println("Na posição " + posicao + " está o elemento " + atual.valor);
        }

    }
}
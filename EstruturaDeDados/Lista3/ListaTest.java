
public class ListaTest {
    public static void main(String[] args) {
        Lista L = new Lista();
        L.N = 0;

        insereElemento(L, 10, 0);
        insereElemento(L, 20, 0);
        insereElemento(L, 30, 1);
        insereElemento(L, 30, 3);
        insereElemento(L, 199, 4);
        insereElemento(L, 1000, 2);
        insereElemento(L, 230, 3);
        removeElemento(L, 230);
        insereElemento(L, 12, 1);
        removeElemento(L, 10);
        removeElemento(L, 3);
        verificaSeEstaNaLista(L, 10);
        verificaSeEstaNaLista(L, 1000);
        insereElemento(L, 29, 3);
        insereElemento(L, 29, 3);
        insereElemento(L, 29, 3);
        // insereElemento(L, 29, 3);
        // insereElemento(L, 29, 3);
        tamanhoDaLista(L);

        mostraVetor(L);
        exibirPosicao(L, 0); 
    }


    public static void acessarElemento(Lista L, int posicaoElemento) {
        // índice inválido 
        if (posicaoElemento < 0 || posicaoElemento > (L.N - 1)) {
            System.out.println("Não existe elemento nesta posião");
        }else {
            System.out.println("Na posição " + posicaoElemento + " Está o número: " + L.Elem[posicaoElemento]);
        }
    }

    public static void insereElemento(Lista L, int elemento, int posicaoElemento) {
        int i;
        if (posicaoElemento > L.Elem.length) {
            System.out.println("A lista já está cheia!");
        } else if (posicaoElemento == L.N) {
            L.Elem[posicaoElemento] = elemento;
            L.N++;
            // System.out.println("-----------====" + L.N);
        } else if (posicaoElemento < 0 || posicaoElemento > (L.N - 1)) {
            System.out.println("Posição inálida!");
        } else {
            // System.out.println("-->" + L.N);
            // System.out.println("-->" + posicaoElemento);
            for (i = L.N; i > posicaoElemento; i--) {
                L.Elem[i] = L.Elem[i - 1];
                // System.out.println("---------------------" + posicaoElemento);
            }
            L.Elem[i] = elemento;
            L.N++;
        }
    }

    public static void removeElemento (Lista L, int elemento) {
        int posicaoElemento = estaNaLista(L, elemento);
        if (posicaoElemento >= 0) {
            for (int i = posicaoElemento; i < L.N; i++) {
                L.Elem[i] = L.Elem[i + 1]; 
            }
            L.N--;
        } else {
            System.out.println("O elemento " + elemento + " Não está na lista e não pode ser removido");
        }
    }
    
    public static int estaNaLista(Lista L, int elemento) {
        int aux = -1;
        for (int i = 0; i < L.Elem.length; i++) {
            if (L.Elem[i] == elemento) {
                aux = i;
            } 
        } 
        
        return aux;
    }

    public static void verificaSeEstaNaLista(Lista L, int elemento) {
        int aux = estaNaLista(L, elemento);
        if (aux != -1) {
            System.out.println("O elemento " + elemento + " está na lista e está na posicão: " + (aux + 1));
        } else {
            System.out.println("O elemento " + elemento + " não está na lista");
        }
    }

    public static void mostraVetor(Lista L) {
        System.out.print("[");
        for (int i = 0; i < L.Elem.length - 1; i++) {
            System.out.print(L.Elem[i] + ", ");
        }
        System.out.println(L.Elem[L.Elem.length - 1] + "]");
    }

    public static void tamanhoDaLista(Lista L) {
        System.out.println("O tamanho da lista é: " + L.N);
    }

    public static void exibirPosicao(Lista L, int posicao) {
        System.out.println("A posição " + posicao + " Contem o elemento " + L.Elem[posicao]); 
    }
    
}

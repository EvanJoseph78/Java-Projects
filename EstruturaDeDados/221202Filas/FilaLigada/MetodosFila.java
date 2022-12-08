public class MetodosFila {

    public static void insere(Fila f, int valor) {
        if (f.primeiro == -1) {
            f.primeiro = 0;
            f.elem[f.primeiro] = valor;
            f.elem[f.ultimo] = valor;
        } else {
            f.elem[f.ultimo] = valor;
        }
        f.ultimo++;
    } 

    public static void remover(Fila f) {
        if (f.primeiro == -1) {
            System.out.println("Fila vazia!");
        }
        for (int i = 0; i <= f.ultimo; i++) {
            f.elem[i] = f.elem[i + 1];
        }
        f.ultimo--;
    }

    public static void mostrarFila(Fila f) {
        for (int i = 0; i < f.ultimo; i++) {
            System.out.println(f.elem[i]);
        }
    }

    public static void main(String[] args) {
        Fila f1 = new Fila(10);
        insere(f1, 10);
        insere(f1, 11);
        insere(f1, 123);
        mostrarFila(f1);

    }
}

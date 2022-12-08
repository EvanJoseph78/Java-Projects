public class Fila {
    int primeiro;
    int ultimo;
    int elem[] = new int[10];

    public Fila(int tamMaximo) {
        this.elem = new int[tamMaximo];
        this.ultimo = 0;
        this.primeiro = -1;
    }

    
}
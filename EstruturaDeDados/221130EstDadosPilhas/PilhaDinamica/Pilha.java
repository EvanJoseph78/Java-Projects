package PilhaDinamica;
public class Pilha {
    No inicio;

    public void push(int V) {
       No q  = new No();
       q.valor = V;
       q.proximo = inicio; 
       inicio = q;
    }

    //remover
    public void pop() {
        inicio = inicio.proximo;   
    }

    public void tamanho() {

    }


    public void mostrarPilha() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }a

    public static void main(String[] args) {
        Pilha p1 = new Pilha();
        p1.push(7);
        p1.push(8);
        p1.push(10);
        p1.push(111);
        // p1.mostrarPilha();
        p1.pop();
        p1.push(110);
        p1.mostrarPilha();
    }



}

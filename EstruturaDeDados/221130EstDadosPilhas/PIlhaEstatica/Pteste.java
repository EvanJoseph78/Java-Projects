public class Pteste {
    public static int tamanho = 5;


    public static void iniciarPilha(Pilha p) {
        p.topo = -1;
    }

    public static Boolean vazia(Pilha p) {
        if (p.topo == -1) {
            return true;
        }else{
            return false;
        }
    }

    public static Boolean overflow(Pilha p) {
        if (p.topo == tamanho -1) {
            return true;
        }else{
            return false;
        }
    }

    public static void push(Pilha p, int valor) {
        if(p.topo == tamanho - 1){
            System.out.println("Pilha cheia");
        }else{
            p.topo++;
            p.elem[p.topo] = valor;
        }
    }

    public static void mostrarPilha(Pilha p) {
        for (int i = p.topo; i >= 0; i--) {
            System.out.println(p.elem[i]);
        }
    }

    public static void pop(Pilha p) {
        if(p.topo == -1) {
            System.out.println("Pilha vazia!");
        }else {
            p.topo--;
        }
    }

    public static int elemento(Pilha p) {
        return p.elem[p.topo];
    }

    public static void lerPilha(Pilha p){
        System.out.println("O último elemento da pilha é: " + p.elem[p.topo]);
    }

    public static void main(String[] args) {
        Pilha P1 = new Pilha();

        System.out.println("Iniciando a Pilha");
        iniciarPilha(P1);
        System.out.println("Inserindo itens na pilha...");
        push(P1, 1);
        push(P1, 2);
        push(P1, 3);
        push(P1, 4);
        push(P1, 5);
        if (overflow(P1)) {
            System.out.println("Pilha cheia, não se pode inserir mais itens");
        } else {
            push(P1, 6);
        }
        System.out.println("Acessa o topo da pilha");
        System.out.println(elemento(P1));
        System.out.println(elemento(P1));
        System.out.println("Desempilhando a Pilha");
        pop(P1);
        System.out.println(elemento(P1));
        System.out.println("Desempilhando a Pilha novamente");
        pop(P1);
        System.out.println(elemento(P1));
        pop(P1);
        pop(P1);
        pop(P1);
        if (vazia(P1)) {
            System.out.println("Pilha vazia, não se pode retirar itens");
        } else {
            pop(P1);
        }
    }   
    
}

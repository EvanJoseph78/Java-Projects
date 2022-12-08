public class Fila {
    public noFila pri;
    public noFila ult;


    // inserir elementos na fila

    public void inserir(int V) {
        noFila q = new noFila();
        q.conteudo = V;
        q.prox = null;
        if (pri == null) {
            // fila vazia
            System.out.println("Teste " + pri.conteudo);
            this.pri = q;
            this.ult = q;
        } else {
            ult.prox = q;
            ult = q;
        }

    }

    public void remover() {
        if (pri == null) {
            //fila vazia
            System.out.println("Fila vazia! ImpossÃ­vel remover elemento");
        }else {
            pri = pri.prox;
            if (pri == null) {
                ult = null;
            }
        }
    }

    public void elemento() {
        if (pri == null) {
            System.out.println("Metodo Elemento - Fila vazia...");
        }else {
            System.out.println(pri.conteudo);
        }
    }

    public void mostrarFila() {

    }


    public static void main(String[] args) {
        Fila f = new Fila();
        f.pri = null;
        f.ult = null;
        f.elemento();
        f.inserir(10);
        f.inserir(20);
    }
}
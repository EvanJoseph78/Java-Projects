
public class ListaEncadeada{
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanhoLista;

    public ListaEncadeada() {
        this.tamanhoLista = 0;
    }


    public Elemento getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }
    public Elemento getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }


    public void add(int novoValor) {
        Elemento novoElemento = new Elemento(novoValor);
        

        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            novoElemento.setAnterior(this.ultimo);
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanhoLista++;
    }

    public Elemento get(int posicao) {
        Elemento atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }

        return atual;
    }


    public int getTamanhoLista() {
        return tamanhoLista;
    }


    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }
    
}

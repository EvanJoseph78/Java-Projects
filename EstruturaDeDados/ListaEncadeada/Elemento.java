public class Elemento {
    private int valor;
    private Elemento proximo;
    private Elemento anterior;
    
    public Elemento getAnterior() {
        return anterior;
    }

    public void setAnterior(Elemento anterior) {
        this.anterior = anterior;
    }

    public Elemento (int novoElemento) {
        this.valor = novoElemento;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Elemento getProximo() {
        return proximo;
    }
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    
    
}

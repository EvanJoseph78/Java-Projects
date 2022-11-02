public class Ingresso {
    private float valor;

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }
    
    @Override
    public String toString() {
        return "O valor do ingresso é: R$ " + getValor();
    }
}

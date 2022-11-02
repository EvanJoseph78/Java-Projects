public class IngressoVIP extends Ingresso {
    private float adicionalIngressoVIP;
    //construtor
    public IngressoVIP(float valor, float adicionalIngressoVIP) {
        super(valor);
        this.adicionalIngressoVIP = adicionalIngressoVIP;
    }

    public void setAdicionalIngressoVIP(float adicionalIngressoVIP) {
        this.adicionalIngressoVIP = adicionalIngressoVIP;
    } 

    public float getAdicionalIngressoVIP() {
        return adicionalIngressoVIP;
    }

    @Override
    public String toString() {
        return "O valor do ingresso VIP é: R$ " + (getValor() + getAdicionalIngressoVIP());
    }
}

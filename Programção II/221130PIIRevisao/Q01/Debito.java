package Q01;

public class Debito extends Pagamento {

    public Debito(float valorPagamento) {
        super(valorPagamento);
    }
    
    @Override
    public void pagar() {
       setValorPagamento(getValorPagamento() + (getValorPagamento() * 0.02f)); 
    }
}

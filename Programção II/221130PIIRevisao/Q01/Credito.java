package Q01;

public class Credito extends Pagamento {


    public Credito(float valorPagamento) {
        super(valorPagamento);
    }

    @Override
    public void pagar() {
       setValorPagamento(getValorPagamento() + (getValorPagamento() * 0.04f)); 
    }
    
}

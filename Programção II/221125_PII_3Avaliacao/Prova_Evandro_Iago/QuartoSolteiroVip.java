public class QuartoSolteiroVip extends QuartoSolteiro{

    public QuartoSolteiroVip(float valorDiaria, Boolean status, String dataLocacao, int qdias) {
        super(valorDiaria, status, dataLocacao, qdias);
        //TODO Auto-generated constructor stub
    }

    @Override
    public float valorConta(float qbebida, float qdoces, float qpetiscos, float qbiscoitos) {
        float valorConta = super.valorConta(qbebida, qdoces, qpetiscos, qbiscoitos);
        return valorConta - 0.05f * valorConta ;
    }
    
}

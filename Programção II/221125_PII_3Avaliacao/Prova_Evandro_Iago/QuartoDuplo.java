public class QuartoDuplo extends Quarto {


    public QuartoDuplo(float valorDiaria, Boolean status, String dataLocacao, int qdias) {
        super(valorDiaria, status, dataLocacao, qdias);
    }

    @Override
    public String getTipoQuarto() {
        // TODO Auto-generated method stub
        return "Quarto duplo";
    }

    @Override
    public void valorLocacao() {
        // TODO Auto-generated method stub
        super.valorLocacao();
    }


    
}

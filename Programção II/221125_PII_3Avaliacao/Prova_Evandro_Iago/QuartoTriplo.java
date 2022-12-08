public class QuartoTriplo extends Quarto {

    public QuartoTriplo(float valorDiaria, Boolean status, String dataLocacao, int qdias) {
        super(valorDiaria, status, dataLocacao, qdias);
    }

    public QuartoTriplo(int qdias) {
        super(qdias);
    }

   @Override
   public String getTipoQuarto() {
       // TODO Auto-generated method stub
       return "Quarto triplo";
   }
   
   @Override
   public void valorLocacao() {
       // TODO Auto-generated method stub
       super.valorLocacao();
   }
    
   
}

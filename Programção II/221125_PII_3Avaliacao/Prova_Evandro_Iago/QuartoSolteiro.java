public class QuartoSolteiro extends Quarto {

    public QuartoSolteiro(float valorDiaria, Boolean status, String dataLocacao, int qdias) {
        super(valorDiaria, status, dataLocacao, qdias);
    }

    public QuartoSolteiro(int qdias) {
        super(qdias);
    }

   @Override
   public String getTipoQuarto() {
       // TODO Auto-generated method stub
       return "Quarto solteiro";
   }

   @Override
   public void valorLocacao() {
       // TODO Auto-generated method stub
       super.valorLocacao();
   }

   
    
}

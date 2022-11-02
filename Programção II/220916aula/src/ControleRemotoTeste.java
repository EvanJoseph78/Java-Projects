public class ControleRemotoTeste {
    public static void main(String[] args) throws Exception {
        // Aviao a1 = new Aviao();
        // Barco b1 = new Barco();
        // Carro c1 = new Carro();
        // a1.mover();
        // b1.mover();
        // c1.mover();

        Barco barco = new Barco();
        ControleRemoto controleRemoto = new ControleRemoto(barco);
        controleRemoto.mover();
        
        Carro carro = new Carro();
        ControleRemoto controleRemoto2 = new ControleRemoto(carro); 
        controleRemoto2.mover();

    }
}

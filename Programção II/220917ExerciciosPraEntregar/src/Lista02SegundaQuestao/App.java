package Lista02SegundaQuestao;

public class App {
    public static void main(String[] args) {
        Peca p1 = new Peca("rebimboca", 100, 20);
        PecaImportada p2 = new PecaImportada("Silabares", 100, 20, 2, 3);


        p1.calcularPreco();
        p1.exibir();
        p2.calcularPreco();
        p2.exibir();
        
    }
}

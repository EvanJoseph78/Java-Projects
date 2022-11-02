public class App {
    public static void main(String[] args) throws Exception {
        Metodos lista = new Metodos();
        lista.inicioLista = null;

        lista.ImprimirLista();
        lista.VerificarEstoque();
        lista.qtd_media();
        lista.InserirPri("Memória RAM", 6);
        lista.InserirInicio("Placa de vídeo", 3);
        lista.InserirInicio("PenDrive", 4);
        lista.InserirInicio("SSD", 12);
        lista.InserirInicio("Processador", 5);
        lista.ImprimirLista();
        lista.VerificarEstoque();
        lista.qtd_media();
        lista.maisMenos();
    }
}

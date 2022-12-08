import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class teste {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("/home/evan/Área de trabalho/arquivo/teste.txt"/home/evan/Área de trabalho/arquivo/)) {
            pw.println("conteúdo"); //escreve o conteúdo do arquivo
            pw.close(); //fecha o arquivo´
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
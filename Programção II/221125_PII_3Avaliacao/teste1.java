import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class teste1 {
    public static void main(String[] args) {
        PrintWriter pw;
        try {
            pw = new PrintWriter("/home/evan/Área de trabalho/arquivo/teste2.txt");
            pw.println("Desgraça");
            pw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}

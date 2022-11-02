import java.io.IOException;

public class EscreverEmail {
    public static void main(String[] args) throws IOException {
        
        for (int i = 0; i < 5; i++) {
            EnviarEmail novoEmail = new EnviarEmail();
            novoEmail.enviarEmail();
        }
            

    }
}


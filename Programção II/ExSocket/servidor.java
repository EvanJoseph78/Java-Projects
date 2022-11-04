import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class servidor {
    public static void main(String[] args) {

        String[] usuarios = {"evan@gmai.com"};
        String[] senhas = {"123455"};

        while (true) {
            try (ServerSocket servidor = new ServerSocket(5555)) {
                System.out.println("Esperando conexão...");
                Socket cliente = servidor.accept();

                DataInputStream entrada = new DataInputStream(cliente.getInputStream());

                String mensagem = entrada.readUTF();

                System.out.println(mensagem);

                cliente.close();
                entrada.close();

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

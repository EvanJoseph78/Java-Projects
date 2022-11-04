import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class servidor {
    public static void main(String[] args) throws IOException {
        while (true) {
            ServerSocket servidor = new ServerSocket(5555);
            System.out.println("Aguardando conexão");

            Socket cliente = servidor.accept();
            
            DataInputStream entrada = new DataInputStream(cliente.getInputStream());
            String mensagem = entrada.readUTF();

            System.out.println(mensagem);

            servidor.close();
            cliente.close();

            
        }
    }
    
}

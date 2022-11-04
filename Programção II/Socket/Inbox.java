import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Inbox {
    public static void main(String[] args) throws IOException {
        while(true) {

            //incia o servidor inbox que fica escutando na porta 8080 a comunicação do Servidor
            ServerSocket inboxServer = new ServerSocket(8080);
            System.out.println("Esperando mensagem do servidor...");
    
            // aguarda a conexão do cliente
            Socket cliente = inboxServer.accept();
    
            //lê a mensagem mandada pelo cliente
    
            DataInputStream entrada = new DataInputStream(cliente.getInputStream());
            String mensagem = entrada.readUTF();
            System.out.println(mensagem);
    
            entrada.close();
            cliente.close();
            inboxServer.close();
        }
    }
}

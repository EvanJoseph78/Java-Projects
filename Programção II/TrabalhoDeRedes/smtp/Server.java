import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        while(true) {
            try (ServerSocket server = new ServerSocket(5555)) {
                String msg="";

                Socket client = server.accept();
                DataInputStream is = new DataInputStream(client.getInputStream());
                DataOutputStream os = new DataOutputStream(client.getOutputStream());
                msg = new String(is.readAllBytes(), StandardCharsets.UTF_8);
                System.out.println("\n\n-----Mensagem Recebida-----\n\n"+msg);

                os.flush(); //limpa o console
                os.close(); //
                is.close();
                client.close();

            }catch(IOException e) {
                e.printStackTrace();

            }
        }

    }

}

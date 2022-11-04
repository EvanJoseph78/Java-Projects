import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class cliente {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket enviar = new Socket("127.0.1.1", 5555);

        DataOutputStream saida = new DataOutputStream(enviar.getOutputStream());

        saida.writeUTF("Olá");

        saida.close();
        enviar.close();
    }
}
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

public class Sender {

    public static void main(String[] args){

        String mensagem = 
                "From: mt.kb.user@.com\n"+
                "Subject: Assunto do email\n"+
                "Date: "+ new Date()+"\n"+
                "To: Email a ser enviado\n"+
                "Message Body: Simulando envio de mensagens testes\n" +
                "com protocolo SMTP usando java.\n";

        try (Socket socket = new Socket(InetAddress.getLocalHost(), 5555)) {
            DataOutputStream os = new DataOutputStream(socket.getOutputStream());
            os.writeBytes(mensagem);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

}
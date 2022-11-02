import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Servidor {
	
	public void inciarServidor() {
		while(true) {
	        try (ServerSocket servidor = new ServerSocket(5555)) {
	            String msg="";
	            System.out.println("Aguardando conexão"); 
	            Socket client = servidor.accept(); //Aguarda a conexão do socket
	            DataInputStream is = new DataInputStream(client.getInputStream());
	            msg = new String(is.readAllBytes(), StandardCharsets.UTF_8);
	            System.out.println("\n\n-----Mensagem Recebida-----\n\n"+msg);
	
	            is.close();
	            client.close(); 
	
	        }catch(IOException e) {
	            e.printStackTrace();
	
	        }
    }
	}

	public static void main(String[] args) throws Exception {
		Servidor servidor = new Servidor();  // cria um novo servidor
		servidor.inciarServidor();
	}
}
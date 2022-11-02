import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;



public class EnviarEmail {
	
	public String email;
	
	public EnviarEmail (String email) {
		this.email = email;
	}
	public void enviarEmail() {
		try(Socket conexao = new Socket(InetAddress.getLocalHost(), 5555)) {
        	DataOutputStream enviar = new DataOutputStream(conexao.getOutputStream());
        	enviar.writeBytes(email);
        }
        
    	catch(IOException e) {
    		e.printStackTrace();
			// System.out.println("hhhhhhhhhhhhhhhh");
        }
	}
}

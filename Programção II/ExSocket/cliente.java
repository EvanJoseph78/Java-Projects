import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class cliente {
    static String[] login = new String[2];
    static String email = "";
    static String senha = "";
    public static void main(String[] args) {
        
        try {
            Socket enviar = new Socket(InetAddress.getLocalHost(), 5555);

            DataOutputStream saida = new DataOutputStream(enviar.getOutputStream());

            Scanner teclado = new Scanner(System.in);

            System.out.println("Entre com o email: "); 
            login[0] = teclado.nextLine();
            System.out.println("Entre com a senha: "); 
            login[1] = teclado.nextLine();

            saida.writeUTF(login);

            

            saida.close();
            enviar.close();
            teclado.close();


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
        
    }
    
}
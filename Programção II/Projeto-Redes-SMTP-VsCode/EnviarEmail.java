import java.io.DataOutputStream;  // mandar mensagem pro servidor
import java.io.IOException;  // tratamento de exeções
import java.net.InetAddress;  // pega o ip da máquina
import java.net.Socket;  // conexção cliente-servidor
import java.net.UnknownHostException;
import java.util.Date;  // retorna a data atual da máquina em String
import java.util.Scanner;

public class EnviarEmail {

    public static void main(String[] args) throws UnknownHostException, IOException {
        //abre conexão com o servidor
        //Tenta estabelecer uma conexao com determinado servidor
        //InetAddress.getLocalHost() pega o IP da máquina do usuário
    
        Socket enviar = new Socket(InetAddress.getLocalHost(), 5555); 

        //Define uma saída de dados do cliente
        DataOutputStream saida = new DataOutputStream(enviar.getOutputStream());
        

        saida.writeUTF(email()); //Envia esta mensagem para o servidor
        
        saida.close(); // fecha o objeto saida→

        enviar.close(); // fecha o socket
    }


    public static String email() {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Remetente: ");
        String remetente = teclado.nextLine();

        System.out.println("Destinatário: ");
        String destinatario = teclado.nextLine();

        System.out.println("Assunto da mensagem: ");
        String assunto = teclado.nextLine();
        
        System.out.println("Corpo da mensagem: ");
        String corpoMensagem = teclado.nextLine();

        teclado.close();


        Email mensagem = new Email(remetente, destinatario, assunto, corpoMensagem, new Date());
        return mensagem.toString();
        
    }

  
}
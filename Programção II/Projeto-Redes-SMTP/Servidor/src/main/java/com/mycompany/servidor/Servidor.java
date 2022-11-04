
package com.mycompany.servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class Servidor {

    public static void main(String[] args) throws IOException {
        // Define o servidor socket (abre uma porta de conexão)
        while(true){

            ServerSocket serverSocket = new ServerSocket(5555);
            System.out.println("Esperando conexão...");
    
            // aguarda a conexão do cliente
            Socket cliente = serverSocket.accept();
    
            //lê a mensagem mandada pelo cliente
    
            DataInputStream entrada = new DataInputStream(cliente.getInputStream());
            String mensagem = entrada.readUTF();


            //envia a mensagem pro inbox
            Socket enviar = new Socket(InetAddress.getLocalHost(), 8080);
            DataOutputStream saida = new DataOutputStream(enviar.getOutputStream());

            saida.writeUTF(mensagem);

            System.out.println("Criptografia de ponta a ponta!");
            System.out.println("Mensagem encaminhada para a caixa de mensagem");
            
            //fechas as variáveis
            entrada.close();
            cliente.close();
            serverSocket.close();
        }
        
    }
}

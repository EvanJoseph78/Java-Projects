package Q05;

import java.util.Scanner;

public abstract class CartaoMensagem {
    private String destinatario;

    public CartaoMensagem(String destinatario) {
        this.destinatario = destinatario;
    }

    
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String retornarMensagem(String remetente) {
        return "Mensagem";
    }

    public void mostrarMensagem() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o remetente: ");
        String remetente;
        remetente = teclado.nextLine();
        System.out.println(retornarMensagem(remetente));
        teclado.close();
    }

    
    
}

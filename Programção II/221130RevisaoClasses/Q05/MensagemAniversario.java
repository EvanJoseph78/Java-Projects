package Q05;

public class MensagemAniversario extends CartaoMensagem {

    public MensagemAniversario(String destinatario) {
        super(destinatario);
    }
 
    @Override
    public String retornarMensagem(String remetente) {
        // TODO Auto-generated method stub
        return  "------------------------------------------------------------------------\n" +
                "Querido(a) " + getDestinatario() + ", feliz natal!"
                 + "\nde: " + remetente;
    }

    @Override
    public void mostrarMensagem() {
        // TODO Auto-generated method stub
        super.mostrarMensagem();
    }
}

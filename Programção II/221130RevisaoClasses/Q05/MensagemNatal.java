package Q05;

public class MensagemNatal extends CartaoMensagem {

    public MensagemNatal(String destinatario) {
        super(destinatario);
    }
    
    @Override
    public String retornarMensagem(String remetente) {
        // TODO Auto-generated method stub
        return  "------------------------------------------------------------------------\n" +
                "Querido(a) " + getDestinatario() + ", feliz aniversário e muitos anos de vida!"
                + "\nde: " + remetente;
    }


    @Override
    public void mostrarMensagem() {
        // TODO Auto-generated method stub
        super.mostrarMensagem();
    }



    
}

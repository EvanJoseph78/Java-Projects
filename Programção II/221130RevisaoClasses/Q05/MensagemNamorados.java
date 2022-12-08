package Q05;

public class MensagemNamorados extends CartaoMensagem{

    public MensagemNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public String retornarMensagem(String remetente) {
        return  "------------------------------------------------------------------------\n" +
                "Querido(a) " + getDestinatario() + ", feliz Dia dos Namorados!"
                + "\nde: " + remetente;
    }

    @Override
    public void mostrarMensagem() {
        // TODO Auto-generated method stub
        super.mostrarMensagem();
    }
    
}

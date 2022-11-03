import java.util.Date;

public class Email {
    private String remetente, destinatario, assunto, mensagem;
    private Date data;

    //construtor

    public String getRemetente() {
        return remetente;
    }
    public Email(String remetente, String destinatario, String assunto, String mensagem, Date data) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.mensagem = mensagem;
        this.data = data;
    }
     

    @Override
    public String toString() {
        return  
                "====================================\n" +
                "From:"+this.remetente+"\n"+
	            "Subject:"+this.assunto+"\n"+
	            "Date: "+this.data+"\n"+
	            "To:"+this.destinatario+"\n"+
	            "Message Body:"+this.mensagem+"\n" + 
                "====================================\n";
    }
    
}

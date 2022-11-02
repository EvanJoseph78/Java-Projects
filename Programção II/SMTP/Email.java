import java.util.Date;

public class Email {
	public String remetente;
	public String destinatario;
	public String assunto;
	public Date data;
	private String mensagem;
	
	public String toString() {
		return  "From:"+this.remetente+"\n"+
	            "Subject:"+this.assunto+"\n"+
	            "Date: "+this.data+"\n"+
	            "To:"+this.destinatario+"\n"+
	            "Message Body:"+this.mensagem+"\n"; 
	}       	
	
	public Email(String remetente, String destinatario, String assunto, Date data, String mensagem) {
		super();
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.assunto = assunto;
		this.data = data;
		this.mensagem = mensagem;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	

}

import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		Email m = new Email("jamir", "evandro", "Trabalho Allan", new Date(), "Oi, executando o trabalho");
		// System.out.println(m.toString());
		EnviarEmail em = new EnviarEmail(m.toString());
		em.enviarEmail();
	}

}

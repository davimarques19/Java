
public class Quartos {

	private String nomeEstudante;
	private String emailEstudante;
	
	public Quartos(String nomeEstudante, String emailEstudante) {
		super();
		this.nomeEstudante = nomeEstudante;
		this.emailEstudante = emailEstudante;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nomeEstudante) {
		this.nomeEstudante = nomeEstudante;
	}

	public String getEmailEstudante() {
		return emailEstudante;
	}

	public void setEmailEstudante(String emailEstudante) {
		this.emailEstudante = emailEstudante;
	}

	public String toString() {
		return getNomeEstudante() + ", " + getEmailEstudante(); 
	}


}

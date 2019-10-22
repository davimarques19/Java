package model.excessoes;

public class Excessoes extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public Excessoes(String msg) {
		super(msg);
	}
	
}

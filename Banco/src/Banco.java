
public class Banco {

	private String titular;
	private int conta;
	private double saldo;
	
	public Banco(String titular, int conta) {
		super();
		this.titular = titular;
		this.conta = conta;
	}
	
	public Banco(String titular, int conta, double depositoInicial) {
		super();
		this.titular = titular;
		this.conta = conta;
		deposito(depositoInicial);
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return this.conta;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public double getSaque() {
		return this.saldo;
	}
	
	public void setSaque(double saque) {
		this.saldo -= saque + 5;
	}
	
	public void deposito(double saldo) {
		this.saldo += saldo;
	}
		
	public String toString() {
		return "Conta: " + this.getConta() + ", Titular: " + this.getTitular() + ", Saldo: R$ " + this.getSaldo();
	}

}

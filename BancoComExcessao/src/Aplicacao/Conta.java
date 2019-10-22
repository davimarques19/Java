package Aplicacao;

public class Conta {

	private Integer number;
	private String suporte;
	private Double saldo;
	private Double limiteDeSaque;
	
	public Conta(Integer number, String suporte, Double saldo, Double limiteDeSaque) {
		this.number = number;
		this.suporte = suporte;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getSuporte() {
		return suporte;
	}

	public void setSuporte(String suporte) {
		this.suporte = suporte;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void deposito(Double moeda) {
		this.saldo += moeda;
	}
	
	public void saque(Double moeda) {
		if (moeda > limiteDeSaque) {
			throw new Excessao("O valor excedeu seu limite");
		}
		if (moeda > saldo) {
			throw new Excessao("Saldo insuficiente");
		}
		saldo -= moeda;
	}
		
}

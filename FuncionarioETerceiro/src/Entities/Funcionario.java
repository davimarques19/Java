package Entities;

public class Funcionario {
	
	private String name;
	private int horas;
	private Double valorPorHora;
	
	public Funcionario(String name, int horas, Double valorPorHora) {
		super();
		this.name = name;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public double pagamento() {
		return this.valorPorHora * this.horas;
	} 
	
}

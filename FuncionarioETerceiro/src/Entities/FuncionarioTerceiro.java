package Entities;

public class FuncionarioTerceiro extends Funcionario {
	
	private Double dispesaAdicional;

	public FuncionarioTerceiro(String name, int horas, Double valorPorHora, Double dispesaAdicional) {
		super(name, horas, valorPorHora);
		this.dispesaAdicional = dispesaAdicional;
	}

	public Double getPorcentagemAdicional() {
		return dispesaAdicional;
	}

	public void setPorcentagemAdicional(Double dispesaAdicional) {
		this.dispesaAdicional = dispesaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + dispesaAdicional * 1.1;
				
	}
}


public class Empregado {

	public String name;
	public double bruto;
	public double imposto;
	
	public double salarioLiquido() {
		return this.bruto - imposto;
	}
	
	public void aumento(double porcentagem) {
		bruto += bruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return name + ", $ " + salarioLiquido();
	}
}


public class ConverterMoeda {

	public double cotacaoDolar;	
	public double quantidade;
	public double valorReal;
	
	public double converter() {
		return (quantidade * cotacaoDolar) * 6 / 100;
	}
	
	public String toString() {
		return "R$ " + converter();
	}
	
}

package Entities;

public class ProdutoImportado extends Produto {
	
	private double taxaAlfandega;

	public ProdutoImportado(String nome, Double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double precoTotal() {
		return super.getPreco() + this.taxaAlfandega;
	}
	
	@Override
	public String etiquetaDePreco() {
		return super.getNome() + " $ " + String.format("%.2f", this.precoTotal()) + " (Taxa alf�ndega: $ " + String.format("%.2f", this.taxaAlfandega) + ")";
	}
	
}

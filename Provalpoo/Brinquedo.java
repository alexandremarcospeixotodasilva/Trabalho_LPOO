public class Brinquedo extends Produto {
	public Brinquedo(String ID, String nome, double precoDeCusto) {
		super(ID, nome, precoDeCusto);
		atualizarDescricao();
		calcularValorDeVenda();
		calcularTaxas();
	}

	@Override
	protected void calcularValorDeVenda() {
		precoFinal = precoDeCusto * 1.5;
	}

	@Override
	protected void calcularTaxas() {
		imposto = precoFinal * 0.25;
	}

	@Override
	protected void atualizarDescricao() {
		descricao = " ";
	}
}

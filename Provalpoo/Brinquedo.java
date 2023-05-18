public class Brinquedo extends Produto {
	public Brinquedo(String ID, String nome, double precoDeCusto) {
		super(ID, nome, precoDeCusto);
		atualizarDescricao();
		calcularValorDeVenda();
		calcularTaxas();
	}

	@Override
	protected void calcularValorDeVenda() {
        final double CENTO_E_CINQUENTA_PORCENTO = 1.5;
		precoFinal = precoDeCusto * CENTO_E_CINQUENTA_PORCENTO;
	}

	@Override
	protected void calcularTaxas() {
        final double VINTE_E_CINCO_PORCENTO = 0.25;
		imposto = precoFinal * VINTE_E_CINCO_PORCENTO;
	}

	@Override
	protected void atualizarDescricao() {;
		descricao = " ";
	}
}

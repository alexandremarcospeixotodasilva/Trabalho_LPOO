public class Eletronico extends Produto {
	public TipoEletronico classe;
	public Eletronico(String ID, String nome, double precoDeCusto, TipoEletronico classe) {
		super(ID, nome, precoDeCusto);
		this.classe = classe;
		atualizarDescricao();
		calcularValorDeVenda();
		calcularTaxas();
	}

	@Override
	protected void calcularValorDeVenda() {
		switch (classe) {
			case UM:
				final double CENTO_E_CINQUENTA_PORCENTO = 1.5;
				precoFinal = precoDeCusto * CENTO_E_CINQUENTA_PORCENTO;
				break;
			case DOIS:
				final double CENTO_E_SESSENTA_PORCENTO = 1.6;
				precoFinal = precoDeCusto * CENTO_E_SESSENTA_PORCENTO;
				break;
			case TRES:
				final double CENTO_E_SETENTA_PORCENTO = 1.7;
				precoFinal = precoDeCusto * CENTO_E_SETENTA_PORCENTO;
				break;
		}
	}

	@Override
	protected void calcularTaxas() {
		switch (classe) {
			case UM:
				final double DEZ_PORCENTO = 0.1;
				imposto = precoFinal * DEZ_PORCENTO;
				break;
			case DOIS:
				final double QUINZE_PORCENTO = 0.15;
				imposto = precoFinal * QUINZE_PORCENTO;
				break;
			case TRES:
				final double VINTE_PORCENTO = 0.2;
				imposto = precoFinal * VINTE_PORCENTO;
				break;
		}
	}

	@Override
	protected void atualizarDescricao() {
		switch (classe) {
			case UM:
				descricao = "Classe 1";
				break;
			case DOIS:
				descricao = "Classe 2";
				break;
			case TRES:
				descricao = "Classe 3";
				break;
		}
	}
}

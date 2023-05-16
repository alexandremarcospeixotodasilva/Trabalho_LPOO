public class Livro extends Produto {
	public TipoLivro tipo;
	public Livro(String id, String nome, double precoDeCusto, TipoLivro tipo) {
		super(id, nome, precoDeCusto);
		this.tipo = tipo;
		atualizarDescricao();
		calcularValorDeVenda();
		calcularTaxas();
	}

	@Override
	protected void calcularValorDeVenda() {
		switch (tipo) {
		    case EDUCACIONAL:
				final double CENTO_E_VINTE_PORCENTO = 1.2;
				precoFinal = precoDeCusto * CENTO_E_VINTE_PORCENTO;
				break;
			case NAO_EDUCACIONAL:
				final double CENTO_E_TRINTA_PORCENTO = 1.3;
				precoFinal = precoDeCusto * CENTO_E_TRINTA_PORCENTO;
				break;
		}
	}

	@Override
	protected void calcularTaxas() {
		switch (tipo) {
			case EDUCACIONAL:
				final double CINCO_PORCENTO = 0.05;
				imposto = precoFinal * CINCO_PORCENTO;
				break;
			case NAO_EDUCACIONAL:
				final double DEZ_PORCENTO = 0.1;
				imposto = precoFinal * DEZ_PORCENTO;
				break;
		}
	}

	@Override
	public void atualizarDescricao() {
		switch (tipo) {
			case EDUCACIONAL:
				descricao = "Educacional";
				break;
			case NAO_EDUCACIONAL:
				descricao = "Nao Educacional";
				break;
		}
	}
}

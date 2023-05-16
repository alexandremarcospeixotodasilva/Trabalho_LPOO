
public class Livro extends Produto {
	public int tipo;
	public Livro(String ID, String nome, int tipo) {
		super(ID, nome);
		this.tipo = tipo;
	}

	@Override
	public void preco() {
		if(tipo == 1)
			PrecoFinal = PrecoDeCusto / 100 * 120;
		if(tipo == 2)
			PrecoFinal = PrecoDeCusto / 100 * 130;
	}

	@Override
	public void Imposto() {
		if(tipo == 1)
			imposto = PrecoFinal / 100 * 5;
		if(tipo == 2)
			imposto = PrecoFinal / 100 * 10;

	}

	@Override
	public void Descricao() {
		if(tipo == 1)
			descricao = "Educacional";
		if(tipo == 2)
			descricao = "Nao Educacional";
	}

}

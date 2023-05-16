
public class Eletronico extends Produto {
	public int Classe;
	public Eletronico(String ID, String nome, int Classe) {
		super(ID, nome);
		this.Classe = Classe;
	}

	@Override
	public void preco() {
		if(Classe == 1)
			PrecoFinal = PrecoDeCusto / 100 * 150;
		if(Classe == 2)
			PrecoFinal = PrecoDeCusto / 100 * 160;
		if(Classe == 3)
			PrecoFinal = PrecoDeCusto / 100 * 170;

	}

	@Override
	public void Imposto() {
		if(Classe == 1)
			imposto = PrecoFinal / 100 * 10;
		if(Classe == 2)
			imposto = PrecoFinal / 100 * 15;
		if(Classe == 3)
			imposto = PrecoFinal / 100 * 20;
	}


	@Override
	public void Descricao() {
		if(Classe == 1)
			descricao = "Classe 1";
		if(Classe == 2)
			descricao = "Classe 2";
		if(Classe == 3)
			descricao = "Classe 3";
	}

	

}


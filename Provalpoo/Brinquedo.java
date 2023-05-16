public class Brinquedo extends Produto {
	public Brinquedo(String ID, String nome) {
		super(ID, nome);
	}
	
	public void preco() {
		PrecoFinal = PrecoDeCusto /100 * 150;
	}
	public void Imposto() {
		imposto = PrecoFinal / 100 * 25;
		
	}


	@Override
	public void Descricao() {
		descricao = " ";
		
	}




}


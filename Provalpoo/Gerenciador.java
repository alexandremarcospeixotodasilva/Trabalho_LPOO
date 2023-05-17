public class Gerenciador {
		public static void main(String[] args) {
		CarrinhoDeCompra cc = new CarrinhoDeCompra();

		Brinquedo b = new Brinquedo("b1", "Brinquedo", 50);
		
		Eletronico e1 = new Eletronico("e1", "Eletronico 1", 500, TipoEletronico.UM);
		Eletronico e2 = new Eletronico("e2", "Eletronico 2", 600, TipoEletronico.DOIS);
		Eletronico e3 = new Eletronico("e3", "Eletronico 3", 700, TipoEletronico.TRES);
		
		Livro l1 = new Livro("l1", "Livro 1", 100, TipoLivro.NAO_EDUCACIONAL);
		Livro l2 = new Livro("l2", "Aivro 2", 300, TipoLivro.EDUCACIONAL);
		
		// inclui produtos no carrinho
		cc.insere(b);
		cc.insere(e2); 
		cc.insere(l2);
		cc.insere(e3);
		cc.insere(e1);
		cc.insere(l1);

		// exibe relat�rios
		cc.relatorionPorNome();
		System.out.println("\n");
		cc.relatorioPorPreco();
		System.out.println("\n");
		//remove um produto
		cc.remocao(e1);
		
		// exibe relat�rios
		cc.relatorionPorNome();
		System.out.println("\n");
		cc.relatorioPorPreco();
		System.out.println("\n");
	}
}

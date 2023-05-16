
public class gerenciador {

	public static void main(String[] args) {
		//carrinho de compras
		CarrinhoDeCompra cc = new CarrinhoDeCompra();
		//brinquedo
		Brinquedo b = new Brinquedo("b1", "Brinquedo");
		// ajusta custo
		b.setPrecoDeCusto(50);
		//inicializando metodos
		b.preco();
		b.Imposto();
		b.Descricao();
		
		//classe 1
		Eletronico e1 = new Eletronico("e1", "Eletronico 1", 1);
		// ajusta custos
		e1.setPrecoDeCusto(500);
		//inicializando metodos
		e1.preco();
		e1.Imposto();
		e1.Descricao();

		//classe 2
		Eletronico e2 = new Eletronico("e2", "Eletronico 2", 2);
		// ajusta custos
		e2.setPrecoDeCusto(600);
		//inicializando metodos
		e2.preco();
		e2.Imposto();
		e2.Descricao();

		//classe 3
		Eletronico e3 = new Eletronico("e3", "Eletronico 3", 3);

		// ajusta custos
		e3.setPrecoDeCusto(700);
		//inicializando metodos
		e3.preco();
		e3.Imposto();
		e3.Descricao();
	
		
		//livro n�o educacional
		Livro l1 = new Livro("l1", "Livro 1", 2);
		// ajusta custos
		l1.setPrecoDeCusto(100);
		//inicializando metodos
		l1.preco();
		l1.Imposto();
		l1.Descricao();
		
		//livro educaional
		Livro l2 = new Livro("l2", "Livro 2", 1);
		// ajusta custos
		l2.setPrecoDeCusto(300);
		//inicializando metodos
		l2.preco();
		l2.Imposto();
		l2.Descricao();
		

		// inclui produtos no carrinho
		cc.insere(b);
		cc.insere(e2); 
		cc.insere(l2);
		cc.insere(e3);
		cc.insere(e1);
		cc.insere(l1);

		// exibe relat�rios
		cc.RelatorionPorNome();
		System.out.println("\n");
		cc.RelatorioPorPreco();
		System.out.println("\n");
		//remove um produto
		cc.remocao(e1);
		
		// exibe relat�rios
		cc.RelatorionPorNome();
		System.out.println("\n");
		cc.RelatorioPorPreco();
		System.out.println("\n");
		
		
		
		
		
	}	
		

}

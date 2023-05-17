import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompra {
	private List<Produto> listaDeProdutos = new ArrayList<Produto>();
	public double impostoTotal;
	public double valorTotal;
	
	public void insere(Produto produto) {
		for (Produto produtoDoCarrinho : listaDeProdutos) {
			if (produtoDoCarrinho.getId() == produto.getId()) {
				listaDeProdutos.remove(produtoDoCarrinho);
				break;
			}
		}
		listaDeProdutos.add(produto);
	}
	
	public void remocao(Produto produto) {
		if (listaDeProdutos.contains(produto)) {
			for (Produto produtoDoCarrinho : listaDeProdutos) {
				if (produtoDoCarrinho.getId().equals(produto.getId())) {
					listaDeProdutos.remove(produtoDoCarrinho);
					break;
				}
			}
		} else {
			throw new IllegalArgumentException("Produto com o ID: " + produto.getId() + " inexistente no carrinho");
		}
	}

    public void calcularCarrinho() {
        impostoTotal = 0;
        valorTotal = 0;
        for (Produto produto : listaDeProdutos) {
            impostoTotal += produto.getImposto();
            valorTotal += produto.getPrecoFinal();
        }
    }

    public void exibirProdutos() {
        for (Produto produto : listaDeProdutos) {
            produto.exibe();
        }
    }

	public void relatorionPorNome() {
        ordenarPorNome();
        calcularCarrinho();
    	System.out.println("---------------------------------------");
    	System.out.println("ID | Nome | Descricao | Preco | Imposto");
    	System.out.println("---------------------------------------");
        exibirProdutos();
		double porcentagemDeImpostoPago = impostoTotal / valorTotal * 100;
    	System.out.println("---------------------------------------");
    	System.out.println(String.format("Imposto Total: %.2f(%.2f%%)", impostoTotal, porcentagemDeImpostoPago));
    	System.out.println(String.format("Valor Total: %d", valorTotal));
       	System.out.println("---------------------------------------");
	}

	public void relatorioPorPreco() {
		ordenarPorPreco();
        calcularCarrinho();
    	System.out.println("---------------------------------------");
    	System.out.println("ID | Nome | Descricao | Preco | Imposto");
    	System.out.println("---------------------------------------");
        exibirProdutos();
		double porcentagemDeImpostoPago = impostoTotal / valorTotal * 100;
    	System.out.println("---------------------------------------");
    	System.out.println(String.format("Imposto Total: %.2f(%.2f%%)", impostoTotal, porcentagemDeImpostoPago));
    	System.out.println(String.format("Valor Total: %d", valorTotal));
       	System.out.println("---------------------------------------");
	}

    public void ordenarPorNome() {
    	Collections.sort(listaDeProdutos, (Produto p1, Produto p2) -> {
            return p1.getNome().compareTo(p2.getNome());
        });
    }

    public void ordenarPorPreco() {
        Collections.sort(listaDeProdutos, (Produto p1, Produto p2) -> {
            if(p1.getPrecoFinal() < p2.getPrecoFinal()) return 1;
            if(p1.getPrecoFinal() > p2.getPrecoFinal()) return -1;
            return 0;
        });
    }
}

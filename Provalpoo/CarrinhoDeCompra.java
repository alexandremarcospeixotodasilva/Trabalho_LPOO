import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class CarrinhoDeCompra {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	public double impostoTotal;
	public double valorTotal;
	
	public void insere(Produto p) {
		for (Produto p1 : produtos) {
			if (p1.getId() == p.getId()) {
				produtos.remove(p1);
				break;
			}
		}
		produtos.add(p);
	}
	
	public void remocao(Produto p) {
		if (produtos.contains(p)) {
			for (Produto p1 : produtos) {
				if (p1.getId().equals(p.getId())) {
					produtos.remove(p1);
					break;
				}
			}
		} else {
			throw new IllegalArgumentException("Produto com o ID: " + p.getId() + " inexistente no carrinho");
		}
		if(!produtos.contains(p)) {
		}
		else {
			for (int i = 0; i < produtos.size(); i++) {
				Produto p1 = produtos.get(i);
				if(p1.getId().equals(p.getId())) {
					produtos.remove(p1);
				}
			}
		}
		
	}

	public void RelatorionPorNome() {
    	System.out.println("---------------------------------------");
    	System.out.println("ID | Nome | Descricao | Preco | Imposto");
    	System.out.println("---------------------------------------");
    	Collections.sort(produtos);
        for(Produto p: produtos) {
        	p.exibe();
			impostoTotal += p.imposto;
			valorTotal += p.getPrecoFinal();
        }

		double x = impostoTotal/valorTotal * 100;
		String xformatado = new DecimalFormat("#0.00").format(x);
    	System.out.println("---------------------------------------");
    	System.out.println("Imposto Total: "+impostoTotal+"("+xformatado+"%)");
    	System.out.println("Valor Total: "+valorTotal);
       	System.out.println("---------------------------------------");
       	valorTotal = 0;
       	impostoTotal = 0;
	}

	public List<Produto> RelatorioPorPreco() {
    	System.out.println("---------------------------------------");
    	System.out.println("ID | Nome | Descricao | Preco | Imposto");
    	System.out.println("---------------------------------------");
		Collections.sort(produtos, (Produto p1, Produto p2) -> {
				if(p1.getPrecoFinal() < p2.getPrecoFinal()) return 1;
				if(p1.getPrecoFinal() > p2.getPrecoFinal()) return -1;
				return 0;
			});
        for(Produto p: produtos) {
        	p.exibe();
			impostoTotal += p.imposto;
			valorTotal += p.getPrecoFinal();
        }
		
		double x = impostoTotal/valorTotal * 100;
		String xformatado = new DecimalFormat("#0.00").format(x);
    	System.out.println("---------------------------------------");
    	System.out.println("Imposto Total: "+impostoTotal+"("+xformatado+"%)");
    	System.out.println("Valor Total: "+valorTotal);
       	System.out.println("---------------------------------------");
       	valorTotal = 0;
       	impostoTotal = 0;
		return produtos;
	}
}

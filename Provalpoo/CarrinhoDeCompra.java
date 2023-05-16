import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class CarrinhoDeCompra {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	public String IDremovido;
	public double impostoTotal;
	public double valorTotal;
	public double x;
	
	
	public void insere(Produto p) {
		for (int i = 0; i < produtos.size(); i++) {
			Produto p1 = produtos.get(i);
			if(p1.getID() == p.getID()) {
				produtos.remove(p1);
			}
		}
		produtos.add(p);
	}
	
	public void remocao(Produto p) {
		IDremovido = p.getID();
		if(!produtos.contains(p)) {
			throw new IllegalArgumentException("Produto com o ID: "+IDremovido+" inexistente");
		}
		else {
			for (int i = 0; i < produtos.size(); i++) {
				Produto p1 = produtos.get(i);
				if(p1.getID().equals(p.getID())) {
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
        }
		for (int i = 0; i < produtos.size(); i++) {
			Produto p = produtos.get(i);
			impostoTotal += p.imposto;
			valorTotal += p.PrecoFinal;
		}
		x = impostoTotal/valorTotal * 100;
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
		Collections.sort(produtos, new precoComparator());
        for(Produto p: produtos) {
        	p.exibe();
        }
		for (int i = 0; i < produtos.size(); i++) {
			Produto p = produtos.get(i);
			impostoTotal += p.imposto;
			valorTotal += p.PrecoFinal;
		}
		x = impostoTotal/valorTotal * 100;
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

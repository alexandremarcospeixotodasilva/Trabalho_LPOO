import java.util.Comparator;

public class precoComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		if(p1.getPrecoFinal() < p2.getPrecoFinal())
			return 1;
		if(p1.getPrecoFinal() > p2.getPrecoFinal())
			return -1;
		return 0;
	}


}


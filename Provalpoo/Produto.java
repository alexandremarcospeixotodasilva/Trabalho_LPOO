public abstract class Produto implements Comparable<Produto>{
	private String id;
	private String nome;
	protected String descricao;
	protected double precoDeCusto;
	protected double precoFinal;
	protected double imposto;
	
	public Produto(String id, String nome, double precoDeCusto) {
		this.id = id;
		this.nome = nome;
		this.precoDeCusto = precoDeCusto;
	}

	protected abstract void calcularValorDeVenda();
		
	protected abstract void calcularTaxas();
	
	protected abstract void atualizarDescricao();

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	public double getPrecoFinal() {
		return precoFinal;
	}
	
	public int compareTo(Produto p) { 
    	return this.nome.compareTo(p.getNome());
    }

	public void exibe() {
		System.out.println(id + " | " + nome + " | " + descricao + " | " + precoFinal + " | " + imposto);
	}
}

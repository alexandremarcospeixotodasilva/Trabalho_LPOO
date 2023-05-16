public abstract class Produto implements Comparable<Produto>{
	
	
	private String ID;
	private String nome;
	protected String descricao;
	protected double PrecoDeCusto;
	protected double PrecoFinal;
	protected double imposto;
	
	public Produto(String ID, String nome) {
		this.ID = ID;
		this.nome = nome;
	}
	public abstract void preco();
		
	public abstract void Imposto();
	
	public abstract void Descricao();
	
	public void setPrecoDeCusto(double precoDeCusto) {
		PrecoDeCusto = precoDeCusto;
	}

	public String getID() {
		return ID;
	}
	public String getNome() {
		return nome;
	}
	
	public double getPrecoFinal() {
		return PrecoFinal;
	}
	public int compareTo(Produto p) { 
    	return this.nome.compareTo(p.getNome());
    }

	public void exibe() {
		System.out.println(getID()+"| "+getNome()+"|"+descricao+"|" +PrecoFinal+"| "+imposto);
	}



}

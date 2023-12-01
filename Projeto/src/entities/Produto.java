package entities;

public class Produto {
	private int id;
	private String nome;
	protected int quantidade;
	protected double preco;
	
	public Produto() {
	}

	public Produto(int id, String item, int quantidade, double preco) {
		this.id = id;
		this.nome =item;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public Produto(String item){
		this.nome = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String item) {
		this.nome = item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
  public String toString() {
    return "Produto{Id=" + id + ", Nome='" + nome + "', Quantidade=" + quantidade + ", Preco=" + preco + "}";
  }
  
}
package entities;

public class Produto {
	private int id;
	private String item;
	private int quantidade;
	private double preco;
	
	public Produto() {
	}
	
	public Produto(int id, String item, int quantidade, double preco) {
		this.id = id;
		this.item =item;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public Produto(String item){
		this.item = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return item;
	}

	public void setNome(String item) {
		this.item = item;
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
    return "Produto{Id=" + id + ", Nome='" + item + "', Quantidade=" + quantidade + ", Preco=" + preco + "}";
  }
  
}
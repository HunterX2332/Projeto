package entities;

public class ItemPedido extends Produto{
	private int codigo;
	private Produto item;
	private int quantidadePedida;
	
	public ItemPedido(){
	}
	
	public ItemPedido(int codigo, Produto item, int quantidade) {
		super();
		this.codigo = codigo;
		this.item = item;
		this.quantidadePedida = quantidade;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Produto getItem() {
		return item;
	}
	public void setItem(Produto item) {
		this.item = item;
	}
	public int getQuantidade() {
		return quantidadePedida;
	}
	public void setQuantidade(int quantidade) {
		this.quantidadePedida = quantidade;
	}
	@Override
  public String toString() {
    return "ItemPedido{Codigo=" + codigo + ", Item='" + item + "', QuantidadePedida=" + quantidadePedida + "}";
  }
}

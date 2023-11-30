package entities;

public class Telefone{
	private String tipo;
	private int telefone;
	
	public Telefone() {
	}
	
	public Telefone(String tipo, int telefone) {
		this.tipo = tipo;
		this.telefone = telefone;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	@Override
  public String toString() {
    return "Telefone{Tipo='" + tipo + "', Numero=" + telefone + "}";
  }

}

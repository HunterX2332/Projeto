package entities;

public class Telefone{
	private int telefone;
	
	public Telefone() {
	}
	
	public Telefone(int telefone) {
		this.telefone = telefone;
	}

	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	@Override
  public String toString() {
    return "Telefone{ "+telefone+ "}";
  }

}

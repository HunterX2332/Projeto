package entities;

public class Cliente{
	public Integer id;
	public String nome;
	public String email;
	
	public Cliente() {
	}
	
	public Cliente(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	
	@Override
  public String toString() {
    return "Cliente{Nome='" + nome + "', Email='" + email + "'}";
  }
}

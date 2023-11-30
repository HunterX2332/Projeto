package entities;

public class Cliente{
	public String nome;
	public String email;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	@Override
  public String toString() {
    return "Cliente{Nome='" + nome + "', Email='" + email + "'}";
  }
}

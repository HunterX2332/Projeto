package entities;

public class Endereco{
	private String rua;
	private int numerocomp;
	private String complemento;
	private String bairro;
	
	public Endereco() {
	}
	
	public Endereco(String rua, int numero, String complemento, String bairro) {
		this.rua = rua;
		this.numerocomp = numero;
		this.complemento = complemento;
		this.bairro = bairro;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNumero() {
		return numerocomp;
	}
	public void setNumero(int numero) {
		this.numerocomp = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String toString() {
		return rua + ", " + numerocomp + ", " + bairro + ", " + complemento;
	}
}

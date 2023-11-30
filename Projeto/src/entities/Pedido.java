package entities;


public class Pedido {
	private String vendedor;
	private Boolean status;
	private String observacoes;
	
	public Pedido() {
	}
	
	public Pedido(String vendedor, Boolean status, String observacoes) {
		
		this.vendedor = vendedor;
		this.status = status;
		this.observacoes = observacoes;
	}


	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	@Override
  public String toString() {
    return "Pedido{Vendedor='" + vendedor + "', Status=" + status + ", Observacao='" + observacoes + "'}";
  }
   
	
}

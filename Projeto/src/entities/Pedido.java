package entities;
import enums.Status;
import enums.MetodosPagamento;

import java.util.Date;

public class Pedido extends Produto{
	private Integer idPed;
	private Date date;
	private Status status;
	private MetodosPagamento metodoPag;
	
	public Pedido() {
	}

	public Pedido(Integer id, Date date, Status status,
			MetodosPagamento metodoPag) {
		this.idPed = id;
		this.date = date;
		this.status = status;
		this.metodoPag = metodoPag;
	}

	public Pedido(int id, int quantidade, Double preco, Integer idPed, Date date) {
		super();
		this.idPed = idPed;
		this.date = date;
	}

	public Pedido(int id, String item, int quantidade, double preco) {
		super(id,item,quantidade,preco);
	}

	public Integer getIdPed() {
		return idPed;
	}

	public Date getDate() {
		return date;
	}

	public Status getStatus() {
		return status;
	}

	public MetodosPagamento getMetodoPag() {
		return metodoPag;
	}
	
	public String toString(){
		return "Id: " +
				idPed +
				"quantidade: " +
				quantidade +
				"Preco: " +
				preco +
				"Data: " +
				date;
	}
}

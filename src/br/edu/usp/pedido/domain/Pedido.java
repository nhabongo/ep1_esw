package br.edu.usp.pedido.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

	@Id 
	@GeneratedValue
	@Column(name = "PEDIDO_ID")
	private Long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedido_id", updatable = false, insertable = false, nullable = false)
	private List<Item> orders;
	
	private String client;
	private String date;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Item> getOrders() {
		return orders;
	}

	public void setOrders(List<Item> orders) {
		this.orders = orders;
	}
	
	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public float calculaValorTotal(){
		float total = 0;
		for (Item order : this.orders) {
			total += order.getPrice();	
		}
		return total;
	}
	
	public float numeroDeItems(){
		float total = 0;
		for (Item order : this.orders) {
			total += order.getAmount();	
		}
		return total;
	}

}

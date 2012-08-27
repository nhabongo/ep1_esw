package br.edu.usp.pedido.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	
	@Id 
	@GeneratedValue
	@Column(name = "ITEM_ID")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "pedido_id", updatable = false, insertable = false, nullable = false)
	private Pedido bag;
	
	private String description;
	private int amount;
	private float price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Pedido getBag() {
		return bag;
	}

	public void setBag(Pedido bag) {
		this.bag = bag;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	

}

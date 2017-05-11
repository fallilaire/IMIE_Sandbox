package fr.imie.cours;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="\"public2\".Cart")
public class Cart {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String number;
	
	@OneToMany(mappedBy = "cart")
	private List<Product> listProducts = new ArrayList<Product>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Product> getListProducts() {
		return listProducts;
	}
	
	public void addProduct(Product p) {
		listProducts.add(p);
	}
	
	public void removeProduct(Product p) {
		listProducts.remove(p);
	}
}

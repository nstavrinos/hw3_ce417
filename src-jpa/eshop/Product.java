package eshop;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="products")
@NamedQueries({@NamedQuery(name="Product.getAll",query="SELECT e FROM Product e")})
public class Product implements Serializable {

	@Id
        @Column(name="barcode")
	private String barcode;
        
	@Column(name="name")
	private String name;
	

	
	@Column(name="color")
	private String color;
	
	@Column(name="description")
	private  String description;
	
	public Product() {
	
	}
	public Product(String name, String barcode, String color, String description) {
		this.barcode = barcode;
		this.name = name;
		this.color = color;
		this.description = description;
	}
	
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}

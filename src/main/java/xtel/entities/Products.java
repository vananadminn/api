package xtel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductManage")
public class Products {
	@GeneratedValue
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "ProductCode")
	private String productcode;
	@Column(name = "ProductName")
	private String productname;
	@Column(name = "Quantity")
	private Double quantity;
	@Column(name = "Unit")
	private int unit;
	@Column(name = "UnsettledDiv")
	private int unsettledDiv;

	public Products() {
		super();
	}

	public Products(int id, String productcode, String productname, Double quantity, int unit, int unsettledDiv) {
		super();
		this.id = id;
		this.productcode = productcode;
		this.productname = productname;
		this.quantity = quantity;
		this.unit = unit;
		this.unsettledDiv = unsettledDiv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getUnsettledDiv() {
		return unsettledDiv;
	}

	public void setUnsettledDiv(int unsettledDiv) {
		this.unsettledDiv = unsettledDiv;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", productcode=" + productcode + ", productname=" + productname + ", quantity="
				+ quantity + ", unit=" + unit + ", unsettledDiv=" + unsettledDiv + "]";
	}

}

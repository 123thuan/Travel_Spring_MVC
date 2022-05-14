package Traversal.Entity;

public class BillDetail {
	private long id;
	private long id_product;
	private long id_bills;
	private Integer quantity;
	private double total;
	public long getId_bills() {
		return id_bills;
	}
	public void setId_bills(long id_bills) {
		this.id_bills = id_bills;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_product() {
		return id_product;
	}
	public void setId_product(long id_product) {
		this.id_product = id_product;
	}

	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public BillDetail() {
		super();
	}
}

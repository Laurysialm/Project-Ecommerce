
public class Order {
	private Integer id_order;
	private Integer numb_Order;
	private String status;
	private Double value = 0.0;
	private User users;
	private Adress adress;
	private Product[] product;
	
	Order(
		 Integer id_order,
		 Integer numb_Order,
		 String status, Product[] product)
	{
		setId_order(id_order);
		setId_order(numb_Order);
		setStatus(status);
		setProduct(product);
	}
	
	public Integer getId_order() {
		return id_order;
	}
	public void setId_order(Integer id_order) {
		this.id_order = id_order;
	}
	public Integer getNumb_Order() {
		return numb_Order;
	}
	public void setNumeroPedido(Integer numb_Order) {
		this.numb_Order = numb_Order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Product[] getProduct() {
		return product;
	}
	public void setProduct(Product[] product) {
		this.product = product;
		Integer qtdProdutos = product.length;
		for(Integer i = 0; qtdProduct > i; i++) {
			if(product[i] == null) {
				break;
			}
			if(product[i] != null) {
				setValue( getValue()+ product[i].getPrice());
			}else {
				setValue(product[i].getPrice());
			}
		}
	}
	public void listProduct() {
		if(product.length > 0) {	
			Integer qtdProduct = product.length;
			for(Integer i = 0; qtdProduct > i; i++) {
				if(product[i] == null) {
					break;
				}
				product[i].showProduct();
			}
		}else {
			System.out.println("There are no products registered");
		}
	}
	
	public void order_owner() {
		User order_owner = getUsers();
		if(order_owner != null) {
			System.out.println(order_owner.getName()); 
		}else {
			System.out.println("Owner of the order could not be found");
		}
	}
	
	public void statusOrder() {
		Adress delivery = getAdress();
		if(delivery != null) {
			delivery.showAdress();
		}else {
			System.out.println("Delivery address Not found");
		}
		
	}
	
	public void showOrder() {
		System.out.println("-------- Order N° "+ getNumb_Order() +" ---------");
		System.out.println("ID Order: " + getId_order());
		System.out.println("Status Order: " + getStatus());
		String valueFormat = String.format("%.2f", getValue());
		System.out.println("Order Value: " + valueFormat);
		System.out.println("Dono do Pedido: ");
		order_owner();
		System.out.println("Delivery Details: ");
		deliveryInfo();
		System.out.println("Product List: ");
		listProduct();
		
	}
}

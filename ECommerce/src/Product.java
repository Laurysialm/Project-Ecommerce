
public class Product {
	Integer id_product;
	String name;
	String brand;
	Double price;
	String category;
	String description;
	String image;
	Product(Integer id_product, String name, String brand,Double price, String category, String description, String image){
		setId_product(id_product);
		setName(name);
		setBrand(brand);
		setPrice(price);
		setCategory(category);
		setDescription(description);
		setImage(image);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getId_product() {
		return id_product;
	}
	public void setId_product(Integer id_product) {
		this.id_product = id_product;
	}
	public void exibirProduto() {
		System.out.println("ID Product: " + getId_product());
		System.out.println("Name Product: " + getName());
		System.out.println("Brand Product: " + getBrand());
		System.out.println("Price Product: " + getPrice());
		System.out.println("Category Product: " + getCategory());
		System.out.println("Description" + getDescription());
		System.out.println("Image Product: " + getImage());
		System.out.println("\n");
	}
	
}

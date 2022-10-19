
public class Adress {
	private Integer id_adress;
	private String street;
	private String district;
	private String city;
	private String zipcode;
	private String coutry;
	
	Adress(Integer id_adress, String street, String district, String city, String zipcode, String coutry){
		setId_adress(id_adress);
		setStreet(street);
		setDistrict(district);
		setCity(city);
		setZipcode(zipcode);
		setCoutry(coutry);
	}
	public void exibirEndereco() {
		System.out.println("ID Adress: " + getId_adress());
		System.out.println("Street: " + getStreet());
		System.out.println("District: " + getDistrict());
		System.out.println("City: " + getCity());
		System.out.println("Zipcode: " + getZipcode());
		System.out.println("Coutry: " + getCoutry());
		System.out.println("\n");
	}
	public Integer getId_adress() {
		return id_adress;
	}
	public void setId_adress(Integer id_adress) {
		this.id_adress = id_adress;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCoutry() {
		return coutry;
	}
	public void setCoutry(String coutry) {
		this.coutry = coutry;
	}
	public void showAdress() {
		// TODO Auto-generated method stub
		
	}
	
}

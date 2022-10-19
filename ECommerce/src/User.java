
public class User  extends Person{
	
	private Integer id_user;
	private String email;
	private String password;
	
	 User(Integer id_user,
			 String email,
			 String password,
			 Integer id_person,
			 String name,
			 String cpf,
			 String phone,
			 String sex,
			 String birth){
		super(id_person, name,cpf,phone,sex,birth);
		this.id_user = id_user;
		this.email = email;
		this.password = password;
	}
	
	public void exibirInformacoes() {
		System.out.println("Id: " + this.id_user);
		System.out.println("Email: " + this.email);
		System.out.println("Password: " + this.password);
		System.out.println("Name: " + this.getName());
		System.out.println("cpf: " + this.getCpf());
		System.out.println("Phone: " + this.getPhone());
		System.out.println("Sex: " + this.getSex());
		System.out.println("Birth: " + this.getBirth());
		System.out.println("\n");
	}
	
	public Integer getId_user() {
		return id_user;
	}
	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}


public class Person {
	private Integer id_person;
	private String name;
	private String cpf;
	private String phone;
	private String sex;
	private String birth;
	
	 Person(Integer id_person, String name, String cpf, String telefone, String sex, String birth){
		this.id_person = id_person;
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.sex = sex;
		this.birth = birth;
	}
	

	public Integer getId_person() {
		return id_person;
	}
	public void setId_person(Integer id_person) {
		this.id_person = id_person;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	
}

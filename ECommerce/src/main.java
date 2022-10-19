public class main {

	public static <User> void main(String[] args) {
		// Criando usuarios 
		User user1 = new User(
				1,
				"laurialms@gmail.com",
				"898989",
				1,
				"Lauri Almeida",
				"33991292-87",
				"33991618491",
				"F",
				"05/03/1995");
		User user2 = new User(
				2,
				"patricia43@hotmail.com",
				"31898738",
				1,
				"Patricia Silva",
				"512312-123",
				"32871371783",
				"F",
				"04/07/1967");
		user1.showInfo();
		user2.showInfo();
		// Criando Endereço
		
		Adress adress1 = new Adress(1, "Rua Das flores","Borboleta", "Juiz de Fora", "36031-080", "Brasil");
		adress1.showAdress();
		
		
		// Criando produto
		Product produto1 = new Product(
				1,
				 "Bala fini dentadura",
				 "Fini",
				 7.90,
				 "Doces",
				 "Bala Fini Dentadura",
				 "caminhofictiocio/img/TV_Samsung_55_4k_3312"
				);
		
		Product product2 = new Product(
				2,
				 "bala fini beijos",
				 "Fini",
				 6.90,
				 "Doces",
				 "Bala Fini Beijos",
				 "caminhofictiocio/img/Notebook Acer"
				);
		product1.showProduct();
		product2.showProduct();
		Product[] products = new Product[10];
		products[0] = product1;
		products[1] = product2;
		

		FormaEntrega forma1 = new FormaEntrega(1, 56.90,"Sedex", 5);
		FormaEntrega forma2 = new FormaEntrega(2, 20.90,"CorreiosPadrão", 14);
		
		FormaPagamento  pagamento1 = new FormaPagamento(1,"digital","Cartão Credito","3112");
		FormaPagamento  pagamento2 = new FormaPagamento(2,"fisico","dinheiro","null");
		
		Order order1 = new Order(
				  1,
				  3312,
				  "Concluído",
				  products
				);
		order1.setAdress(adress1);
		order1.setUsers(user1);
		order1.showOrder();
		pedido1.setFormaPagamento(pagamento1);
		pedido1.exibirPedido();
	}

}

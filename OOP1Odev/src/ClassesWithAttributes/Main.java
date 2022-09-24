package ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus laptop");
		product.setPrice(500);
		product.setStockAmount(3);
		
		
		Product product2 = new Product(2,"TV","Samsung TV",2212,111212,"Black");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getName());
		System.out.println(product2.getName());

	}

}
